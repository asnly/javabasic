package seven;

import static net.mindview.util.Print.print;

public class FinalOverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideFinal of =new OverrideFinal();
		of.f();
		of.g();
		of.h();
		WithFinal wf=of;
		wf.f();
		wf.g();
		wf.h();
	}

}

class WithFinal{
	final void f(){
		print("WithFinals.f()");
	}
	void g(){
		print("WithFinals.g()");
	}
	final void h(){
		print("WithFinals.h()");
	}
}

class OverrideFinal extends WithFinal {
	// attempt to override:
	// public final void f() { print("OverrideFinal.f()"); } // no can do
	@Override public void g() { print("OverrideFinal.g()"); } // OK, not final
	// final void h(); { print("OVerrideFinal.h()"); } // cannot override final 	
}