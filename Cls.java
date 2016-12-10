//inheritance
class A{
	public void mul()
	{
		int a=10,b=10,x;
	    x=a*b;
		System.out.println(""+x);
	}
}
class B extends A{
	public void div(){
		int z=100,y=200;
		int x=y/z;
		System.out.println(""+x);
	}
}
class C extends B{
	public void doo(){
		int p=20;
		int x=p-1;
		System.out.println(""+x);
	}
}
class Cls{
	public static void main(String args[])
{
		C c=new C();
		c.mul();
		c.div();
		c.doo();
}
}
