package Encapsulation;

public class AIcars implements car2,AI {
	
	
	public static void main(String[] args) {
		
        car2 c= new AIcars();
        AI c1= new AIcars();
        c.start();
        c.stop();
        c.drive();
        c.playmusic();
        c1.selfDrive();
        c1.obstacleDetection();
        
		
	}
public void start() {
		System.out.println("Start engine");
	}
public	void stop() {
		System.out.println("stop the car");
	}
public	void drive() {
		System.out.println("drive the car");
	}
public void playmusic() {
		System.out.println("play the music");
	}
public void selfDrive() {
		System.out.println("turn on automatic mode");
	}
public	void obstacleDetection() {
		System.out.println("detect obstacle");
	}
}


