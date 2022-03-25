package hw6.task3;

import hw6.task3.animals.Cat;
import hw6.task3.animals.Mouse;

public class Application1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Red", 23, 27);
        Cat cat2 = new Cat("Mars", 27, 26);

        cat1.catchMouse(new Mouse(1,35));
        cat1.catchMouse(new Mouse(2,25));
        cat1.catchMouse(new Mouse(3,21));
        cat1.catchMouse(new Mouse(4,22));
        cat1.catchMouse(new Mouse(5,16));


        cat2.catchMouse(new Mouse(6,28));
        cat2.catchMouse(new Mouse(7,24));
        cat2.catchMouse(new Mouse(8,19));
        cat2.catchMouse(new Mouse(9,18));

        System.out.println(cat1);
        System.out.println(cat2);
        cat1.catFight(cat2);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
