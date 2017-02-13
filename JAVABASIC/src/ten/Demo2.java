package ten;

public class Demo2 {
	public static void main(String[] args) {
		
		
		/**
		 * 添加若干个String对象到Sequence
		 */
//		StringsA w1=new StringsA("dsaf");
//		StringsA w2=new StringsA("dsa2f");
//		StringsA w3=new StringsA("ddsf");
//		Sequence seq2=new Sequence(3);
//		seq2.add(w1);
//		seq2.add(w2);
//		seq2.add(w3);
//		Selector sel=seq2.selector();
//		while(!sel.end()){
//			System.out.println(sel.current()+" ");
//			sel.next();
//		}
		Sequence.main(args);
	}
}

class StringsA{
	public String s;
	public StringsA(String a){
		this.s=a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
}

interface Selector{
	boolean end();
	Object current();
	void next();
}

class Sequence{
	private Object[] items;
	private int next=0;
	public Sequence(int size){
		items=new Object[size];
	}
	public void add(Object x){
		if(next<items.length){
			items[next++]=x;
		}
	}
	public void test(){
		System.out.println("Sequence.test()");
	}
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<items.length) i++;
		}
		public Sequence sequence(){
			return Sequence.this;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence seq=new Sequence(10);
		for (int i = 0; i < 10 ;i++) {
			seq.add(Integer.toString(i));
		}
		Selector selector=seq.selector();
		while(!selector.end()){
			System.out.println(selector.current()+" ");
			selector.next();
		}
		((SequenceSelector)selector).sequence().test();
	}
}

