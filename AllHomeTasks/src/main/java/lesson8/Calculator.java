package lesson8;

import lesson8.components.NumberJButton;
import lesson8.components.OperatorJButton;
import lesson8.helpers.FirstNumber;
import lesson8.helpers.OperatorHelper;
import lesson8.helpers.SecondNumber;
import lesson8.listeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField input;
    //private String chosenOperator;
    //create some helper classes
    OperatorHelper operatorHelper = new OperatorHelper();
    FirstNumber firstNumber =  new FirstNumber();
    SecondNumber secondNumber =  new SecondNumber();

       public Calculator(String title) throws HeadlessException {
        super(title);
        //Window Settings
        setBounds(900,0,300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Close when press cross
        setAlwaysOnTop(true);
        setVisible(true);// make visible, should be at the end

        setJMenuBar(createMenu());// create menu

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH); //create top
        add(createLeft(), BorderLayout.WEST); //create left
        add(createCenter(), BorderLayout.CENTER);
        add(createRight(), BorderLayout.EAST);
        add(createbottom(), BorderLayout.SOUTH);

        setVisible(true);// make visible, should be at the end
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar(); //create menu bar

        JMenu menuFile =  new JMenu("File");//create menu tag
        JMenu menuAbout =  new JMenu("About");//create menu tag

        menuBar.add(menuFile);//add menu tag to menu bar

        menuFile.add(new JMenuItem("Clear"));//create item in tag File

        JMenuItem exitItem =  menuFile.add(new JMenuItem("Exit"));//create exit item
        exitItem.addActionListener(new ExitBtnListener());//add action for exit item
        menuBar.add(menuAbout);
        menuFile.add(exitItem);

        return (menuBar);
    }

    private JPanel createTopPanel() {
        JPanel top =  new JPanel();
        top.setLayout(new BorderLayout());

        input = new JTextField();
        input.setEditable(false);
        top.add(input);
        input.setFont(new Font ("TimesRoman", Font.PLAIN, 25));
        input.setBackground(new Color(89, 237, 243));
        return(top);
    }

    private JPanel createCenter() {
        JPanel center = new JPanel();
        center =  createOperatorPanel();
        return(center);
    }

    private JPanel createOperatorPanel() {
        JPanel operatorsPanel = new JPanel();
        operatorsPanel.setLayout(new GridLayout(4,1));

        JButton sumBtn = new OperatorJButton("+"); // create button
        ActionListener sumBtnListener =  new OperatorBtnListener(operatorHelper, input, firstNumber);// create listener
        sumBtn.addActionListener(sumBtnListener);//link listener with button
        operatorsPanel.add(sumBtn);//add btn to panel

        JButton subtrBtn = new OperatorJButton("-");
        ActionListener subtrBtnListener =  new OperatorBtnListener(operatorHelper, input, firstNumber);
        subtrBtn.addActionListener(subtrBtnListener);
        operatorsPanel.add(subtrBtn);

        JButton multBtn = new OperatorJButton("*");
        ActionListener multBtnListener =  new OperatorBtnListener(operatorHelper,input, firstNumber);
        multBtn.addActionListener(multBtnListener);
        operatorsPanel.add(multBtn);

        JButton divBtn = new OperatorJButton("/");
        ActionListener divBtnListener =  new OperatorBtnListener(operatorHelper, input,  firstNumber);
        divBtn.addActionListener(divBtnListener);
        operatorsPanel.add(divBtn);
        return (operatorsPanel);
    }

    private JPanel createLeft(){
        JPanel LeftPanel =  new JPanel();
        LeftPanel.setLayout(new BorderLayout());
        LeftPanel.add(createDigitsPanel(), BorderLayout.CENTER);
        return (LeftPanel);
    }

    private JPanel createDigitsPanel() {
        JPanel digitsPanel =  new JPanel();
        digitsPanel.setLayout(new GridLayout(4,3));
        for (int i = 0; i < 9 ; i++) {
            String btnTitle;
            btnTitle = String.valueOf(i + 1);
            JButton btn  =  new NumberJButton(btnTitle);
            btn.addActionListener(new DigitBtnListener(input));
            digitsPanel.add(btn);
        }
        JButton btn0  =  new NumberJButton("0");
        btn0.addActionListener(new DigitBtnListener(input));
        digitsPanel.add(btn0);
        return(digitsPanel);
    }

    private JPanel createbottom() {
        JPanel bottom =  new JPanel();
        bottom.setLayout(new BorderLayout());

        JButton calcBtn =  new JButton("Calculate");
        ActionListener calcBtnListener =  new CalculateBtnListener(input, firstNumber, secondNumber);
        calcBtn.addActionListener(calcBtnListener);
        bottom.add(calcBtn);

        return(bottom);
    }
    private JPanel createRight() {
        JPanel right =  new JPanel();
        right.setLayout(new GridLayout(5,1));
        JButton clearAll =  new JButton("clear all");//create btn
        right.add(clearAll);// add "clear all" btn to right panel

        ActionListener clearAllDataBtnListener =  new ClearAllDataBtnListener(input, firstNumber, secondNumber, operatorHelper);// create listener
        clearAll.addActionListener(clearAllDataBtnListener);//link listener with btn

        JButton sosBtn = new JButton("sos");
        ActionListener sosBtnListener =  new SosBtnListener(operatorHelper, firstNumber, secondNumber);
        sosBtn.addActionListener(sosBtnListener);
        right.add(sosBtn);
        return(right) ;

    }
}
