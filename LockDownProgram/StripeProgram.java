/*
 * Good morning! Here's your coding interview problem for today.

This problem was asked by Stripe.

Given an array of integers, 
find the first missing positive integer in linear time and
 constant space. In other words, find the lowest positive integer
  that does not exist in the array. 
  The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. 
The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/

package LockDownProgram;

public class StripeProgram {
	public static int missingElement(int arr[]){
		int i,j,add=0,total=0;
		int max=arr[0];
		
		for(i=0;i<arr.length;i++){
			if(arr[i]>0){
				add=add+arr[i];
				if(arr[i]>max){
	
				max=arr[i];
				}
			}	
		}
		//System.out.println("max element: "+max+" Add: "+add);
		for(j=0;j<=max;j++){
			total=total+j;
		}
		//System.out.println("total:"+total);
		int missingElement=total-add;
		return missingElement;
	}
	public static void main(String[] args) {
		int arr[]={ 3, 4, -1, 1  };
		System.out.println("Missing element in array is: "+StripeProgram.missingElement(arr));
	}
	
}
