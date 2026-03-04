class Father{
	private int landArea;
	private string propertyType;
	public void showproperty(){
		landArea=200;
		propertyType="HELL YEA";
		System.out.println(landArea,propertyType);
	}
}

class Child1 extends Father{
	private usage;
	public void showUsage(){
		usage="Farming"
		System.out.println(usage);
	}
}

class Child2 extends Father{
private usaage;
	public void showUsaage(){
		usaage="Buiding"
		System.out.println(usaage);
	}
	
public class Show{
	public static void main(String[] args){
		Child1 c1=new Child1;
		Child2 c2=new Child2;
		
		c1.propertyType();
		c1.landArea();
		c1.showUsage();
		
		c2.showUsaage();
	}
}