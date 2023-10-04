package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
public class Fibonacci_series {
	static int n1=0,n2=1,n3=0;
	public void series()
	{
		TrickyQuestion_IO.oneDigIO();
		int count=TrickyQuestion_IO.val1;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public void series(int count)
	{
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public void seriesRecursion(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			seriesRecursion(count-1);
		}
	}
}
