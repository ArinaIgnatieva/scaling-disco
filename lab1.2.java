
import java.util.Scanner;

public class Main {
    public static int main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int day, month;

        System.out.print("Введите месяц:");
        month = Scan.nextInt();
        System.out.print("Введите день:");
        day = Scan.nextInt();

        if (day <= 28 && day >= 1 && month==2) {
            System.out.print("Зима");
            }
        else if (day == 29 && month==2){
            System.out.print("Зима, если год високосный");}
        else if (day <= 31 && day >= 1 && month==1){
            System.out.print("Зима");}
        else if (day <= 31 && day >= 1 && month==3){
            System.out.print("Весна");}
        else if (day <= 31 && day >= 1 && month==5){
            System.out.print("Весна");}
        else if (day <= 31 && day >= 1 && month==7){
            System.out.print("Лето");}
        else if (day <= 31 && day >= 1 && month==8){
            System.out.print("Лето");}
        else if (day <= 31 && day >= 1 && month==10){
            System.out.print("Осень");}
        else if (day <= 31 && day >= 1 && month==12){
            System.out.print("Зима");}
        else if (day <= 30 && day >= 1 && month==4){
            System.out.print("Весна");}
        else if (day <= 30 && day >= 1 && month==6){
            System.out.print("Лето");}
        else if (day <= 30 && day >= 1 && month==9){
            System.out.print("Осень");}
        else if (day <= 30 && day >= 1 && month==11){
            System.out.print("Осень");}
        else {
            System.out.print("Ошибка");


        }


    }
}
