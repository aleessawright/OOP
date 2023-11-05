//In order to help learn course concepts, I worked on the homework with none, discussed homework topics and issues with none, and/or consulted related material 
//that can be found at Stack Overflow.
import java.util.Scanner;
public class TravelBuddy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Travel Buddy Service!  Please enter your name here: ");

        String name = input.next();
        String nameL = name.toLowerCase();
        String letterProper = nameL.toUpperCase();
        String nameProper = letterProper.charAt(0) + nameL.substring(1);
        System.out.println(nameProper);

        double total = 0;
        boolean done = false;
        double t = 0;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Where would you like to go, " + nameProper + "?");
        System.out.println("The Hive - $6.00\nInvention Studio - $7.50\nKlaus - $6.90\nCULC - $3.20");

        String location = input.next();
        if (location == "CULC" || location == "Klaus") {
            System.out.println("Would you like to stop by Chick-fil-a on the way? (Yes/No)");
            String cfa = input.next();

            if(cfa == "Yes") {

                switch(location) {
                    case "The Hive":
                        break;

                    case "Invention Studio":
                        break;

                    case "Klaus":
                        total = 6.90 * 1.50;
                        break;

                    case "CULC":
                        total = 3.20 * 1.50;
                        break;
                }
            }
            else if (cfa == "No") {
            }
            else {
                //terminate the service
                done = true;
            }

            System.out.println("Your current total is $" + total);
            if(location != "The Hive" && location != "Invetion Studio" && location != "Klaus" && location != "CULC") {
                System.out.println("That destination is invalid, goodbye!");
                //terminate the service
            }
        }
        Scanner input3 = new Scanner(System.in);
        System.out.println("Do you have a discount? (Yes/No)");
        String discount = input.next();
        if (discount == "Yes") {
            Scanner input4 = new Scanner(System.in);
            System.out.println("What is the discount code?");
            String response = input.next();
            double t = total * .75;
            if (response == "CS1331")

            System.out.println("You have received 25% off your ride!");
        }
        else if(response == "KNOWTHEOWNER"){
            Scanner input5 = new Scanner(System.in);
            System.out.println("How much would you like to take off?");
            String response2 = input.next();
            if (Double.parseDouble(response2)){
                double t = total - (double)response2;
                System.out.println("Taking off $" + response2 + " from your total...");
            }
            else if(response2.isNan) {
                double t = total - 1.00;
                System.out.println("Taking off $1.00 from your total...");
            }
            else {
                System.out.println("That discount does not exist! Better luck next time!");
            }
        }
        if (t < 0){
            t = 0;
            System.out.println("Thank you for riding with the Travel Buddy Service, %s! You are now $%.2f poorer! We hope you ride with us again! :)", nameProper, t);
        }
        else{
            System.out.println("Thank you for riding with the Travel Buddy Service, %s! You are now $%.2f poorer! We hope you ride with us again! :)", nameProper, t);
        }
    }
}
