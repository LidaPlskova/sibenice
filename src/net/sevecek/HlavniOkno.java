package net.sevecek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labPismeno1;
    JLabel labPismeno2;
    JLabel labPismeno3;
    JLabel labPismeno4;
    JLabel labUhodni;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HlavniOkno() {
        initComponents();
    }

    private void thisKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_J) {
            labPismeno1.setText("J");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            labPismeno2.setText("A");
            labPismeno4.setText("A");
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            labPismeno3.setText("V");
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labPismeno1 = new JLabel();
        labPismeno2 = new JLabel();
        labPismeno3 = new JLabel();
        labPismeno4 = new JLabel();
        labUhodni = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moje nov\u00e1 aplikace");
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                thisKeyPressed(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- labPismeno1 ----
        labPismeno1.setText("*");
        contentPane.add(labPismeno1);
        labPismeno1.setBounds(95, 85, 25, 25);

        //---- labPismeno2 ----
        labPismeno2.setText("*");
        contentPane.add(labPismeno2);
        labPismeno2.setBounds(125, 85, 28, 25);

        //---- labPismeno3 ----
        labPismeno3.setText("*");
        contentPane.add(labPismeno3);
        labPismeno3.setBounds(155, 85, 28, 25);

        //---- labPismeno4 ----
        labPismeno4.setText("*");
        contentPane.add(labPismeno4);
        labPismeno4.setBounds(185, 85, 28, 25);

        //---- labUhodni ----
        labUhodni.setText("Uhodni slovo");
        contentPane.add(labUhodni);
        labUhodni.setBounds(100, 30, 105, 50);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(285, 200);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
