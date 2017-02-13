package nine;

public interface AA2 {
	public void f();
}

interface BB2 extends AA2{
	public void g();
}

interface CC2 extends AA2{
	public void h();
}

interface DD extends BB2,CC2{
	public void d();
}
