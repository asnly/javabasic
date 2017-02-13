package eight;
import static org.greggordon.tools.Print.*;
/**
 * 
 * @author caolinchao
 *添加wheels()方法
 */
public class Demo1 {
	public static void ride(Cycle c){
		c.travel(c);
		println("wheels: "+c.wheels());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle u=new Unicycle();
		Bicycle b=new Bicycle();
		Tricycle t=new Tricycle();
		ride(u);
		ride(b);
		ride(t);
		Cycle[] c={new Unicycle(),new Bicycle(),new Tricycle()};
//		for (Cycle cycle : c) {
//			cycle.balance();
//		}
		((Unicycle)c[0]).balance();
		((Bicycle) c[1]).balance();
		
	}

}

class Cycle{
	private String name="Cycle";
	private int wheels=0;
	public static void travel(Cycle c){
		println("Cycle.ride() "+c);
	}
	public String toString(){
		return this.name;
	}
	public int wheels(){
		return wheels;
	}
}

class Unicycle extends Cycle{
	private String name="Unicycle";
	private int wheels=1;
	public String toString(){
		return this.name;
	}
	public void balance(){
		System.out.println("Unicycle balance()");
	}
	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
}

class Bicycle extends Cycle{
	private String name="Bicycle";
	private int wheels=2;
	public String toString(){
		return this.name;
	}
	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	public void balance(){
		System.out.println("Bicycle balance()");
	}
}

class Tricycle extends Cycle{
	private String name="Tricycle";
	private int wheels=3;
	public String toString(){
		return this.name;
	}
	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	
}
