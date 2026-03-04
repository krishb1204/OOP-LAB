class gyaat{
	String name;
	int Cm;
	int PID;
	String tps;
	int EXC;
	
	public void setname(String NAME){
		name=NAME;
	}
	public void setCm(int CM){
		Cm=CM;
		
	}
	public void setpid(int pid){
		PID=pid;
	}
	public void settps(String TPS){
		tps=TPS;
	}
	public void exc(int cost){
		EXC=cost;
		
	}
	public String getname(){
		return name;
	}
	public int getcm(){
		return Cm;
	}
	public int getpid(){
		return PID;
	}
	public String gettps(){
		return tps;
	}
	public int getexc(){
		return EXC;
	}
	
}
public class cs19{
	public static void main(String[] args){
	gyaat g1=new gyaat();
	g1.setname("Yadhu");
	g1.setCm(123);
	g1.setpid(100);
	g1.settps("Root Canal");
	g1.exc(8000);
	
	gyaat g2=new gyaat();
	g2.setname("Kanishk");
	g2.setCm(124);
	g2.setpid(101);
	g2.settps("Filling costs");
	g2.exc(1500);
	
	gyaat g3=new gyaat();
	g3.setname("Krish");
	g3.setCm(125);
	g3.setpid(102);
	g3.settps("Root Canal");
	g3.exc(8000);
	
	gyaat g4=new gyaat();
	g4.setname("Zidane");
	g4.setCm(126);
	g4.setpid(103);
	g4.settps("Cleaning");
	g4.exc(500);
	
	profile(g1);
	profile(g2);
	profile(g3);
	profile(g4);
	}
	
	

public static void profile(gyaat g){
	System.out.println("Name:" + g.getname());
	
	System.out.println("Contact:" + g.getcm());
	
	System.out.println("ID:" + g.getpid());
	
	System.out.println("Procedure:" + g.gettps());
	
	System.out.println("Cost in rupees:" + g.getexc());
	
	System.out.println("-----------------");
}
}
	
	
	
	
	
		
	
	