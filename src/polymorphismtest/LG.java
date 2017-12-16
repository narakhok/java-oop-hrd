package polymorphismtest;

public class LG implements PhoneIStandard {

	@Override
	public void call() {
		System.out.println("LG is calling");
		
	}

	@Override
	public void message() {
		System.out.println("LG is messaging");
		
		
	}

	@Override
	public void turnoff() {
		System.out.println("LG is turnoff");
		
		
	}

	@Override
	public void turnon() {
		System.out.println("LG is turnon");
		
		
	}


}
