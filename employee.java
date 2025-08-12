package Collections;

public class employee {
	String name;
	int id;
	String dept;
	employee(String name,int id,String dept){
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	public boolean equals(Object o) {
		employee e=(employee)o;
		if(this.id==e.id) {
			return false;
		}
		return true;
	}
	public int hashcode(Object o) {
		employee e=(employee)o;
		return e.id;
	}
	
	

}
