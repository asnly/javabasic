package eight;

public class Demo3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DY2 dy=new DY2();
		dy.change("dasf");
	}

}

class DY{
	private String s="DY";
	public void change(String s){
		this.s=s;
		display(s);
	}
	public void display(String s){
		System.out.println(s);
	}
}

class DY2 extends DY{
	private String s="DY2";
	@Override
	public void display(String s2) {
		// TODO Auto-generated method stub
		this.s=s2;
		System.out.println(s);
	}
}
