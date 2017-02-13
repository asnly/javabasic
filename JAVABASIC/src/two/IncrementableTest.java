package two;

public class IncrementableTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Incrementable in=new Incrementable();
//		in.increment();;
		Incrementable.increment();
	}

}

class StaticTest{
	static int i=47;
}

class Incrementable{
	static void increment(){
		StaticTest.i++;
		System.out.println(StaticTest.i);
	}
}