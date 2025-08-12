package Collections;

public class greet4 {
	//public static int sum(int a,int b) {    ->static method
	//	return a+b;
	//}
	public  int sum(int a,int b) {    //->non static method
	return a+b;
	}
public static void main(String[] args) {
    // greet3 g=greet4::sum;->static method
    // System.out.println(g.sum(12, 12));
	greet4 g1=new greet4();  //->non static method
	greet3 g2=g1::sum;
	System.out.println(g2.sum(12, 13));
}
}
