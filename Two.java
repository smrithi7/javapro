import java.util.Scanner;


public class Two {
public static void main(String args[])
{
	//even odd
	int n,lar=0,small = 0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	if(n%2==0)
		System.out.println("The given number is even");
	else
		System.out.println("The given number is odd");
	//greatest smallest
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=in.nextInt();	
	}
	for(int i=0;i<3;i++)
		for(int j=0;j<3;j++)
		{
			if(a[i]>a[j])
				lar=a[i];
			if(a[i]<a[j])
			    small=a[i];
		}
				System.out.println("Greatest number is "+lar);
				System.out.println("Smallest number is "+small);
		}
}

