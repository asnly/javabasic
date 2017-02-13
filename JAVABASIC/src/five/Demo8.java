package five;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeClass f1=new FinalizeClass(true);
		FinalizeClass f2=new FinalizeClass(true);
		f1.logOut();
//		f1.logIn();
		new FinalizeClass(true);
		System.gc();
	}

}

class FinalizeClass{
	boolean loggedIn=false;
	FinalizeClass(boolean logStatus){
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