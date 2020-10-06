package bot;

import java.util.*;

public class SimpleBot {
    public static void main(String[] args) {
        //printLetters();
        //printMagicLetters();
        //printTicTacToe();
        //printBotDetails();
        //printNumbers();
        //printDeclaration();
        //whatsMyName();
        //comments();
        //systemInput();
        //printSameOrder();
        printFromLastName();
    }

    //printing Letters
    public static void printLetters() {
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
    }

    //printing magic letter
    public static void printMagicLetters() {
        System.out.println("********");
        for (int i = 0; i < 3; i++) {
            System.out.println("      **");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("**    **");
        }
        System.out.println(" *******");
    }

    //print result of tic-tac-toe
    public static void printTicTacToe() {
        System.out.println("O X X");
        System.out.println("O X O");
        System.out.println("X O X");
    }

    //print name and birthday
    public static void printBotDetails() {
        String name = "Aid";
        int birthDay = 2020;
        System.out.println("Hello! My name is " + name + "\n" +
                "I was created in " + birthDay + ".");
    }

    //Assignments
    public static void printNumbers() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        System.out.println(String.format("%d %d %d %d", one, two, three, four));
    }

    //Invalid declaration of variables
    public static void printDeclaredVariables() {
        int a = 512_343;
        int b = 3_431_231;

        System.out.println(a + b);
    }

    //Fill the declaration
    public static void printDeclaration() {
        int variable = 123_456;
        System.out.println(variable);
    }

    //What's my name?
    public static void whatsMyName() {
        System.out.println("Hello! My name is Aid");
        System.out.println("I was created in 2020");
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("What a great name you have, " + input);
    }

    //comments
    public static void comments() {
         /*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);*/
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        //System.out.println(8);

        //uncomment a file
        //System.out.println(980233);
        System.out.println(893_457);
        //System.out.println(789722);

        System.out.print("three! ");
        System.out.print("two! ");
        System.out.println("one!");
        //System.out.println("go!");

        System.out.println("go!");
    }

    //Printing each word in a new line
    public static void systemInput() {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
    }

    //Printing strings in the same order
    public static void printSameOrder() {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();

        System.out.println(word1 + "\n" + word2 + "\n" + word3 + "\n" + word4);
    }

    public static void printFromLastName() {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        String input4 = scanner.next();
        String input5 = scanner.next();
        String input6 = scanner.next();
        String input7 = scanner.next();
        String input8 = scanner.next();

        System.out.println(input8);
        System.out.println(input7);
        System.out.println(input6);
        System.out.println(input5);
        System.out.println(input4);
        System.out.println(input3);
        System.out.println(input2);
        System.out.println(input1);
    }
}
