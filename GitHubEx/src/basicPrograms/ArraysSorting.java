package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSorting 
{
	public static void main(String[] args) 
	{
		String[] mons ={"jan","feb","mar","apr","may","jun","jul"};
		System.out.println("Months before sorting : ");
		printStringArray(mons);
		Arrays.sort(mons);
		System.out.println("Months after sorting : ");
		printStringArray(mons);
	}
	
	public static void printStringArray(String[] mons)
	{
		for(String s : mons)
		{
			System.out.println(s);
		}
		System.out.println("GitHub test - code change commit");
		System.out.println("Adding one more line code");
	}
	
}
