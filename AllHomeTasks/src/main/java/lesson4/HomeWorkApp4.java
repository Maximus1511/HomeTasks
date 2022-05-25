package lesson4;

import java.util.Random;
import java.util.Scanner;


public class HomeWorkApp4 {
    public static final int SIZE = 3;

    public static final Character HUMAN_SIGN = '+';
    public static final Character COMPUTER_SIGN = '0';
    public static final Character EMPTY_SIGN = '-';
    public static final Character CORNER_SIGN = '&';
    public static Scanner in = new Scanner(System.in);//to interact with user use console
    public static Random random = new Random();// to generate random number
    private final static char[][] MAP = new char[SIZE][SIZE];

    public static int moveCounter = 0;
    private static boolean isHumanWinner;


    public static void main(String[] args) {

        System.out.println("Hello!");
        InitMap(MAP);
        drawMap(MAP);
        Game();

        /*do{
            System.out.println("Lets start...");
            InitMap(MAP);
            DrawMap(MAP);
            Game();
        } while (!oneMoreGame());
         closeGame();*/
    }

    public static void Game() {
        while (anyEnableCells()) {
            humanMove(MAP);
            //isWinner();
            anyEnableCells();
            drawMap(MAP);
            //computerMove(MAP);
            //DrawMap(MAP);
            //isWinner();
            //anyEnableCells();
        }
    }

    private static void closeGame() {
        in.close();
        System.out.println("Thank you. Bye");
    }

    private static boolean oneMoreGame() {
        return (false);
    }

    public static void printGameResults(boolean isDraW) {
        String str = "";
        if (isDraW){
            System.out.println("Draw");
        }else {
        if (isHumanWinner) {
            str = "Human";
        } else str = "Computer";
        System.out.println("Winner is " + str);
        }
    }

    private static void isWinner() {
        printGameResults(isHumanWinner);
    }

    private static char[][] computerMove(char[][] map) {
        int columnNumber = 0;
        int rowNumber = 0;

        do {
            columnNumber = random.nextInt(SIZE);
            rowNumber = random.nextInt(SIZE);
        } while (!isCellAvailable(columnNumber, rowNumber));

        MAP[rowNumber][columnNumber] = COMPUTER_SIGN;
        moveCounter = moveCounter++;
        System.out.println("\n");
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
        moveCounter = moveCounter + 1;
        System.out.println("moveCounter = " + moveCounter + "\n");
        return (MAP);
    }

    private static int getValidNumber() {
        int n = -1;
        boolean needTip = false; //variable for print or not "out of range" message to user
        do {
            if (in.hasNextInt()){ //is ineteger?
                n = in.nextInt();
                needTip = true;
            } else {
                System.out.println("Please, input integer number");
                needTip = false;
                in.next();// Reset in value, else there will be infinite cycle
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
        //not perfect solution, but first of all, i'm trying launch it in general
        //System.out.print(CORNER_SIGN + "\t");
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

