
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,1,2,3,5,8,13,21,33};
		int[] b = new int[a.length];
		int j=0;
		int count = 0;
		//take first two digits of the given array and make a fibonacci series in a new array
		for(int i=0;i<a.length;i++)
		{
			if(i<=1)
			{
				b[j] = a[i];
				j++;
			}
			else
			{
				b[j] = a[i-1] + a[i-2];
				j++;
			}
		}
		//check given array and new array are same or not by counting all integers of array
		for(int k=0;k<a.length;k++)
		{
			if(a[k] == b[k])
			{
				count++;
			}
		}
		