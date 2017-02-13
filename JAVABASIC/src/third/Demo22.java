package third;
import static net.mindview.util.Print.*;
public class Demo22 {
	static void f(Floatf f){
		f.f=23.32f;
	}
	public static void main(String[] args) {
		Floatf f2=new Floatf();
		f2.f=23234.32F;
		print("1:f2.f: "+f2.f);
		f(f2);
		print("2:f2.f: "+f2.f);
	}
}

class Floatf{
	float f;
}
