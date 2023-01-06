import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Email Address: ");
        String studentemailAd = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("[\\w]+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentemailAd);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid Student email address");
        } else {
            System.out.println("Invalid Student email address");
        }

        
        System.out.print("Enter Student Contact Number: ");
        String studentcontactNum = scan.nextLine();

        // Long method
        Pattern pattern1 = Pattern.compile("\\+639\\d{9}");
        Matcher matcher1 = pattern1.matcher(studentcontactNum);

        boolean match1 = matcher.matches();

        if (match1) {
            System.out.println("Valid Student Contact Numberr");
        } else {
            System.out.println("Invalid Student Contact Number");
        }
        

        System.out.print("Enter Student Birth Date: ");
        String studentbirthDate = scan.nextLine();

        // Long method
        Pattern pattern2 = Pattern.compile("\\d{3}\\d{2}\\d{2}");
        Matcher matcher2 = pattern2.matcher(studentbirthDate);

        boolean match2 = matcher.matches();

        if (match2) {
            System.out.println("Valid Student Birth Date");
        } else {
            System.out.println("Invalid Student Birth Date");
        }


    }
}
