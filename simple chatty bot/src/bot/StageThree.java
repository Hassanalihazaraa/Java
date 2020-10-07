package bot;

import java.util.Scanner;

public class StageThree {
    public static void main(String[] args) {
        //arithmetic();
        //DifferenceOfTimes();
        //sumOfDigits();
        //desks();
        //decrement();
        //extractSubstring();
        //replaceSubstring();
        //stringContains();
        howOldAmI();

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

    public static void desks() {
        Scanner scanner = new Scanner(System.in);
        int classOne = (int) Math.ceil((float) scanner.nextInt() / 2);
        int classTwo = (int) Math.ceil((float) scanner.nextInt() / 2);
        int classThree = (int) Math.ceil((float) scanner.nextInt() / 2);

        System.out.println(classOne + classTwo + classThree);
    }


    public static void decrement() {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();

        System.out.print(--one + " " + --two + " " + --three + " " + --four);
    }

    public static void extractSubstring() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(name.substring(number1, number2 + 1));
    }

    public static void replaceSubstring() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next().replaceAll("a", "b");
        System.out.println(string);
    }

    public static void stringContains() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string.contains("J") || string.contains("j"));
    }

    public static void howOldAmI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainder1 = scanner.nextInt();
        int remainder2 = scanner.nextInt();
        int remainder3 = scanner.nextInt();

        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}