package eight;
import static net.mindview.util.Print.*;
public class ReferenceCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s=new Shared();
		Composing[] c={new Composing(s),new Composing(s),new Composing(s),new Composing(s),new Composing(s) };
		for (Composing composing : c) {
			composing.dispose();
		}
		Composing compTest=new Composing(s);
		Composing comTest2=new Composing(s);
		s.finalize();
		Shared s2=new Shared();
		Composing comTest3=new Composing(s2);
		s2.finalize();
	}

}

class Shared{
	private int refcount=0;
	private static long counter=0;
	private final long id=counter++;
	public Shared(){
		print("Creating "+this);
	}
	public void addRef(){
		refcount++;
	}
	@Override
	protected void finalize() {
		// TODO Auto-generated method stub
		if(refcount>0){
			print("Error "+refcount+"Shared "+id+"objects in use");
		}
	}
	protected void dispose(){
		if(--refcount==0)
			print("Disposing "+this);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shared "+id;
	}
}

class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing(Shared shared){
		print("Creating "+this);
		this.shared=shared;
		this.shared.addRef();
	}
	protected void dispose(){
		print("disposing "+this);
		shared.dispose();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Composing "+id;
	}
}
