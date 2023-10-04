package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
import java.lang.Math;
public class Armstrong {
	public void isArmstrong() {
		TrickyQuestion_IO.oneDigIO();
		int num=TrickyQuestion_IO.val1;
		boolean check=check(num);
		if(check==true)
		{
			System.out.println(num+" is Armstrong");
		}
		else {
			System.out.println(num+" is not Armstrong");
		}
		
	}
	public void isArmstrong(int num) {
		boolean check=check(num);
		if(check==true)
		{
			System.out.println(num+" is Armstrong");
		}
		else {
			System.out.println(num+" is not Armstrong");
		}
		
	}
	public static boolean check(int num) {
		int temp,digits=0,last=0,sum=0;
		temp=num;
		//count number on digits in number
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			// calculates the power of a number up to 
			// digit times and add the results to sum 
			// variable
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
