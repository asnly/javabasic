package six;

public class ConnectionManager {
	static Connection[] c=new Connection[5];
	static int how=3;
	{
		for(Connection x:c){
			x=Connection.makeSoup();
		}
	}
	public static Connection get(){
		if(how>0){
			return c[--how];
		}else{
			System.out.println("no more conneciton");
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionManager cm = new ConnectionManager();
		System.out.println(cm.how);
		cm.get();
		System.out.println(how);
		cm.get();
		System.out.println(how);
		cm.get();
		System.out.println(cm.get());
		System.out.println(how);
	}

}
