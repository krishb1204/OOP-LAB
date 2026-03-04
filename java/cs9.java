class Employee{
	String name;
	int employeeid;
	int salary;
	 
	public void setname(String Nam){
		name=Nam;
	}
	public String getname(){
		return name;
	}
	
	public void setid(int id){
		employeeid=id;
	
	}
	public int getid(){
		return employeeid;
	}
	public void setsalary(int sal){
		salary=sal;
	}
	public int getsalary(){
		return salary;
	}
}
	
	class TeamLead extends Employee{
		int teamsize;
		int bonussalary=50000+1000;
		
		
		public int getbonussalary(){
			return bonussalary;
		}
		
		public void setsize(int team){
			teamsize=team;
		}
		public int getsize(){
			return teamsize;
		}
	}
	
	class ProjectManager extends TeamLead{
		String pname;
		int pfund;
		
		public void setpname(String pn){
			pname=pn;
			
		}
		public String getpname(){
			return pname;
		}
		
		public void setpfund(int pf){
			pfund=pf;
		}
		public int getpfund(){
			return pfund;
		}
	}
	
	public class cs9{
		public static void main(String[] args){
			ProjectManager obj=new ProjectManager();
			
			obj.setname("Krish");
			obj.setid(100);
			obj.setsize(5);
			obj.setpname("Blockchain");
			obj.setpfund(5000000);
			
			System.out.println("Name:" + obj.getname());
			System.out.println("ID:" + obj.getid());
			System.out.println("Salary:" + obj.getbonussalary());
			System.out.println("Size:" + obj.getsize());
			System.out.println("Project Name:" + obj.getpname());
			System.out.println("Project Fund:" + obj.getpfund());
		}
	}
	



			
		
			
		
		
		
		
		
		
		
		
		
		
		