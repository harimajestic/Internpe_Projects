package Encapsulation;

public class Animal {
private String species;
private int legs;
Animal( String species,int legs){
	this.species=species;
	this.legs=legs;

}
String getspecies() {
	return species;
}
int getlegs() {
	return legs;
}
void setspecies(String species) {
	this.species=species;
}
void setlegs(int legs) {
	this.legs=legs;
	
}
}