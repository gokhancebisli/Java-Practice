package day3;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /* String Methods
        String girildiginde ilk iki karakteri haric string
        Ancak ilk iki karakter 'g' ve ikinci karakteri 'h' ise bu karakterleri de yazdiran bir program yaziniz.

        INPUT   : goat
                  photo
                  ghost
                  kalem
        OUTPUT  : gat
                  hoto
                  ghost
                  lem
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime = scanner.nextLine();
        if (kelime.startsWith("gh")) {
            System.out.println(kelime);

        }else if (kelime.startsWith("g")) {
            System.out.println(kelime.charAt(0) + kelime.substring(2));

        }

        else if (kelime.charAt(1)=='h') {
            System.out.println(kelime.substring(1));

        }else{
            System.out.println(kelime.substring(2));

        }



        }

    }



