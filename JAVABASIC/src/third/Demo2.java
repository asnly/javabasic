package third;

public class Demo2 {
	float f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 demo=new Demo2();
		Demo2 demo1=new Demo2();
		demo.f=111.3F;
		demo1.f=123213.3F;
		System.out.println("f="+demo.f+",demo1.f="+demo1.f);
		demo=demo1;
		System.out.println("2.f="+demo.f+",demo1.f="+demo1.f);
		demo.f=demo1.f;
		System.out.println("3.f="+demo.f+",demo1.f="+demo1.f);
	}

}
