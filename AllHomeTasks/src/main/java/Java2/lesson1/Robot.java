package Java2.lesson1;

public class Robot implements Participant{

    private String name = null;
    private int height = 0;
    private int distance = 0;

    public Robot(String name, int height, int distance) {
        this.name = name;
        this.height = height;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Jump(Obstacle obstacle) {
        if (height >= obstacle.getDifficult()){
            System.out.println("Robot " + getName() + " passed the wall '" + obstacle.getName() + "'");
        }else {
            System.out.println("Robot " + getName() + " sucks behind the wall '" + obstacle.getName() + "'");
        }
    }

    @Override
    public void Run(Obstacle obstacle) {
        if (distance >= obstacle.getDifficult()){
            System.out.println("Robot " + getName() + " passed the road '" + obstacle.getName() + "'");
        }else {
            System.out.println("Robot " + getName() + " sucks on the road '" + obstacle.getName() + "'");
        }
    }
}

