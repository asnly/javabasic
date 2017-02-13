package seven;

public class Demo5 {
	private final int i;
	public Demo5(){
		i=11;
	}
	public Demo5(int c){
		this.i=c;
	}
	public void show(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d=new Demo5();
		d.show();
		Demo5 d2=new Demo5(333);
		d2.show();
		//d2.i=88;
	}

}
