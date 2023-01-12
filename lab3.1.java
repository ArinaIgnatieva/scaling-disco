import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner Scan = new Scanner(System.in);

            System.out.print("Введите размерность массива:");
            int n = Scan.nextInt();

            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент массива:");
                arr[i] = Scan.nextDouble();
            }

            double[] arr2 = new double[n];
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                arr2[i] = sum / (i + 1);
            }

            System.out.println("Исходный массив:" + Arrays.toString(arr));
            System.out.println("Массив после обработки: " + Arrays.toString(arr2));
        }
        catch (Exception e){
            System.out.println("Ошибка: число должно быть целым");
        }




    }
}
