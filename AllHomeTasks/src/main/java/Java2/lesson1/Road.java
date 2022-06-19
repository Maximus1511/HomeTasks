package Java2.lesson1;

public class Road implements Obstacle{
    private String roadName;
    private int roadDistance;

    Road (String roadName, int roadDistance){
        setDifficult(roadDistance);
        setName(roadName);
    }

    @Override
    public void setDifficult(int a) {
        roadDistance =  a;
    }

    @Override
    public int getDifficult() {
        return roadDistance;
    }

    @Override
    public void setName(String string) {
        roadName = string;
    }

    @Override
    public String getName() {
        return roadName;
    }
}
