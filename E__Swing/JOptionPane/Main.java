package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       /* JOptionPane.showMessageDialog(null,"hello","hello",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello","hello",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello","hello",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"YOUR COMPUTER HAS A VIRUS !!!","Warning",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"call tech support now","ERROR",JOptionPane.ERROR_MESSAGE);
*/
/*
        JOptionPane.showConfirmDialog(null,"are u sure to do this operation","confirm",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        */
        String name =JOptionPane.showInputDialog("put a name ");
        System.out.println(name);
        String[] answers={"of course i'm awesome","thank you ","not interested"};
        JOptionPane.showOptionDialog(null,"you are awesome",
                "option",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,answers,null);
    }
}
