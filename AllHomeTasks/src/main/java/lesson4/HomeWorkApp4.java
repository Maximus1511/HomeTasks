package lesson4;

import java.util.Random;
import java.util.Scanner;


public class HomeWorkApp4 {
    public static final int SIZE = 3;

    public static final Character HUMAN_SIGN = '+';
    public static final Character COMPUTER_SIGN = '0';
    public static final Character EMPTY_SIGN = '-';
    public static final Character CORNER_SIGN = '&';

    public static Scanner in = new Scanner(System.in);// for interact with user use console
    public static Random random = new Random();// for generate random number
    private final static char[][] MAP = new char[SIZE][SIZE];

    public static int moveCounter = 0;
    public static int lastRowNumber = 0;
    public static int lastColumnNumber = 0;

    private static boolean isPlayerWinner;


    public static void main(String[] args) {

        System.out.println("Hello!");
        /*InitMap(MAP);
        /drawMap(MAP);
        game();
        closeGame();*/
        do {
            System.out.println("Lets start...");
            InitMap(MAP);
            drawMap(MAP);
            game();
        } while (oneMoreGame());
        closeGame();
    }

    public static void game() {
        while (anyEnableCells()) {
            humanMove(MAP);
            drawMap(MAP);
            if (isWinner(HUMAN_SIGN)) {// is human winner?
                System.out.println("Winner is human");
                break;
            }
            if (anyEnableCells() == false) {//do we have cells for next move?
                break;
            }
            //computer move
            computerMove(MAP);
            drawMap(MAP);
            if (isWinner(COMPUTER_SIGN)) {// is computer winner?
                System.out.println("Winner is computer");
                break;
            }
            if (anyEnableCells() == false) {//do we have cells for next move?
                break;
            }
        }
    }

    private static void closeGame() {
        in.close();
        System.out.println("Thank you. Bye");
    }

    private static boolean oneMoreGame() {
        System.out.println("Do you want play again? Yes / No");
        String str = in.next();
        if (str.equals("Yes")) {//ATTENTION! string comparison without "==", use equals method!lost 10 min
            moveCounter = 0;
            return (true);
        } else return (false);
    }

    private static boolean isWinner(char sign) {//don't check diagonals
        int winnerCounter = 0;
        boolean vertical;
        boolean horizontal;

        //Check vertical lines
        for (int i = 0; i < SIZE; i++) {//check vertical lines
            if (MAP[i][lastColumnNumber] == sign) {
                winnerCounter++;
            } else {
                winnerCounter = 0;
                break;
            }
        }
        vertical = (winnerCounter == SIZE);

        //Check horizontal lines
        winnerCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[lastRowNumber][i] == sign) {
                winnerCounter++;
            } else {
                winnerCounter = 0;
                break;
            }
        }
        horizontal = (winnerCounter == SIZE);

        // do we have any lines?
        isPlayerWinner = (horizontal || vertical);
        return (isPlayerWinner);
    }

    private static char[][] computerMove(char[][] map) {
        int columnNumber = 0;
        int rowNumber = 0;

        do {
            columnNumber = random.nextInt(SIZE);
            rowNumber = random.nextInt(SIZE);
        } while (!isCellAvailable(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = COMPUTER_SIGN;
        lastColumnNumber = columnNumber;
        lastRowNumber = rowNumber;

        moveCounter = moveCounter + 1;
        return (MAP);
    }

    private static char[][] humanMove(char[][] Map) {
        int columnNumber = 0;
        int rowNumber = 0;

        do {
            System.out.println("Input column number");
            columnNumber = getValidNumber() - 1;

            System.out.println("Input row number");
            rowNumber = getValidNumber() - 1;
        } while (!isCellAvailable(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = HUMAN_SIGN;
        lastColumnNumber = columnNumber;
        lastRowNumber = rowNumber;

        moveCounter = moveCounter + 1;
        return (MAP);
    }

    private static int getValidNumber() {
        int n = -1;
        boolean needTip = false; //variable for print or not "out of range" message to user
        do {
            if (in.hasNextInt()) { //is ineteger?
                n = in.nextInt();
                needTip = true;
            } else {
                System.out.println("Please, input integer number");
                needTip = false;
                in.next();// Reset "in" value, else there will be infinite cycle
            }
        } while (!isNumberValid(n, needTip));
        return (n);
    }

    private static boolean isNumberValid(int n, boolean needTip) {
        boolean bool = (n >= 1) && (n <= SIZE);
        if (bool == false) {
            if (needTip) {
                System.out.println("Out of range. Input number in correct range");
            }
        }
        return bool;
    }

    private static boolean isCellAvailable(int x, int y) {//is choosen cell available for your move?
        boolean bool = MAP[x][y] == EMPTY_SIGN;
        if (!bool) {
            System.out.println("Cell isn't available. There is other sign, try again...");
        }
        return (bool);
    }

    private static boolean anyEnableCells() {//do you have any cell for move?
        boolean temp = moveCounter < SIZE * SIZE;
        if (!temp) {
            System.out.println("Draw");
        }
        return (temp);
    }

    private static char[][] InitMap(char[][] arr) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = EMPTY_SIGN;
            }
        }
        return arr;
    }

    private static char[][] drawMap(char[][] arr) {
        //draw without any headers...First of all general understaning
        for (int i = 0; i < SIZE; i++) {
            //System.out.print(i + 1 + "\t");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            //System.out.print(i + 1 + "\t");
            for (int j = 0; j < SIZE; j++) {
                System.out.print((arr[i][j]) + "\t");
            }
            System.out.println("");
        }
        return (arr);
    }
}

