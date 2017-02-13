package third;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='m';
		System.out.println(Integer.toBinaryString(c));
		c='a';
		System.out.println(Integer.toBinaryString(c));
		c='e';
		System.out.println(Integer.toBinaryString(c));
		c+=1;
		System.out.println(Integer.toBinaryString(c));
		for (int i = 0; i < 26; i++) {
			c+=1;
			System.out.println(Integer.toBinaryString(c));
		}
	}

}
