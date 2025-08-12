package DSAproblems;

import java.util.Arrays;

public class sortedarray {
public static void main(String[] args) {
	int []b= {10,20,30,25,40};
	int i=0;
	int j=b.length-1;
	while(i<j) {
		int t=b[i];
		b[i]=b[j];
		b[j]=t;
		j--;
		i++;
	
		}
	System.out.println(Arrays.toString(b));

}
}