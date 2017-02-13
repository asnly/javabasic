package nine;

public class Adventure {
	public static void t(CanFight x){x.fight();}
	public static void b(CanClimb x){
		x.climb();
	}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void main(String[] args) {
		Hero h=new Hero();
		t(h);
		b(h);
		u(h);
		v(h);
		w(h);
	}
}


interface CanFight{
	void fight();
}

interface CanClimb{
	void climb();
}

interface CanFly{
	void fly();
}

interface CanSwim{
	void swim();
}
class ActionCharacter{
	public void fight(){}
}

class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly,CanClimb{

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}