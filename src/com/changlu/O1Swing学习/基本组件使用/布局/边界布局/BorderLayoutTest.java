package com.changlu.O1Swing学习.基本组件使用.布局.边界布局;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName BorderLayoutTest
 * @Author ChangLu
 * @Date 2022/1/4 14:29
 * @Description BorderLayout：边界布局，分为东西南北中心五个局部位置
 */
public class BorderLayoutTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,600,400);
        //设置边界布局
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //创建按钮
        final JButton b = new JButton("北部");
        final JButton b1 = new JButton("东部");
        final JButton b2 = new JButton("南部");
        final JButton b3 = new JButton("西部");
        final JButton b4 = new JButton("中心");
        jf.add(b,BorderLayout.NORTH);
        jf.add(b1,BorderLayout.EAST);
        jf.add(b2,BorderLayout.SOUTH);
        jf.add(b3,BorderLayout.WEST);
        jf.add(b4,BorderLayout.CENTER);

        jf.setVisible(true);
    }

}