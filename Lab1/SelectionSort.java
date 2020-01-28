
public class SelectionSort implements SortStrategy{
	static long startTime;
	static long endTime;
	public long[]sort(long[] ar)
	{
		startTime = System.currentTimeMillis();
		for (int i = 0;i<ar.length -1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j<ar.length; j++)
		            if (ar[j]<ar[min]) min = j;
		      long temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   } 
		endTime = System.currentTimeMillis();
		return ar;
	}
	public long getSorttime() {
		
		long totaltime = endTime-startTime;
		
		
		return totaltime;
	}
	public String strategyName()
	{
		return "SelectionSort";
	}

}
