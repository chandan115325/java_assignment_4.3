class C
{
	public void Test()
	{
		System.out.println("Method1 of C class");
	}
}

class B extends C
{
	public void Test()
	{
		super.Test();
		System.out.println("Method1 of B class");
		
	}
}

class A extends B
{
	public void Test()
	{
		super.Test();
		System.out.println("Method1 of A class");
	}
}
public class Demo {
	public static void main(String[] args)
	{
		A a=  new A();
		a.Test();
	}
}

//Answer is
//b. super.test();