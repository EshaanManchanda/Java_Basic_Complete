package InputOutput;
import java.util.Scanner;

public class TrickyQuestion_IO {
	public static int val1=1,val2=2,val3=3;
	public static void oneDigIO()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter a number: ");
		val1=enter.nextInt();
//		enter.close();
	}
	public static void twoDigIO()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter First Value: ");
		val1=enter.nextInt();
		System.out.print("Enter Second Value: ");
		val2=enter.nextInt();
//		enter.close();
	}
	public static void threeValIO()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter First Value: ");
		val1=enter.nextInt();
		System.out.print("Enter Second Value: ");
		val2=enter.nextInt();
		System.out.print("Enter Third Value: ");
		val3=enter.nextInt();
//		enter.close();
	}
}
