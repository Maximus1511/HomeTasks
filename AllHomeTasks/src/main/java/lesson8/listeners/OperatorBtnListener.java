package lesson8.listeners;

import lesson8.helpers.FirstNumber;
import lesson8.helpers.OperatorHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorBtnListener implements ActionListener {
    //private String chosenOperator;
    private OperatorHelper operatorHelper;
    private JTextField input;
    private FirstNumber firstNumber;


    public OperatorBtnListener(OperatorHelper operatorHelper, JTextField input){
        this.operatorHelper =  operatorHelper;
        this.input =  input;
    }
    public OperatorBtnListener(OperatorHelper operatorHelper,JTextField input, FirstNumber firstNumber){
        this.operatorHelper =  operatorHelper;
        this.input =  input;
        this.firstNumber = firstNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String operator;
        String inputStr = input.getText();
        operator = btn.getText();//determine which btn was pressed
        if (inputStr.contains("+") | inputStr.contains("-") | inputStr.contains("*") | inputStr.contains("/")) {
            //if any operator exists, do nothing
        } else {
            operatorHelper.setChosenOperator(operator);
            String s1 = input.getText();
            int i = Integer.parseInt(s1);
            firstNumber.setNumber1(i);
            //System.out.println("number1 = " + i); // for debug
            //System.out.println("now operator is " + operatorHelper.getChosenOperator()); //for debug
            input.setText(input.getText() + operator);

        }
    }
}
