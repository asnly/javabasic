package nine;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner s= new Scanner(new RandomCharsAdapter(10));
		while(s.hasNext()){
			System.out.println(s.next()+" ");
		}
	}
}


class RandomChars{
	private static Random rand=new Random();
	public char next(){
		return (char) rand.nextInt(128);
	}
	public static void main(String[] args) {
		RandomChars rc=new RandomChars();
		for (int i = 0; i < 10; i++) {
			System.out.println(rc.next()+" ");
		}
	}
}


class RandomCharsAdapter extends RandomChars implements Readable{
	private int count;
	public RandomCharsAdapter(int count) {
		// TODO Auto-generated constructor stub
		this.count=count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count--==0){
			return -1;
		}
		String result=Character.toString(next())+" ";
		cb.append(result);
		return result.length();
	}
	
}