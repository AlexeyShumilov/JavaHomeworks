package hw7;

import hw7.base.Lesson;
import hw7.base.Units;

public class Student extends Lesson {
    private int knowleges;
    public Student( String name, int age, String lesson){
        super(name, age, lesson);
    }

    public void toLearn (int level){
        knowleges += (int) (Math.random() * level);
        System.out.println("Уровень знаний ученика состовляет" + knowleges);
    }

    public int getKnowleges() {
        return knowleges;
    }

}
