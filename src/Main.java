import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        User user = service.askUserInfo();

        service.compareBloodType(user);




























        /*Scanner read = new Scanner(System.in);

        //Define variables and possible blood types into an array
        String userBloodInput;
        int optionGiveOrReceive;
        int goOn;
        List<String> bloodTypes = Arrays.asList("a+", "0+", "b+", "ab+", "a-", "0-", "b-", "ab-");
        String replace = bloodTypes.toString().replace("[", "").replace("]", "");

        //Starts with a do-while, so we can ask the user if he wants to continue when he is finished.
        do {
            System.out.println("Please insert a blood type");
            userBloodInput = read.next().toLowerCase();

            //Check that the user chose a valid blood type, if not make him choose again
            while (!bloodTypes.contains(userBloodInput.toLowerCase())) {
                System.out.println("Not a blood type, insert again");
                System.out.println("The possible options are: " + replace.toUpperCase());
                userBloodInput = read.next().toLowerCase();
            }

            //Ask the user if he wants to know about receiving or giving
            System.out.println("To know which type of blood " + userBloodInput.toUpperCase() + " can GIVE to, insert 1");
            System.out.println("To know which type of blood " + userBloodInput.toUpperCase() + " can RECEIVE from, insert 2");
            optionGiveOrReceive = read.nextInt();

            //Check that the user chose a valid option, if not make him choose again
            while (optionGiveOrReceive != 1 && optionGiveOrReceive != 2) {
                System.out.println(optionGiveOrReceive + " is not a valid answer");
                System.out.println("To know which type of blood " + userBloodInput.toUpperCase() + " can GIVE to, insert 1");
                System.out.println("To know which type of blood " + userBloodInput.toUpperCase() + " can RECEIVE from, insert 2");
                optionGiveOrReceive = read.nextInt();
            }

            //Conditional, if the user chose to know about giving blood
            if (optionGiveOrReceive == 1) {
                //switch depending on user's blood type
                switch (userBloodInput) {
                    case "a+":
                        System.out.println("A+ can give blood to: A+, AB+");
                        break;
                    case "0+":
                        System.out.println("0+ can give blood to: 0+, A+, B+, AB+");
                        break;
                    case "b+":
                        System.out.println("B+ can give blood to: B+, AB+");
                        break;
                    case "ab+":
                        System.out.println("AB+ can give blood to: AB+");
                        break;
                    case "a-":
                        System.out.println("A- can give blood to: A+, A-, AB+, AB-");
                        break;
                    case "0-":
                        System.out.println("0+ can give blood to: " + replace.toUpperCase());
                        break;
                    case "b-":
                        System.out.println("B- can give blood to: B+, B-, AB+, AB-");
                        break;
                    case "ab-":
                        System.out.println("AB- can give blood to: AB+, AB-");
                        break;
                }
                //Conditional, if the user chose to know about receiving blood
            } else {
                //switch depending on user's blood type
                switch (userBloodInput) {
                    case "a+":
                        System.out.println("A+ can receive blood from: A+, A-, 0+, 0-");
                        break;
                    case "0+":
                        System.out.println("0+ can receive blood from: 0+, 0-");
                        break;
                    case "b+":
                        System.out.println("B+ can receive blood from: B+, B-, 0+, 0-");
                        break;
                    case "ab+":
                        System.out.println("AB+ can receive blood from: " + replace.toUpperCase());
                        break;
                    case "a-":
                        System.out.println("A- can receive blood from: A-, 0-");
                        break;
                    case "0-":
                        System.out.println("0+ can receive blood from: 0-");
                        break;
                    case "b-":
                        System.out.println("B- can receive blood from: B-, 0-");
                        break;
                    case "ab-":
                        System.out.println("AB- can receive blood from AB-, A-, B-, 0-");
                        break;
                }
            }

            //Ask the user if he wants to make another question
            System.out.println("Would you like to continue? Enter 1 for YES and 2 for NO");
            goOn = read.nextInt();

            //Check that the user chose a valid option, if not make him choose again
            while (goOn != 1 && goOn != 2) {
                System.out.println(goOn + " Is not a valid option, please enter 1 for YES and 2 for NO");
                goOn = read.nextInt();
            }

            //Depending on the users choice, he can make another question or exit
        } while (goOn != 2);

        //Give the user a message that the program ended
        System.out.println("You decided to exit. Thank you for using the program");
*/
    }
}