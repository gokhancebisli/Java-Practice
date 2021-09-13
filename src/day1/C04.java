package day1;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /* Soru: Mesafeyi ve hizi alip süreyi tanimlayan bir kod yaziniz.
        Örnegin; Istanbul ile Ankara arasi 400 km olarak ölcülmektedir.  Bu yolu ortalama
        120 km/s hizla giden bir arac ne kadar sürede hedefe varir?

        Expected Output:
        Mesafeyi giriniz :400
        Hizi giriniz     :100
        Süre    : 4 saattir.
         */
    Scanner scan=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz :");
        double mesafe=scan.nextDouble();
        System.out.print("hizinizi giriniz :");
        double hiz=scan.nextDouble();
        double sure=mesafe/hiz;
        System.out.println("yolculuk sureniz : "+sure+" saattir");


    }
}
