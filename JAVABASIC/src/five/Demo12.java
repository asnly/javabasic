package five;

public class Demo12 {
	static void showStrings(String...args){
		for (String string : args) {
			System.out.println(string+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showStrings("one", "TWO", "three", "four");
		showStrings(new String[]{"1", "2", "3", "4"});
	}

}
