package Java2.lesson1;

public class Cat implements Participant{

    private String name = null;
    private int height = 0;
    private int distance = 0;

    public String getName() {
        return name;
    }

    public Cat(String name, int height, int distance) {
        this.name = name;
        this.height = height;
        this.distance = distance;
    }
    @Override
    public void Jump(Obstacle obstacle) {
        if (height >= obstacle.getDifficult()){
            System.out.println("Cat " + getName() + " passed the wall '" + obstacle.getName() + "'");
        }else {
            System.out.println("Cat " + getName() + " sucks behind the wall '" + obstacle.getName() + "'");
        }
    }

    @Override
    public void Run(Obstacle obstacle) {
        if (distance >= obstacle.getDifficult()){
            System.out.println("Cat " + getName() + " passed the road '" + obstacle.getName() + "'");
        }else {
            System.out.println("Cat " + getName() + " sucks on the road '" + obstacle.getName() + "'");
        }
    }
}
