package seven;

public class C2 extends A2{
	private B2 b2=new B2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c=new C2();
	}

}


class A2{
	public A2(){
		System.out.println("A() constructor");
	}
}

class B2{
	public B2(){
		System.out.println("B() constructor");
	}
}
