package lesson3;

import java.util.Arrays;


public class HomeWorkApp3 {
    public static final int SIZE_4exer = 5;

    public static void main(String[] args) {
        //Exercise 1
        int[] Arr1 = new int[5];
        //int[] ResultArr1 = new int [5];
        Arr1[0] = 0;
        Arr1[1] = 0;
        Arr1[2] = 1;
        Arr1[3] = 1;
        Arr1[4] = 0;
        //System.out.println(Arrays.toString(ChangeZero(Arr1))); //Uncomment this line to see result of Exercise 1

        // Exercise 2
        int[] Arr2 = new int[100];
        fillArr2(Arr2);
        //System.out.println(Arrays.toString(fillArr2(Arr2))); //Uncomment this line to see result of Exercise 2

        // Exercise 3
        int[] Arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Mult2(Arr3);
        //System.out.println(Arrays.toString(Mult2(Arr3))); //Uncomment this line to see result of Exercise 3

        //Exercise 4
        int[][] Arr4 = new int[SIZE_4exer][SIZE_4exer];
        fillArr4Ones(Arr4);
        //printArr4(Arr4);//Uncomment this line to see result of Exercise 4

        //Exercise 5
        int[] Arr5;
        Arr5 = InitArr(5, 4);
        //System.out.println(Arrays.toString(Arr5)); //Uncomment this line to see result of Exercise 5

        //Exercise 6
        int[] Arr6 = new int[]{1, 3, 4, -7, -25, 11, 99, 12};
        //System.out.println("Maximum value is: " + findMaxVal(Arr6)); //Uncomment this line to see result of Exercise 6 (max)
        //System.out.println("Minimum value is: " + findMinVal(Arr6)); //Uncomment this line to see result of Exercise 6 (min)

        //Exercise 7
        int[] Arr7 = new int[]{10, 6, 4, 2};
        //System.out.println("There is some point, where sums are equal: " + CheckSumsInsight(Arr7)); //Uncomment this line to see result of Exercise 7

        //Exercise 8
        int[] Arr8 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int Shift = 2;
        //ShiftArray(Shift, Arr8);

    }

    private static int[] ChangeZero(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        //System.out.println(Arrays.toString(arr));
        return (arr);
    }

    private static int[] fillArr2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return (arr);
    }

    private static int[] Mult2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return (arr);
    }

    private static int[][] fillArr4Ones(int[][] arr) {
        for (int i = 0; i < SIZE_4exer; i++) {
            for (int j = 0; j < SIZE_4exer; j++) {
                if (i == j) {
                    arr[i][j] = 1; //left top -> right bottom diagonal
                    arr[i][SIZE_4exer - 1 - j] = 1; // right top -> left bottom diagonal
                }
            }
        }
        return (arr);
    }

    private static void printArr4(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static int[] InitArr(int len, int InitValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = InitValue;
        }
        return (arr);
    }

    private static int findMaxVal(int[] arr) {
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return (maximum);
    }

    private static int findMinVal(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return (minimum);
    }

    private static boolean CheckSumsInsight(int[] arr) {
        //Calculate total summ
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        //Calculate summs
        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum = leftSum + arr[i];
            rightSum = rightSum - arr[i];
            if (leftSum == rightSum) {
                return (true);
            }
            break;
        }
        return (false);
    }

    private static int[] ShiftArray(int shift, int[] arr) {
        int N = shift % arr.length;
        for (int i = 0; i < N; i++) {
                
        }
        return (arr);
    }
}
