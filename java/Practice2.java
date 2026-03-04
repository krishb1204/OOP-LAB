class Vehicle{
		String brand;
		int speed;
		
		Vehicle(String br,int sp){
			brand=br;
			speed=sp;
		}
		
		public void show(){
			System.out.println("Brand:" + brand);
			System.out.println("Speed" + speed + "km/hr");
			
		}
}
class Car extends Vehicle{
	int seats;
	Car(String br,int sp,int seat){
		super(br,sp);
		seats=seat;
	}
	public void show2(){
		System.out.println("Seat" + seats);
	}
}

class Bike extends Vehicle{
	String type;
	Bike(String br,int sp,String typ){
		super(br,sp);
		type=typ;
	}
	public void show3(){
		System.out.println("Type:" + type);
	}
}

public class Practice2{
	public static void main(String[] args){
		Car c=new Car("Lambo",150,2);
		c.show();
		c.show2();
		
		Bike b=new Bike("RE",200,"Bullet");
		b.show();
		b.show3();
	}
}
		
	
		