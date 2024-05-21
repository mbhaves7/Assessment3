
class NThread implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i+" : "+t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread complete");
	}
	
}
class NewThread extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i+" : "+t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread complete");
	}
}
public class AbstractClass {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i+" : "+t);
			Thread.sleep(2000);
		}
		System.out.println("thread complete");
		
	}
}



