package hw6.task3.animals;

import java.util.Arrays;

public class Cat {
    private double catSpeed;
    private String catName;
    private double catWeight;
    private Mouse[] catchMouse = new Mouse[100];

    public Cat(String catName, double catSpeed, double catWeight) {
        setCatName(catName);
        setCatSpeed(catSpeed);
        setCatWeight(catWeight);
    }

    public double getCatSpeed() {
        return catSpeed;
    }

    public void setCatSpeed(double catSpeed) {
        if (catSpeed < 0) {
            throw new IllegalArgumentException("скорость кота дожна быть больше 0");
        }
        this.catSpeed = catSpeed;
    }


    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        if (catName == null) {
            throw new IllegalArgumentException("введите имя кота");
        }
        this.catName = catName;
    }


    public double getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(double catWeight) {
        if (catWeight < 0) {
            throw new IllegalArgumentException("кот должен весить больше 0");
        }
        this.catWeight = catWeight;
    }


    public void catchMouse(Mouse mouse) {
        if (mouse == null) {
            throw new IllegalArgumentException("значение мышей не может быть null");
        }
        if (this.getCatSpeed() > mouse.getMouseSpeed()) {
            System.out.println("Кот " + getCatName() + " поймал " + mouse);
            for (int i = 0; i < catchMouse.length; i++) {
                if (catchMouse[i] == null) {
                    catchMouse[i] = mouse;
                    return;
                }
            }
        } else System.out.println(mouse + " убежала от кота");
    }

    public void getMouse(Cat cat) {
        for (int i = 0; i < this.catchMouse.length; i++) {
            if (catchMouse[i] == null) {
                for (int j = 0; j < this.catchMouse.length; j++) {
                    if (cat.catchMouse[j] != null) {
                        if (getCatSpeed() > cat.catchMouse[j].getMouseSpeed()) {
                            catchMouse[i] = cat.catchMouse[j];
                            if (cat.catchMouse[j] != null)
                                cat.catchMouse[j] = null;
                        } else {
                            System.out.println("Мышь " + cat.catchMouse[j] + " убежала");
                            if (cat.catchMouse[j] != null)
                                cat.catchMouse[j] = null;
                            continue;
                        }
                    }
                }
            }
        }
    }

    public void catFight(Cat cat) {
        if (cat == null) throw new IllegalArgumentException("Cat Null");
        if (this.getCatWeight() > cat.getCatWeight()) {
            System.out.println("Кот " + this.getCatName() + " победил");
            this.getMouse(cat);
        } else {
            System.out.println("Кот " + cat.getCatName() + " победил");
            cat.getMouse(this);
        }
    }

    @Override
    public String toString() {
        return "Кот(" + "имя = " + catName + ", скорость = " + catSpeed + ", вес = " + catWeight + ", пойманные мыши: " + Arrays.toString(catchMouse) + ")";
    }
}
