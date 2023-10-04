package InputOutput;

import java.util.Scanner;

public class pattern_IO {
	public static int row,col,size;
	public static void ioRowCol()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter number of Row: ");
		row=enter.nextInt();
		System.out.print("Enter number of Column: ");
		col=enter.nextInt();
	}
	public static void size()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter size: ");
		size=enter.nextInt();
	}
}
