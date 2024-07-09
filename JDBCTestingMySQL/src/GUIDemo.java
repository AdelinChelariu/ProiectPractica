import javax.swing.*;

public class GUIDemo extends JFrame {
    private JPanel panel1;
    private JLabel jlFirstName;
    private JTextField textField1;

    public GUIDemo() {
        setTitle("GUIDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        jlFirstName = new JLabel("First Name");
        jlFirstName.setVisible(true);
        textField1 = new JTextField(10);
        textField1.setVisible(true);
    }
    public static void main(String[] args) {
        new GUIDemo();
    }
}
