package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
public class sum2num {
	
	public void sum()
	{
		TrickyQuestion_IO.twoDigIO();
		int sum=TrickyQuestion_IO.val1+TrickyQuestion_IO.val2;
		System.out.println("Sum is "+sum);
	}
	public int sum(int a , int b)
	{
		return a+b;
	}

}
