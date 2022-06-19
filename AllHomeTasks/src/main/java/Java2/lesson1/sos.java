package Java2.lesson1;

public class sos {
    public static void main(String[] args) {
        Animal dog =  new Dog("bobik");
        Bird bird  =  new Bird();
        System.out.println(dog instanceof Animal);
        //System.out.println(bird instanceof Animal);
        int [] arr =  new int[] {1,2,3};
    }
}

class Animal {
    private String name;
}

class Dog extends Animal {
    private String name;
    Dog(String name){
        this.name =  name;
    }
}
class Bird {

}