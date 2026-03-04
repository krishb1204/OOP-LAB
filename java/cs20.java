import java.util.Scanner;

public class cs20 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        boolean hasss;   

        do {
            int bonus;

            System.out.print("Enter name: ");
            String name = obj.nextLine();

            System.out.print("Enter age: ");
            int age = obj.nextInt();

            System.out.print("Enter salary: ");
            int salary = obj.nextInt();

            System.out.print("Enter years of experience: ");
            int yoe = obj.nextInt();


            System.out.print("Enter department: ");
            String dept = obj.nextLine();

            System.out.print("Is hazard job (true/false): ");
            boolean hazard = obj.nextBoolean();

            if (yoe < 2) {
                bonus = 0;
            } 
            else if (yoe < 5) {
                bonus = (salary * 10) / 100;
            } 
            else if (yoe < 10) {
                bonus = (salary * 20) / 100;
            } 
            else {
                bonus = (salary * 35) / 100;
            }

            if (hazard) {
                bonus += 5000;
                System.out.println("You get an extra bonus.");
            }

            System.out.println("You receive a bonus of " + bonus + " rupees.");

            System.out.print("Continue (true/false): ");
            hasss = obj.nextBoolean();

        } while (hasss);

    }
}