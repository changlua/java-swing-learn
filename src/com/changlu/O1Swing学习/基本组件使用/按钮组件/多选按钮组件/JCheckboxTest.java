package com.changlu.O1Swing学习.基本组件使用.按钮组件.多选按钮组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JCheckboxTest
 * @Author ChangLu
 * @Date 2022/1/4 13:48
 * @Description 多选组件JCheckbox：可直接添加到JFrame，不需要添加到按钮组
 */
public class JCheckboxTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout());//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建多选组件
        final JCheckBox jcb1 = new JCheckBox("吃饭", true);
        final JCheckBox jcb2 = new JCheckBox("睡觉", false);
        final JCheckBox jcb3 = new JCheckBox("打豆豆", true);

        jf.add(jcb1);
        jf.add(jcb2);
        jf.add(jcb3);
        jf.setVisible(true);
    }

}