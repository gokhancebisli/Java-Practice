package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /* Kullanicidan aracinin hizini aliniz
        Trafik cezasinin degerini hesaplayin.
        45 hiz siniridir.
        Eger hiziniz 55-74 arasinda ise ==> Ceza 100$'dir.
        Eger hiziniz 75-84 arasinda ise ==> Ceza 150$'dir.
        Eger hiziniz 85-94 arasinda ise ==> Ceza 320$'dir.
        Eger hiziniz 94'den fazla ise ==> Ceza 500$'dir. ve ayrica
        Eger sürücünün ehliyeti yoksa cezaya 200$ eklenir.
        Exp: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350$ olur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("hizinizi giriniz");
        int hiz=scan.nextInt();

        System.out.println("ehliyetiniz varsa 1 degilse 0 yaziniz");
        int ehliyet=scan.nextInt();

        if(ehliyet==1) {
            if(hiz>54 && hiz<75 ){
            System.out.println("cezaniz 100$'dir");
        }else if(hiz>=75 && hiz<85){
                System.out.println("cezaniz 150$'dir");
            }else if(hiz>=85 && hiz<95) {
                System.out.println("cezaniz 320$'dir");
            }else if(hiz>=95 ) {
                System.out.println("cezaniz 500$'dir");

                if (ehliyet == 0) {
                    if (hiz > 54 && hiz < 75) {
                        System.out.println("cezaniz 300$'dir");
                    } else if (hiz >= 75 && hiz < 85) {
                        System.out.println("cezaniz 350$'dir");
                    } else if (hiz >= 85 && hiz < 95) {
                        System.out.println("cezaniz 520$'dir");
                    } else if (hiz >= 95) {
                        System.out.println("cezaniz 700$'dir");
                    }

                }
            }

