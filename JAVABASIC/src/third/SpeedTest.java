package third;

public class SpeedTest {
	static float v(float d,float t){
		if(t==0) return 0f;
		else return d/t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d=565.3f;
		float t=3.6f;
		System.out.println("Distance: "+d);
		System.out.println("Time: "+t);
		float v=SpeedTest.v(d, t);
		System.out.println("v="+v);
	}

}
