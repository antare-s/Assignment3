//This part was written by Jorge Martinez-Burgos Ortiz

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ItemsQuantityFrame extends JFrame implements ActionListener {

    JLabel label = new JLabel("Enter the quantity: ");
    JLabel error = new JLabel("Error: Input must be integer");
    JTextField textField = new JTextField();
    JButton button = new JButton("Next");
    JPanel panel = new JPanel();


    ItemsQuantityFrame() {

        panel.setLayout(null);
        panel.setBounds(0, 0, 300, 100);
        panel.setVisible(true);
        this.add(panel);

        label.setBounds(40, 10, 140, 20);

        error.setBounds(20, 47, 200, 20);
        error.setVisible(false);
        error.setForeground(Color.RED);

        textField.setBounds(170, 10, 80, 20);

        button.setBounds(220, 47, 70, 20);
        button.addActionListener(this);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(error);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300, 100);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == button ) {
            String text = textField.getText();
            try {
                int check = Integer.parseInt(text);
                this.dispose();

            } catch (NumberFormatException nfe) {
                error.setVisible(true);
            }
        }
    }
}
