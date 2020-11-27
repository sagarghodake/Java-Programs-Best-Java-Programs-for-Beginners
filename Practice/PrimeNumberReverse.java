package Practice;

public class PrimeNumberReverse {
	public static void main(String[] args) {
		int limit=100;
		
		int flag =0;
		for(int i=1;i<=limit;i++){
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					flag=1;
				}
			}
			if(flag==0){
				System.out.println(i);
			}else{
				flag=0;
			}
		}
	}

}
  