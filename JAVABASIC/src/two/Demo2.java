package two;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String23 s=new String23();
		System.out.println(s.storage("dsafsfsfs"));
	}

}

class String23{
	int storage(String s){
		return s.length()*2;
	}
}
