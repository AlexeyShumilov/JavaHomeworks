package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int random = (int) (1 + Math.random() * 9);
        System.out.println("Введите целое число от 1 до 9 или 0 для выхода из программы");
        Scanner in = new Scanner(System.in);
        int userNum = in.nextInt();
        do {
            if (userNum == 0){
                System.out.println("Вы вышли из программы");
            break;
            } if (userNum > random);{
                System.out.println("Загаданное число меньше, попробуйте другое: ");
                userNum = in.nextInt();
            } if (userNum < random);{
                System.out.println("Загаданное число больше, попробуйте другое: ");
                userNum = in.nextInt();
            } if (userNum == random){
            System.out.println("Вы угадали, это число" + random);
            break;}
        } while (true);
    }
}
