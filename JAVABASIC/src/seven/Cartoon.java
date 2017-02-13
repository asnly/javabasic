package seven;
import static net.mindview.util.Print.*;
public class Cartoon extends Drawing{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x=new Cartoon(); 
		System.out.println(x.getClass().getDeclaredConstructors());
	}

}

class Art{
	Art(){
		print("Art constructor");
	}
}

class Drawing extends Art{
	Drawing(){
		print("Drawing constructor");
	}
}