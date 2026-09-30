import java.util.Scanner;

public class AssignmentOperatorsExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = 10000;
    System.out.print("Enter the amount you want to deposit: ");
    int num = sc.nextInt();
    value += num;
    System.out.println("After '+=' (add deposit): " + value);
    sc.close();
  }
}
