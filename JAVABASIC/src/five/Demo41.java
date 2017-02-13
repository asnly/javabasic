package five;

public class Demo41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark1();
		d.bark1((char)c);
		d.bark1((byte)b);
		d.bark1((short)s);
		d.bark1(1);
		d.bark1(1L);
		d.bark1(1.0f);
		d.bark1(1.0);
		d.bark1(c, 2);
		d.bark1(2, c);
	}

}

class Dog2{
	void bark1() {System.out.println("quiet");}
	void bark1(char c) {System.out.println("cawcaw");}
	void bark1(byte b) {System.out.println("barkbark");}
	void bark1(short s) {System.out.println("slurpslurp");}
	void bark1(int i) {System.out.println("iyow");}
	void bark1(long L) {System.out.println("lalala");}
	void bark1(float f) {System.out.println("fififoofum");}
	void bark1(double d) {System.out.println("dodo");}
	void bark1(char c, int i) {System.out.println("caw-iyow");}
	void bark1(int i, char c) {System.out.println("iyow-caw");}
}