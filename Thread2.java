package Threaad;
public class Thread2 extends Thread{
public	void run() {
		for(int i=0;i<2;i++) {
			//System.out.println("main");
			//for(i=0;i<5;i++) {
				//System.out.println("hello adhi");
			//}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("roobu");
			System.out.println("seshan");
		}
		
	}
public static void m2(){
	System.out.println("hello");
}
}
