package second;

import first.First;

public class FirstTest {
	protected class D implements First{

		@Override
		public String f() {
			// TODO Auto-generated method stub
			return "D.f()";
		}
		public D(){
			System.out.println("D()");
		}
	}
}
