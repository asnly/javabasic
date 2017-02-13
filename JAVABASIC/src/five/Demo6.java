package five;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest t=new MethodTest();
		t.display();
	}

}

class MethodTest{
	void display(){
		System.out.println("MethodTest display()");
		laryngoscopy();
		this.laryngoscopy();
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
	
	
}
