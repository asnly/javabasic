package eight;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] r=new Rodent[]{new Mouse(),new Gerbil(),new Hamster()};
		for (Rodent rodent : r) {
			rodent.eat();
			rodent.run();
			rodent.sleep();
		}
	}

}


class Rodent{
	public String name="Rodent";
	public void eat(){
		System.out.println("Rodent.eat()");
	}
	public void run(){
		System.out.println("Rodent.run()");
	}
	public void sleep(){
		System.out.println("Rodent.sleep()");
	}
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