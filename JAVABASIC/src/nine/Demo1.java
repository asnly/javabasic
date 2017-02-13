package nine;

public class Demo1 {
	public static void main(String[] args) {
		Rodent[] r={new Mouse(),new Gerbil(),new Hamster()};
		for (Rodent rodent : r) {
			rodent.eat();
			rodent.run();
			rodent.sleep();
		}
	}
	
	
}


abstract class Rodent{
	public String name="Rodent";
	public abstract void eat();
	public abstract void run();
	public abstract void sleep();
}

class Mouse extends Rodent{
	public String name="Mouse";
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mouse.eat()");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mouse.run()");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Mouse.sleep()");
	}
}

class Gerbil extends Rodent{
	public String name="Gerbil";
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil.eat()");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil.run()");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil.sleep()");
	}
}

class Hamster extends Rodent{
	private String name="Hamster";
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hamster.eat()");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hamster.run()");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Hamster.sleep()");
	}
}