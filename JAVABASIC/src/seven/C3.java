package seven;

public class C3 extends A3{

	public C3(int i){
		super(i);
		new B3(i);
		System.out.println("C3() constructor"+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C3(11);
		//D1.main(args);
	}

}

class A3{
	public A3(int i){
		System.out.println("A3() constructor"+i);
	}
}

class B3{
	public B3(int i){
		System.out.println("B3() constructor"+i);
	}
}

