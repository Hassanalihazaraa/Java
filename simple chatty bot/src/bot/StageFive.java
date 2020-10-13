package bot;

import java.util.Scanner;

public class StageFive {
    public static void main(String[] args) {
        collatzConjecture();
    }

    public static void collatzConjecture() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.print(number + " ");
        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2;
                System.out.print(number + " ");
            } else {
                if (number == 1) {
                    break;
                }
                number = number * 3 + 1;
                System.out.print(number + " ");
            }
        }
    }
}
