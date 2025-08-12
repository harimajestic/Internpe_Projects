package Encapsulation;

public class Computer {
	String brand;
	double price;
	Cpu c=new Cpu("intel",12345);
	Computer(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	void display() {
		System.out.println("brand:"+ brand);
		System.out.println("price:"+price);
		System.out.println("Systemname:"+c.systemname);
		System.out.println("cpuid:"+c.cpuid);
	}
	

}
