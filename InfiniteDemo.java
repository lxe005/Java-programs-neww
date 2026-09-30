public class InfiniteDemo {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("count: " + count);
            count++;
            if (count > 10) {
                break;
            }
        }
        System.out.println("Loop exited after count reached: " + count);
    }
}