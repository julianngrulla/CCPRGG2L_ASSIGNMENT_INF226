import java.util.Scanner;

public class Drive {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Drive");
        scan.close();
    }

    static void drive(String drive) {

        System.out.println("Driving!");
        test(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixedRequirment(drive);

            // Recursive call
            drive(drive);
        } else if (feedback.equals("yes")) {
            learn(drive);
        }
    }

    static void test(String drive) {
        System.out.println("Test Driving");
    }

    static String getFeedBack(String drive) {
        System.out.println("Did you Passed the " + drive + " Test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixedRequirment(String drive) {
        System.out.print("What driving skill do you want to improve:");
        String skill = scan.next();
        System.out.println("Improved Skill. Added " + skill);
    }

    static void learn(String drive) {
        System.out.println("Passed " + drive);
    }

}