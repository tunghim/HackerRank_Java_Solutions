import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale uslocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale inlocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale cnlocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale frlocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        
        NumberFormat usformat = NumberFormat.getCurrencyInstance(uslocale);
        NumberFormat informat = NumberFormat.getCurrencyInstance(inlocale);
        NumberFormat cnformat = NumberFormat.getCurrencyInstance(cnlocale);
        NumberFormat frformat = NumberFormat.getCurrencyInstance(frlocale);
        
        String us = usformat.format(payment);
        String india = informat.format(payment);
        String china = cnformat.format(payment);
        String france = frformat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
