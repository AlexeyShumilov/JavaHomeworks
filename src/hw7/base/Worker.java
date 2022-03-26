package hw7.base;

abstract public class Worker extends Human {
    protected String lesson;
    private int skill;


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        if (lesson == null || lesson.length() < 2){
            throw new IllegalArgumentException("Название урока должно иметь больше 2 символов");
        }
        this.lesson = lesson;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        if (skill <= 0){
            throw new IllegalArgumentException("Уровень знаний должен быть выше 0");
        }
        this.skill = skill;
    }

    public Worker(String name, int age, String lesson, int skill){
        super(name, age);
        setLesson(lesson);
        setSkill(skill);
    }
}
