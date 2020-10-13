package bot;

import java.util.Scanner;

public class StageFive {
    public static void main(String[] args) {
        //collatzConjecture();
        //smallestValue();
        //squaresOfNaturalNumbers();
        //Profit();
        evenOrOdd();
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

    public static void smallestValue() {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1L;
        long result = 1L;

        while (result <= m) {
            result = result * (n + 1);
            n++;
        }
        System.out.println(n);
    }

    public static void squaresOfNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 1;
        int number = 1;

        while (square <= n) {
            System.out.println(square);
            number++;
            square = number * number;
        }
    }

    public static void Profit() {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextDouble();

        int year = 0;

        while (m < k) {
            year++;
            m += m * p;
        }
        System.out.println(year);
    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
