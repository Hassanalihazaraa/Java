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
        divisibleByNumber();
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
}