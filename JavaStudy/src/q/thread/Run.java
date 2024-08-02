package q.thread;

public class Run {
	public static void main(String[] args) {

		Task t1 = new Task();
		
		Runnable task = new MyRunnable();
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		System.out.println("END : " + Thread.currentThread().getName());
	}
}
