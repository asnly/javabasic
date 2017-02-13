package seven;

public class AmphibianTest {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.color("green");
		f.legs(4);
		f.eat();
		f.grow(f);
	}
}


class Amphibian{
	int i;
	String s;
	public void legs(int i){
		this.i=i;
		System.out.println("Amphibian legs"+i);
	}
	public void color(String s){
		this.s=s;
		System.out.println("Amphibian color"+s);
	}
	public void eat(){
		System.out.println("Amphibian eat");
	}
}

class Frog extends Amphibian{
	static void grow(Amphibian a){
		System.out.println("Amphian grow");
		a.eat();
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Frog eat");
	}
}