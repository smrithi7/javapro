//getting data types
import java.util.Scanner;
public class Gett {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		byte a;
		System.out.println("Enter byte:");
		a=in.nextByte();
		System.out.println(""+a);
		short b;
		System.out.println("Enter short:");
		b=in.nextShort();
		System.out.println(""+b);
		int c;
		System.out.println("Enter int:");
		c=in.nextInt();
		System.out.println(""+c);
		long d;
		System.out.println("Enter long:");
		d=in.nextLong();
		System.out.println(""+d);
		float e;
		System.out.println("Enter float:");
		e=in.nextFloat();
		System.out.println(""+e);
		double f;
		System.out.println("Enter double:");
		f=in.nextDouble();
		System.out.println(""+f);
		boolean g;
		System.out.println("Enter boolean:");
		g=in.nextBoolean();
		System.out.println(""+g);
		char h;
		System.out.println("Enter char:");
		h=in.next().charAt(0);
		System.out.println(""+h);
		String s;
		System.out.println("Enter string:");
		s=in.next();
		System.out.println(""+s);
	}
}
