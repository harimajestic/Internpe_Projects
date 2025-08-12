package DSAproblems;

public class count {
	public static void main(String[] args) {
        String a="zbcadxazb";
        a.split("zbcadxazb");
		int count=0;
		int i=0;
		int j=i+1;
		int b=a.charAt(i);
		int c=a.charAt(j);
		int c1=0;
		for(;i<a.length();i++) {
			
			for( ;j<a.length();j++) {
				if(b!=c) {
				c1=	count++;
				}
			}
			
	
	}System.out.println("count:"+ c1);

}
}