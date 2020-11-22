package study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FromTen From = new FromTen();

        System.out.println ("Write random number: ");
        Scanner mult = new Scanner(System.in );
        From.randomNumber = mult.nextDouble();

        System.out.println("Перевод числа 456 в 2ую систему: " + Integer.toBinaryString((int) From.randomNumber));

        System.out.println("12ую систему: " + Integer.toString((int) From.randomNumber, 12) + ", 12 - мой порядковый номер");

        System.out.println("16ую система: " + Integer.toHexString((int) From.randomNumber));
        System.out.println("Ты красавчик!!");


    }
}
