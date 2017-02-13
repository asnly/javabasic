package nine;

public class Demo6 {
static void ff(A a){
	a.f();
	a.g();
}
static void BB(B b){
	b.print();
	b.v();
}
static void CC(C c){
	c.show();
	c.p();
}
static void DD(D d){
	d.ha();
}
public static void main(String[] args) {
	tt  t =new tt();
	ff(t);
	BB(t);
	CC(t);
	DD(t);
	 
}
}


interface A{
	public void f();
	public void g();
}

interface B{
	public void print();
	public void v();
}

interface C{
	public void show();
	public void p();
}

interface D extends A,B,C{
	public void ha();
}

/**
 * 
 * @author caolinchao
 *创建一个实现了改新接口并且继承了某个具体类的类
 */
//class dd{
//	private int i=0;
//	public dd(int d){
//		this.i=d;
//	}
//}
abstract class dd{
	private int d=11;
	public abstract void s(int i);
}

class tt extends dd implements D{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void s(int i) {
		// TODO Auto-generated method stub
		
	}
}