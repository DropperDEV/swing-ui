import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoSectionUI extends JFrame implements ActionListener {
    private JPanel section1, section2;
    private JButton goToSection2Button;

    public TwoSectionUI() {
        setTitle("Duas Seções");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        section1 = new JPanel();
        section2 = new JPanel();


        JLabel label1 = new JLabel("Seção 1");
        goToSection2Button = new JButton("Ir para a Seção 2");
        goToSection2Button.addActionListener(this);
        section1.add(label1);
        section1.add(goToSection2Button);


        JLabel label2 = new JLabel("Seção 2");
        section2.add(label2);
        section2.setVisible(false);

        setLayout(new CardLayout());
        add(section1, "section1");
        add(section2, "section2");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToSection2Button) {
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "section2");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TwoSectionUI ui = new TwoSectionUI();
                ui.setVisible(true);
            }
        });
    }
}
