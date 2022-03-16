package hw5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String comb = scan.nextLine();
        String[] combArr = comb.split(" ");
        int[] length = new int[combArr.length];
        char[] firstWord = combArr[0].toCharArray();
        int firstWordL = firstWord.length;
        String maxWord = null;
        for (int i = 1; i < combArr.length; i++){
            char[] letters = combArr[i].toCharArray();
            length[i] = letters.length;
            if (length[i] > firstWordL){
                maxWord = combArr[i];
                firstWordL = length[i];

            }
        }
        System.out.println("Самое длинное слово: " + maxWord);
    }
}
