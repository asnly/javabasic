package eight;
import static net.mindview.util.Print.*;
public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		new Rectangular(2, 6);
	}

}


class Glyph{
	void draw(){
		print("Glyph.draw()");
	}
	Glyph(){
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius=1;
	RoundGlyph(int r){
		radius=r;
		print("RoundGlyph.RoundGlyph(),radius = "+radius);
	}
	void draw(){
		print("RoundGlyph.draw(),radius = "+radius);
	}
}

class Rectangular extends Glyph{
	private int a=1,b=3;
	public Rectangular(int a,int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		print("Rectangular.Rectangular(),a="+a+",b="+b);
	}
	void draw(){
		print("Rectangular.draw(),a="+a+",b="+b);
	}
}
