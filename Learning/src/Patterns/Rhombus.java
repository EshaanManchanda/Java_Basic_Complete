package Patterns;
import InputOutput.pattern_IO;

public class Rhombus {
	public void print()
	{
		pattern_IO.ioRowCol();
		int row=pattern_IO.row;
		int col=pattern_IO.col;
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int space=1;space<i;space++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
