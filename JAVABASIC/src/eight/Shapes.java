package eight;

public class Shapes {
 private static RandomShapeGenerator gen=new RandomShapeGenerator();
 public static void main(String[] args) {
	Shape[] s=new Shape[10];
	for (int i = 0; i < s.length; i++) {
		s[i]=gen.next();
	}
	for (Shape shape : s) {
		shape.draw();
		shape.display();
	}
}
}
