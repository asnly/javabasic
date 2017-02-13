package six;

public class Connection {
	private static int count=0;
	public Connection(){
		System.out.println("Connection() constructor");
	}
	public static Connection makeSoup(){
		count++;
		return new Connection();
	}
}
