package seven;

public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem22 s=new Stem22();
		s.dispose();
	}

}

class Root2{
	private Component112 c1=new Component112();
	private Component222 c2=new Component222();
	private Component332 c3=new Component332();
	public Root2(){
		System.out.println("Root2()");
	}
	public void dispose(){
		c3.dispose();
		c2.dispose();
		c1.dispose();
		System.out.println("Root2 dispose()");
	}
}

class Component112{
	public Component112(){
		System.out.println("Component11");
	}
	public void dispose(){
		System.out.println("Component11 dispose()");
	}
}

class Component222{
	public Component222(){
		System.out.println("Component22");
	}
	public void dispose(){
		System.out.println("Component22 dispose()");
	}
}

class Component332{
	public Component332(){
		System.out.println("Component33");
	}
	public void dispose(){
		System.out.println("Component33 dispose()");
	}
}

class Stem22 extends Root2{
	private Component112 c1=new Component112();
	private Component222 c2=new Component222();
	private Component332 c3=new Component332();
	public Stem22(){
		super();
		System.out.println("Stem22()");
	}
	public void dispose(){
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
		System.out.println("Stem22 dispose()");
	}
}