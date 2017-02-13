package SecondTest;

import first.First;
import second.FirstTest;

public class SecondTest extends FirstTest{
	public First getd(){
		return this.new D();
	}
	public static void main(String[] args) {
		SecondTest st=new SecondTest();
		System.out.println(st.getd().f());
	}
}
