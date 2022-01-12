package com.changlu.O1Swing学习.基本组件使用.窗体;

import javax.swing.*;

/**
 * @ClassName JFrameTest
 * @Author ChangLu
 * @Date 2022/1/4 13:10
 * @Description JFrame使用
 */
public class JFrameTest {

    public static void main(String[] args) {
        final JFrame jf = new JFrame("title");
        //设置窗口位置、设置窗体大小
//        jf.setLocation(500,500);
//        jf.setSize(400,200);
        //直接设置两个属性
        jf.setBounds(500,500,800,600);

        jf.setVisible(true);
        //DISPOSE_ON_CLOSE：隐藏当前窗口，并释放当前窗体的资源
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}