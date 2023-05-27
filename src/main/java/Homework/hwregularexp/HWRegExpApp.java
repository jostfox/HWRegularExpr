package Homework.hwregularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HWRegExpApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        while (true) {
            System.out.println("\nInput the phone number: ");
            phoneNumber = scanner.nextLine();
            if ("exit".equals(phoneNumber)) {
                break;
            }
            System.out.println(checkPhoneNumber(phoneNumber));
        }

        String emailInput;
        while (true) {
            System.out.println("\nInput the email address: ");
            emailInput = scanner.nextLine();
            if ("exit".equals(emailInput)) {
                break;
            }
            checkEmail(emailInput);
        }
    }

    public static byte checkPhoneNumber(String number) {
        String regex = "(\\d{7}|\\d{3}\\s\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.printf("\nThe number %s is a valid phone number\n", number);
            return 1;
        } else {
            System.out.printf("\nThe number %s is NOT a valid phone number\n", number);
            return 0;
        }
    }

    public static byte checkEmail(String email) {
        String regexLeft = "(.*@.*)";
        String regexRight = "([a-z]{2,3})";
        String regex = regexLeft + "\\." + regexRight;
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.printf("\nThe email \"%s\" is valid. ", email);
            return 1;
        } else {
            System.out.printf("\nThe email \"%s\" is NOT  valid. ", email);
            return 0;
        }
    }
}



