package Java1.lesson8.listeners;

import Java1.lesson8.helpers.FirstNumber;
import Java1.lesson8.helpers.OperatorHelper;
import Java1.lesson8.helpers.SecondNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearAllDataBtnListener implements ActionListener {
    private FirstNumber firstNumber;
    private SecondNumber secondNumber;
    private JTextField input;
    private OperatorHelper operatorHelper;

    public ClearAllDataBtnListener(JTextField input, FirstNumber firstNumber, SecondNumber secondNumber,
                                   OperatorHelper operatorHelper) {
        this.input = input;
        this.firstNumber =  firstNumber;
        this.secondNumber =  secondNumber;
        this.operatorHelper =  operatorHelper;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        input.setText("");
        firstNumber.setNumber1(0);
        secondNumber.setNumber2(0);
        operatorHelper.setChosenOperator("Nothing");
        //System.out.println("Clear all btn pressed");//for debug
    }
}
