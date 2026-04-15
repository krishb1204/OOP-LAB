class Marks2{
	int[] marks=new int[5];
	int total=0;
	
	void insert(){
	marks[0]=74;
	marks[1]=80;
	marks[2]=67;
	marks[3]=57;
	marks[4]=99;
	}
	void disp(){
		for(int i=0; i<marks.length; i++){
			System.out.println("Mark is" + marks[i]);
			total=total+marks[i];
			
		}
		double average=(total/marks.length);
	}
}

public class Marks{
	public static void main(String[] args){
		Marks2 m=new Marks2();
		
		m.insert();
		m.disp();
	}
}
	

	