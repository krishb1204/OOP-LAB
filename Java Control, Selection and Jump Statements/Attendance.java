import java.util.*;

public class Attendance {
    public static void main(String[] args) {

        double attendance;

        Scanner hii = new Scanner(System.in);
       
        System.out.println("Enter attendance percentage:");
        attendance = hii.nextDouble();
       
       

        if (attendance > 75) {
            if (attendance > 90) {
                System.out.println("You are eligible to write exam");
                System.out.println("You are granted +5 marks");
            } else {
                System.out.println("You are eligible to write exam");
            }
        } else {
            System.out.println("You are not eligible to write exam");
        }
    }
}