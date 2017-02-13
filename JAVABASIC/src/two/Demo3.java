package two;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StaticTest.i= " + StaticTest2.i);
		StaticTest2 st1 = new StaticTest2();
		StaticTest2 st2 = new StaticTest2();
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		Incrementable2.increment();
		System.out.println("After Incrementable.increment() called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		Incrementable2.increment();
		System.out.println("After Incrementable.increment called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		st1.i = 3;
		System.out.println("After st1.i = 3, ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("Create another StaticTest, st3.");
		StaticTest2 st3 = new StaticTest2();
		System.out.println("st3.i = " + st3.i);
	}

}

class StaticTest2{
	static int i = 47;
}

class Incrementable2{
	static void increment(){
		StaticTest2.i++;
	}
}
