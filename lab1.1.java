
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int day, month, year;

        System.out.print("Введите день рождения:");
        day = Scan.nextInt();
        System.out.print("Введите месяц рождения:");
        month = Scan.nextInt();
        System.out.print("Введите год рождения:");
        year = Scan.nextInt();

        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && (day>31||day<1)){
            System.out.print("Ошибка");
            return;}
        else if ((month==4||month==6||month==9||month==11) && (day>30||day<1)){
            System.out.print("Ошибка");
            return;}
        else if (month==2 && year%4!=0 && (day>28||day<1)){
            System.out.print("Ошибка");
            return;}
        else if (month==2 && year%4==0 && (day>29||day<1)){
            System.out.print("Ошибка");
            return;}
        else
            if (month == 11 && day == 25){
                year = 2022 - year;
                month = 0;
                day = 0;}
            else if (month == 11 && day < 25){
                year = 2022 - year;
                month = 0;
                day = 25 - day;}
            else if (month == 11 && day > 25){
                year = 2021 - year;
                month = 11;
                day = 31 - day + 25;}
            else if (month == 12 && day > 25){
                year = 2021 - year;
                month = 10;
                day = 31 - day + 25;}
            else if (month == 12 && day <= 25){
                year = 2021 - year;
                month = 11;
                day = 25 - day;}
            else if (month < 11 && month >= 1 && day > 25){
                year = 2022 - year;
                month = 10 - month;
                day = 31 - day + 25;}
            else if (month < 11 && month >= 1 && day <= 25){
                year = 2022 - year;
                month = 11 - month;
                day = 25 - day;}
            else
                System.out.print("Ошибка");


        System.out.println("Лет:" + year);
        System.out.println("Месяцев:" + month);
        System.out.println("Дней:" + day);
    }
