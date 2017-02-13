package seven;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoBase n=new NoBase();
		NoBase n2=new NoBase(21);
	}

}

class Base{
	public Base(int i){
		System.out.println("Base() "+i);
	}
}

class NoBase extends Base{

	public NoBase(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("NoBase() "+i);
	}
	public NoBase(){
		super(3);
		System.out.println("NoBase()");
	}
}

