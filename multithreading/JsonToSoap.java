package multithreading;

public class JsonToSoap {
	public static void main(String[] args) {
		PrintOdd th1=new PrintOdd();
		PrintEven th2=new PrintEven();
		th1.start();
		th2.start();
		try {
			th2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++){
			System.out.println("This is main thread code****************"+i);
			System.out.println("Even i value:"+th2.i);

		}
	}
}
