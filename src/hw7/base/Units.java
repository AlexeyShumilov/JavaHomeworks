package hw7.base;

abstract public class Units {
    protected String name;
    protected int age;

    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("Имя не должно быть null");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age == 0){
            throw new IllegalArgumentException("Возраст не может быть равен 0");
        }
        this.age = age;
    }


    public Units(String name, int age) {
        setName(name);
        this.name = name;
        setAge(age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
