import java.util.Scanner;

public class Recursion {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Student Driver");

        scan.close();
    }

    static void drive(String Student) {

        System.out.println("Training!");
        taste(Student);

        String feedback = getFeedBack(Student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            drivingSkill(Student);

            // Recursive call
            drive(Student);
        } else if (feedback.equals("yes")) {
            approve(Student);
        }
    }

    static void taste(String Student) {
        System.out.println("Testing Student Driving Skills");
    }

    static String getFeedBack(String Student) {
        System.out.println("Is the " + Student + " ready to drive? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void drivingSkill(String Student) {
        System.out.print("Driving Skills to Improve:");
        String skill = scan.next();
        System.out.println("Fixing Driving Skill: " + skill);
    }

    static void approve(String Student) {
        System.out.println("The student is now approved and equipped to drive!");
    }

}