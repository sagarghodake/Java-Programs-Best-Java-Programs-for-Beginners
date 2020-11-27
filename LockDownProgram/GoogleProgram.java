package LockDownProgram;

import array_common_operation.GoogleProblem;

public class GoogleProgram {
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