package seven;

public class Demo1 {
	private DD d;
	public Demo1(String s){
		d=new DD(s);
	}
	public static void main(String[] args) {
		Demo1 d2=new Demo1("aa");
	}
}


class DD{
	private String s;
	public DD(String s){
		this.s=s;
		System.out.println(s);
	}
}