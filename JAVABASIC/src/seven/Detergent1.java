package seven;

import static net.mindview.util.Print.print;

/**
 * 
 * @author caolinchao
 *代理的使用
 */
public class Detergent1{
	private String s="Detergent1";
	Cleanser1 c=new Cleanser1();
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		c.dilute();
	}
	public void apply(){
		c.apply();
	}
	public void scrub(){
		append("Detergent1.scrub()");
		c.scrub();
	}
	public String toString(){
		return s+" "+c;
	}
	public void foam(){
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent1 x=new Detergent1();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}

class Cleanser1{
	private String s = "Cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		append(" dliute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleanser x=new Cleanser();
		print(x);
	}
}
