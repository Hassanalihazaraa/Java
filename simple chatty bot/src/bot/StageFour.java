package bot;

import java.util.*;

public class StageFour {
    public static void main(String[] args) {
        //checkSum();
        //notEqual();
        //sort();
        //conditionalStatement();
        conditionalStatementTwo();
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
}