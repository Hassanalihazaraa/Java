package bot;

import java.util.*;

public class StageFour {
    public static void main(String[] args) {
        //checkSum();
        //notEqual();
        //sort();
        //conditionalStatement();
        //conditionalStatementTwo();
        //leapYear();
        //chocolate();
        //sumOfIntegers();
        //sizeOfParts();
        //divisibleByNumber();
        //divisibleByFour();
        //countOfNumbers();
        //cubicEquation();
        //arithmeticAverage();
        letCount();
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

    public static void sort() {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        if (h1 >= h2 && h2 >= h3) {
            System.out.println(true);
        } else if (h3 >= h2 && h2 >= h1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void conditionalStatement() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }

    public static void conditionalStatementTwo() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println((i > -15 && i <= 12) || (i > 14 && i < 17) || (i >= 19) ? "True" : "False");
    }


    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "Leap" : "Regular");
    }

    public static void chocolate() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n) ? "YES" : "NO");
    }

    public static void sumOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sizeOfParts() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fixed = 0;
        int reject = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            if (size == 1) {
                fixed++;
            } else if (size == -1) {
                reject++;
            } else {
                perfect++;
            }
        }
        System.out.println(perfect + " " + fixed + " " + reject);
    }

    public static void divisibleByNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < input; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    public static void divisibleByFour() {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < max; i++) {
            int n = scanner.nextInt();

            if (n % 4 == 0 && n > result) {
                result = n;
            }
        }
        System.out.println(result);
    }

    public static void countOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;

        while (a <= b) {
            if (a % n == 0) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }

    public static void cubicEquation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i <= 1000; i++) {
            if (a * (i * i * i) + b * (i * i) + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }

    public static void arithmeticAverage() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        double maxA = Math.min(a, b);
        double maxB = Math.max(a, b);

        double result = 0;
        double counter = 0;
        for (double i = maxA; i <= maxB; i++) {
            if (i % 3 == 0) {
                result += i;
                counter++;
            }
        }

        double average = result / counter;
        System.out.println(average);
    }

    public static void letCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");
    }
}