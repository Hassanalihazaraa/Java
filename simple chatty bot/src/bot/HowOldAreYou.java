package bot;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}