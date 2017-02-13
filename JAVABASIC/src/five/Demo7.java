package five;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoConstructor t =new TwoConstructor();
	}

}

class TwoConstructor{
	public TwoConstructor(){
		this("dd");
		System.out.println("This is TwoConstructor()");
	}
	public TwoConstructor(String s){
		System.out.println("This is another TwoConstructor() "+s);
	}
}
