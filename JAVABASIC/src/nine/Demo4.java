package nine;

public class Demo4 {
	public static void testPrint(NomethodClass no){
		((MethodClass)no).print();
	}
	public static void test(SecondDad s){
		s.print();
	}
	public static void main(String[] args) {
		MethodClass m=new MethodClass();
		Demo4.testPrint(m);
		SecondSon s=new SecondSon();
		Demo4.test(s);
	}
}

abstract class NomethodClass{
}

class MethodClass extends NomethodClass{
	protected void print(){
		System.out.println("MethodClass");
	}
	
}

abstract class SecondDad{
	abstract protected void print();
}

class SecondSon extends SecondDad{
	protected void print(){
		System.out.println("SecondSon");
	}
}
