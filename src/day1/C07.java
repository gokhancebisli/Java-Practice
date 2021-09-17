package day1;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /* Kullanicidan kilosunu ve boyunu alip Vücut Kitle indeksini hesaplayan bir program yaziniz
        Ipucu : Vücut
        Kitle Indeksi (VKI) =Vücut agirligi(kg)/Boy uzunlugunun karesi(m)
        Exp==> Input ==> Kilo :71
                         Boy : 1.72
              Output==> Vücut Kitle Indeksiniz: 23  */
        Scanner scanner=new Scanner(System.in);
        System.out.print("kilonuzu giriniz :");
        double kilo= scanner.nextDouble();

        System.out.print("boyunuzu giriniz :");
        double boy= scanner.nextDouble();

        double VKI=kilo/(boy*boy);
        System.out.println("Vücut Kitle Indeksiniz :"+VKI);
    }
}
