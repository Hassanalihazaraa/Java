package bot;

import java.util.Scanner;

public class StageFive {
    public static void main(String[] args) {
        //collatzConjecture();
        //smallestValue();
        //squaresOfNaturalNumbers();
        //Profit();
        //evenOrOdd();
        //busTour();
        //unOrderedSequence();
        //sign(-1);
        //isVowel('a');
        factorial(0);
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

    public static void busTour() {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridge = scanner.nextInt();
        for (int i = 1; i < numberOfBridge; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight <= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == bridgeHeight) {
                System.out.println("Will not crash");
            }
        }
    }

    public static void unOrderedSequence() {
        Scanner scanner = new Scanner(System.in);
        int previous = scanner.nextInt();
        boolean increasing = true;
        boolean decreasing = true;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > previous) {
                decreasing = false;
            } else if (number < previous) {
                increasing = false;
            }
            previous = number;
        }
        System.out.println(increasing || decreasing);
    }

    public static int sign(int number) {
        if (number <= -1) {
            System.out.println(-1);
        } else if (number == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        return number;
    }

    public static boolean isVowel(char vowel) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char charactor : vowels) {
            if (charactor == vowel) {
                System.out.print(true);
                return true;
            }
        }
        System.out.print(false);
        return false;
    }

    public static long factorial(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
            System.out.println(result);
        }
        return result;
    }
}
