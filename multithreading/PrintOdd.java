package multithreading;

public class PrintOdd  extends Thread{
	public void run(){
		for(int i=1;i<10;i=i+2){
			try {
				System.out.println("Odd Thread"+i);
				//Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Odd Thread Ends*****************");
		}
	}
}
