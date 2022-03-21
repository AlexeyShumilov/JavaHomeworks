package hw7.base;

abstract public class Lesson extends Units{
    protected String lesson;

    public Lesson(String name,int age, String lesson){
        super(name, age);
        if (lesson == null){
            throw new IllegalArgumentException("Название урока не может быть пустым");
        }
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }
}
