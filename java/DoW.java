import java.util.*;
public class DoW{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
boolean result=true;
do{
System.out.println("Enter math:");
int math=obj.nextInt();
System.out.println("Enter sci:");
int sci=obj.nextInt();
System.out.println("Enter soc:");
int soc=obj.nextInt();
int totalscore=(math+sci+soc)/3;
System.out.println("Your totalscore is"+totalscore);
result=obj.nextBoolean();
}
while(result);

}
}








