package com.changlu.O1Swing学习.基本组件使用.文本组件.文本域组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JTextAreaTest
 * @Author ChangLu
 * @Date 2022/1/4 14:14
 * @Description 文本域组件：JTextArea
 */
public class JTextAreaTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //文本域组件
        final JTextArea textArea = new JTextArea(12,20);
        textArea.setLineWrap(true);//文本域自动换行
        jf.add(textArea);
        //获取文本域中的内容
//        textArea.getText();

        jf.setVisible(true);
    }

}