package DSAproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class productaarray {
public static void main(String[] args) {
	int[] a= {2,1,4,3,5};
  int []l=new int[a.length];
  l[0]=1;
  for(int i=1;i<l.length;i++) {
	  l[i]=a[i-1]*l[i-1];
	}
  System.out.println(Arrays.toString(l));
  int[] r=new int[a.length];
 r[ r.length-1]=1;
  for(int i=a.length-2;i>=0;i--) {
	  r[i]=a[i+1]*r[i+1];
  }
  System.out.println(Arrays.toString(r));
  int[]product=new int[a.length];
  for(int i=0;i<product.length;i++) {
	  product[i]=l[i]*r[i];
  }
  System.out.println(Arrays.toString(product));
  int[]n= {1,2,3,4,5};
  for(int i=0;i<n.length;i++) {
	  product[i]=product[i]*n[i];
  }
  System.out.println(Arrays.toString(product));
}
}