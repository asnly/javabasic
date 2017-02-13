package nine;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PA p=new PA();
		p.setA(11);
		p.print();;
	}
}

abstract class BaseA{
	private String s;
	public abstract void print();
}

class PA extends BaseA{
	private int a=0;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	
}