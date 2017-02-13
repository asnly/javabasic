package five;

public class MoneyTest {
	MONEY money;
	public MoneyTest(MONEY m){
		this.money=m;
	}
	public void describe(){
		System.out.println("This money is ");
		switch(money){
		case ONE:System.out.println("one");break;
		case TEN:System.out.println("ten");break;
		case TWENTY:System.out.println("twenty");break;
		case FIFTY:System.out.println("fifty");break;
		case HUNDRED:System.out.println("hundred");break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(MONEY m:MONEY.values()){
			System.out.println(m+",ordinal "+m.ordinal());
		}
		MoneyTest one=new MoneyTest(MONEY.ONE);
		MoneyTest two=new MoneyTest(MONEY.TWENTY);
		MoneyTest three=new MoneyTest(MONEY.FIFTY);
		MoneyTest four=new MoneyTest(MONEY.HUNDRED);
		one.describe();
		two.describe();
		three.describe();
		four.describe();
		
	}

}
