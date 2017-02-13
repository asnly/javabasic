package five;

public class TankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tank();
		System.gc();
		System.runFinalization();
		new Tank().changestatus(true);
		System.gc();
		System.runFinalization();
	}

}

class Tank{
	public boolean status=false;
	public void changestatus(boolean status){
		this.status=status;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(status){
			System.out.println("full");
			throw new Throwable("有问题");
		}else{
			System.out.println("empty,no problem");
			super.finalize();
		}
	}
	
}