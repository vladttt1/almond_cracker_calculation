package almond_cracker_calculation;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class almcracker {

    private static Scanner sc;

	/**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main (String args[])throws IOException {
      double quanA,prAc,coefA,prCr,summ;
     sc = new Scanner(System.in); 
     
     System.out.println("Введите количество до чистки");
     quanA=sc.nextDouble();
     
     System.out.println("Price before cleaning(Bernardo) is");
        double prbC = sc.nextDouble();
     System.out.println("Price after cleaning (Slava)is ");
     prAc=sc.nextDouble();
     System.out.println("Coeffitient of exit is");
     coefA=sc.nextDouble();
     System.out.println("Price of cleaning is");
     prCr=sc.nextDouble();
     double quanAc = quanA*coefA;
     
     summ=(quanAc*prAc)-(quanA*prCr);  
     if (summ<(prbC*quanA)){
     System.out.println("Bernardo WON" + ((prbC*quanA)-summ));}
     else {System.out.println("Slava WON"+((prbC*quanA)-summ));}
    }}
    


    
        // TODO code application logic here
   
    
