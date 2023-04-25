package Jpptaskperform;

import java.util.HashMap;

//Find the pairs of element equal to the sum of given number
class PairsCount {

	static int getPairsCount(int a[],int sum)
	{
		int n=a.length;
		HashMap<Integer,Integer> hash=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(hash.containsKey(a[i]))
			{
				hash.put(a[i], 0);
			}
			else
			{
				hash.put(a[i], hash.get(a[i]+1));
			}
		}
		
		int twicecount=0;
		
		for(int i=0;i<n;i++)
		{
			if(hash.get(sum-a[i])!=null)
			{
				twicecount+=hash.get(sum-a[i]);
			}
			if(sum-a[i]==a[i])
			{
				twicecount--;
			}
		}
		return twicecount/2;
			
	}
	public static void main(String[] args) {
		
		int a[]= {1,5,7,-1};
	    int sum=6;
		System.out.println(getPairsCount(a,sum));
	}
	
}
