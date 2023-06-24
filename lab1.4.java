
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int N;
        float r, x, y;
        int n = 0;

        System.out.print("Введите количество точек:");
        N = Scan.nextInt();
        System.out.print("Введите радиус окружности:");
        r = Scan.nextFloat();

        for (int i = 1; i <= N; i++){
            System.out.print("Введите координату Х точки:");
            x = Scan.nextFloat();
            System.out.print("Введите координату Y точки:");
            y = Scan.nextFloat();
            if (x * x + y * y <= r * r)
                System.out.println("Количество точек, попавших в окружность:" + (n = n + 1));
            else
                System.out.println("Количество точек, попавших в окружность, не изменилось:" + n);
            }
    }
}
