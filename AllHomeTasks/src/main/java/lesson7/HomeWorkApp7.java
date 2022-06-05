package lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat =  new Cat("Barsik", 3);
        Plate plate =  new Plate (20);

        for (int i = 0; i < 3; i++) {
            cat.eat(plate);
            plate.printInfo();
            cat.printInfo();
            Thread.sleep(2000);
        }
        //plate.addFood(6);
    }
}
