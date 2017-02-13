package third;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0x10000000;
		System.out.println(Integer.toBinaryString(h));
		for (int i = 0; i < 28; i++) {
			h>>>=1;
			System.out.println(Integer.toBinaryString(h));
		}
	}

}
