package hw6.task3;

import hw6.task3.animals.Cat;
import hw6.task3.animals.Mouse;

public class Application1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Red", 23, 27);
        Cat cat2 = new Cat("Mars", 27, 26);

        cat1.catchMouse(new Mouse(35));
        cat1.catchMouse(new Mouse(25));
        cat1.catchMouse(new Mouse(21));
        cat1.catchMouse(new Mouse(22));
        cat1.catchMouse(new Mouse(16));


        cat2.catchMouse(new Mouse(28));
        cat2.catchMouse(new Mouse(24));
        cat2.catchMouse(new Mouse(19));
        cat2.catchMouse(new Mouse(18));

        System.out.println(cat1);
        System.out.println(cat2);
        cat1.catFight(cat2);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
