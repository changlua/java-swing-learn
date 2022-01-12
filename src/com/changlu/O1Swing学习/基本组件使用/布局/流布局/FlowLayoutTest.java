package com.changlu.O1Swing学习.基本组件使用.布局.流布局;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName FlowLayoutTest
 * @Author ChangLu
 * @Date 2022/1/4 14:24
 * @Description FlowLayout：流布局，根据屏幕的宽度来进行调整其中的组件
 */
public class FlowLayoutTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,200,100);
        //设置流布局
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        //创建10个按钮
        final JButton b = new JButton("A");
        final JButton b1 = new JButton("A");
        final JButton b2 = new JButton("A");
        final JButton b3 = new JButton("A");
        final JButton b4 = new JButton("A");
        final JButton b5 = new JButton("A");
        final JButton b6 = new JButton("A");

        jf.add(b);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);

        jf.setVisible(true);

    }

}