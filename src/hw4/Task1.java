package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scan.nextInt();
        int[] mas = new int[n];
        int max = mas[0], min = 100, sum = 0;
        for (int i=0;i<n;i++){
            mas[i]=((int)(Math.random() * 100));
            if (mas[i]>max)max=mas[i];
            if (mas[i]<min)min=mas[i];
            sum+=mas[i];
        }
        double av =(double)sum/n;
        System.out.print("Случайный массив: "+ Arrays.toString(mas)+"\nМаксимальное значение: "+max+"\nМинимальное значение: "+min+"\nСреднее значение: "+av);
    }
}
