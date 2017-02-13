package nine;

import java.util.Random;
import java.util.Scanner;

public class Demo9 {
	public static void playGame(TouandzhiFactory f){
		Game g=f.getService();
		g.play();
	}
	public static void main(String[] args) {
		playGame(new zhiFactory());
		playGame(new touFactory());
	}
}


interface Game{
	public void play();
}


interface TouandzhiFactory{
	Game getService();
}

class zhi implements Game{
	Random rand=new Random();
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("掷的次数");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		for (int i = 0; i <b; i++) {
			int m=rand.nextInt(6)+1;
			System.out.println("点数"+m);
		}
	}
}

class zhiFactory implements TouandzhiFactory{

	@Override
	public Game getService() {
		// TODO Auto-generated method stub
		return new zhi();
	}
}


class  tou implements Game{
	Random r=new Random();
	@Override
	public void play() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("投的次数");
		int d=s.nextInt();
		//int r2=r.nextInt(2);
		for (int i = 0; i < d; i++) {
			int r2=r.nextInt(2)+1;
			switch (r2) {
			case 1:
				System.out.println("硬币为正面");
				break;
			case 2:
				System.out.println("硬币为反面");
				break;
			}
			//System.out.println("硬币为"+r2);
		}
	}
}

class touFactory implements TouandzhiFactory{

	@Override
	public Game getService() {
		// TODO Auto-generated method stub
		return new tou();
	}
	
}