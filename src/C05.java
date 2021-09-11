import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan aldiginiz vize 1, vize 2 ve final notlarini
        vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Vize 1 notunu giriniz :");
        double vize1=scan.nextDouble();
        System.out.print("Vize 2 notunu giriniz :");
        double vize2=scan.nextDouble();
        System.out.print("Final notu giriniz :");
        double finalnotu=scan.nextDouble();
        double gecmeNotu=((vize1*3/10+vize2*3/10)/2+finalnotu*7/10);
        System.out.println("Gecme notunuz :"+gecmeNotu);
    }
}
