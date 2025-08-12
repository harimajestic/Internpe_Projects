package Collections;

public class greet2 {
//static void m1() {
//	System.out.println("Good afternoon");->static method
//}
	void m1() {
		System.out.println("hi aravinth");//->non static method
	}
public static void main(String[] args) {
	//greet1 g=greet2::m1;->static method
	//g.m1();
	greet2 g2=new greet2();//->non static method
	greet1 g=g2::m1;
	g.m1();
}
}
