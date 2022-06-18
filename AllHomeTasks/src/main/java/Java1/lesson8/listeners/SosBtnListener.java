package Java1.lesson8.listeners;

import Java1.lesson8.helpers.FirstNumber;
import Java1.lesson8.helpers.OperatorHelper;
import Java1.lesson8.helpers.SecondNumber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is just for debugging. Sos button show me calculator status

public class SosBtnListener implements ActionListener {
   private OperatorHelper operatorHelper;
   private FirstNumber firstNumber;
   private SecondNumber secondNumber;

   public SosBtnListener(OperatorHelper operatorHelper, FirstNumber firstNumber, SecondNumber secondNumber) {
        this.operatorHelper =  operatorHelper;
        this.firstNumber =  firstNumber;
        this.secondNumber =  secondNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sos Info. Operator is " + operatorHelper.getChosenOperator());
        System.out.println("Sos Info. Number1 is " + firstNumber.getNumber1());
        System.out.println("Sos Info. Number2 is " + secondNumber.getNumber2());
    }
}
