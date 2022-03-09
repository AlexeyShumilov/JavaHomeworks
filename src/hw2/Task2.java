package hw2;

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 20, secondNumber = 10, operator = 9;
        switch (operator) {
            case 3:
                System.out.println( firstNumber + secondNumber);
                break;
            case 5:
                System.out.println( firstNumber - secondNumber);
                break;
            case 7:
                System.out.println( firstNumber * secondNumber);
                break;
            case 9:
                System.out.println( firstNumber / secondNumber);
                break;
        }
    }
}
