package lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Coworker co = new Coworker("Petrov Petr Petrovich",
                "Software developer",
                "Petrov@mail.ru",
                "89997776655",
                50,
                55);
        //co.getCoworkerInfo();
        //I also created "short" constructor with 2 input data
        Coworker coworker1 = new Coworker("Putin", 70);
        Coworker coworker2 = new Coworker("Obama", 20);
        Coworker coworker3 = new Coworker("Merkel", 34);
        Coworker coworker4 = new Coworker("Tramp", 49);
        Coworker coworker5 = new Coworker("Elizabeth", 90);
        Coworker [] coworkers = {coworker1, coworker2,coworker3, coworker4, coworker5};
        for (int i = 0; i < coworkers.length; i++) {
            if (coworkers[i].age >= 40){
                coworkers[i].getCoworkerInfo();
            }
        }
    }
}
