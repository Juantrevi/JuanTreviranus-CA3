import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Service {

    User user = new User();
    Scanner read = new Scanner(System.in);
    List<String> bloodTypes = Arrays.asList("a+", "0+", "b+", "ab+", "a-", "0-", "b-", "ab-");


    public User askUserInfo(){

            System.out.println("Please insert your First Name");
            user.setName(read.next());
            System.out.println("Please insert your Last Name");
            user.setLastName(read.next());

            System.out.println("Please, enter D if tou want to know information about donating," +
                    " or R if you want to know information about receiving");
            user.setGiveOrReceive(read.next());

            while (!user.getGiveOrReceive().equalsIgnoreCase("d") &&
                    !user.getGiveOrReceive().equalsIgnoreCase("r")){
                System.out.println("Not a valid option, please insert again:" +
                        "D to get information about donating, R for receiving");
                user.setGiveOrReceive(read.next());
            }

        System.out.println("Please insert the blood type (\"a+\", \"0+\", \"b+\", \"ab+\", \"a-\", \"0-\", \"b-\" or \"ab-\"");
        user.setBloodType(read.next());

        while (!bloodTypes.contains(user.getBloodType().toLowerCase())){
            System.out.println("Not a valid option, please insert again: " +
                    "\"a+\", \"0+\", \"b+\", \"ab+\", \"a-\", \"0-\", \"b-\" or \"ab-\"");
            user.setBloodType(read.next());
        }


            return user;
        }

    public void compareBloodType(User user){

        if (user.getGiveOrReceive().equalsIgnoreCase("d")) {
            //switch depending on user's blood type
            switch (user.getBloodType()) {
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
                    System.out.println("0+ can give blood to: ");
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
            switch (user.getBloodType()) {
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
                    System.out.println("AB+ can receive blood from: ");
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
    }
    }

