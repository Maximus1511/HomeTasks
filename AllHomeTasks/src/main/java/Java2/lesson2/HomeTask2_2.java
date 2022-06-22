package Java2.lesson2;

public class HomeTask2_2 {
    private static final int ARRAY_SIZE = 3;

    public static void main(String[] args) throws InterruptedException {
        String[][] arr = new String[][] {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", "9"}};

        //String[][] arr = new String[][] {{"1", "2", "3"},{"4", "5", "6"},{"7", "i8", "9"}}; // for debug
       //String[][] arr = new String[][] {{"1", "2", "3"},{"4", "5", "6"}};//for debug

        System.out.println("Array sum is " + calculateSum(arr));
    }

    private static int calculateSum(String[][] arr) {
        //check size first of all
        try {
            checkArraySize(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        //try to calculate summa
        int sum = 0;
        try {
            sum = calculate(arr);
        } catch (MyArrayDataException e) {
            sum = -1;
            e.printStackTrace();
        }
        return (sum);
    }

    private static int calculate(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        String str;
        int value = 0;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {

                str = arr[i][j];
                try {
                    value = Integer.parseInt(str);
                    sum =  sum + value;
                } catch (NumberFormatException e){
                    /*parseInt method throws NumberFormatException, it means I try to catch it
                    and replace it with my own exception*/
                throw new MyArrayDataException("invalid cell: {" + i +";" + j + "}");
                }
            }
        }
        return (sum);
    }

    private static boolean checkArraySize(String[][] arr) throws MyArrayDataException {
        boolean arrValid =  false;
        if (arr.length == ARRAY_SIZE){
            for (int i = 0; i < ARRAY_SIZE; i++) {
                //check inner arrays
                if (arr[i].length != ARRAY_SIZE){
                    arrValid =  false;
                    throw new MyArrayDataException("inner size array " + i + " is invalid: " + arr[i].length );
                }else {
                    arrValid =  true;
                }
            }

        } else {
            arrValid = false;
            throw new MyArrayDataException("general size invalid: " + arr.length);
        }
        String arrValidStr;
        if (arrValid){
            arrValidStr =  "valid";
        }else {
            arrValidStr = "invalid";
        }
        System.out.println("Array size is " + arrValidStr);
        return (arrValid);
    }
}




