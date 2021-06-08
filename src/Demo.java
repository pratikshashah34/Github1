


public class Demo {
	
	
	{
		
	
	 System.out.println("instnce block");
	}	 

void m1()
{
	 System.out.println(" m1 ");
}

void m2()
{
	 System.out.println(" m2 ");
	 this.m1();
}

public static void main(String args[])
{
	Demo d1=new Demo();
	d1.m2();
}
}
