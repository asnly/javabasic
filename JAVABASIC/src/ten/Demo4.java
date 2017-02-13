package ten;

public class Demo4 {
	/**
	 * 在某个方法内定义一个内部类以实现次接口
	 */
//	public static xx d(){
//		class a implements xx{
//
//			@Override
//			public void f() {
//				// TODO Auto-generated method stub
//				System.out.println("a.f()");
//			}
//			
//		}
//		return new a();
//	}
//	public static void main(String[] args) {
//		Demo4 d=new Demo4();
//		d.d().f();
//	}
	/**
	 * 内部类定义在某个方法的一个作用域内
	 */
	
	private void p(boolean b){
		if(b){
			class a implements xx{
				private int a;
				public a(int b){
					this.a=b;
				}
				@Override
				public void f() {
					// TODO Auto-generated method stub
					System.out.println("a.f() "+a);
				}
				Integer geta(){
					return a;
				}
			}
			a a1=new a(11);
			int a2=a1.geta();
			System.out.println(a2);
		}
	}
	public void track(){
		p(true);
	}
	public static void main(String[] args) {
		Demo4 d=new Demo4();
		d.track();
	}
}

interface xx{
	public void f();
}


