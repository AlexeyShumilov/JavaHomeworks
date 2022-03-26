package hw7;

import hw7.base.Worker;

public class Student extends Worker {
    public Student(String name, int age, int skill, String lesson){
        super(name, age, lesson, skill);
    }

    public void learning(Teacher teacher){
        setSkill(Math.min((int)(Math.random() * teacher.getSkill() + getSkill()), teacher.getSkill()));
    }
}
