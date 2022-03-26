package hw7;


public class Application {
    public static void main(String[] args) {
        School school = new School("Гимназия 196", new Director("Виктор Михайлович", 56));

        Teacher teacher1 = new Teacher("Irina", 27, "Geography", 25);
        Teacher teacher2 = new Teacher("Maria", 52, "Biology", 40);

        Student student1 = new Student("Oleg", 15, 7,"Geography");
        Student student2 = new Student("Yana", 13, 11,"Biology");
        Student student3 = new Student("Igor", 14, 16,"Geography");
        Student student4 = new Student("Nikita", 13, 3,"Biology");

        school.addTeacher(teacher1);
        school.addStudent(student1, student3);

        school.schoolDay();
    }
}
