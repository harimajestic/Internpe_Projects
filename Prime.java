package Threaad;
public class Prime extends Thread{
	int  n;
	Prime(int n){
		this.n=n;
	}
public void run() {
	if(n==0||n==1)
		return;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return ;
		}
	}
	System.out.println( n + "  "+"is a prime no.");
}
	
	

}
