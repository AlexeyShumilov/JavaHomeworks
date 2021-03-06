package hw6.task3.animals;

public class Mouse {
    private double mouseSpeed;
    private int mouseNumber;

    public Mouse(int mouseNumber, double mouseSpeed) {
        setMouseNumber(mouseNumber);
        setMouseSpeed(mouseSpeed);
    }

    public int getMouseNumber() {
        return mouseNumber;
    }

    public void setMouseNumber(int mouseNumber) {
        if (mouseNumber <= 0) {
            throw new IllegalArgumentException("скорость мыши дожна быть больше 0");
        }
        this.mouseNumber = mouseNumber;
    }

    public void setMouseSpeed(double mouseSpeed) {
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
        return "Мышь " + mouseNumber + " (" + "скорость = " + mouseSpeed + ")";
    }
}
