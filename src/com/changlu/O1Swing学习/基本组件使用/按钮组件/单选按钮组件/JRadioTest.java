package com.changlu.O1Swing学习.基本组件使用.按钮组件.单选按钮组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ButtonGroupTest
 * @Author ChangLu
 * @Date 2022/1/4 13:42
 * @Description 单选按钮组使用：搭配ButtonGroup
 */
public class JRadioTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout());//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建两个单选按钮并添加一个一个按钮组中（起到绑定效果，两个只能选择一个）
        final JRadioButton jrb1 = new JRadioButton("男",true);//默认设置选中
        final JRadioButton jrb2 = new JRadioButton("女",false);
        final ButtonGroup group = new ButtonGroup();
        group.add(jrb1);
        group.add(jrb2);
        //注意：依旧是将两个按钮添加到jframe中，而不是添加按钮组（若是只添加按钮组无效）
        jf.add(jrb1);
        jf.add(jrb2);

        jf.setVisible(true);
    }

}