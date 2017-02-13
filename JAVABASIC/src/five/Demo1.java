package five;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings s=new Strings();
		System.out.println(s.toString());
		StaticTest s2=new StaticTest();
		s2.display();
	}

}

class Strings{
	private String s;

	@Override
	public String toString() {
		return "Strings [s=" + s + "]";
	}
	
}

class StaticTest{
	private static int c=11;
	public static void f(int d){
		c=d;
		System.out.println(c);
	}
	public void display(){
		f(5);
	}
}
