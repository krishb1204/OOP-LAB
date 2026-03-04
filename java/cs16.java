 class Car{
		int plate;
		String color;
		String name;
		
		public void set(String nam,int plat,String col){
			name=nam;
			plate=plat;
			color=col;
			System.out.println("Name:"  +  name);
			System.out.println("Plate:"  +  plate);
			System.out.println("Colour:"  +  color);
		}
		
		public void wash(){
			System.out.println("Basic Exterior Wash");
			System.out.println("-------------------");
		}
		
		public void clean(){
			System.out.println("Interior Cleaning");
						System.out.println("-------------------");
		}

		public void service(){
			System.out.println("Full Detail Service");
						System.out.println("-------------------");

		}
}
public class cs16{
	public static void main(String[] args){
		
		Car obj1=new Car();
		
		obj1.set("Krish",4004,"Red");
		obj1.wash();
		
		Car obj2=new Car();
		
		obj2.set("Kanishk",4005,"Blue");
		obj2.clean();
		
		Car obj3=new Car();
		
		obj3.set("Zidane",4006,"Green");
		obj3.service();
	}
}
	
		
		
		
		

			