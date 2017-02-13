package seven;
import static net.mindview.util.Print.*;
public class FinalOverridingIllusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingPrivate2 op2=new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op=op2;
//		op.f();
//		op.g();
	}

}

class WithFinals{
	private final void f(){
		print("WithFinals.f()");
	}
	private void g(){
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals{
//	private final void f(){
//		print("OverridingPrivate.f()");
//	}
	private final void f() { print("OverridingPrivate.f()"); }
	private void g(){
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	// attempt to override:
	public final void f() { print("OverridingPrivate2.f()"); }
	public void g() { print("OverridingPrivate2.g()"); }
	// use @Override so compiler with say "does NOT override or implement"
	// @Override public final void f() { print("OverridingPrivate2.f()"); }
	// @Override public void g() { print("OverridingPrivate2.g()"); }
}