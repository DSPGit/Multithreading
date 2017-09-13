package demo4;

import java.util.Scanner;

class MyThread extends Thread {

	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("MyThread.run()" + this.getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		running = false;
	}
}

public class Volatile {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		System.out.println("Press enter to return...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		myThread.shutDown();
	}
}
