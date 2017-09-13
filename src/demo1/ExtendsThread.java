package demo1;


class MyThread extends Thread{
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

public class ExtendsThread {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}

}
