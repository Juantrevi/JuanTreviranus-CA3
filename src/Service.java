import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Service {

    //Creates a new user called user
    User user = new User();
    Scanner read = new Scanner(System.in);
    //An array containing the blood types that exists
    List<String> bloodTypes = Arrays.asList("a+", "0+", "b+", "ab+", "a-", "0-", "b-", "ab-");


    //Method to ask the user for their information, this method returns a user
    public User askUserInfo(){

            System.out.println("Please input your First Name");
            user.setName(read.next());
            System.out.println("Please input your Last Name");
            user.setLastName(read.next());

            System.out.println("Are you a donor or receiver (1 for Donor, 2 for Receiver): ");
            user.setGiveOrReceive(read.next());

            //Check that the option about donor or receiver is correct
            while (!user.getGiveOrReceive().equalsIgnoreCase("1") &&
                    !user.getGiveOrReceive().equalsIgnoreCase("2")){
                System.out.println("Choice doesn’t exist, please try again!\n" +
                        "Are you a donor or receiver (1 for Donor, 2 for Receiver): \n");
                user.setGiveOrReceive(read.next());
            }

        System.out.println("Please provide your blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
        user.setBloodType(read.next());

        //Check that the option about the blood type is correct
        while (!bloodTypes.contains(user.getBloodType().toLowerCase())){
            System.out.println("Not a valid option, please provide your blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
            user.setBloodType(read.next());
        }


            return user;
        }

        //Method to compare the blood type and display the options
    public void compareBloodType(User user){

        System.out.print(user.getName() + " " + user.getLastName() + ", ");
        if (user.getGiveOrReceive().equalsIgnoreCase("1")) {

            //switch depending on user's blood type
            switch (user.getBloodType()) {
                case "a+":
                    System.out.println("you can give the following blood type: A+, AB+");
                    break;
                case "0+":
                    System.out.println("you can give the following blood type: 0+, A+, B+, AB+");
                    break;
                case "b+":
                    System.out.println("you can give the following blood type: B+, AB+");
                    break;
                case "ab+":
                    System.out.println("you can give the following blood type: AB+");
                    break;
                case "a-":
                    System.out.println("you can give the following blood type: A+, A-, AB+, AB-");
                    break;
                case "0-":
                    System.out.println("you can give the following blood type: " + bloodTypes.toString()
                            .replace("[", "")
                            .replace("]", ""));
                    break;
                case "b-":
                    System.out.println("you can give the following blood type: B+, B-, AB+, AB-");
                    break;
                case "ab-":
                    System.out.println("you can give the following blood type: AB+, AB-");
                    break;
            }
            //Conditional, if the user chose to know about receiving blood
        } else {

            //switch depending on user's blood type
            switch (user.getBloodType()) {
                case "a+":
                    System.out.println("you can receive the following blood type: A+, A-, 0+, 0-");
                    break;
                case "0+":
                    System.out.println("you can receive the following blood type: 0+, 0-");
                    break;
                case "b+":
                    System.out.println("you can receive the following blood type: B+, B-, 0+, 0-");
                    break;
                case "ab+":
                    System.out.println("you can receive the following blood type: "+ bloodTypes.toString()
                            .replace("[", "")
                            .replace("]", ""));
                    break;
                case "a-":
                    System.out.println("you can receive the following blood type: A-, 0-");
                    break;
                case "0-":
                    System.out.println("you can receive the following blood type: 0-");
                    break;
                case "b-":
                    System.out.println("you can receive the following blood type: B-, 0-");
                    break;
                case "ab-":
                    System.out.println("you can receive the following blood type: AB-, A-, B-, 0-");
                    break;
            }
        }
    }
    }

