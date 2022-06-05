package lesson7;

public class Cat {

    private boolean isHungry;
    private int desireFoodCount;
    private String name;
    int catEatFoodCount = 0;

    public Cat(String name, int desireFoodCount) {
        this.desireFoodCount = desireFoodCount;
        this.name = name;
        this.isHungry = true;
    }

    public void printInfo() {
        System.out.printf("Cat Info {Name = %s, isHungry = %b, desireFoodCount = %d}%n",
                this.name, this.isHungry, this.desireFoodCount);
    }

    public void eat(Plate plate) {
        if (isHungry == true) {
            generateCatEatFoodCount();
            if (catEatFoodCount <= plate.getFoodCount()) {// eat amount of food lower than total food in plate
                plate.decreaseFood(catEatFoodCount);
                isStillHungry();
                //System.out.printf("Cat %s has eaten %d food%n", name, catEatFoodCount); //for debugging
            }
            else{//eat all rest food from plate
                //System.out.printf("Cat %s has eaten %d food. ", name, plate.getFoodCount()); //for debugging
                plate.decreaseFood(plate.getFoodCount());
                //System.out.printf("Plate is empty...%n");//for debugging
            }
        }
    }

    private void checkCatEatFoodCount() {// cat can't eat more than it wants
        if (catEatFoodCount > desireFoodCount){
            catEatFoodCount =  desireFoodCount;
        }
    }

    private void generateCatEatFoodCount() {
        catEatFoodCount = (int) (Math.random()* 8 + 2); //generate number from 2 to 10
        checkCatEatFoodCount();
        //System.out.println("catFoodCount = " + catEatFoodCount); //debugging output
    }

    private void isStillHungry() {
        if (desireFoodCount == catEatFoodCount) {// is cat hungry after eating?
            isHungry = false;
        }
    }
    public boolean getIsHungry() {
        return isHungry;
    }
    public String getName(){
        return (name);
    }

}
