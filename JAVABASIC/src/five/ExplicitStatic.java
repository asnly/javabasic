package five;
import static net.mindview.util.Print.*;
public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Inside main()");
		Cups.cup1.f(99);
	}

}

class Cup{
	Cup(int marker){
		print("Cup("+marker+")");
	}
	void f(int marker){
		print("f("+marker+")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1=new Cup(1);
		cup2=new Cup(2);
	}
	Cups(){
		print("Cups()");
	}
}