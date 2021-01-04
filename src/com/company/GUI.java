package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class GUI {

    GUI(){

        ImageIcon image = new ImageIcon("logo.png"); //create picture of oxcy

        JLabel label = new JLabel();
        label.setText("This ain't nothing to relate to");
        label.setIcon(image); //set image
        label.setHorizontalTextPosition(JLabel.LEFT); //set text left of picture
        label.setVerticalTextPosition(JLabel.TOP); //set text on top
        label.setForeground(Color.WHITE); //font is white
        label.setFont(new Font("Arial",Font.PLAIN,20)); //font is arial size 20
        label.setIconTextGap(400); //push picture further to right

        /* Set Basic Frame Attributes */
        JFrame frame = new JFrame();
        frame.setTitle("Oxcy's Lyric Retriever"); //frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit upon clicking 'x'
        frame.setResizable(false); //adjustable app size
        //this.setSize(1280,720); //default size is 720p
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

        /* App Logo */
        ImageIcon logo = new ImageIcon("logo.png"); //create logo
        frame.setIconImage(logo.getImage()); //set logo
        frame.getContentPane().setBackground(new Color(0x000000));


    }

}
