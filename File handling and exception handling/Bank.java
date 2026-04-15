class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

public class Bank{
	public static void main(String[] args){
	try{
		int amount=1000;
		int balance=2000;
		
		if(amount>balance){
			throw new MyException("No Balance");
		}
		System.out.println("successful");
	}
	
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}