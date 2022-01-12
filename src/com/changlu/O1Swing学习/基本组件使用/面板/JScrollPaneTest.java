package com.changlu.O1Swing学习.基本组件使用.面板;

import javax.swing.*;

/**
 * @ClassName JScrollPaneTest
 * @Author ChangLu
 * @Date 2022/1/4 13:27
 * @Description 带滚动条面板：只能添加一个组件
 */
public class JScrollPaneTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,300,150);
        //DISPOSE_ON_CLOSE：隐藏当前窗口，并释放窗口占有的资源
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        final JButton button = new JButton("香蕉");
        button.setSize(200,200);
        //创建带滚动条面板
        final JScrollPane jp = new JScrollPane(button);
        jf.add(jp);
    }

}