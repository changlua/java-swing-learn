package com.changlu.O1Swing学习.基本组件使用.菜单栏组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JMenuTest
 * @Author ChangLu
 * @Date 2022/1/4 13:54
 * @Description 菜单栏组件练习：菜单栏(JMenuBar)、一级菜单(JMenu)、二级菜单(JMenuItem)
 */
public class JMenuTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建菜单栏：JMenuBar
        final JMenuBar menuBar = new JMenuBar();
        //一级菜单：JMenu
        final JMenu menu = new JMenu("菜单一");
        final JMenu menu2 = new JMenu("菜单一");
        //二级菜单：JMenuItem
        menu.add(new JMenuItem("菜单一-1"));
        menu.add(new JMenuItem("菜单一-1"));
        menu.add(new JMenuItem("菜单一-1"));
        menu2.add(new JMenuItem("菜单二-1"));
        menu2.add(new JMenuItem("菜单二-2"));
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.setBounds(0,0,jf.getWidth(),20);

        jf.add(menuBar);
        jf.setVisible(true);
    }

}