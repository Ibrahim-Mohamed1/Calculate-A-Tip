//Ibrahim Mohamed

package calculateatipibrahimmohamed;

import java.util.Scanner;

public class CalculateATipIbrahimMohamed
{

    public static void main(String[] args)
    {

        double bill;
        double tipPercent;
        double convertPercent;
        double tip;
        double output;

        Scanner myTip = new Scanner(System.in);
        System.out.println("How much is your bill?");
        bill = myTip.nextDouble();

        System.out.println("What percentage would you like to tip?");
        tipPercent = myTip.nextDouble();
        
        convertPercent = tipPercent * 0.01;
        tip = bill * convertPercent;

        output = Math.round(tip * 100.00) / 100.00;

        System.out.println("Gratuity: $" + output);
        System.out.println("Total bill: $" + (output + bill));
    }
}