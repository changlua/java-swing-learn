package com.changlu.O1Swing学习.事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName ActionListenerTest
 * @Author ChangLu
 * @Date 2022/1/4 14:54
 * @Description 监听事件测试：点击按钮添加文字信息
 */
public class ActionListenerTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,400,300);
        //设置流布局
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        //创建一个文本域和一个按钮
        final JTextArea textArea = new JTextArea(10,20);
        textArea.setLineWrap(true);//设置自动换行
        final JButton button1 = new JButton("发送");
        //添加添加点击事件
        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText() + "hello,changlu!");
            }
        });
        jf.add(textArea);
        jf.add(button1);
        jf.setVisible(true);
    }

}