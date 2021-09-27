package day2;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // c = (f-32)*5/9

        Scanner scan =new Scanner(System.in);
        System.out.println("Fahrenayt değeri giriniz : ");

        double f=scan.nextDouble();
        System.out.println("girdiginiz fahrenayt değerinin santigrad derecesi : "+(f-32)*5/9);
    }
}
