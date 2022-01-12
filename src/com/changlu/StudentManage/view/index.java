/*
 * Created by JFormDesigner on Tue Jan 04 18:39:34 CST 2022
 */

package com.changlu.StudentManage.view;

import com.changlu.StudentManage.view.Login.Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class index extends JFrame {
    public index() {
        initComponents();
        this.setSize(621,301);
        this.setVisible(true);
        this.addButton3Event();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("com.changlu.StudentManage.constant");
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        passwordField1 = new JPasswordField();
        button3 = new JButton();

        //======== this ========
        setTitle(bundle.getString("index.this.title"));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("index.label1.text"));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 7f));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1);
        label1.setBounds(190, 10, 195, 50);
        contentPane.add(textField2);
        textField2.setBounds(260, 90, 150, 30);

        //---- label2 ----
        label2.setText(bundle.getString("index.label2.text"));
        label2.setIcon(new ImageIcon("C:\\Users\\93997\\Desktop\\swing\\test\\resources\\images\\\u7528\u6237\u540d.png"));
        contentPane.add(label2);
        label2.setBounds(175, 90, 60, 25);

        //---- label3 ----
        label3.setText(bundle.getString("index.label3.text"));
        label3.setIcon(new ImageIcon("C:\\Users\\93997\\Desktop\\swing\\test\\resources\\images\\\u7528\u6237\u540d.png"));
        contentPane.add(label3);
        label3.setBounds(175, 135, 70, 25);

        //---- button1 ----
        button1.setText(bundle.getString("index.button1.text"));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(180, 205), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText(bundle.getString("index.button2.text"));
        contentPane.add(button2);
        button2.setBounds(290, 205, 70, 30);
        contentPane.add(passwordField1);
        passwordField1.setBounds(260, 135, 150, 30);

        //---- button3 ----
        button3.setText(bundle.getString("index.button3.text"));
        contentPane.add(button3);
        button3.setBounds(395, 205, 78, 30);

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
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void addButton3Event(){
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JPasswordField passwordField1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
