package hw7;

import hw7.base.Lesson;

public class Teacher extends Lesson {
    private int level;

    public Teacher(String name, int age, String lesson, int level){
        super(lesson, age, name);
        this.level = level;
    }

    public void toTeach (Student student){
        student.toLearn(level);
        System.out.println("Учитель обучил" + getLesson());
    }
}
