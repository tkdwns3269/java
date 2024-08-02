package q.thread.ex2;

public class Task2 extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 1; i < 20; i++) {
				if (i % 2 == 1) {
					System.out.println(i + " ");
				}
				Thread.sleep(200);// 0.2초 동안 지금 쓰레드를 재운다.
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		; // 0.1초 동안 지금 쓰레드를 재운다.

	}
}
