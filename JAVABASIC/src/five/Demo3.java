package five;

public class Demo3 {
	public Demo3(){
		System.out.println("this is demo3");
	}
	public Demo3(String s){
		System.out.println("this is overriding Demo3 "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		Demo3 d2=new Demo3("hahha");
	}

}
