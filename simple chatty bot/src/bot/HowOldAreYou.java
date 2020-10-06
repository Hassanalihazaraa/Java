package bot;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        //arithmetic();
        //DifferenceOfTimes();
        sumOfDigits();
    }

    public static void arithmetic() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(((n + 1) * n + 2) * n + 3);
    }

    public static void DifferenceOfTimes() {
        Scanner scanner = new Scanner(System.in);
        int firstOne = ((scanner.nextInt() * 60) * 60) + (scanner.nextInt() * 60) + scanner.nextInt();
        int secondOne = ((scanner.nextInt() * 60) * 60) + (scanner.nextInt() * 60) + scanner.nextInt();
        System.out.println(secondOne - firstOne);
    }

    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int first = number / 100;
        int second = (number - (first * 100)) / 10;
        int third = number % 10;

        System.out.println(first + second + third);
    }
}