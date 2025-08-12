package DSAproblems;

public class maximumconsecutive {
	public static void main(String[] args) {
		int maxcount=0;
		int count=0;
		int []a= {1,1,0,1,1,1,0,1,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
			else {
				count=0;
			}
			maxcount=maxcount>count?maxcount:count;
			
		}
		System.out.println(maxcount);
	}

}
