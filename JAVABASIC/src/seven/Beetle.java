package seven;
import static net.mindview.util.Print.*;
public class Beetle extends Insect{
private int k=printInit("Beekle.k initialized");
public Beetle(){
	print("k="+k);
	print("j="+j);
}
private static int x2=printInit("static Beetle.x2 initialized");
public static void main(String[] args) {
	print("Beetle constructor");
	Beetle b=new Beetle();
}
}

class HolotrichiatitanisReitt extends Beetle{
	private int l=printInit("HolotrichiatitanisReitt.l initialized");
	public HolotrichiatitanisReitt(){
		print("l="+l);
		print("j="+j);
	}
	private static int x3=printInit("static HolotrichiatitanisReitt.x3 initialized");
	public static void main(String[] args) {
		print("HolotrichiatitanisReitt constructor");
		//Beetle.main(args);
		HolotrichiatitanisReitt h=new HolotrichiatitanisReitt();
		
	}
}
class Insect{
	private int i=9;
	protected int j;
	Insect(){
		print("i="+i+",j="+j);
		j=39;
	}
	private static int x1=printInit("static Insect.x1 initialized");
	static int printInit(String s){
		print(s);
		return 47;
	}
}

