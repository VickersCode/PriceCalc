import javax.swing.JOptionPane;

/**
 * This is an excercise - building a method
 * 
 * User inputs wholesale cost of item and it's markup percentage
 * Program returns retail price
 */

public class PriceCalc {
    public static void main(String[] args) {
        
        // Initialize variables
        float wholesale, // wholesale price
              markup;    // markup price

        // Grab prices from user and convert to float
        String input = JOptionPane.showInputDialog("What is the WHOLESALE price?");
        wholesale = Float.parseFloat(input);

        input = JOptionPane.showInputDialog("What is the MARKUP percentage?");
        markup = Float.parseFloat(input);

        // Call conversion method
        float answer = priceCalc(wholesale, markup);

        // Displays result for user
        JOptionPane.showMessageDialog(null, "The total retail price is " + answer);
    }    

    public static float priceCalc(float wholesale, float markup) {
        markup = markup / 100;

        return wholesale * markup;
    }
}
