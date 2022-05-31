package lesson5;

import java.util.ConcurrentModificationException;

public class Coworker {
    String FullName;
    String Function;
    String Email;
    String PhoneNumber;
    int salary = 0;
    int age;

    Coworker(){
    }

    Coworker(String FullName, int age){
        this.FullName = FullName;
        this.age = age;
    }
    Coworker(String FullName, String Function, String Email, String PhoneNumber, int salary, int age){
        this.FullName =  FullName;
        this.Function = Function;
        this.Email =  Email;
        this.PhoneNumber =  PhoneNumber;
        this.salary =  salary;
        this.age =  age;
    }

     public void getCoworkerInfo() { //style based on method created by Intellij after pressed alt+Insert
        System.out.println("Coworker{" +
                "FullName='" + FullName + '\'' +
                ", Function='" + Function + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}');
    }
}
