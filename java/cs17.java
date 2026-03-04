class Cinema{
String moviename1;
String time1;
int screennum1;

public void setname(String nam){
		moviename1=nam;
		System.out.println("Movie:" + moviename1);
}
		
	public void settime(String time){
		time1=time;
		System.out.println("Time:" + time1);
	}
	
	public void setscreen(int screen){
		screennum1=screen;
		System.out.println("Screen:" + screennum1);
	}

}
 
class Screen1 extends Cinema{
	
	static int seatav1=100;

	public void booked1(){
		seatav1--;
	}
	public void cancelled1(){
		seatav1++;
	}
	public void show1(){
		System.out.println("Seat Av:" + seatav1);
	}
}

class Screen2 extends Cinema{
	
	static int seatav2=100;

	public void booked2(){
		seatav2++;
	}
	public void cancelled2(){
		seatav2--;
	}
	public void show2(){
		System.out.println("Seat Av:" + seatav2);
	}

}

public class cs17{
	public static void main(String[] args){
	
	Screen1 s1=new Screen1();
	
	s1.setname("Saaho");
	s1.settime("12 pm");
	s1.setscreen(1);
	s1.booked1(); 
	s1.show1();
	
	Screen2 s2=new Screen2();
	 
	s2.setname("Varanasi");
	s2.settime("1 pm");
	s2.setscreen(1);
	s2.booked2(); 
	s2.cancelled2();
	s2.show2();
	}
}

	
		

