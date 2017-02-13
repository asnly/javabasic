package eight;
import static net.mindview.util.Print.*;
public class Music3 {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] o={new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
		tuneAll(o);
		for (Instrument instrument : o) {
			System.out.println(instrument);
		}
	}

}

class Instrument{
	void play(Note n){
		print("Instrument.play() "+n);
	}
	public String toString() { return "Instrument"; }
	void adjust(){
		print("Adjusting Instrument");
	}
}
class  Wind extends Instrument{
	void play(Note n){
		print("Wind.play() "+n);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wind";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Wind");
	}
	
}
class Percussion extends Instrument{
	void play(Note n){
		print("Percussion.play() "+n);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Percussion";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Percussion");
	}
	
}

class Stringed extends Instrument{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Stringed.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stringed";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Stringed");
	}
}

class Brass extends Wind{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Brass.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Brass");
	}
	
}

class Woodwind extends Wind{
	@Override
	void play(Note n) {
		// TODO Auto-generated method stub
		print("Woodwind.play()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		print("Adjusting Woodwind()");
	}
}


