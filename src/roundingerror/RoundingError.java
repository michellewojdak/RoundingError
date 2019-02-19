/*
 * Michelle Wojdak
 * February 18, 2019
 * to compare the square of a sqaure of any number and its rounding erorr
 */
package roundingerror;

import javax.swing.JOptionPane;

/**
 *
 * @author michellewojdak
 */
public class RoundingError {
    public static void main(String[] args) {
        double num; // initial number being inputted
        double a;
        double b;
        double c;
        double d;
        
        //Asking User for a number
        String numStr = JOptionPane.showInputDialog("Rounding"
		+"Error Calculator\nPlease enter a number");
        
        //Convert the number from a String to a double
     	num = Double.parseDouble(numStr);
        
        //Calculate square of the square root     
        a= java.lang.Math.sqrt(num);
        b = a * a; 
        c = java.lang.Math.round(b);
        d = c - b;
        
        // output new number and rounding error
         JOptionPane.showMessageDialog(null, "The square of the sqaure"
		+"="+ b + " The round off error" + "=" + d );
        
                
    }
    
}
