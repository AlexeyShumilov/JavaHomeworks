package hw6.task3.animals;

public class Mouse {
    private int mouseSpeed;

    public Mouse(int mouseSpeed) {
       setMouseSpeed(mouseSpeed);
    }

    public void setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed <= 0) {
            throw new IllegalArgumentException("скорость мыши дожна быть больше 0");
        }
        this.mouseSpeed = mouseSpeed;
    }

    public double getMouseSpeed() {
        return mouseSpeed;
    }

    @Override
    public String toString() {
        return "Мышь(" + "скорость = " + mouseSpeed + ")";
    }
}
