

import javax.swing.JOptionPane;

/*
 * @author Ntlakanipho Mgaguli
 */


public class DEMOPIZZA {
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog(null,"Enter the number of pizza ordering windows to open:");
        
         // Convert the input to an integer
         int numOfwindows = Integer.parseInt(input);
         
          // Create the specified number of windows and start each in its own thread
         for(int i = 0; i < numOfwindows; i++)
         {
              // Create an instance of PizzaOrderWindow
            PizzaOrderWindow window = new PizzaOrderWindow();
            
            // Create a new Thread object with the window as the Runnable target
            Thread thread = new Thread(window);
            
            // Start the thread
            thread.start();
         }    
    }
    
}
