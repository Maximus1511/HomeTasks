package Java2.lesson1;

public class Wall implements Obstacle{
    private int wallHeight = 0;
    private String wallName = null;

    public Wall(int wallHeight, String wallName) {
        setDifficult(wallHeight);
        setName(wallName);
    }

    @Override
    public int getDifficult() {
        return wallHeight;
    }

    @Override
    public void setDifficult(int a) {
        wallHeight = a;
    }

    @Override
    public void setName(String string) {
        wallName = string;
    }

    @Override
    public String getName() {
        return wallName;
    }
}
