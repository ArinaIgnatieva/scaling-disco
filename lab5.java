
import java.util.Scanner;

class Fractions{
    public int numerator, denominator;

    //дробь по умолчанию
    public Fractions(){
        numerator = 1;
        denominator = 1;
    }
    //создаем дробь
     public Fractions(int a, int b) throws Exception{
        if(b!=0){
            numerator = a;
            denominator = b;
        } else {
            throw new Exception("На ноль делить нельзя");
        }
     }
     //вывод дроби
    public void fractionOutput(){
        System.out.println(numerator + "/" + denominator);
    }
    //сложение
    public void sum(int a, int b, int c, int d){
        System.out.println("Результат:" + (a*d + b*c) + "/" + b*d);
    }
    //вычитание
    public void dif(int a, int b, int c, int d){
        System.out.println("Результат:" + (a*d - b*c) + "/" + b*d);
    }
    //умножение
    public void mult(int a, int b, int c, int d){
        System.out.println("Результат:" + a*c + "/" + b*d);
    }
    //деление
    public void div(int a, int b, int c, int d){
        System.out.println("Результат:" + a*d + "/" + c*b);
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //дробь по умолчанию
        Fractions f1 = new Fractions();
        f1.fractionOutput();

        //создание дроби
        System.out.println("Введите целые значение числителя и знаменателя");
        Fractions f2 = new Fractions(in.nextInt(), in.nextInt());
        f2.fractionOutput();

        //сложение
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f3 = new Fractions(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Fractions f4 = new Fractions(in.nextInt(), in.nextInt());
        f3.sum(f3.numerator, f3.denominator, f4.numerator, f4.denominator);

        //сложение со значением по умолчанию
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f5 = new Fractions(in.nextInt(), in.nextInt());
        Fractions f6 = new Fractions();
        System.out.println("Значение по умолчанию:" + f6.numerator + "/" + f6.denominator);
        f3.sum(f5.numerator, f5.denominator, f6.numerator, f6.denominator);

        //вычитание
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f7 = new Fractions(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Fractions f8 = new Fractions(in.nextInt(), in.nextInt());
        f7.dif(f7.numerator, f7.denominator, f8.numerator, f8.denominator);

        //вычитание со значением по умолчанию
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f9 = new Fractions(in.nextInt(), in.nextInt());
        Fractions f10 = new Fractions();
        System.out.println("Значение по умолчанию:" + f10.numerator + "/" + f10.denominator);
        f7.dif(f9.numerator, f9.denominator, f10.numerator, f10.denominator);

        //умножение
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f11 = new Fractions(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Fractions f12 = new Fractions(in.nextInt(), in.nextInt());
        f11.mult(f11.numerator, f11.denominator, f12.numerator, f12.denominator);

        //умножение со значением по умолчанию
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f13 = new Fractions(in.nextInt(), in.nextInt());
        Fractions f14 = new Fractions();
        System.out.println("Значение по умолчанию:" + f10.numerator + "/" + f10.denominator);
        f11.mult(f13.numerator, f13.denominator, f14.numerator, f14.denominator);

        //деление
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f15 = new Fractions(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Fractions f16 = new Fractions(in.nextInt(), in.nextInt());
        f15.div(f15.numerator, f15.denominator, f16.numerator, f16.denominator);

        //деление со значением по умолчанию
        System.out.println("Введите целые значения числителя и знаменателя первой дроби:");
        Fractions f17 = new Fractions(in.nextInt(), in.nextInt());
        Fractions f18 = new Fractions();
        System.out.println("Значение по умолчанию:" + f10.numerator + "/" + f10.denominator);
        f15.div(f17.numerator, f17.denominator, f18.numerator, f18.denominator);
    }
}
