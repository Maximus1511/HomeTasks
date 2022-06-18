package Java1.lesson4.lesson6;

public class Cat extends Animal{
    private static int catCounter;
    //Constructors
    public Cat(){}

    public Cat(String name, int swimLimit, int runLimit) {
        this.name = name;
        this.swimLimit =  swimLimit;
        this.runLimit =  runLimit;
        //dogCounter =  dogCounter + 1;
        System.out.println("Cat " + this.name + " was created. Cat number is: " + incrAnimalCounter());
    }
    //Overriden methods
    @Override
    protected void run(int distance) {
        if (distance > runLimit){
            System.out.printf("%s can't run %d meters.%n", name, distance);
            getRunLimit();
        }
        else {
            System.out.printf("%s has already run %d meters%n", name, distance);
        }
    }

    @Override
    protected void swim(int distance) {
        System.out.printf("%s: I can't swim and i hate it!%n", this.name);
    }

    @Override
    protected void getRunLimit() {
        System.out.printf("%s: My run limit is %s meters%n",this.name, this.runLimit);
    }

    @Override
    protected void setRunLimit(int runLimit) {
        System.out.printf("%s's run limit changed to %d meters%n", name, runLimit);
        this.runLimit =  runLimit;
    }

    @Override
    protected void getSwimLimit() {
        System.out.printf("%s: i can't swim...Your swim actions are inconsiderable", this.name);
    }

    @Override
    protected void setSwimLimit(int swimLimit) {
        System.out.printf("%s: i can't swim...Your swim actions inconsiderable%n", this.name);
    }

    @Override
    protected int incrAnimalCounter() {
        super.incrAnimalCounter();
        catCounter =  catCounter + 1;
        return (catCounter);
    }
}
