package hw6.task2.animals;

public class Mouse {
    private double mouseSpeed;

    public void setMouseSpeed(double mouseSpeed) {
        if (mouseSpeed <= 0) {
            throw new IllegalArgumentException("скорость мыши дожна быть больше 0");
        }
        this.mouseSpeed = mouseSpeed;
    }

    public double getMouseSpeed() {
        return mouseSpeed;
    }
}
