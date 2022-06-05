package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private boolean isHungry;
    private int desireFoodCount;
    private String name;

    public Cat(String name, int desireFoodCount) {
        this.desireFoodCount = desireFoodCount;
        this.name = name;
        this.isHungry = true;
    }

    public void printInfo() {
        System.out.printf("Cat Info:{Name = %s, isHungry = %b, desireFoodCount = %d}%n",
                this.name, this.isHungry, this.desireFoodCount);
    }

    public void eat(Plate plate) {
        if (isHungry == true) {
            int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;

            if (catEatFoodCount <= plate.getFoodCount()) {// cat can't eat more than amount of food in plate
                plate.decreaseFood(catEatFoodCount);
                if (desireFoodCount == catEatFoodCount) {// is cat hungry after eating?
                    isHungry = false;
                }
                System.out.printf("Cat %s has eaten %s food%n", name, catEatFoodCount);
            }
        }
    }

    public void checkGluttony(){
        
    }
}
