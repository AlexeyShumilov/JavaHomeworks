package hw7;

import hw7.base.Units;

public class Director extends Units {

    public Director(String name, int age){
        super(name, age);
        this.name = name;
    }


    public void start(){
        System.out.println("Занятия начались");
    }

    public void finish(){
        System.out.println("Занятия закончились");
    }
}
