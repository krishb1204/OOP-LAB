class patient{
		String name;
		int age;
		static int id=1000;
		String ward ;
		String notes;
		
		public void getinfo(String NAME,int AGE,String WARD,String NOTES){
			name=NAME;
			age=AGE;
			ward=WARD;
			notes=NOTES;
			id++;
			
			System.out.println("Name:" + name);
			System.out.println("age" + age);
			System.out.println("ward" + ward);
			System.out.println("notes" + notes);
			System.out.println("ID:" + id);
		}
		
		
		public void emergency(){
			name="Unknown";
			age=0;
			ward="Emergency";
			id++;
			System.out.println("Name:" + name);
			System.out.println("age" + age);
			System.out.println("ward" + ward);
			System.out.println("notes" + notes);
			System.out.println("ID:" + id);
		}
}
public class cs3{
	public static void main(String[] args){
	patient c=new patient-();
	
	c.getinfo("Rahul", 18, "General", "Fever");
	c.emergency();
	}
}
	
	



		
			
	
			
			
		
		
			
			
			
			
			