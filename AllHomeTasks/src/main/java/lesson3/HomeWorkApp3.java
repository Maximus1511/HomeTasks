package lesson3;

import java.sql.SQLOutput;
import java.util.Arrays;


public class HomeWorkApp3 {
    public static final int SIZE_4exer = 5;
    public static void main(String[] args) {
        //Exercise 1

        int [] Arr1 = new int[5];
        int[] ResultArr1 = new int [5];
        Arr1[0] = 0;
        Arr1[1] = 0;
        Arr1[2] = 1;
        Arr1[3] = 1;
        Arr1[4] = 0;
        ResultArr1 = ChangeZero(Arr1);
        //System.out.println(Arrays.toString(ResultArr1));

        // Exercise 2
        int [] Arr2 = new int [100];
        fillArr2(Arr2);
        //System.out.println(Arrays.toString(fillArr2(Arr2)));

        // Exercise 3
        int [] Arr3 =  new int []{1,5,3,2,11,4,5,2,4,8,9,1};
        Mult2(Arr3);
        //System.out.println(Arrays.toString(Mult2(Arr3)));

        //Exercise 4
        int [][] Arr4 =  new int[SIZE_4exer][SIZE_4exer];
        fillArr4Ones(Arr4);
        //printArr4(Arr4);//This method created for print Arr4 to check fillArr4Ones functionality

        //Exercise 5
        int [] Arr5;
        Arr5 = InitArr(5,4);
        //System.out.println(Arrays.toString(Arr5));
    }

    private static int [] ChangeZero(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else arr[i] = 0;
        }
        //System.out.println(Arrays.toString(arr));
        return(arr);
    }

    private static int [] fillArr2(int [] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;
        }
        return (arr);
    }

    private static int []  Mult2(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        return(arr);
    }

    private static int[][] fillArr4Ones(int[][] arr) {
        for (int i = 0; i < SIZE_4exer; i++) {
            for (int j = 0; j < SIZE_4exer; j++) {
                if (i == j){
                    arr[i] [j] = 1;
                }
            }
        }
    return(arr);
    }

    private static void printArr4(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static int [] InitArr(int len, int InitValue) {
        int [] arr =  new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = InitValue;
        }
        return (arr);
    }
}
