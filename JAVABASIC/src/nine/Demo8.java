package nine;

public class Demo8 {
	public static void serviceConsunmer(CycleFactory c){
		Cycle cycle=c.getCycle();
		cycle.balance();
		System.out.println(cycle.wheels());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsunmer(new UnicycleFactory());
		serviceConsunmer(new TricycleFactory());
	}

}


interface Cycle{
	public String toString();
	public void balance();
	public int wheels();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	private int wheels=2;
	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Unicycle balance");
	}

	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	
}

class UnicycleFactory implements CycleFactory{

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	private int wheels=3;

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle balance()");
	}

	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	
}

class BicycleFactory implements CycleFactory{

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	private int wheels=4;

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Tricycle balance()");
	}

	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
}

class TricycleFactory implements CycleFactory{

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}
	
}
