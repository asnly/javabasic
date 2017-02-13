package seven;

public class Demo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem1 s1=new Stem1(4);
	}

}

class Root1{
	private Component1 c1=new Component1();
	private Component2 c2=new Component2();
	private Component3 c3=new Component3();
	public Root1(int i){
		System.out.println("Root()"+i);
	}
}

class Component11{
	public Component11(int i){
		System.out.println("Component11()"+i);
	}
}

class Component21{
	public Component21(int i){
		System.out.println("Component21()"+i);
	}
}

class Component31{
	public Component31(int i){
		System.out.println("Component31()"+i);
	}
}

class Stem1 extends Root1{
	private Component11 c1=new Component11(1);
	private Component21 c2=new Component21(2);
	private Component31 c3=new Component31(3);
	public Stem1(int i){
		super(i);
		System.out.println("Stem1()"+i);
	}
}