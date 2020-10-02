public class Introduction {
    public static void main(String[] args) {
        printLetters();
        printMagicLetters();
        printTicTacToe();
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
}
