package nine;
import eight.Note;
import static net.mindview.util.Print.*;

public class Demo5 {
//	static void tune(Instrument22 i){
//		i.play(Note.MIDDLE_C);
//	}
	static void tune(Playable p){
		p.play(Note.MIDDLE_C);
	}
//	static void tuneAll(Instrument22[] in){
//		for (Instrument22 instrument22 : in) {
//			tune(instrument22);
//		}
//	}
	static void tuneAll(Playable[] po){
	    for(Playable p:po){
	    	tune(p);
	    }
	}
	public static void main(String[] args) {
//		Instrument22[] o={new Wind(),new Persussion(),new Stringed(),new Brass(),new Woodwind()};
//		tuneAll(o);
		Playable[] p={new Wind(),new Persussion(),new Stringed(),new Brass(),new Woodwind()};
		tuneAll(p);
	}
}

class Wind extends Instrument22 implements Playable{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this+".play()"+n);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wind";
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		print(this+".adjust()");
	}
	
}

class Persussion extends Instrument22 implements Playable{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this+".play()"+n);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persussion";
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		print(this+".adjust()");
	}
	
}

class Stringed extends Instrument22 implements Playable{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println(this+".play()"+n);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stringed";
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		print(this+".adjust()");
	}
	
}

class Brass extends Wind{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass";
	}
}

class Woodwind extends Wind{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind";
	}
}


