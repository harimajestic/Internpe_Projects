package Encapsulation.carradio;

public class Cardriver {
public static void main(String[] args) {
	Car c=new Car("XUV");
	System.out.println(c.model);
	System.out.println(c.r);
	System.out.println("============");
	c.createRadio("Pioneer");
	System.out.println(c.r);
	System.out.println(c.r.brand);
}
}
