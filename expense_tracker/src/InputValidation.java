import javax.swing.*;

/**
 * The Input Validation Class checks if the amount and category are valid.
 */
public class InputValidation {
    public static void isAmountValid(String amount){
        //Check if amount is a valid number
        try {
            Double.parseDouble(amount);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Number",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        //Check if amount is between 0 and 1000
        if(Double.parseDouble(amount) < 0 || Double.parseDouble(amount) > 1000 ) {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Number between 0 and 1000",
                    "Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Please Enter a Number between 0 and 1000");
        }
    }

    public static void isCategoryValid(String category){
        //Check if category belongs to given list
        switch (category.toLowerCase()) {
            case "food", "travel", "bills", "entertainment", "other":
                break;
            default: {
                JOptionPane.showMessageDialog(new JFrame(), "Please Enter a valid Category (food, travel, bills, entertainment, other)",
                        "Error", JOptionPane.ERROR_MESSAGE);
                throw new IllegalArgumentException("Please Enter a valid Category");
            }
        }
    }
}
