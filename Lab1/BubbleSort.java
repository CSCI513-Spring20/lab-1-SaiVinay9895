
public class BubbleSort implements SortStrategy{
	static long startTime;
	static long endTime;
	public long[]sort(long[] ar)
	{
		startTime = System.currentTimeMillis();
		 for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j < i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
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
		return "BubbleSort";
	}

}
