class gyaat{
    int memid;
    String name;
    int age;
    String memtype;

    public void setname(String NAME,int ag,int memID,String memTYPE){
        name = NAME;
		
		age = ag;
		 memid = memID;
		 memtype = memTYPE;
		  System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Member ID: " + memid);
        System.out.println("Membership Type: " + memtype);


    
        if(age < 25){
            System.out.println(name + " is eligible for Youth discount");
		}
	}
}
        

public class cs18 {
    public static void main(String[] args){
		
		gyaat g=new gyaat();
		
		g.setname("Krish",18,100,"Hi");
		
		gyaat g1=new gyaat();
		g1.setname("Kris",19,101,"Hii");

        
    }
}
