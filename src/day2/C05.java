package day2;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


    /* Kullanicidan vize ve final notlarini aliniz.
    Kullanicinin istedigi oranlarda vize ve final yüzdeleri not ile not ortalamasini hesaplayiniz.
    Not ortalamasini yazdirin 50 ve büyük ise "Tebrikler dersi basari ile gectiniz..."
    Kücük ise "Malesef dersten kaldiniz..." yazdiriniz
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("vize1 notunuzu giriniz");
        int v1 = scanner.nextInt();

        System.out.println("vize2 notunuzu giriniz");
        int v2 = scanner.nextInt();

        System.out.println("final notunuzu giriniz");
        int f = scanner.nextInt();

        System.out.println("vize hesaplama oranini giriniz");
        double vOrani = scanner.nextInt();

        System.out.println("final hesaplama oranini giriniz");
        double fOrani = scanner.nextInt();

        double ortalama = ((v1 + v2) / 2 * vOrani / 100) + (f * fOrani / 100);

        if (ortalama >= 50) {
            System.out.println("Tebrikler dersi basari ile gectiniz : "+ortalama);

        } else {
            System.out.println("Malesef dersten kaldiniz");


        }


    }
}