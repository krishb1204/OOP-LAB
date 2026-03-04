import java.util.*;
public class Items{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter no of items");
int p=obj.nextInt();
int total=0;


for(int i=0;i<p;i++){
	System.out.println("Price of item"+(i+1)+':');
	int price=obj.nextInt();
	total=total+price;
}
	System.out.println("Total is:"total);
	

}
}

