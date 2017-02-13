package seven;

public class E extends D{
	public E(){
		System.out.println("E() constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E();
		D.main(args);
	}

}

class A{
	public A(){
		System.out.println("A() constructor");
	}
}

class B extends A{
	public B(){
		System.out.println("B() constructor");
	}
}

class C extends B{
	public C(){
		System.out.println("C() constructor");
	}
}

class D extends C{
	public D(){
		System.out.println("D() constructor");
	}
	public static D makeD(){
		return new D();
	}
	public static void main(String[] args) {
		D d=new D();
		D d2=makeD();
	}
}