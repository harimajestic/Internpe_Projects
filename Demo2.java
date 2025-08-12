package Threaad;

public class Demo2 {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<2;i++) {
			System.out.println("hi");
		}
		Thread2 t=new Thread2();
		//t.start();//it is treated as normal method If we want to access the run method we have already one method named as start method
		Thread2.m2();
		//t.start();
		System.out.println(t.getName());
		Thread2 t1=new Thread2();
		Thread1 t3=new Thread1();
		Thread q=new Thread(t3);
		q.start();
		
		t1.start();
		t1.setName("thread3");
		System.out.println(t1.getName());
		//Thread.currentThread().setPriority(2);
		//Thread.currentThread().setPriority(5);
		t1.setPriority(8);
		t1.setPriority(5);
		System.out.println(t1.getPriority());
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ben");
		}
		System.out.println("hari");
		
	}

}
