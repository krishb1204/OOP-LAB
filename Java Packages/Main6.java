import Vehicle.Vehicle;

class Car implements Vehicle{
	public void start(){
		System.out.println("Car starts");
	}
	public void stop(){
		System.out.println("Car Stops");
	}
}

public class Main6{
	public static void main(String[] args){
		
		Car c=new Car();
		
		c.start();
		c.stop();
	}
}
	