package com.company;
import javax.swing.*;
public class Main {
    public static final JButton jb0 = new JButton("0");
    public static final JButton jb1 = new JButton("1");
    public static final JButton jb2 = new JButton("2");
    public static final JButton jb3 = new JButton("3");
    public static final JButton jb4 = new JButton("4");
    public static final JButton jb5 = new JButton("5");
    public static final JButton jb6 = new JButton("6");
    public static final JButton jb7 = new JButton("7");
    public static final JButton jb8 = new JButton("8");
    public static final JButton jb9 = new JButton("9");

    public static void main(String[] args)
    {
        JFrame f=new JFrame("Button Example");
        f.setSize(400,800);
        f.setLayout(null);
        f.setVisible(true);

        jb0.setBounds(20,700,60,30);
        jb1.setBounds(20,700,60,30);
        jb2.setBounds(80,700,60,30);
        jb3.setBounds(140,700,60,30);
        jb4.setBounds(20,670,60,30);
        jb5.setBounds(80,670,60,30);
        jb6.setBounds(140,670,60,30);
        jb7.setBounds(20,640,60,30);
        jb8.setBounds(80,640,60,30);
        jb9.setBounds(140,640,60,30);


        f.add(jb1);  f.add(jb2); f.add(jb3); f.add(jb4);  f.add(jb5); f.add(jb6); f.add(jb7);  f.add(jb8); f.add(jb9);


    }
}
