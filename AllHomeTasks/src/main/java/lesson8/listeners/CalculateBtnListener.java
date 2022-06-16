package lesson8.listeners;

import lesson8.helpers.FirstNumber;
import lesson8.helpers.SecondNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateBtnListener implements ActionListener {
    private JTextField input;
    private FirstNumber firstNumber;
    private SecondNumber secondNumber;

    public CalculateBtnListener(JTextField input, FirstNumber firstNumber, SecondNumber secondNumber) {
        this.input = input;
        this.firstNumber =  firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputStr =  input.getText();
        if (inputStr.contains("=")){
            input.setText("");
        }else {
            String operator = findOperator(input);//determine operator
            secondNumber.setNumber2(findSecondNumber(input, operator));//determine number 2
            String result = Calculation(firstNumber.getNumber1(), secondNumber.getNumber2(), operator);
            input.setText(input.getText() + "=" + result);
        }
    }

    public String Calculation(double a, double b, String operator) {
       String result;
        switch (operator) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case "/":
                if (b == 0) {
                    result = "Error";
                } else {
                    result = String.valueOf(a / b);
                }
                break;
            default:
                result = null;
                break;
        }
        return (result);
    }

    public String findOperator(JTextField input){
        String inputStr =  input.getText();
        //System.out.println("Field: " + inputStr); //for debug
        String operator = null;
        int a0 = inputStr.indexOf("+");
        int a1 = inputStr.indexOf("-");
        int a2 = inputStr.indexOf("*");
        int a3 = inputStr.indexOf("/");
        int [] arr =  new int[]{a0, a1, a2, a3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1){
                operator = String.valueOf(inputStr.charAt(arr[i]));
                break;
            }
        }
        return(operator);
    }
    public int findSecondNumber(JTextField input, String operator){
        String inputStr =  input.getText();
        String number2;
        number2 = inputStr.substring(inputStr.indexOf(operator)+1);
        int secondNumber = Integer.parseInt(number2);
        return(secondNumber);
    }
}

