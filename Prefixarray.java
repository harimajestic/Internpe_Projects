package Threaad;
import java.util.ArrayList;
import java.util.Scanner;
public class Prefixarray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size:");
		int[] a=new int[s.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();		
			}
		ArrayList<Integer> prefixsum=new ArrayList<Integer>();
		System.out.println("Enter k value:");
		int k=s.nextInt();
		int val=0;
		prefixsum.add(val);
		for(int i:a)
		{	
			val=val+i;
			if(prefixsum.contains(val-k)){
				System.out.println("element present");
				return;
			}
			
		}prefixsum.add(val);
		System.out.println("not present");
		
		
		
	}

}
