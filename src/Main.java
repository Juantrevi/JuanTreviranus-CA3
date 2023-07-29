
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String goOn;

        //Start the program and stay in the loop as long as the user wants
        do {
            Service service = new Service();
            User user = service.askUserInfo();
            service.compareBloodType(user);
            System.out.println("Would you like to start again? Y for yes, N for no");
            goOn = read.next();

            //Checks if the option the user has given (To continue) is correct
            while (!goOn.equalsIgnoreCase("y") && !goOn.equalsIgnoreCase("n")){
                System.out.println("Not a valid option. Y for yes, N for no");
                goOn = read.next();
            }

        }while (!goOn.equalsIgnoreCase("n"));

        System.out.println("Thank you for using the service.");
    }
}