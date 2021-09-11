package day1;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {


    /* Task: Kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlarini
    birler, onlar ve yüzler basamagi olarak yazdirin

    Exp: Input : 853
        Output : Girdiginiz sayinin birler basamagi : 3
                 Girdiginiz sayinin onlar basamagi  : 5
                 Girdiginiz sayinin yüzler basamagi : 8
     */

    Scanner scan =new Scanner (System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz :");

        int sayi=scan.nextInt();
        int birler=sayi%10;
        int onlar=sayi/10%10;
        int yuzler=sayi/100;

        System.out.println("Girdiginiz sayinin birler basamagi : "+birler);
        System.out.println("Girdiginiz sayinin onlar basamagi : "+onlar);
        System.out.println("Girdiginiz sayinin yuzler basamagi : "+yuzler);

    }

}
