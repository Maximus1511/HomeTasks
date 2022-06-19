package Java2.lesson1;

public class HomeTask2_1 {
    public static void main(String[] args) {
        Participant robot = new Robot("R2D2",2, 100);
        Participant cat =  new Cat("Barsik", 7, 50);

        Obstacle wall = new Wall(5, "The Great Chinese Wall");
        Obstacle road  =  new Road("Road to the Dream", 70);

        Obstacle [] obstacles =  new Obstacle[] {wall, road};

        ParticipantToObstacles(robot, obstacles);
        System.out.println("---Another Participant---");
        ParticipantToObstacles(cat, obstacles);
    }

    private static void ParticipantToObstacles(Participant participant, Obstacle[] obstacles) {
        for (int i = 0; i < obstacles.length; i++) {
            if(obstacles[i] instanceof Road){
                participant.Run(obstacles[i]);
            } else if(obstacles[i] instanceof Wall){
                participant.Jump(obstacles[i]);
            }
        }
    }
}
