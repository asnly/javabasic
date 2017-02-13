package seven;

public class Demo3 {
	public static void main(String[] args) {
		Stem s=new Stem();
	}
}

class Root{
	private Component1 c1=new Component1();
	private Component2 c2=new Component2();
	private Component3 c3=new Component3();
	public Root(){
		System.out.println("Root()");
	}
}

class Component1{
	public Component1(){
		System.out.println("Component1");
	}
}

class Component2{
	public Component2(){
		System.out.println("Component2");
	}
}

class Component3{
	public Component3(){
		System.out.println("Component3");
	}
}

class Stem extends Root{
	private Component1 c1=new Component1();
	private Component2 c2=new Component2();
	private Component3 c3=new Component3();
	public Stem(){
		System.out.println("Stem()");
	}
}