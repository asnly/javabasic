package eight;

import static net.mindview.util.Print.*;
import eight.Shared1;
public class Demo21 {
	private static RandomRodentGenerator r = new RandomRodentGenerator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent1[] rodent = new Rodent1[10];
		for (Rodent1 rodent1 : rodent) {
			rodent1 = r.next();
			System.out.println(rodent1);
		}
		//r.shared.showRefcount();
	}

}

class Characteristic {
	private String s;

	public Characteristic(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		print("Creating Characteristic " + s);
	}
}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}
}

class Rodent1 {
	public String name = "Rodent1";
	private static long counter = 0;
	private final long id = counter++;
	private Shared1 shared;
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent1(Shared1 shared) {
		System.out.println("Rodent1()"+id);
		this.shared = shared;
		this.shared.addRef();
	}

	public void eat() {
		System.out.println("Rodent1.eat()");
	}

	public void run() {
		System.out.println("Rodent1.run()");
	}

	public void sleep() {
		System.out.println("Rodent1.sleep()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+","+id;
	}
}

/**
 * 基类和导出类的初始化顺序
 */
// class Squirrel extends Rodent1 {
// private String name = "Squirrel";
// private Characteristic c = new Characteristic("climbs trees");
// private Description d = new Description("likes nuts");
// Squirrel() { System.out.println("Squirrel()"); }
// @Override
// public void eat() {
// // TODO Auto-generated method stub
// System.out.println("Squirrel.eat()");
// }
// @Override
// public void run() {
// // TODO Auto-generated method stub
// System.out.println("Squirrel.run()");
// }
// @Override
// public void sleep() {
// // TODO Auto-generated method stub
// System.out.println("Squirrel.sleep()");
// }
// public String toString() { return this.name; }
// }
// class Mouse1 extends Rodent1{
// public String name="Mouse";
// private Characteristic c = new Characteristic("likes cheese");
// private Description d = new Description("nocturnal");
// @Override
// public void eat() {
// // TODO Auto-generated method stub
// System.out.println("Mouse1.eat()");
// }
// @Override
// public void run() {
// // TODO Auto-generated method stub
// System.out.println("Mouse1.run()");
// }
// @Override
// public void sleep() {
// // TODO Auto-generated method stub
// System.out.println("Mouse1.sleep()");
// }
// @Override
// public String toString() {
// // TODO Auto-generated method stub
// return this.name;
// }
// }
//
// class Gerbil1 extends Rodent1{
// private String name="Gerbil1";
// private Characteristic c= new Characteristic("larger");
// private Description d=new Description("black");
// @Override
// public void eat() {
// // TODO Auto-generated method stub
// System.out.println("Gerbil1.eat()");
// }
// @Override
// public void run() {
// // TODO Auto-generated method stub
// System.out.println("Gerbil1.run()");
// }
// @Override
// public void sleep() {
// // TODO Auto-generated method stub
// System.out.println("Gerbil1.sleep()");
// }
// @Override
// public String toString() {
// // TODO Auto-generated method stub
// return this.name;
// }
// }
//
// class Hamster1 extends Rodent1{
// private String name="Hamster";
// private Characteristic c=new Characteristic("more larger");
// private Description d=new Description("gray");
// @Override
// public void eat() {
// // TODO Auto-generated method stub
// System.out.println("Hamster1.eat()");
// }
// @Override
// public void run() {
// // TODO Auto-generated method stub
// System.out.println("Hamster1.run()");
// }
// @Override
// public void sleep() {
// // TODO Auto-generated method stub
// System.out.println("Hamster1.sleep()");
// }
// @Override
// public String toString() {
// // TODO Auto-generated method stub
// return this.name;
// }
// }

class Squirrel extends Rodent1 {
	private String name = "Squirrel";
	private Shared1 shared;
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");

	Squirrel(Shared1 s) {
		super(s);
		System.out.println("Squirrel()");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Squirrel.eat()");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Squirrel.run()");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Squirrel.sleep()");
	}

	public String toString() {
		return this.name+super.toString();
	}
}

class Mouse1 extends Rodent1 {
	Mouse1(Shared1 shared) {
		super(shared);
		// TODO Auto-generated constructor stub
		System.out.println("Mouse1()");
	}

	public String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mouse1.eat()");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mouse1.run()");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Mouse1.sleep()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+super.toString();
	}
}

class Gerbil1 extends Rodent1 {
	Gerbil1(Shared1 shared) {
		super(shared);
		// TODO Auto-generated constructor stub
		System.out.println("Gerbil1()");
	}

	private String name = "Gerbil1";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil1.eat()");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil1.run()");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil1.sleep()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Hamster1 extends Rodent1 {
	Hamster1(Shared1 shared) {
		super(shared);
		// TODO Auto-generated constructor stub
		System.out.println("Hamster1()");
	}

	private String name = "Hamster";
	private Characteristic c = new Characteristic("more larger");
	private Description d = new Description("gray");

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hamster1.eat()");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hamster1.run()");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Hamster1.sleep()");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+","+super.toString();
	}
}
