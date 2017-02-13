package seven;
import static org.greggordon.tools.Print.*;
public class LoadClass extends B{
	static int i=printInit("LoadClass.i initialized");
	LoadClass(){println("LoadClass() constructor");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("hi");
		LoadClass lc=new LoadClass();
		println(C.a);
		D d=new D();
	}

}

class A{
	static int j=printInit("A.j initialized");
	static int printInit(String s){
		println(s);
		return 1;
	}
	A(){println("A() constructor");}
}

class B extends A{
	static int k=printInit("B.k initialized");
	B(){println("B() constructor");}
}

class C{
	static int n=printInitC("C.n initialized");
	static A a=new A();
	C(){println("C() constructor");}
	static int printInitC(String s){
		println(s);
		return 1;
	}
}

class D{
	D() {println("D() constructor");}
}