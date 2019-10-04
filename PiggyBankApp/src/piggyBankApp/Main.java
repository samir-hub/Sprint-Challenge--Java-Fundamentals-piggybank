package piggyBankApp;

import java.util.*;
import java.text.DecimalFormat;



public class Main
{
	public static void main(String[] args)
	{

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        QuarterFromCoin quarter = new QuarterFromCoin(1);
        DimeFromCoin dime1 = new DimeFromCoin(1);
        DollarFromCoin dollar1 = new DollarFromCoin(5);
        NickelFromCoin nickel = new NickelFromCoin(3);
        DimeFromCoin dime2 = new DimeFromCoin(7);
        DollarFromCoin dollar2 = new DollarFromCoin(1);
        PennyFromCoin penny = new PennyFromCoin(10);
        
       

        ArrayList<AbstractCoin> piggyBank = new ArrayList<AbstractCoin>();
        piggyBank.add(quarter);
        piggyBank.add(dime1);
        piggyBank.add(dollar1);
        piggyBank.add(nickel);
        piggyBank.add(dime2);
        piggyBank.add(dollar2);
        piggyBank.add(penny);
        

        piggyBank.forEach((v) -> System.out.println(v.printNumber()));
        

        System.out.println("The piggy bank holds " + fp.format(quarter.getTotValue() + dime1.getTotValue()+ dollar1.getTotValue()+ nickel.getTotValue() + dime2.getTotValue()+ dollar2.getTotValue() + penny.getTotValue()));
        

    
        

	}
}
