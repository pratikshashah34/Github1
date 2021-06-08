package Abstraction;

public abstract class Test extends Abstraction{

	@Override
	public void m2() {
		System.out.println("i m implent m2 method in parent");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		System.out.println("i m implemrnted m3 method in paent");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		System.out.println("i m implement m4 mehod in parent");
		// TODO Auto-generated method stub
   
	}

	public abstract void m5();
		
		
	
	public final void m6() {
		System.out.println("i m final method");
	}
		
	
}
