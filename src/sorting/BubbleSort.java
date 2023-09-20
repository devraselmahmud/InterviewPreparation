package sorting;

public class BubbleSort {
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		//descending order
		
		int arr[] = {1, 5, 3, 9, 6};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j] < arr[j+1])
				{	
					//swapping values
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
}
