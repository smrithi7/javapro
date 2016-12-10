//overloading
public class Over {
public static void main(String args[])
{
	Over o=new Over();
	o.sum(100,200);
	o.sum(10.10,20.20);
	o.sum(40);
}
public void sum(int a,int b)
{
	int c=a+b;
	System.out.println(""+c);
}
public void sum(double p,double q)
{
	double r=p+q+q+p;
	System.out.println(""+r);
}
public void sum(int i)
{
	int j=i+10;
	System.out.println(""+j);
}
}
