package lesson4;

import java.util.Random;
import java.util.Scanner;


public class HomeWorkApp4 {
    public static final int SIZE = 3;

    public static final Character HUMAN_SIGN = '+';
    public static final Character COMPUTER_SIGN = '0';
    public static final Character EMPTY_SIGN = '-';
    public static final Character CORNER_SIGN = '&';
    public static Scanner in =  new Scanner(System.in);//to interact with user use console
    public static Random random = new Random();// to generate random number
    private final static char[][] MAP = new char[SIZE][SIZE];

    public static int moveCounter = 0;
    private static boolean isHumanWinner;


    public static void main(String[] args) {

        System.out.println("Hello!");
        InitMap(MAP);
        DrawMap(MAP);
        Game();
        /*do{
            System.out.println("Lets start...");
            InitMap(MAP);
            DrawMap(MAP);
            Game();
        } while (!oneMoreGame());
         closeGame();*/
        }

    private static char[][] InitMap(char[][] arr) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr [i][j] = EMPTY_SIGN;
            }
        }
        return arr;
    }

       private static char[][] DrawMap(char[][] arr) {
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
        return(arr);
    }

    public static void Game() {
        while (anyEnableCells()) {
            humanMove(MAP);
            //isWinner();
            anyEnableCells();
            DrawMap(MAP);
            //computerMove(MAP);
            //DrawMap(MAP);
            //isWinner();
            anyEnableCells();
        }
    }

    private static boolean anyEnableCells() {
        return(moveCounter <= SIZE*SIZE);
    }

    private static void closeGame() {
        in.close();
        System.out.println("Thank you. Bye");
    }

    private static boolean oneMoreGame() {
        return(false);
    }

    private static void printGameResults(boolean isHumanWinner) {
        String str = "";
        if (isHumanWinner){
            str = "Human";
        }else str = "Computer";
        System.out.println("Winner is " + str);
    }

    private static boolean isCellAvailable(int x, int y) {
        boolean bool = MAP [x][y] == EMPTY_SIGN;
        if (!bool) {
            System.out.println("Cell isn't available. There is other sign, try again...");
        }
        return(bool);
    }

    private static void isWinner() {
        printGameResults(isHumanWinner);
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
        moveCounter = moveCounter ++;
        System.out.println("\n");
        return (MAP);
    }

    private static char [][] computerMove(char[][] map) {
        int columnNumber = 0;
        int rowNumber = 0;

        do {
            columnNumber = random.nextInt(SIZE);
            rowNumber = random.nextInt(SIZE);
        } while (!isCellAvailable(columnNumber, rowNumber));

        MAP[rowNumber][columnNumber] = COMPUTER_SIGN;
        moveCounter = moveCounter ++;
        System.out.println("\n");
        return (MAP);
    }

    private static int getValidNumber() {
        while (true) {
            if (in.hasNextInt()) { //Number or smth else?
                int n = in.nextInt();
                if (isNumberValid(n)) { //Number in range?
                    return (n);
                } else System.out.println("Input number in correct range");
                ;
            } else System.out.println("Input number, not just symbol");
            in.next();// ЧТО ЭТО ДЕЛАЕТ?
        }
    }

    private static boolean isNumberValid (int n){
        return ((n > 0)&& (n <= SIZE));
    }

}

