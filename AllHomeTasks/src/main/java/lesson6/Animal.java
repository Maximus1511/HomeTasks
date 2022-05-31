package lesson6;

public abstract class Animal {
    protected int distance;
    protected int runLimit;
    protected int swimLimit;
    protected String name;

    private static int animalCounter;
    protected abstract void run (int distance);
    protected abstract void swim (int distance);

    protected void getRunLimit() {
        //return runLimit;
    }

    protected void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public void getSwimLimit() {
        //return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    protected int incrAnimalCounter(){
        animalCounter =  animalCounter + 1;
        System.out.printf("Animal number is %d%n", animalCounter);
        return (animalCounter);
    }

}

