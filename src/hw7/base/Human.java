package hw7.base;

abstract public class Human {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 2) {
            throw new IllegalArgumentException("Имя не должно быть меньше 2 символов");
        }
            this.name = name;
    }

    public void setAge(int age) {
        if (age <= 6) {
            throw new IllegalArgumentException("Возраст не может быть меньше 6");
        }
        this.age = age;
    }


    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

}

