package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Frame extends JFrame {

    Frame(){

        ImageIcon image = new ImageIcon("logo.png"); //create picture of oxcy

        JLabel label = new JLabel();
        label.setText("This ain't nothing to relate to");
        label.setIcon(image); //set image

        /* Set Basic Frame Attributes */
        this.setTitle("Lyric Retriever"); //frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit upon clicking 'x'
        this.setResizable(false); //adjustable app size
        this.setSize(1280,720); //default size is 720p
        this.setVisible(true);
        this.add(label);

        /* App Logo */
        ImageIcon logo = new ImageIcon("logo.png"); //create logo
        this.setIconImage(logo.getImage()); //set logo
        this.getContentPane().setBackground(new Color(0x000000));


    }

}
