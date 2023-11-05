
//In order to help learn course concepts, I worked on the homework with none,
// discussed homework topics and issues with none, and/or consulted related material
//that can be found at Stack Overflow.
import java.util.Scanner;
public class Giveaway {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String[][] array2d = {{"x","x","StuffedPython","x","CSalt"},
//                {"hAIrspray","x","x","x","x"}
//                {"x","x","x","JavaBeans","x"}
//                {"x","RustedMetal","SwiftShoes","x","x"},
//                {"FuRniture","x","x","GroovyGear","RadiantRuby"}};
        int columns = 5;
        int rows = 5;
        String[][] array2d = new String[columns][rows];
        array2d[0][0] = "x";
        array2d[0][1] = "hAIrspray";
        array2d[0][2] = "x";
        array2d[0][3] = "x";
        array2d[0][4] = "FuRniture";

        array2d[1][0] = "x";
        array2d[1][1] = "x";
        array2d[1][2] = "x";
        array2d[1][3] = "RustedMetal";
        array2d[1][4] = "x";

        array2d[2][0] = "StuffedPython";
        array2d[2][1] = "x";
        array2d[2][2] = "x";
        array2d[2][3] = "SwiftShoes";
        array2d[2][4] = "x";

        array2d[3][0] = "x";
        array2d[3][1] = "x";
        array2d[3][2] = "JavaBeans";
        array2d[3][3] = "x";
        array2d[3][4] = "GroovyGear";

        array2d[4][0] = "CSalt";
        array2d[4][1] = "x";
        array2d[4][2] = "x";
        array2d[4][3] = "x";
        array2d[4][4] = "RadiantRuby";

        String prizes = "";
        for (String[] i : array2d) {
            for (String j : i) {
                prizes += j;
            }
        }
        System.out.println("Welcome to the 1331 Giveaway!");
        boolean done = false;

        //while loop the entire if statement
        while (!prizes.equals("xxxxxxxxxxxxxxxxxxxxxxxxx")) {

            System.out.println("\nWould you like to take an item? [Y]es, [N]o, or [E]xit");
            String item = input.nextLine();
            if (item.equals("E")) {
                System.out.println("Have a good day!");
                break;
            }
            //done = true;
            if (item.equals("Y")) {
                System.out.print("\n");
                for (int i = 0; i < array2d.length; i++) {
                    for (int j = 0; j < array2d[i].length; j++) {
                        System.out.print("|" + array2d[j][i]);
                    }
                    System.out.print("|\n");
                }
                System.out.println("\nWhat item are you interested in taking?");
                String interest = input.nextLine();

                while (interest.length() != 3) {
                    System.out.println("\nLocation does not exist.");
                    System.out.println("\nWhat item are you interested in taking?");
                    interest = input.nextLine();
                }

                int r = Integer.valueOf(interest.substring(0, 1));
                int c = Integer.valueOf(interest.substring(2));

                while (!done) {
                    if (r > 4 || c > 4 || r < 0 || c < 0) {
                        System.out.println("\nLocation does not exist.");
                        System.out.println("\nWhat item are you interested in taking?");
                        interest = input.nextLine();
                        r = Integer.valueOf(interest.substring(0, 1));
                        c = Integer.valueOf(interest.substring(2));
                    } else if (array2d[c][r].equals("x")) {
                        System.out.println("\nThere is no item in this location.");
                        System.out.println("\nWhat item are you interested in taking?");
                        interest = input.nextLine();
                        r = Integer.valueOf(interest.substring(0, 1));
                        c = Integer.valueOf(interest.substring(2));
                    } else if (!array2d[c][r].equals("x")) {
                        done = true;
                        System.out.println("\nYou successfully took the " + array2d[c][r] + "!\n");
                        array2d[c][r] = "x";
                        for (int i = 0; i < array2d.length; i++) {
                            for (int j = 0; j < array2d[i].length; j++) {
                                System.out.print("|" + array2d[j][i]);
                            }
                            System.out.print("|\n");
                        }
                    }
                }
            } else if (item.equals("N")) {
                System.out.println("Next person in line!");
                 //System.out.println("\nWould you like to take an item? [Y]es, [N]o, or [E]xit");
                 //item = input.nextLine();
            } else {
                System.out.println("\nPlease input 'Y', 'N', or 'E'.");
            }
            prizes = "";
            for (String[] i : array2d) {
                for (String j : i) {
                    prizes += j;
                }
            }
        }
        if (prizes.equals("xxxxxxxxxxxxxxxxxxxxxxxxx")) {
            System.out.println("“Sorry, we have no more items!");
        }
    }
}
