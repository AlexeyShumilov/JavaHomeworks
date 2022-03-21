package hw7;

import hw7.Student;
import hw7.Teacher;
import hw7.Director;
import hw7.base.Units;

public class School {
    private String name;

    public String getName() {
        return name;
    }

    private Director director;
    private Teacher[] teachers = new Teacher[2];
    private Student[] students = new Student[4];

    public School(String name, Director director) {
        this.name = name;
        this.director = director;
    }

    public void schoolDay() {
        director.start();
        for (Teacher t : teachers) {
            for (Student s : students) {
                if ((s != null && t != null) && (t.getLesson().equals(s.getLesson()))) {
                    t.toTeach(s);
                    System.out.println("У ученика" );
                }
        }
        director.finish();;
    }

    public void addTeacher(Teacher teacher){
        for (int i = 0; i < teachers.length; i++){
            if (teachers[i] == null){
                teachers[i] = teacher;
                return;
            }
        }
        System.out.println("Учителей в школе");
    }

    public void addTeacher(Teacher...teachers){
        for(Teacher teacher:teachers){
            addTeacher(teacher);
        }
    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                return;
            }
        }
        System.out.println("Учеников в школе");
    }

    public void addStudent(Student...students){
        for (Student student:students){
            addStudent(student);
        }
    }

}


