package five;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String1 s1=new String1();
		System.out.println(s1.toString());
		String2 s2=new String2("test");
		System.out.println(s2.toString());
	}

}

class String1{
	private String s="fafsdf";

	@Override
	public String toString() {
		return "String1 [s=" + s + "]";
	}
	
}

class String2{
	private String s;
	public String2(String s){
		this.s=s;
	}
	@Override
	public String toString() {
		return "String2 [s=" + s + "]";
	}
	
}