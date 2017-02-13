package ten;

public class Demo5 {
	public static void main(String[] args) {
		pp p=new pp();
		p.get().f();
		//(uu)(p.get()).f();
	}
}

class pp{
	private class uu implements ue{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("uu.f()");
		}
		
	}
	public ue get(){
		uu u=new uu();
		return u;
	}
//	public uu gg(){
//		uu u1=new uu();
//		return u1;
//	}
}


interface ue{
	public void f();
}
