package Java1.lesson8.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitBtnListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
