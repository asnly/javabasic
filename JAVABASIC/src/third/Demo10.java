package third;

public class Demo10 {
	static void f(boolean b){
		if(b==true)
			System.out.println(true);
		else{
			System.out.println(false);
		}
		
	}
	static void compare(String s1,String s2){
		f(s1==s2);
		f(s1.equals(s2));
		f(s2.equals(s1));
		f(s1!=s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="four",s1="thirteen";
		Demo10.compare(s, s1);
	}

}
