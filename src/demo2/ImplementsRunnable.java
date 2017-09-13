package demo2;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello ::" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ImplementsRunnable {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		thread.start();
	}

}
