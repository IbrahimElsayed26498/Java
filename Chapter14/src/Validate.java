/**
 * Fig. 14.21: Validate.java.
 * Input and validate data from user using the ValidateInput class
 */

import java.util.Scanner;

public class Validate {

    public static void main(String[] args)
    {
        //Get User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Name : ");
        String firstName = scanner.nextLine();

        System.out.println("Please Enter Second Name : ");
        String lastName = scanner.nextLine();

        System.out.println("Please Enter Address : ");
        String address = scanner.nextLine();

        System.out.println("Please Enter City : ");
        String city = scanner.nextLine();

        System.out.println("Please Enter State : ");
        String state = scanner.nextLine();

        System.out.println("Please Enter Zip : ");
        String zip = scanner.nextLine();

        System.out.println("Please Enter Phone : ");
        String phone = scanner.nextLine();

        // validate user input and display error message
        System.out.println("Validate Input : ");

        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid First Name");
        else if (!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid Last Name");
        else if (!ValidateInput.validateAddress(address))
            System.out.println("Invalid Address");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid City");
        else if (!ValidateInput.validateState(state))
            System.out.println("Invalid State");
        else if (!ValidateInput.validateZip(zip))
            System.out.println("Invalid Zip");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Invalid Phone");
        else
            System.out.println("Validate Input. Thank You !");
    }
}
