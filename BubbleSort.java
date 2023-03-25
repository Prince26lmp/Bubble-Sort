package JavaDSA;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {4,2,1,5,3};
		System.out.println("Array Before Sorting:"+Arrays.toString(arr));
        int n = arr.length;
        for(int i=0;i<ns-1;i++)          // No. Of Passes
        {
        	for(int j=0;j<n-1;j++)      // Iterations
        	{
        		if(arr[j]>arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
       
        System.out.println("Array After Sorting:"+Arrays.toString(arr));
	}

}
