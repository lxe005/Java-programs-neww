public class SumWhile {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 5) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to 5 is: " + sum);
    }
}