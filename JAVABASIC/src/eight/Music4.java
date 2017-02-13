package eight;

import static net.mindview.util.Print.print;

public class Music4 {
	/**
	 * 验证多态性是否作用于所添加的新类型
	 */
//	public static void tune1(Instrument1 i){
//		i.play(Note.MIDDLE_C);
//	}
//	public static void tuneAll1(Instrument1[] e){
//		for (Instrument1 instrument : e) {
//			tune1(instrument);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Instrument1[] i={new Wind1(),new Percussion1(),new Stringed1(),new Brass1(),new Woodwind1(),new Keyboard(),new piano()};
//		tuneAll1(i);
//	}
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	private static Music3gGenerator g=new Music3gGenerator();
	public static void main(String[] args) {
		Instrument[] i=new Instrument[9];
		for (int j = 0; j < i.length; j++) {
			i[j]=g.next();
		}
		tuneAll(i);
		for (Instrument instrument : i) {
			System.out.println(instrument);
		}
	}
}

class Instrument1{
	void play(Note n){
		print("Instrument1.play() "+n);
	}
	public String toString() { return "Instrument1"; }
	void adjust(){
		print("Adjusting Instrument1");
	}
}
class  Wind1 extends Instrument1{
	void play(Note n){
		print("Wind1.play() "+n);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wind1";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Wind1");
	}
	
}
class Percussion1 extends Instrument1{
	void play(Note n){
		print("Percussion1.play() "+n);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Percussion1";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Percussion1");
	}
	
}

class Stringed1 extends Instrument1{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Stringed1.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stringed1";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Stringed1");
	}
}

class Keyboard extends Instrument1{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Keyboard.play()");
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Keyboard");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Keyboard";
	}
}

class piano extends Keyboard{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("piano.play()");
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting piano");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "piano";
	}
}
class Brass1 extends Wind1{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Brass1.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass1";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Brass1");
	}
	
}

class Woodwind1 extends Wind1{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Woodwind1.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind1";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Woodwind1()");
	}
}



