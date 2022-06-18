package Java1.lesson1;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        printThreeWords();
        CheckSumSign();
        PrintColor();
        CompareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void CheckSumSign() {
        int a = 5;
        int b = 7;
        int result = a + b;
        if (result >= 0){
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    private static void PrintColor() {
        int value = 55;
        if (value <= 0){
            System.out.println("Red");
        } else if (value > 0 && value <= 100)
        {
            System.out.println("Yellow");
        }
        else if (value > 100)
        {
            System.out.println("Green");
        }
    }

    private static void CompareNumbers() {
        int a = 4;
        int b = 30;
        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }
}

