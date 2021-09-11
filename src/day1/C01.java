package day1;

import java.sql.SQLOutput;

public class C01 {
   /*
   \n (or\r) : starts from a new line : metni bir alt satirdan itibaren yazdirir.
          \t : horizontal tab : metni yatayda 1 tab miktari kaydirir.
          \\ : prints a back  slash :\ters slash yazdirir.
          \' : prints single quote : ' tek tirnak yazdirir.
          \" : prints double quote : "" cift tirnak yazdirir.
    */

    public static void main(String[] args) {
        // Soru1 : Konsola "Hello", "World \/" seklinde yazdiriniz
        System.out.println("\"Hello \", \"World \\ /\"");

    //Soru 2: isminizin her harfini ayri bir satira gelecek sekilde yazdiriniz.
         System.out.println("G\nO\nK\nH\nA\nN");

    //Soru3: "Java ile hayat cok 'afilli' yazdiriniz
        System.out.println(" \"Java\" ile hayat cok \'afilli\' ");

    //Soru4: "Basari" gayrete
        //     'asiktir'     yazdiriniz sonraki "TechproEd ile java cok kolay ..." ifadesi 3 satir sonra ve satir basindan 1 tab ileri yazdiriniz
        System.out.println("\"Basari\" gayrete \n\'asiktir\'");
        System.out.println("\n\n\n");
        System.out.println("\tTechproEd ile java cok kolay");


    }



}
