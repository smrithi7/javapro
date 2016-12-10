//static non static
import java.util.Scanner;
public class SNS {
public static void main(String args[])
{
	met();
	SNS s=new SNS();
	s.fact();
}
public static void met()
{
	System.out.println("Lets see factorial program!!!!");
}
public void fact()
{
	int n,fact=1;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
		System.out.println("Factorial of "+n+" is "+fact);
}
}
