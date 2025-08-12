package Encapsulation;

public class Cpu {
	String systemname;
	int cpuid ;
	Cpu(String systemname,int cpuid){
		this.systemname=systemname;
        this.cpuid=cpuid;
	}
	void cpuspecification() {
		System.out.println("systemname:"+systemname);
		System.out.println("cpuid:"+cpuid);
	}

}
