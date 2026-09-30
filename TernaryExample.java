import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your attendance: ");
        int attendance = scanner.nextInt();
        String result = (attendance >= 75) ? "Eligible for Exam" : "Not Eligible for Exam";
        System.out.println("Your attendance is: " + result);
        scanner.close();
    }
}