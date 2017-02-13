package four;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1=new Random();
		Random rand2=new Random();
		for (int i = 0; i < 25; i++) {
			int x=rand1.nextInt();
			int y=rand2.nextInt();
			if(x<y) System.out.println(x+"<"+y);
			else if(x>y) System.out.println(x+">"+y);
			else System.out.println(x+"="+y);
		}
		Random rand3=new Random();
		Random rand4=new Random();
		for (int i = 0; i < 25; i++) {
			int x=rand3.nextInt(10);
			int y=rand4.nextInt(10);
			if(x<y) System.out.println(x+"<"+y);
			else if(x>y) System.out.println(x+">"+y);
			else System.out.println(x+"="+y);
		}
	}

}
