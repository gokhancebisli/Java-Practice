package day2;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen bir sayinin mutlak degerini yazdirmak icin bir program yaziniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayinizi giriniz");
        int sayi = scanner.nextInt();

        if(sayi<0) {
            sayi *= (-1);//sayi=sayi*(-1) sayi -1 ile carp ==> artik - olan sayi + oldu.
        }

        System.out.println("sayinizin mutlak degeri: "+sayi);
        }
    }

