package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBtnListener implements ActionListener {
    private JTextField input;
    public DigitBtnListener(JTextField input) {
        this.input =  input;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        input.setText(input.getText() + btn.getText());
        //System.out.println("Button " + btn.getText() + " pressed");//for debug
    }
}
