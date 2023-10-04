package ArrayQ;

public class Sorting {
//	Bubble Sorting
//	Time Complexity is O(n^2)
	public static int[] bubbleSorting(int[] array) {
		for(int i=0;i<array.length-1;i++)// n-1
		{
			for(int j=0;j<array.length-i-1;j++) 
			{
				if(array[j]>array[j+1])
				{
					//Swap
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
//	Selection Sorting
//	Time Complexity is O(n^2)
	public static int[] selectionSorting(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[smallest]>array[j]) 
				{
					smallest=j;
				}
			}
			int temp=array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
		}
		return array;
	}
//	Insertion Sort
	
	public static int[] insertionSorting(int[] array)
	{
		for(int i=1; i<array.length;i++)
		{
			int current=array[i];
			int j=i-1;// running in sorted aaray in start it 0 index
			while(j>=0 && current<array[j]) {
//				shifting element 0+1 index
				array[j+1]=array[j];
				j--;
			}
			//placement
			array[j+1]=current;
		}
		return array;
	}
}
