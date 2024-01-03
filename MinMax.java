//Brute-force approach: sort the array and return the first and last element of the array.
//Time complexity: O(n* logn)
//Space Complexity: O(1)

//Optimized approach: pick the first and last elements in pairs and compare the min and max respectively.
//Space Complexity: O(1)
//Time complexity: O(n)

import java.io.*;
import java.util.*;

public class MinMax{

	static class Pair{
		int min;
		int max;
	}


	static Pair getMinMax(int arr[],int n){
		Pair minmax = new Pair();
		int i;

		if(n % 2 ==0){
			if(arr[0] > arr[1]){
				minmax.max = arr[0];
				minmax.min = arr[1];
			}
			else{
				minmax.min = arr[0];
				minmax.max = arr[1];
			}
			i=2;
		}
		else{
			minmax.min = arr[0];
			minmax.max = arr[0];
			i=1;
		}


		while(i < n-1){
				if(arr[i] > arr[i+1]){
					if(arr[i] > arr[i+1]){
					minmax.max = arr[i+1];
				}

				if(arr[i+1] < minmax.min){
					minmax.max = arr[i+1];
				}
		}
		else{
			if(arr[i+1] > minmax.max){
				minmax.min = arr[i+1];
			}
			if(arr[i] > minmax.min){
				minmax.min = arr[i];
			}
		}
		i+=2;	

	}

		return minmax;
}

 public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("Minimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
    }
}