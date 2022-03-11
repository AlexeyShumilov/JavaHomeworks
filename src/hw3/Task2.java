package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        int summ = userNum / 10 + userNum % 10;
        System.out.println(summ);
    }
}
