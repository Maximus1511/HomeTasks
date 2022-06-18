package Java1.lesson4.lesson6;

public abstract class Animal {
    protected int distance;
    protected int runLimit;
    protected int swimLimit;
    protected String name;

    private static int animalCounter;
    protected abstract void run (int distance);
    protected abstract void swim (int distance);

    protected abstract void getRunLimit();
    protected abstract void setRunLimit(int runLimit);
    protected abstract void getSwimLimit();
    protected abstract void setSwimLimit(int swimLimit);

    protected int incrAnimalCounter(){
        animalCounter =  animalCounter + 1;
        System.out.printf("Animal number is %d%n", animalCounter);
        return (animalCounter);
    }

}

