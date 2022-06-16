package lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) throws InterruptedException {
        Plate plate =  new Plate (20);
        Cat cat1 =  new Cat("Barsik", 8);
        Cat cat2 =  new Cat("Murka", 20);
        Cat cat3 =  new Cat("Shgucka", 3);

        Cat [] cats =  new Cat[]{cat1, cat2, cat3};
        //System.out.println("Start food count = " + plate.getFoodCount()); //for debugging

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            //plate.printInfo(); //for debugging
            //cats[i].printInfo(); //for debugging
            //Thread.sleep(200);
            System.out.printf("Cat %s is hungry? Answer: %b%n", cats[i].getName(), cats[i].getIsHungry());
            //System.out.println(); //for debugging
        }

    }
}
