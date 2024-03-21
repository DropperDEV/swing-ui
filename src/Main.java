import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.intellij.uiDesigner.core.*;

public class Main extends JFrame {

    public Main() {
        initComponents();
        setContentPane(MainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - unknown
        MainPanel = new JPanel();
        var vSpacer1 = new Spacer();
        cliqueEmMimButton = new JButton();
        var label1 = new JLabel();
        TextField1 = new JTextField();

        //======== MainPanel ========
        {
            MainPanel.setToolTipText("aa");
            MainPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,MainPanel. getBorder( )) ); MainPanel. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            MainPanel.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
            MainPanel.add(vSpacer1, new GridConstraints(0, 2, 3, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                null, null, null));

            //---- cliqueEmMimButton ----
            cliqueEmMimButton.setText("Clique em mim");
            MainPanel.add(cliqueEmMimButton, new GridConstraints(2, 0, 1, 2,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- label1 ----
            label1.setText("Seja bem vindo");
            MainPanel.add(label1, new GridConstraints(0, 0, 1, 2,
                GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_FIXED,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- TextField1 ----
            TextField1.setText("");
            MainPanel.add(TextField1, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel MainPanel;
    private JButton cliqueEmMimButton;
    private JTextField TextField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}