package hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 30);
        int[] mas = new int[n];
        int i, j, k;
        int count1 =0, count2 =0;
        for (i=0;i<n;i++){mas[i]=((int)(Math.random()*200)-100); if (mas[i]%2==0)count1++;else count2++;}
        int[] mas1 = new int[count1];
        for (j=0,i=0; j < count1; j++,i++){if (mas[i]%2==0) mas1[j]=mas[i]; else j--;}
        Arrays.sort(mas1);
        int[] mas2 = new int[count2];
        for (k=0, i=0; k < count2; k++, i++){if (mas[i]%2!=0) mas2[k]=mas[i]; else k--;}
        Arrays.sort(mas2);
        System.out.println("Исходный массив: "+ Arrays.toString(mas)+"\nМассив четных чисел: "+Arrays.toString(mas1)+"\nМассив нечетных чисел: "+Arrays.toString(mas2));
    }
    }
