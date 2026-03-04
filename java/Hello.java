import java.util.*;
public class Hello{
public static void main(String[] args){
double attendance;
int i;
int no;
Scanner obj=new Scanner(System.in);
System.out.println("Enter No. of students");
no=obj.nextInt();
for(i=0;i<no;i++){
System.out.println("Enter Attendance");
attendance=obj.nextDouble();
if(attendance>90){
System.out.println("You are eligible to write exam");
System.out.println("You get +5 internal marks");
}
else if(attendance>75){
System.out.println("You are eligible to write exam");
}
else{
System.out.println("You are not allowed to write exam");
}
}
}
}





