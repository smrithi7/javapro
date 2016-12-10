//switch-case
import java.util.Scanner;

public class Switchcase {
public static void main(String args[])
{
	char ch;
	Scanner in=new Scanner(System.in);
	ch=in.next().charAt(0);
	switch(ch)
	{
		case 'a':
			System.out.println("JAVA");
			break;
		case 'b':
			System.out.println("ANDROID");		
			break;
		case 'c':
			System.out.println("DOTNET");
			break;
			default:
				System.out.println("Wrong choice");
				
	}
}
}
