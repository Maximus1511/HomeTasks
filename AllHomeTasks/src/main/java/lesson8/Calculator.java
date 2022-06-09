package lesson8;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator(String title) throws HeadlessException {
        super(title);
        //Window Settings
        setBounds(900,0,300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Close when press cross
        setAlwaysOnTop(true);
        setVisible(true);// make visible, should be at the end

        //
          /*  Button btn = new Button("Fuck");
            btn.addActionListener(new ButtonListener());
            super.add(btn);*/
        setJMenuBar(createMenu());// create menu

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH); //create top
        add(createLeft(), BorderLayout.WEST); //create top
        add(createCenter(), BorderLayout.CENTER); //create top

        setVisible(true);// make visible, should be at the end
    }

    private JPanel createCenter() {
        JPanel center = new JPanel();
        return(center);
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

        JTextField input = new JTextField();
        input.setEditable(false);
        top.add(input);
        input.setFont(new Font ("TimesRoman", Font.PLAIN, 25));
        return(top);
    }
    private JPanel createLeft(){
        JPanel LeftPanel =  new JPanel();
        LeftPanel.setLayout(new BorderLayout());
        LeftPanel.add(createDigitsPanel(), BorderLayout.CENTER);
        //LeftPanel.add(createOperatorsPanel(), BorderLayout.EAST);

        return (LeftPanel);
    }

    private JPanel createDigitsPanel() {
        JPanel digitsPanel =  new JPanel();
        digitsPanel.setLayout(new GridLayout(4,3));
        for (int i = 0; i < 12 ; i++) {
            String btnTitle;
            switch (i) {
                case 9: btnTitle = ".";
                break;
                case 10: btnTitle = "0";
                break;
                case 11: btnTitle = "C";
                break;
                default: btnTitle = String.valueOf(i + 1);
            }
            JButton btn  =  new NumberJButton(btnTitle);
            digitsPanel.add(btn);
        }
        return(digitsPanel);
    }
}
