package com.changlu.O1Swing学习.基本组件使用.下拉列表组件;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName JComboBox
 * @Author ChangLu
 * @Date 2022/1/4 13:51
 * @Description 下拉列表组件：JComboBox
 */
public class JComboBoxTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setLayout(new FlowLayout());//设置流布局
        jf.setBounds(200,200,300,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建多选组件：添加多个条目
        final JComboBox<String> jcb = new JComboBox<>();
        jcb.addItem("--请选择你的大学--");//添加下拉内容
        jcb.addItem("苏州市职业大学");
        jcb.addItem("清华大学");
        jcb.addItem("南京邮电大学");
        jf.add(jcb);
        jf.setVisible(true);
    }

}