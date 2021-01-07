package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class GUI implements ActionListener {

    /* Define Buttons */
    JButton afterHours = new JButton("After Hours");
    JButton myDearMelancholy = new JButton("My Dear Melancholy,");
    JButton starboy = new JButton("Starboy");
    JButton beautyBehindTheMadness = new JButton("Beauty Behind the Madness");
    JButton kissLand = new JButton("Kiss Land");
    JButton trilogy = new JButton("Trilogy");


    public GUI(){

        ImageIcon image = new ImageIcon("logo.png"); //create picture of oxcy

        JLabel label = new JLabel();
        label.setText("                             Select an Album!");
        label.setIcon(image); //set image
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT); //set text left of picture
        label.setVerticalTextPosition(JLabel.TOP); //set text on top
        label.setForeground(Color.WHITE); //font is white
        label.setFont(new Font("Arial",Font.BOLD,20)); //font is arial size 20
        label.setIconTextGap(200); //push picture further to right

        /* Buttons */
        afterHours.setBounds(12,92,212,90);
        myDearMelancholy.setBounds(276,92,212,90);
        starboy.setBounds(12,244,212,90);
        beautyBehindTheMadness.setBounds(276,244,212,90);
        kissLand.setBounds(12,394,212,90);
        trilogy.setBounds(276,394,212,90);

        afterHours.addActionListener(this);


        /*
        // Set Basic Panel Attributes
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0x1fc9f));
        greenPanel.setBounds(135, 0, 192,30);
       */

        /* Set Basic Frame Attributes */
        JFrame frame = new JFrame();
        frame.setTitle("Oxcy's Lyric Retriever"); //frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit upon clicking 'x'
        frame.setResizable(false); //adjustable app size
        //this.setSize(1280,720); //default size is 720p
        frame.setVisible(true);
        frame.add(afterHours);
        frame.add(myDearMelancholy);
        frame.add(starboy);
        frame.add(beautyBehindTheMadness);
        frame.add(kissLand);
        frame.add(trilogy);
        //greenPanel.add(label);
        //frame.add(greenPanel);
        frame.add(label);
        frame.pack();



        /* App Logo */
        ImageIcon logo = new ImageIcon("logo.png"); //create logo
        frame.setIconImage(logo.getImage()); //set logo
        frame.getContentPane().setBackground(new Color(0x000000));


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==afterHours){
            //TODO call appropriate method
        }
        else if(e.getSource() == myDearMelancholy){
            //TODO call appropriate method
        }
        else if(e.getSource() == starboy){
            //TODO call appropriate method
        }
        else if(e.getSource() == beautyBehindTheMadness){
            //TODO call appropriate method
        }
        else if(e.getSource() == kissLand){
            //TODO call appropriate method
        }
        else if(e.getSource() == trilogy){
            //TODO call appropriate method
        }
        else
            System.out.println("Error: Invalid Button");

    }
}
