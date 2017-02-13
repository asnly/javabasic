package four;

public class IfElse2 {
	static int test(int testval,int begin,int end){
		if(end<begin){
			System.out.println("end cannot be<begin");
			return 0;
		}
		if((testval>(begin-1))&&(testval<(end+1))) return +1;
		if((testval<begin)||(testval>end)) return -1;
		System.out.println("exceptional case");
		return 13;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(10,5,4));
		System.out.println(test(5,5,5));
	}

}
