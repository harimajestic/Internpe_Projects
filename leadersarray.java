package DSAproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class leadersarray {
public static void main(String[] args) {
	int[] a= {20,30,5,8,3,2,6};
	ArrayList<Integer>l=new ArrayList<Integer>();
	int c=a.length-1;
	int max=0;
	for(int i=c;i>=0;i--) {
	if(c<=a[i]) {
		max=a[i];
		
		System.out.println(max);
		l.add(max);
		
	}

c=max;


}
	System.out.println(l);
}}