package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
public class printPrimeNum {
	public void printPrime()
	{
		TrickyQuestion_IO.oneDigIO();
		int n=TrickyQuestion_IO.val1;
		int num=2;
		while(num<=n)
		{
			int div=2;
			while(div<num)
			{
				if(num%div==0)
				{
					num++;
				}
				else
				{
					div++;
				}
			}
			System.out.print(num+",");
			num++;
		}
	}
	public void printPrime(int n)
	{
		int num=2;
		while(num<=n)
		{
			int div=2;
			while(div<num)
			{
				if(num%div==0)
				{
					num++;
				}
				else
				{
					div++;
				}
			}
			System.out.print(num+",");
			num++;
		}
	}
}
