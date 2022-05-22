package lesson3;

import java.util.Arrays;


public class HomeWorkApp3 {
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
        System.out.println(Arrays.toString(ResultArr1));

        // Exercise 2
        int [] Arr2 = new int [100];
        fillArr2(Arr2);
        System.out.println(Arrays.toString(fillArr2(Arr2)));
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
}
