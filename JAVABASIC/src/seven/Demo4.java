package seven;

public class Demo4 extends Numberinfo{
	public void number(char c){
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d=new Demo4();
		d.number('d');
		d.number(11);
		d.number(22.33D);
		d.number("dafdsasf");
	}

}

class Numberinfo{
	public void number(int i){
		System.out.println(i);
	}
	public  void number(String s){
		System.out.println(s);
	}
	public void number(double d){
		System.out.println(d);
	}
}

