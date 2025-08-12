package Collections;

public class insertion {
	public static void main(String[] args) {
		int a[]= {30,10,45,2,7};
		for(int i=1;i<a.length;i++) {
		int	current=a[i];
		int j=i-1;
		while(j>=0&& current<a[j]) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=current;
		}
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
}
}