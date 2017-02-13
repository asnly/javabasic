package eight;

import static net.mindview.util.Print.*;

public class Shared1 {
	private int refcount= 0;
	private static long counter = 0;
	private final long id1= counter++;

	public Shared1() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	public String toString() {
		return "Shared1 " + id1;
	}

	public void showRefcount() {
		System.out.println("refcount = " + refcount);
	}
}
