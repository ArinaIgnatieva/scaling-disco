import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner Scan = new Scanner(System.in);
            
            System.out.print("Введите размерность массива:");
            int n = Scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент массива:");
                arr[i] = Scan.nextInt();
            }

            System.out.print("Введите число, которое нужно удалить:");
            int del = Scan.nextInt();


            int arr2_size = 0;

            for (int i = 0; i < arr.length; i++) {
                if (del != arr[i]) {
                    arr2_size++;
                }
            }
            int[] arr2 = new int[arr2_size];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (del != arr[i]) {
                    arr2[j++] = arr[i];
                }
            }
            
            System.out.println("Исходный массив:" + Arrays.toString(arr));
            System.out.println("Массив после обработки: " + Arrays.toString(arr2));
        }
        catch (Exception e){
            System.out.print("Ошибка, числа должны быть целыми");
        }
    }
}
