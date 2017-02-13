package two;

public class DataOnlyTest {
	public static void main(String[] args) {
		class DataOnly{
			int i;
			double d;
			boolean b;
			void show(){
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		DataOnly data=new DataOnly();
		data.i=47;
		data.d=1.1;
		data.b=false;
		data.show();
	}
}
