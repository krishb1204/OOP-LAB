class Person{
	String name;
	int ID;
	public void setname(String NAME){
		name=NAME;
		System.out.println("Name:" + name);
	}
	public void setid(int id){
		ID=id;
		System.out.println("ID:" + ID);
	}
}

class Student extends Person{
	String dept;
	double cgpa;
	
	public void setdept(String dep){
		dept=dep;
		System.out.println("Dept:" + dept);
	}
	public void setcgpa(double cgp){
		cgpa=cgp;
		System.out.println("CGPA:" + cgpa);
	}
}

class Scholar extends Student{
	String rtopic;
	String gname;
	
	public void setrtopic(String topic){
		rtopic=topic;
		System.out.println("Research topic:" + rtopic);
	}
	public void setgname(String Gname){
		gname=Gname;
		System.out.println("Guide Name:" + gname);
	}
}

public class cs7{
	public static void main(String[] args){
		Scholar s=new Scholar();
		
		s.setname("Krish");
		s.setid(100);
		s.setdept("CSE");
		s.setcgpa(8.39);
	s.setrtopic("Blockchain");
	s.setgname("Kanishk");
	}
}
