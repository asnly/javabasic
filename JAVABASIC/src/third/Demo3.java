package third;

import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int coin=rand.nextInt();
		if(coin%2==0)
			System.out.println("head");
		else{
			System.out.println("tails");
		}
	}

}
