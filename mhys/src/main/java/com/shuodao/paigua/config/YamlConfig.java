package com.shuodao.paigua.config;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ho.yaml.Yaml;

public class YamlConfig {

	 private final static Log log = LogFactory.getLog(YamlConfig.class);
	 
		public static class ConfigEntry{
			
			public String jdbc_url;
			public String jdbc_user;
			public String jdbc_password;
			public String domain_url;
			
		}
		
		private static YamlConfig  instance = new YamlConfig();
		
		private  ConfigEntry configEntry;
		
		private  String webappRoot;
		
		private  String contextPath = "/";
		
		private YamlConfig(){
				
			webappRoot = System.getProperty("mhys.root");
				try{
					configEntry= Yaml.loadType(new File(webappRoot,"WEB-INF/config.yml"),ConfigEntry.class);
					
				} catch (Exception e){
					log.error("Load config.yml error.",e);
				}
				if(configEntry == null || configEntry.domain_url == null){
					log.error(" Can not find domain_url in the config.yml.");
					
					throw new RuntimeException("Error in the config.yml");
				}
				if(configEntry.domain_url != null && configEntry.domain_url.startsWith("http")){
					configEntry.domain_url = "http://"+configEntry.domain_url;
				}
				if(configEntry.domain_url.endsWith("/")){
					configEntry.domain_url= configEntry.domain_url.substring(0,configEntry.domain_url.length()-1);
				}
		}
		
	public static YamlConfig getInstance(){
			return instance;
			
	}
	public ConfigEntry getConfigEntry(){
		 return configEntry;
		 
	}
	public String getWebappRoot(){
		return webappRoot;
		
	}
		
	public void setContextPath(String path){
		 contextPath= path;
		 
	}
		
	public String getDomain_Url(){
		return configEntry.domain_url;
	}
	
	
	public String getContextUrl(){
		 return configEntry.domain_url+ contextPath + "/";
	}
	
}