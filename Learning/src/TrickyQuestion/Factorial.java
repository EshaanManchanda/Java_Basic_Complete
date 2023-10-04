package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
public class Factorial {
	static int i,fact=1;
	public void getFactorial()
	{
		TrickyQuestion_IO.oneDigIO();
		int num=TrickyQuestion_IO.val1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	public int getFactorial(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static int getFactorialRec(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else {
			return(num*getFactorialRec(num-1));
		}
	}
}
