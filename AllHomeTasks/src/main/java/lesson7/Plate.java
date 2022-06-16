package lesson7;

public class Plate {
    private int foodCount = 0;

    public Plate (int foodCount){
        this.foodCount =  foodCount;
    }

    public void printInfo() {
        System.out.printf("Plate {foodCount = %d}%n", foodCount);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount = foodCount - catEatFoodCount;
    }

    public void addFood(int addedFood) {//add food to plate
        foodCount =  foodCount + addedFood;
    }
}

