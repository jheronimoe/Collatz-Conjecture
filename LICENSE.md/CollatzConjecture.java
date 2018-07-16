import java.util.Scanner;
import javax.swing.JOptionPane;

public class CollatzConjecture 
{

    /**
     * @author Jherome Hernandez
     */
    public static void main(String[] args) 
    {
            
            int steps = 0;
            
            int n;
            n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: ")); //PARSING THE JOPTION PANE BECAUSE JOPTIONPANE ONLY ACCEPTS STRING
            int x = n;
            				
            while(n > 1)
            {
                    if(n % 2 == 0) //IF N == 2 THEN N/2
                            n /= 2;
                    else n = (n * 3) + 1; //IF ODD (N == 3 THEN 3*N + 1)
                    steps++;        
            }     
           JOptionPane.showMessageDialog(null, "Number of steps is '" + steps + "' steps to reach \'1\' using the Collatz conjecture on the number \'" + x +"\'.");
    }

}