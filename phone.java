class phone {
    void call() {
        System.out.println("Calling...");
    }
}

class smartphone extends phone {
    void browse() {
        System.out.println("Browsing the internet...");
    }
}

public class Main {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.call();
        sp.browse();
    }
}
