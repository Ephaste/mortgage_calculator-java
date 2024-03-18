import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT =100;


        int principal =0;
        float monthlyRate =0 ;
        byte years=0;


        Scanner scanner =new Scanner(System.in);
       //Mortgage calculator
         while(true) {
             System.out.println("Principal:");
             principal = scanner.nextInt();
             if (principal >= 1000 && principal <= 1_000_000)
                 break;
             System.out.println("enter the value btn 1k and 1M");
         }
         while(true) {
             System.out.println("Annual interest rate:");
             float anualRate = scanner.nextFloat();
             if (anualRate >= 1 && anualRate <= 30){
                  monthlyRate = anualRate / PERCENT /MONTHS_IN_YEAR;
                 break;
         }
        System.out.println("Enter a value btb 10 and 30");
         }

    while (true) {
        System.out.println("Period (YEARS)");
         years = scanner.nextByte();
        if (years >= 1 && years <= 10)
            break;
        System.out.println("Enter the years  btn 1 and 10");
    }
        int numberOfPayments = years *MONTHS_IN_YEAR;
        double mortgage= principal*
                (monthlyRate*Math.pow((1+monthlyRate),numberOfPayments)/(Math.pow((1+monthlyRate),numberOfPayments)-1));
        String mFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage="+ mFormated);

    }
}