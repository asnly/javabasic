package four;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++){
			int factors=0;
			for(int j = 1; j < (i + 2)/2; j++ ) {
				if((i % j) == 0) factors++; 			
			}
			if(factors < 2) System.out.println(i + " is prime");
			
		}
			
				
	}

}
