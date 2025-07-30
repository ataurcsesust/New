package Project;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("----ONLINE SHOPPING SYSTEM----");
        System.out.println("Choose whether you are an Admin or a Customer");
        System.out.println("1.Admin \n2.Customer \n3.Exit ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                Administrator.main(null);
                break;
            case 2:
                Customer.main(null);
                break;
            case 3:
                System.out.println("Exiting.. Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
}
