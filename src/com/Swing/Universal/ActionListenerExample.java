<<<<<<< HEAD
package com.Swing.Universal;
=======
package Swing;
>>>>>>> 9322992895471427837d2f2f2d548303e2dc0e33
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginApp2 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField textFnum, textSnum, textAns;
    JButton btnOk, btnClear;

    public LoginApp2() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
//        setLayout(null);
        l1 = new JLabel("Enter The First Name: ");
        l2 = new JLabel("Enter Second Number: ");
        l3 = new JLabel("Sum");

        textFnum = new JTextField(16);
        textSnum = new JTextField(17);
        textAns = new JTextField(19);

        btnOk = new JButton("Click to sum");
        btnClear = new JButton("Reset");

        add(l1); add(textFnum);
        add(l2); add(textSnum);
        add(l3); add(textAns);
        add(btnOk); add(btnClear);

        Font ft = new Font("Arial", Font.PLAIN, 20);
        l1.setFont(ft); l2.setFont(ft); l3.setFont(ft); 
        textFnum.setFont(ft); textSnum.setFont(ft); textAns.setFont(ft); 
        btnOk.setFont(ft); btnClear.setFont(ft);

        btnOk.addActionListener(this);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            try {
                int num1 = Integer.parseInt(textFnum.getText());
                int num2 = Integer.parseInt(textSnum.getText());
                int sum = num1 + num2;
                textAns.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        } else if (e.getSource() == btnClear) {
            textFnum.setText("");
            textSnum.setText("");
            textAns.setText("");
        }
    }
}

public class ActionListenerExample {
    public static void main(String[] args) {
        LoginApp2 l = new LoginApp2();
        l.setVisible(true);
    }
    
    
    
    
    /*Let's dry run the corrected code you provided and explain the usage of `JOptionPane` and `getSource()` method:

### Dry Run Explanation:

#### Initialization and Frame Setup:
1. **Frame Setup:**
   - The `LoginApp2` class extends `JFrame`, which sets up a Swing JFrame with a size of 600x600 pixels and sets `EXIT_ON_CLOSE` for the default close operation.

2. **Layout Management:**
   - Uses `FlowLayout` as the layout manager, which arranges components from left to right in the order they are added.

#### Components Initialization:
3. **Labels (`JLabel`):**
   - `l1`, `l2`, `l3` are `JLabel` components initialized with text labels for prompting user input (`"Enter The First Name: "`, `"Enter Second Number: "`, `"Sum"`).

4. **Text Fields (`JTextField`):**
   - `textFnum`, `textSnum`, `textAns` are `JTextField` components initialized with specific column widths (`16`, `17`, `19` respectively) to control the visible size of the input fields.

5. **Buttons (`JButton`):**
   - `btnOk` and `btnClear` are `JButton` components initialized with labels (`"Click to sum"`, `"Reset"`).

6. **Font Setup:**
   - A `Font` object (`ft`) is created with Arial font, plain style, and size 20. This font is then applied to all labels, text fields, and buttons for consistent styling.

#### Adding Components to Frame:
7. **Adding Components:**
   - Components (`JLabel`, `JTextField`, `JButton`) are added to the frame using `add(component)` method calls.

#### Action Event Handling (`ActionListener`):
8. **ActionListener Implementation:**
   - `ActionListener` interface is implemented to handle button click events (`btnOk` and `btnClear`).
   - Inside `actionPerformed(ActionEvent e)` method:
     - **getSource():** Checks which component triggered the action using `e.getSource()`. This method returns the object that fired the event (`btnOk` or `btnClear`).
     - **Button Click Handling:**
       - If `btnOk` is clicked:
         - Parses integers from `textFnum` and `textSnum`.
         - Computes their sum and sets the result in `textAns`.
         - Displays an error message if input is not a valid number.
       - If `btnClear` is clicked:
         - Clears all text fields (`textFnum`, `textSnum`, `textAns`).

#### JOptionPane Usage:
9. **JOptionPane:**
   - `JOptionPane.showMessageDialog(this, "Please enter valid numbers.");` is used inside the catch block (`NumberFormatException`) to show a dialog box with an error message if parsing fails (i.e., input is not a valid number).

### Conclusion:
The provided code sets up a simple Swing application where users can input numbers, compute their sum, and clear the input fields using buttons. It demonstrates the use of `JOptionPane` for displaying messages and `getSource()` method to identify the source of action events. Adjustments can be made further for layout and error handling as needed for specific application requirements.*/
}
