package Encapsulation.carradio;

public class Car {
String model;
Radio r;
Car(String model){
	this.model=model;
}
void createRadio(String brand) {
	r=new Radio(brand);
}
}
