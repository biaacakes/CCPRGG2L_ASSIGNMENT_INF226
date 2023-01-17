import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Student Driver");

        scan.close();
    }

    static void drive(String Student) {

        System.out.println("Training...");
        test(Student);

        String feedback = getFeedBack(Student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            enhancedrivingSkill(Student);

            // Recursive call
            drive(Student);
        } else if (feedback.equals("yes")) {
            approve(Student);
        }
    }

    static void test(String Student) {
        System.out.println("Testing Student Driving Skills");
    }

    static String getFeedBack(String Student) {
        System.out.println("Is the " + Student + " ready to drive? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void enhancedrivingSkill(String Student) {
        System.out.print("Driving Skills to Improve:");
        String skill = scan.next();
        System.out.println("Enhance your skill in: " + skill);
    }

    static void approve(String Student) {
        System.out.println("The student is now approved and equipped to drive!");
    }

}