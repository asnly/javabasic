package five;

public class Demo81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeClass1 f1=new FinalizeClass1(true);
		FinalizeClass1 f2=new FinalizeClass1(true);
		f1.logOut();
		new FinalizeClass1(true);
		System.gc();
		System.runFinalization();
	}

}

class FinalizeClass1{
	boolean loggedIn=false;
	FinalizeClass1(boolean logStatus){
		loggedIn=logStatus;
	}
	void logIn(){
		loggedIn=true;
	}
	void logOut(){
		loggedIn=false;
	}

	protected void finalize(){
		// TODO Auto-generated method stub
		if(loggedIn)
			System.out.println("Error22: still logged in");
	
	}
}