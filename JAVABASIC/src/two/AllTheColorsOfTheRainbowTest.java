package two;

public class AllTheColorsOfTheRainbowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class AllTheColorsOfTheRainbow{
			int anIntegerRepresentingColors;
			void changeTheHueOfTheColor(int newHue){
				this.anIntegerRepresentingColors=newHue;
			}
			@Override
			public String toString() {
				return "AllTheColorsOfTheRainbow [anIntegerRepresentingColors="
						+ anIntegerRepresentingColors + "]";
			}
			
		}
		AllTheColorsOfTheRainbow a=new AllTheColorsOfTheRainbow();
		a.changeTheHueOfTheColor(22);
		System.out.println(a.toString());
	}

}
