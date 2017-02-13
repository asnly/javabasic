package seven;
import static net.mindview.util.Print.*;
public class Detergent extends Cleanser{
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam(){
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent x=new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}

class DT extends Detergent{
	public void scrub(){
		append("  DT scrub()");
		super.scrub();
	}
	public  void sterilize(){
		append(" sterilize()");
	}
	public static void main(String[] args) {
		DT t=new DT();
		t.dilute();
		t.apply();
		t.scrub();
		t.foam();
		t.sterilize();
		print(t);
		print("Testing DT");
		Detergent.main(args);
	}
}
class Cleanser{
	private String s = "Cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		append(" dliute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleanser x=new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}