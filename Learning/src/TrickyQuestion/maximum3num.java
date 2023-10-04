package TrickyQuestion;
import InputOutput.TrickyQuestion_IO;
public class maximum3num {
	public void max3num()
	{
		TrickyQuestion_IO.threeValIO();
		int a =TrickyQuestion_IO.val1;
		int b =TrickyQuestion_IO.val2;
		int c =TrickyQuestion_IO.val3;
//		if(a>b) {
//			if(a>c)
//			{
//				System.out.print(a+" is Greater");
//			}
//			else
//			{
//				System.out.print(c+" is Greater");				
//			}
//		}
//		else {
//			if(b>c)
//			{
//				System.out.println(b+" is Greater");
//			}
//			else
//			{
//				System.out.println(c+" is Greater");
//			}
//		}
		if(a>b&&a>c)
		{
			System.out.println(a+" is Greater");
		}
		else if(b>c)
		{
			System.out.println(b+" is Greater");
		}
		else
		{
			System.out.println(c+" is Greater");
		}
	}
}
