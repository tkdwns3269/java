package q.thread;

public class Task extends Thread {

	// 메인문처럼 독립적으로 실행될 수 있는 메소드

	@Override
	public void run() {
		int n1 = 20;
		int n2 = 30;

		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
}
