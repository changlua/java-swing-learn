package com.changlu.O1Swing学习.基本组件使用.面板;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JPanelTest
 * @Author ChangLu
 * @Date 2022/1/4 13:24
 * @Description JPanel可添加多个组件
 */
public class JPanelTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,800,600);
        //DISPOSE_ON_CLOSE：隐藏当前窗口，并释放窗口占有的资源
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        //创建面板
        final JPanel jPanel = new JPanel(new FlowLayout());
        final JButton button1 = new JButton("confirm");
        final JButton button2 = new JButton("cancel");
        jPanel.add(button1);
        jPanel.add(button2);

        //将面板添加到JFrame
        jf.add(jPanel);
    }

}