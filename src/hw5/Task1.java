package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scan.nextInt();
        String word;
        String[] words = new String[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите" + (i+1) + " слово: ");
            word = scan.nextLine();
            if (word.equalsIgnoreCase("exir")) break;
            words[i] = word;
            for (int f = (i - 1); f >= 0; f--){
                if (word.equalsIgnoreCase(words[f])){
                    System.out.println("Такое слово уже есть");
                    i--;
                    break;
                }
            }
        }
        System.out.println("Получившийся массив:" + Arrays.toString(words));
    }
}
