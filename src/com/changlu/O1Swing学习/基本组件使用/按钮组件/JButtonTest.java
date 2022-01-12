package com.changlu.O1Swing学习.基本组件使用.按钮组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JButtonTest
 * @Author ChangLu
 * @Date 2022/1/4 13:36
 * @Description TODO
 */
public class JButtonTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout());//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //添加按钮
        final JButton jb = new JButton("按钮1");
        //设置图标
        jb.setIcon(new ImageIcon("C:\\Users\\93997\\Desktop\\swing\\exception期末项目\\sgproj_exception\\src\\image\\用户名.png"));
        jb.setEnabled(true);//设置可用
        jb.setBorderPainted(false);//按钮是否有边框，默认有边框为true
        jf.add(jb);

        jf.setVisible(true);
    }

}