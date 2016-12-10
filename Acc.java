//Access-modifier
public class Acc {
	private void fun3()
	{
		float v=11.1f;
		System.out.println(""+v);
	}
public static void main(String args[])
{
	Another a=new Another();
	a.fun1();
	a.fun2();
	Acc at=new Acc();
	at.fun3();
	//a.fun3();
}
}
class Another{
	public void fun1()
	{
		int val=25;
		System.out.println(""+val);
	}
	protected void fun2()
	{
		double value=77.77;
		System.out.println(""+value);
	}
	/*private void fun3()
	{
		float v=11.1f;
		System.out.println(""+v);
	}*/
}