package Patterns;
import InputOutput.pattern_IO;

public class RectangleOrSquare {
	
	public void print()
	{
		pattern_IO.ioRowCol();
		int row=pattern_IO.row;
		int col=pattern_IO.col;
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void printHollow()
	{
		pattern_IO.ioRowCol();
		int row=pattern_IO.row;
		int col=pattern_IO.col;
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || j==1 || i==row || j==col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
