package multithreading;

public class PrintEven extends Thread {
	int i=0;
	public void run() {
		for (int i = 2; i < 100; i = i + 2) {
		
			try {
				System.out.println("Even Thread" + i);
				this.i=i;
				//Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Even Thread Ends****************");
		}
	}
}
