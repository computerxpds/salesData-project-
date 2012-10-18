
/**
 * Write a description of class salesData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;

public class salesData
{

    public static void main(String[] args)
    {
        //input dialog
        String movieName = JOptionPane.showInputDialog("Enter The Name of The Movie");
        String aPrice = JOptionPane.showInputDialog("Enter Adult Ticket Price");
        String cPrice = JOptionPane.showInputDialog("Enter Child Ticket Price");
        String aSold = JOptionPane.showInputDialog("Enter Number of Adult Tickets Sold");
        String cSold = JOptionPane.showInputDialog("Enter Number of Child Tickets Sold");
        String percentSold = JOptionPane.showInputDialog("Enter Percent Donated");
        
        //Output dialog
        
        //sum
        double adultPri = Double.parseDouble(aPrice);
        double childPri = Double.parseDouble(cPrice);
        //gross
        double adultSol = Double.parseDouble(aSold);
        double childSol = Double.parseDouble(cSold);
        //percentSold
        double pSold = Double.parseDouble(percentSold);
        
        double sum;
        double gross;
        double amountDonated;
        double netSale;
        
        sum = adultPri + childPri;
        gross = adultPri * adultSol + childPri * childSol;
        amountDonated = gross / 10;
        netSale = gross - amountDonated;
        
        
        JOptionPane.showMessageDialog(null, movieName + sum + gross + pSold + amountDonated + netSale, "Movie name" + "\n Number of tickets sold" + "\n Gross Amount: $" + "\n Percent Donated: " + "\n Net Sale: $", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, sum, "Number of Tickets Sold: " , JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, gross, "Gross Amount: $" , JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, pSold, "Percent Donated: " , JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, amountDonated, "Amount Donated: $" , JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, netSale, "Net Sale: $" , JOptionPane.WARNING_MESSAGE);
    }
}
        