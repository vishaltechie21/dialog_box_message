import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        String  name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null,"Your age is" + age+" Year");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null,"Your Height is:"+ height +" cm");

    }
}