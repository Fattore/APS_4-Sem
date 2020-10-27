package utility;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Message {
    
    public void showErrorMessage() {
        JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);    
        JDialog dialog = optionPane.createDialog("Opção Inválida");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
