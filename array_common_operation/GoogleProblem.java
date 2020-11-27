/*Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/		
package array_common_operation;
import java.util.*;

public class GoogleProblem {
	public static void LidtOfNumbers(int num[],int k){
		int i,j;
		System.out.println("Resultant answer is: \n");
		for( i=0;i<num.length;i++){
			for( j=i+1;j<num.length;j++){
				if(num[i]+num[j]==k){
					System.out.println(num[i]+"+"+num[j]+"="+k);
				}	
			}
		}
	}
	public static void main(String[] args) {
		int num[]={10, 15, 3, 7};
		int k=25;
		GoogleProblem.LidtOfNumbers(num, k );
		
	}

}
