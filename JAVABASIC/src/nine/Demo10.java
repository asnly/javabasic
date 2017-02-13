package nine;

public class Demo10 {
	public static void main(String[] args) {
		innerTest in = new innerTest();
	}
}

class Outer3 {
	private int s = 33;

	public Outer3(int s2) {
		this.s = s2;
		System.out.println(s);
	}

	public int getS() {
		return s;
	}

	class inner32 {
		private String s;

		inner32(String s1) {
			this.s = s1;
		}

		public void display() {
			System.out.println("innner32"+s);
		}
	}
}

class innerTest {
	public innerTest() {
		Outer3 ou = new Outer3(11);
		Outer3.inner32 inner = ou.new inner32(String.valueOf(ou.getS()));
		inner.display();
	}
}