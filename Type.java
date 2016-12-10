//method types
public class Type {
public static void main(String args[])
{	
	Type t=new Type();
	t.func();
	int ret=t.meth();
	System.out.println("return value is "+ret);
	t.pq(5,10);
}
public void func()
{
	pq(4,7);
	System.out.println("Hello!");
}
public int meth()
{ 
	int b=5;
	b+=2;
	return b;	
}
public void pq(int p,int q)
{
	int r=p+q;
	System.out.println("Ans is "+r);
}
}
