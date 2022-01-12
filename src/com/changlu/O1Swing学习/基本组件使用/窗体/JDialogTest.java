package com.changlu.O1Swing学习.基本组件使用.窗体;

import javax.swing.*;

/**
 * @ClassName JDialogTest
 * @Author ChangLu
 * @Date 2022/1/4 13:16
 * @Description TODO
 */
public class JDialogTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        jf.setBounds(500,500,800,600);
        //DISPOSE_ON_CLOSE：隐藏当前窗口，并释放窗口占有的资源
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        final JDialog jdialog = new JDialog(jf, "jdialog");
        jdialog.setBounds(200,200,400,300);
        jdialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jdialog.setVisible(true);
    }

}