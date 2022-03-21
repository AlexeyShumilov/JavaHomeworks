package hw7;

import hw7.School;

public class Application {
    public static void main(String[] args) {
        Director director = new Director("Alexander", 56);
        School school = new School("Гимназия 196", director);

        Teacher teacher1 = new Teacher("Irina", 27, "Geography", 25);
        Teacher teacher2 = new Teacher("Maria", 52, "Biology", 40);
        Student student1 = new Student("Oleg", 15, "Geography");
        Student student2 = new Student("Yana", 13, "Biology");
        Student student3 = new Student("Igor", 14, "Geography");
        Student student4 = new Student("Nikita", 13, "Biology");

        school.addTeacher(teacher1, teacher2);
        school.addStudent(student1, student2);


        school.schoolDay();
    }
}
