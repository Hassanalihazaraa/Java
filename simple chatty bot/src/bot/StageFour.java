package bot;

import java.util.*;

public class StageFour {
    public static void main(String[] args) {
        //checkSum();
        notEqual();
    }

    public static void checkSum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b == 20 || b + c == 20 || a + c == 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void notEqual() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a != b && b != c && a != c);
    }
}