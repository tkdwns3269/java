package q.thread;

//쓰레드 생성방법2. Runnable의 추상메소드 run을 구현하는 객체를 만든다.
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}

}
