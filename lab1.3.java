
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int x, n;
        float y = 1;

        System.out.print("Введите число:");
        x = Scan.nextInt();
        System.out.print("Введите показатель степени:");
        n = Scan.nextInt();

        if (n>0 && n<15){
            for (int i = 1; i <= n; i++)
                y = y * x;
                System.out.print("Ответ:" + y);}
        else if (n<0 && n>-15) {
            for (int j = -1; j >= n; j--)
                y = y/x;
                System.out.print("Ответ:" + y);}
        else if (n == 0) {
            System.out.print("Ответ:" + y);}
        else
            System.out.print("Введите показатель степени меньше 15 или больше -15");


    }
}
