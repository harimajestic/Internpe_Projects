package Encapsulation;

public class Atm1 {
	private int money;
	int pin;
    int a=10;
    Atm1(){
    }
    Atm1(int money, int pin){
    	this.money=money;
    	this.pin = pin;
    }
    int getMoney(int pin) {
    	if(this.pin==pin) {
    		return money;
    	}
    	else {
    		System.out.println("Invalid pin");
    		return 0;
    	}
    	
    }
    void setMoney(int money,int pin) {
    	if (this.pin==pin) {
    	this.money+=money;
    }
}
}