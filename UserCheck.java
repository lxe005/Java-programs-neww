public class UserCheck {
  public static void main(String[] args) {
    String username = "admin";
    int pin = 1234;
    if (username.equals("admin") && pin == 1234) {
      System.out.println("Access granted.");
    } else {
      System.out.println("wrong username or pin.");
    }
    System.out.println("Unknown user.");
  }
}
