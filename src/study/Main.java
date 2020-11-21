package study;

public class Main {

    public static void main(String[] args) {
        FromTen From = new FromTen();

        System.out.println("Перевод чисоа 456 в 2ую систему: " + Integer.toBinaryString((int) From.randomNumber));

        System.out.println("12ую систему: " + Integer.toString((int) From.randomNumber, 12) + " 12 - мой порядковый номер");

        System.out.println("16ую систеуа: " + Integer.toHexString((int) From.randomNumber));


    }
}
