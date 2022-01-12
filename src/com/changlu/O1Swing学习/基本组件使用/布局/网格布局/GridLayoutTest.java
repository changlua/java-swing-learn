package com.changlu.O1Swing学习.基本组件使用.布局.网格布局;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName GridLayoutTest
 * @Author ChangLu
 * @Date 2022/1/4 14:34
 * @Description TODO
 */
public class GridLayoutTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,600,400);
        //设置流布局：指定行数+列数+水平间隔+垂直间隔
        jf.setLayout(new GridLayout(3,3,10,20));
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
        final JButton b7 = new JButton("A");
        final JButton b8 = new JButton("A");

        jf.add(b );
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);

        jf.setVisible(true);
    }

}