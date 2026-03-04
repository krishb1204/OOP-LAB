abstract class Shipment{
	protected int shid;
	protected int weight;
	protected String dest;
	static int tnum=0;
	
	
	public void set(int id,int wt, String des){
		shid=id;
		weight=wt;
		dest=des;
		System.out.println("Shipment ID:" + shid);
		System.out.println("Weight:" + weight);
		System.out.println("Destination is:" + dest);
	}
	public void track(){
		System.out.println("Tracking number is:" + shid + "LOGI");
	}
		
	public abstract void co();
}

class Domestic extends Shipment{
	
	int dcost=0;
	@Override
	public void co(){
		dcost=weight*50;
		System.out.println("Cost equals:" + dcost);
	}
}

class International extends Shipment{
	int icost=0;
	@Override
	public void co(){
		icost=(weight*200)+1000;
		System.out.println("Cost equals:" + icost);
	}
}

public class cs28{
	public static void main(String[] args){
		
		Domestic d=new Domestic();
		
		d.set(100,50,"India");
		d.track();
		d.co();
		
		International i=new International();
		 i.set(101,40,"Australia");
		 i.track();
		 i.co();
	}
}	

	
		
	
	
	
	
	
	
	
	
	
	