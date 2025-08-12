package Threaad;
import java.util.Scanner;
public class arrayprime {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Start:");
		int start=s.nextInt();
		System.out.println("End:");
		int end=s.nextInt();
	    Thread[]a=new Thread[end-start+1];
		int k=0;
		for(int i=start;i<=end;i++) {
			a[k]=new Prime(i);
			k++;
		}
		for(Thread i:a) {
			i.start();
		}
	}

}
