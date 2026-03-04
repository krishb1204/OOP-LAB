import java.util.*;

class cs24{
	public static void main(String[] args){
		
		String name;
		int marks;
		int noS=0;
		int avg;
		int totalmarks=0;
		
		Scanner s=new Scanner(System.in);
		do{
		System.out.println("Enter name:");
		name=s.nextLine();
		System.out.println("Enter marks scored:");
		marks=s.nextInt();
		s.nextLine();
		
		if(marks==100){
			System.out.println("Perfect Scorer");
		}			
		else if(marks>90){
			System.out.println("Outstanding");
		}
		else if(marks>75){
			System.out.println("Excellent");
		}
		else if(marks>60){
			System.out.println("Good");
		}
		else if(marks>45){
			System.out.println("Satisfactory");
		}
		else{
			System.out.println("Needs Improvement");
			
		}
		noS=noS+1;
		totalmarks=totalmarks+marks;
		System.out.println("-------------");
		}
		while(noS<=6);
		System.out.println("Total number of students are:"  +  noS);
		
		System.out.println("Class Average is"  +  totalmarks/6);
	}
}
		
	
	