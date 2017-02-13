package third;

public class Demo6 {
public static void main(String[] args) {
	int i = 1 + 4 + 16 + 64;
	int j = 2 + 8 + 32 + 128;
	System.out.println("i = " + Integer.toBinaryString(i));
	System.out.println("j = " + Integer.toBinaryString(j));
	System.out.println("i & j = " + Integer.toBinaryString(i & j));
	System.out.println("i | j = " + Integer.toBinaryString(i | j));
	System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
	System.out.println("~i = " + Integer.toBinaryString(~i));
	System.out.println("~j = " + Integer.toBinaryString(~j));
}
}
