package com.changlu.O1Swing学习.基本组件使用.文本组件.密码框组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JPasswordFieldTest
 * @Author ChangLu
 * @Date 2022/1/4 14:08
 * @Description 密码框组件：输入的内容为****形式
 */
public class JPasswordFieldTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JLabel label = new JLabel("密码");
        //密码框组件
        final JPasswordField pdField = new JPasswordField("请输入密码", 20);
        //设置密文效果：默认是●，修改为*形式
        pdField.setEchoChar('*');
//        pdField.setEchoChar((char)0);  //设置明文可见！
        jf.add(label);
        jf.add(pdField);

        jf.setVisible(true);
    }

}