package com.changlu.O1Swing学习.基本组件使用.标签组件;

import javax.swing.*;

/**
 * @ClassName JLabelTest
 * @Author ChangLu
 * @Date 2022/1/4 13:32
 * @Description 文本标签
 */
public class JLabelTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(200,200,300,150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //添加标签
        final JLabel jl = new JLabel("账号");
        jf.add(jl);
    }

}