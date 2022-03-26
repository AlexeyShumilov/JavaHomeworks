package hw7;

import hw7.base.Human;

public class Director extends Human {

    public Director(String name, int age){
        super(name, age);
    }


    public void startLessons(){System.out.println(getName() + " объявил начало уроков");
    }

    public void finishLessons(){
        System.out.println(getName() + " объявил конец уроков");
    }
}
