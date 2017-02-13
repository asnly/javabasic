package five;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark();
		d.bark((char)c);
		d.bark((byte)b);
		d.bark((short)s);
		d.bark(1);
		d.bark(1L);
		d.bark(1.0f);
		d.bark(1.0);
	}

}

class Dog{
	void bark(){
		System.out.println("quiet");
	}
	void bark(char c){
		System.out.println("cawcaw");
	}
	void bark(byte b){
		System.out.println("barkbark");
	}
	void bark(short s){
		System.out.println("sldafsd");
	}
	void bark(int i){
		System.out.println("iyow");
	}
	void bark(long L){
		System.out.println("lfd");
	}
	void bark(float f){
		System.out.println("dafs");
	}
	void bark(double d){
		System.out.println("dodo");
	}
}