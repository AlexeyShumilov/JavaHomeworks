package hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[20 / 2];
        for (int i = 0; i < mas.length; i++){
            if (i==0) mas[i] = 2;
            else mas[i] = (2 + mas[i - 1]);
        }
        System.out.println("Орининальный массив: " + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) mas[i]*=-1;
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) mas[i]*=-1;
        System.out.println("Отсортированный массив: " + Arrays.toString(mas));
    }
}
