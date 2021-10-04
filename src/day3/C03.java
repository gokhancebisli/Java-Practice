package day3;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

//Bakiye ögrenme para cekme yatirma ve cikis islemlerinin oldugu bir bankamatik pr kodlayiniz

        System.out.println("*****************************");
        System.out.println("ATM'ye Hoşgeldiniz...");

        System.out.println("1.islem: bakiye sorgulama\n2.islem: para cekme\n3.islem: para yatirma\n4. islem:cikis");

        int bakiye=5000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int secim = scanner.nextInt();

        switch(secim){
            case 1:{
                System.out.println("bakiyeniz: "+bakiye);
                break;
            }
            case 2:{
                System.out.println("cekeceginiz miktari giriniz: ");
                int cekilenMiktar=scanner.nextInt();
                if(cekilenMiktar>bakiye){
                    System.out.println("bakiyeniz yeterli degil");

                }else{
                    bakiye-=cekilenMiktar;//Bakiyeden cekilen miktari cikardik.
                    System.out.println("güncel bakiyeniz :"+bakiye);
                }
                break;
            }
            case 3:{
                System.out.println("yatiracaginiz miktari giriniz");
                int yatirilanMiktar = scanner.nextInt();
                bakiye = yatirilanMiktar; //Bakiyeye yatirilan miktari ekledik.
                System.out.println("güncel bakiyeniz :" + bakiye);
                break;
            }
            case 4:{
                System.out.println("Cikisiniz yapiliyor");
                break;

            }
            default:
        }




    }
}