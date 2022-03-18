package hw6.task2.animals;

public class Cat {
    private double catSpeed;

    public double getCatSpeed() {
        return catSpeed;
    }

    public void setCatSpeed(double catSpeed) {
        if (catSpeed <= 0) {
            throw new IllegalArgumentException("скорость кота дожна быть больше 0");
        }
        this.catSpeed = catSpeed;
    }

    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        if (catName == null) {
            throw new IllegalArgumentException("введите имя кота");
        }
        this.catName = catName;
    }

    private double catWeight;

    public double getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(double catWeight) {
        if (catWeight <= 0) {
            throw new IllegalArgumentException("кот должен весить больше 0");
        }
        this.catWeight = catWeight;
    }

    private int mouseScore;

    public int getMouseScore() {
        return mouseScore;
    }

    public void setMouseScore(int mouseScore) {
        if (mouseScore < 0 || mouseScore > 100) {
            throw new IllegalArgumentException("кол-во пойманных мышей не может быть отрицательным или больше 100");
        }
        this.mouseScore = mouseScore;
    }
}
