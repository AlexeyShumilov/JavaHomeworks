package hw4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int n = (int) (Math.random()*40);
        int[] mas = new int[n];
        int i, j;
        int count = 0;
        for (i = 0; i < n; i++){mas[i] = ((int)(Math.random() * 200) - 100); if (mas[i] < 0) count++;}
        int[] mas1 = new int[count];
        for (j = 0,i = 0; j < count; j++,i++){if (mas[i] < 0) mas1[j] = mas[i]; else j--;}
        System.out.println("Исходный массив: "+ Arrays.toString(mas)+"\nМассив отрицательных чисел: "+ Arrays.toString(mas1));
    }
    }
