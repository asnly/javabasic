package nine;
import static net.mindview.util.Print.*;
public class Sandwich extends PortableLunch implements FastFood{
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	private Letture l=new Letture();
	private Pickle p=new Pickle();
	public Sandwich(){
		print("Sandwich()");
	}
	public static void main(String[] args) {
		
		Sandwich s=new Sandwich();
		s.cheeseburger();
		s.fries();
		s.softDrink();
	}
	@Override
	public void cheeseburger() {
		// TODO Auto-generated method stub
		System.out.println("cheeseburger");
	}
	@Override
	public void fries() {
		// TODO Auto-generated method stub
		System.out.println("fries");
	}
	@Override
	public void softDrink() {
		// TODO Auto-generated method stub
		System.out.println("softDrink");
	}
}

class Meal{
	Meal(){
		print("Meal()");
	}
}

class Bread{
	Bread(){
		print("Bread()");
	}
}

class Cheese{
	Cheese(){
		print("Cheese");
	}
}

class Letture{
	Letture(){
		print("Letture");
	}
}

class Lunch extends Meal{
	Lunch(){
		print("Lunch()");
	}
}

class Pickle{
	Pickle(){
		print("Pickle()");
	}
}
class PortableLunch extends Lunch{
	public PortableLunch() {
		// TODO Auto-generated constructor stub
		print("PortableLunch()");
	}
}
