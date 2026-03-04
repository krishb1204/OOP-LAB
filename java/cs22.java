import java.util.Scanner;

public class cs22 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        boolean repeat;

        do {
            System.out.println("Enter name:");
            String name = obj.nextLine();

            System.out.println("Enter age:");
            int age = obj.nextInt();
            obj.nextLine(); 

            System.out.println("Enter Licence Type:");
            String licenceType = obj.nextLine();


            if (age >= 16 && age < 18 &&
                licenceType.equals("Motorcycle learner")) {
				System.out.println("You are eligible");
            }

            else if (age >= 18 && age < 20 &&
                (licenceType.equals("Car license") ||
                 licenceType.equals("Motorcycle learner")))
				 {
					 				System.out.println("You are eligible");

            }

            else if (age >= 20 &&
                (licenceType.equals("Car license") ||
                 licenceType.equals("Motorcycle learner") ||
                 licenceType.equals("Commercial Vehicle"))) {
					 				System.out.println("You are eligible");

            }
			else{
				System.out.println("You are not eligible");
			}

            if (!licenceType.equals("Car license") &&
                !licenceType.equals("Motorcycle learner") &&
                !licenceType.equals("Commercial Vehicle")) {
                System.out.println("Invalid license category");
            }
            
      

            System.out.println("Continue? (true/false)");
            repeat = obj.nextBoolean();
            obj.nextLine();

        } while (repeat);

 
    }
}