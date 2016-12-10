//Constructor
public class Cons {
	public static int a=10;
	Cons()
	{
		System.out.println("Have a good day!!");
	}
	Cons(int x)
	{
		int y=200;
		int w=Cons.a;
		int z= x*y*w;
		System.out.println(""+z);
		a=20;
		System.out.println(""+a);
	}
public static void main(String args[])
{
	Cons c=new Cons();
	Cons c1=new Cons(2);
}
}
