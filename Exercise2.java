import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive ("Student Driver");
        scan.close();
    }

    static void drive(String student ) {

        System.out.println("Training");
        test(student);

        String feedback = getFeedBack(student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixdrivingSkill(student);

            // Recursive call
            drive(student);
        } else if (feedback.equals("yes")) {
           approve (student);
        }
    }

    static void test(String student) {
        System.out.println("Testing Student Driving Skills");
    }

    static String getFeedBack(String student) {
        System.out.println("Is the " + student + " ready to drive? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixdrivingSkill(String student) {
        System.out.print("Driving skills to improve:");
        String skill = scan.next();
        System.out.println("Improve Driving Skills" + skill);
    }

    static void approve(String student) {
        System.out.println("Student is now ready to drive!!!" );
    }

}