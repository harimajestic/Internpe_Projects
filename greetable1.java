package Collections;

public class greetable1 {
	public static void main(String[] args) {
		Greetable g2=()->{System.out.println("hello bro");
		};
	g2.greet();
	Print p=()->{System.out.println("Sum of 2 and 3 is"+(2+3));};
	p.print();
}
}
