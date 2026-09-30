import java.util.Scanner;

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        int minimumMarks = 75;
        System.out.println(marks + " >= " + minimumMarks + " : " + (marks >= minimumMarks));
        if (marks >= minimumMarks) {
            System.out.println(name + ", you are eligible for scholarship.");
        } else {
            System.out.println(name + ", you are not eligible for scholarship.");
        }
        sc.close();
    }
}