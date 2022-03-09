package hw2;

public class Task3 {
    public static void main(String[] args) {
        int random = (int) (10 + Math.random() * 491);
        if (random > 25 && random < 200){
            System.out.println( "Число " + random + " содержится в интервале (25;200)");
        } else System.out.println( "Число " + random + " не содержится в интервале (25;200)");
    }
}
