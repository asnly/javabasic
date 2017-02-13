package eight;

import java.util.Random;
/**
 * 
 * @author caolinchao
 *基类和导出类的初始化顺序
 */
public class RandomRodentGenerator {
	Random rand=new Random();
	protected Shared1 shared=new Shared1();
//	public Rodent1 next(){
//		switch(rand.nextInt(4)){
//		default:
//		case 0:return new Mouse1();
//		case 1:return new Gerbil1();
//		case 2:return new Hamster1();
//		case 3:return new Squirrel();
//		}
//	}
	public Rodent1 next(){
		switch(rand.nextInt(4)){
		default:
		case 0:return new Mouse1(shared);
		case 1:return new Gerbil1(shared);
		case 2:return new Hamster1(shared);
		case 3:return new Squirrel(shared);
		}
	}
}
