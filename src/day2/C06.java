package day2;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        /* Problem tanimi
        Kullanicidan 3 adet sayi alarak bu sayilarin bir dik ücgenin kenar uzunluklari olup olmadigini hesaplatan
        bir kod yaziniz (Ipucu: Bir ücgenin dik oldugunu anlamak icin a²+b²=c² pisagor bagintisindan yararlanabilirsiniz)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("c kenarini giriniz");
        int c = scan.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println("Girdiginiz kenarlar bir dik ücgen olusturur");
        } else if ((a * a) + (c * c) == b * b){
            System.out.println("Girdiginiz kenarlar bir dik ücgen olusturur");
    }else if((b*b)+(c*c)==a*a){
            System.out.println("Girdiginiz kenarlar bir dik ücgen olusturur");
    }else System.out.println("girdiginiz kenarlar dik ücgen olusturmaz");

    }
}
