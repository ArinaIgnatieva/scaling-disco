import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length-1; i++){
            arr[i]=arr[i+1];
        }

        int[] arr2 = new int[n-1];
        for(int i =0, j=0; i < arr.length; i++){
            if (i!=del){
                arr2[j+1] = arr[i];
            }
        }

        System.out.print("Массив после обработки: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
