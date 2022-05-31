package lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Dog dog =  new Dog("Sharik",20, 300);
        //Dog dog1 =  new Dog("Bobik",40, 3000);

        //dog run check
        /*dog.run(500);
        dog.setRunLimit(1000);
        dog.run(600);*/

        //dog swim check
        dog.swim(50);
        dog.setSwimLimit(100);
        dog.swim(70);
    }
}
