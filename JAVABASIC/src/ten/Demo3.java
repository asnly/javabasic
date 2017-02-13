package ten;

public class Demo3 {
	public static void main(String[] args) {
		PRIVATE p=new PRIVATE();
		p.getinner("dsfasfs");
	}
}

class PRIVATE{
	private String s="dsfasfqe231312121213213123";
	
	private void setS(String s) {
		this.s = s;
		p();
	}
	public void p(){
		System.out.println(s);
	}

	public class innerclass{
		private double i=2131231231231231D;
		public void change(String s2){
			setS(s2);
		}
	}
	public void getinner(String s){
		innerclass in=new innerclass();
		in.change(s);
		System.out.println(in.i);
	}
}
