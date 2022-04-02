import java.util.Random;

class TestPuzzle{

    public static void main(String[] args) {

        // Random numero = new Random();

        // int n = numero.nextInt(7);

        // System.out.println(n);

        // Random numAleatorio = new Random();
        // int n1 = numAleatorio.nextInt(75-25+1) + 25;
        // System.out.println(n1);
        PuzzleJava puzzle = new PuzzleJava();
        puzzle.getTenRolls();
        puzzle.getRandomLetter();
        puzzle.generatePassword();
    }
}
