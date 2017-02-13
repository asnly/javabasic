package five;

public class Demo9Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STATIC s=new STATIC();
		s.display();
	}

}

class STATIC{
	static String a="aa";
	static String b;
	static{
		b="bb";
	}
	static void display(){
		System.out.println("a="+a+",b="+b);
	}
}
