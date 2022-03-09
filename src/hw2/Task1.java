package hw2;

public class Task1 {
    public static void main(String[] args) {
        int count = 68;
        if ( count > 89 && count < 101 ){
            System.out.println("Отлично");
        } else if ( count > 59 ) {
            System.out.println("Хорошо");
        } else if ( count > 39 ) {
            System.out.println("Удовлетворительно");
        } else if ( count > 0 ) {
            System.out.println("Попробуйте в следующий раз");
        }
    }

}
