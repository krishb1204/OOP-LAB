import java.util.*;

public class cs23 {
    public static void main(String[] args) {

        int order;
        int qty;
        int cost = 0;
		boolean hii;

        Scanner c = new Scanner(System.in);
		do{
        System.out.println("Enter order number (1-5):");
        order = c.nextInt();

        switch(order){
            case 1:
                System.out.println("Beverage");
                cost = 100;
                break;

            case 2:
                System.out.println("Starter");
                cost = 200;
                break;

            case 3:
                System.out.println("Main Course");
                cost = 400;
                break;

            case 4:
                System.out.println("Dessert");
                cost = 150;
                break;

            case 5:
                System.out.println("Combo");
                cost = 600;
				break;

            default:
                System.out.println("Invalid Selection");
                return;
        }

        System.out.println("Enter quantity:");
        qty = c.nextInt();

        int totalcost = cost * qty;

        if(totalcost > 2000){
            totalcost = totalcost - (totalcost * 20 / 100);
            System.out.println("Your total cost with 20% discount is " + totalcost + " rupees");
        }
        else if(totalcost > 1000){
            totalcost = totalcost - (totalcost * 10 / 100);
            System.out.println("Your total cost with 10% discount is " + totalcost + " rupees");
        }
        else{
            System.out.println("Your total cost is " + totalcost + " rupees");
        }
		hii=c.nextBoolean();
		}
		while(hii);
    }
}