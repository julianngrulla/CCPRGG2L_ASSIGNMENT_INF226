import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Student Email
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Email: ");
        String studentEmail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        //Phone Number
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phoneNum = scan.nextLine();

        Pattern pattern1 = Pattern.compile("\\+63\\d{10}");
        Matcher matcher1 = pattern.matcher(phoneNum);

        boolean match1 = matcher.matches();

        if (match) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }

        //Birth Date
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter Birthdate: ");
        String birthDate = scan.nextLine();

        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher2 = pattern.matcher(birthDate);

        boolean match2 = matcher.matches();

        if (match) {
            System.out.println("valid birth date");
        } else {
            System.out.println("invalid birth date");
        }
}
}