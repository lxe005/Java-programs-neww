public class LoginCheck {
    public static void main(String[] args) {
        String username = "admin";
        int pin = 1234;
        if (username.equals("admin") && pin == 1234) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or pin.");
        }
    }
}