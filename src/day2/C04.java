package day2;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

    /*
	 *  Kullanicidan 3 tene pozitif  tam sayi aliniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan kücük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen
	 */
    Scanner scanner=new Scanner(System.in);
        System.out.println("a kenarini giriniz");
        int a=scanner.nextInt();

        System.out.println("b kenarini giriniz");
        int b=scanner.nextInt();

        System.out.println("c kenarini giriniz");
        int c=scanner.nextInt();


        if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {

            if (a == b && b == c) {
                System.out.println("ücgeniniz eskenar");

            } else System.out.println("ücgeniniz eskenar degil");

        }else System.out.println("girdiginiz kenarlar bir ücgen belirtmez");



        }

}

