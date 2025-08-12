package Collections;

public class EmployeeKeys implements Comparable {
		int empid;
		String dept;
		EmployeeKeys(int empid,String dept){
			this.empid=empid;
			this.dept=dept;
		}
		
		@Override
		public int compareTo(Object o) {
			EmployeeKeys e=(EmployeeKeys) o;
			if(this.empid>e.empid) {
				return 1;
			}
			else if(this.empid<e.empid) {
				return -1;
			}
			else {
				return 0;
			}
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "empid:"+ empid +"dept:"+ dept;
		}
	

}
