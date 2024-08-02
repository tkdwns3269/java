package q.thread.ex2;

public class Task1 extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 1; i < 20; i++) {
				if (i % 2 == 0) {
					System.out.println(i + " ");
				}
				Thread.sleep(100); // 0.1초 동안 지금 쓰레드를 재운다.
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
