package day1;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        /* Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini giriniz
        Exp==> Input: 12345
              Output: 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("5 basamakli bir sayi giriniz : ");
        int sayi=scan.nextInt();

        int ilkIkiSayi=sayi/1000; //12
        int sonIkiSayi=sayi%100; //45

        int ilkIkiSayiTop=ilkIkiSayi/10+ilkIkiSayi%10; //3
        int sonIkiSayiTop=sonIkiSayi/10+sonIkiSayi%10; //9

        System.out.println("Girdiginiz 5 basamakli sayinin ilk 2 ve son 2 basamagi toplami: "+(ilkIkiSayiTop+sonIkiSayiTop));


    }

}
