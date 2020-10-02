package bot;

public class SimpleBot {
    public static void main(String[] args) {
        printLetters();
        printMagicLetters();
        printTicTacToe();
        printBotDetails();
        printNumbers();
        printDeclaration();
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
        int variable = 123456;  // Change this line

        System.out.println(variable);
    }
}
