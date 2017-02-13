package eight;

import java.util.Random;
/**
 * 随机创建Instrument对象
 * @author caolinchao
 *
 */
public class Music3gGenerator {
	private Random rand=new Random();
	public Instrument next(){
		switch(rand.nextInt(5)){
		default:
		case 1: return new Wind();
		case 2: return new Percussion();
		case 3: return new Stringed();
		case 4: return new Brass();
		case 5: return new Woodwind();
		}
	}
}
