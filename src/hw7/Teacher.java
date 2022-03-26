package hw7;

import hw7.base.Worker;

public class Teacher extends Worker {


    public Teacher(String name, int age, int skill, String lesson){
        super(name, age, lesson, skill);
    }

    public void teaching (Student student){
        if (getLesson().equals(student.getLesson())){
            student.learning(this);
        }
    }
}
