package five;

public class Demo11 {
	public Demo11(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11[] d=new Demo11[5];
		Demo112[] d1=new Demo112[6];
		for (int i = 0; i < d1.length; i++) {
			d1[i]=new Demo112(String.valueOf(i));
		}
	}

}

class Demo112{
	public Demo112(String s){
		System.out.println(s);
	}
}
