package eight;
import static net.mindview.util.Print.*;
public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starship s=new Starship();
		s.check();
		s.FastSpeed();
		s.check();
		s.SlowSpeed();
		s.check();
		s.UniformSpeed();
		s.check();
	}

}

class AlbertStatus{
	public void alert(){}
}

class FastSpeed extends AlbertStatus{
	@Override
	public void alert() {
		// TODO Auto-generated method stub
		print("Fast");
	}
}

class UniformSpeed extends AlbertStatus{
	@Override
	public void alert() {
		// TODO Auto-generated method stub
		print("UniformSpeed");
	}
}

class SlowSpeed extends  AlbertStatus{
	@Override
	public void alert() {
		// TODO Auto-generated method stub
		print("Slow");
	}
}

class Starship{
	public AlbertStatus albertStatus=new FastSpeed();
	public void FastSpeed(){
		albertStatus=new FastSpeed();
	}
	public void UniformSpeed(){
		albertStatus=new UniformSpeed();
	}
	public void SlowSpeed(){
		albertStatus=new SlowSpeed();
	}
	public void check(){
		albertStatus.alert();
	}
}