package testing;
import InputOutput.Array_IO;
//import ArrayQ.Searching;
import ArrayQ.Sorting;

public class arrayTest {
	public static void main(String[] args)
	{
//		int[] array=Array_IO.ArrInput();
//		Array_IO.ArrOutput(Array_IO.sort_array);
//		System.out.print(Searching.LinearSearch(Array_IO.array_def));
//		System.out.print(Searching.ternarySearch(Array_IO.sort_array));
		int[] array=Sorting.insertionSorting(Array_IO.unsort_array);
		Array_IO.ArrOutput(array);
	}

}
