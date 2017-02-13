package six;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.i);
		B.change(a, 9);
		System.out.println(a.i);
	}

}

class A{
	protected int i=12;
}

class B{
	static void change(A a,int c){
		a.i=c;
	}
}