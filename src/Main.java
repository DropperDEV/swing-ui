import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField TextField1;
    private JLabel Title;
    private JButton cliqueEmMimButton;
    private JPanel MainPanel;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = TextField1.getText();
                JOptionPane.showMessageDialog(Main.this,"Bem vindo: " + name);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}