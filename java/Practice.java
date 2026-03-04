class Employee{
    String name;
    int id;
    int salary;

    Employee(String nam,int eid,int sal){
        name=nam;
        id=eid;
        salary=sal;
    }

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Salary: " + salary);
    }
}

class TeamLead extends Employee{

    int teamsize;
    int bonussal;

    TeamLead(String nam,int eid,int sal,int size){
        super(nam,eid,sal);
        teamsize=size;
        bonussal=salary+5000;
    }

    public void show2(){
        System.out.println("Team Size: " + teamsize);
        System.out.println("Bonus Salary: " + bonussal);
    }
}

class ProjectManager extends TeamLead{

    String pname;
    int pfund;

    ProjectManager(String nam,int eid,int sal,int size,String pnam,int pfu){
        super(nam,eid,sal,size);
        pname=pnam;
        pfund=pfu;
    }

    public void show3(){
        System.out.println("Project name: " + pname);
        System.out.println("Project Fund: " + pfund);
    }
}

public class Practice{
    public static void main(String[] args){

        ProjectManager p = new ProjectManager(
            "Krish",101,50000,5,"AI Project",200000
        );

        p.show();
        p.show2();
        p.show3();
    }
}
	
	
		
	
		
		
			
			
	