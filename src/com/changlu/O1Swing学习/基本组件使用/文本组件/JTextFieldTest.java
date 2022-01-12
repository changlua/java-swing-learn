package com.changlu.O1Swing学习.基本组件使用.文本组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JTextFieldTest
 * @Author ChangLu
 * @Date 2022/1/4 14:02
 * @Description 文本组件
 */
public class JTextFieldTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JLabel label = new JLabel("用户名");
        //文本组件（默认输入值，文本框长度）
        final JTextField textField = new JTextField("请输入用户名",20);
        textField.setSize(20,30);
        jf.add(label);
        jf.add(textField);

        jf.setVisible(true);
    }

}