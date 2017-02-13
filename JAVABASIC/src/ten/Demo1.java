package ten;

import ten.Outer1.inner2;

public class Demo1 {
	public static void main(String[] args) {
		Outer out =new Outer();
		out.in();
		Outer1 out1=new Outer1("dsf");
		inner2 in=out1.in2();
		System.out.println(in.toString());
	}
}

class Outer{
	public inner in(){
		return new inner();
	}
	class inner{
		inner(){
			System.out.println("This is an inner class");
		}
	}
}



class Outer1{
	private String s;
	public Outer1(String s){
		this.s=s;
	}
	public inner2 in2(){
		return new inner2();
	}
	class inner2{
		inner2(){
			System.out.println("This is another inner2()");
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return s;
		}
	}
}