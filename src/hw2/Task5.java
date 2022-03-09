package hw2;

public class Task5 {
    public static void main(String[] args) {
        int month = 1;
        if ( month > 12 || month < 1) System.out.println("Ошибка");
        else if ( month > 11) System.out.println("Зима");
        else if ( month > 8) System.out.println("Осень");
        else if ( month > 5) System.out.println("Лето");
        else if ( month > 2) System.out.println("Весна");
        else System.out.println("Зима");
    }
}
