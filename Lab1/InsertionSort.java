
public class InsertionSort implements SortStrategy{
	static long startTime;
	static long endTime;
	public long[]sort(long[] ar)
	{
		startTime = System.currentTimeMillis();
		for (int i=1; i<ar.length; i++)
		   {
		      long index = ar[i]; int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
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
		return "Insertion";
	}

}
