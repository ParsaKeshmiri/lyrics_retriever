package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class GUI implements ActionListener {

    ImageIcon oxcy = new ImageIcon("logo.png"); //create picture of oxcy
    ImageIcon afterHoursImage = new ImageIcon("afterHours.png");
    ImageIcon myDearMelancholyImage = new ImageIcon("myDearMelancholy.jpg");
    ImageIcon starboyImage = new ImageIcon("starboy.png");
    ImageIcon beautyBehindTheMadnessImage = new ImageIcon("beautyBehindTheMadness.png");
    ImageIcon kissLandImage = new ImageIcon("kissLand.png");
    ImageIcon trilogyImage = new ImageIcon("trilogy.jpg");

    /* Define Buttons */
    JButton afterHours = new JButton("After Hours", afterHoursImage);
    JButton myDearMelancholy = new JButton("My Dear Melancholy", myDearMelancholyImage);
    JButton starboy = new JButton("Starboy", starboyImage);
    JButton beautyBehindTheMadness = new JButton("Beauty Behind the Madness", beautyBehindTheMadnessImage);
    JButton kissLand = new JButton("Kiss Land", kissLandImage);
    JButton trilogy = new JButton("Trilogy", trilogyImage);


    JLabel label = new JLabel();
    JFrame frame = new JFrame();

    public GUI(){



        label.setText("                             Select an Album!  ");
        label.setIcon(oxcy); //set image
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT); //set text left of picture
        label.setVerticalTextPosition(JLabel.TOP); //set text on top
        label.setForeground(Color.WHITE); //font is white
        label.setFont(new Font("Arial",Font.BOLD,20)); //font is arial size 20
        label.setIconTextGap(200); //push picture further to right


        /* Buttons */

        /* Bounds */
        afterHours.setBounds(12,92,212,90);
        myDearMelancholy.setBounds(276,92,212,90);
        starboy.setBounds(12,244,212,90);
        beautyBehindTheMadness.setBounds(276,244,212,90);
        kissLand.setBounds(12,394,212,90);
        trilogy.setBounds(276,394,212,90);

        /* Album Centering */
        afterHours.setHorizontalAlignment(SwingConstants.CENTER);
        myDearMelancholy.setHorizontalAlignment(SwingConstants.CENTER);
        starboy.setHorizontalAlignment(SwingConstants.CENTER);
        beautyBehindTheMadness.setHorizontalAlignment(SwingConstants.CENTER);
        kissLand.setHorizontalAlignment(SwingConstants.CENTER);
        trilogy.setHorizontalAlignment(SwingConstants.CENTER);

        /* Text Formatting */
        /*
        afterHours.setBackground(new Color(0x1fc9f));
        afterHours.setFont(new Font("Arial", Font.BOLD, 20));
        afterHours.setForeground(Color.WHITE);
        afterHours.setFocusable(false);


        myDearMelancholy.setBackground(new Color(0x1fc9f));
        myDearMelancholy.setFont(new Font("Arial", Font.BOLD, 15));
        myDearMelancholy.setForeground(Color.WHITE);
        myDearMelancholy.setFocusable(false);

        starboy.setBackground(new Color(0x1fc9f));
        starboy.setFont(new Font("Arial", Font.BOLD, 20));
        starboy.setForeground(Color.WHITE);
        starboy.setFocusable(false);

        beautyBehindTheMadness.setBackground(new Color(0x1fc9f));
        beautyBehindTheMadness.setFont(new Font("Arial", Font.BOLD, 15));
        beautyBehindTheMadness.setForeground(Color.WHITE);
        beautyBehindTheMadness.setFocusable(false);

        kissLand.setBackground(new Color(0x1fc9f));
        kissLand.setFont(new Font("Arial", Font.BOLD, 20));
        kissLand.setForeground(Color.WHITE);
        kissLand.setFocusable(false);

        trilogy.setBackground(new Color(0x1fc9f));
        trilogy.setFont(new Font("Arial", Font.BOLD, 20));
        trilogy.setForeground(Color.WHITE);
        trilogy.setFocusable(false);
         */

        /* Initialise Action Listener */
        afterHours.addActionListener(this);
        myDearMelancholy.addActionListener(this);
        starboy.addActionListener(this);
        beautyBehindTheMadness.addActionListener(this);
        kissLand.addActionListener(this);
        trilogy.addActionListener(this);


        /*
        // Set Basic Panel Attributes
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0x1fc9f));
        greenPanel.setBounds(135, 0, 192,30);
       */

        /* Set Basic Frame Attributes */
        frame.setTitle("Oxcy's Lyric Retriever"); //frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit upon clicking 'x'
        frame.setResizable(false); //adjustable app size
        //frame.setSize(1200,600);
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
            songList("afterHours");
        }
        else if(e.getSource() == myDearMelancholy){
            songList("myDearMelancholy");
        }
        else if(e.getSource() == starboy){
            songList("starboy");
        }
        else if(e.getSource() == beautyBehindTheMadness){
            songList("beautyBehindTheMadness");
        }
        else if(e.getSource() == kissLand){
            songList("kissLand");
        }
        else if(e.getSource() == trilogy){
            songList("trilogy");
        }
        else
            System.out.println("Error: Invalid Button");

    }

    public void songList(String album){
        //TODO Implement what happens after button pressed
        label.setText("                          Now Choose a Song");
        frame.remove(label);
        frame.setVisible(false);
        frame.remove(afterHours);
        frame.remove(myDearMelancholy);
        frame.remove(starboy);
        frame.remove(beautyBehindTheMadness);
        frame.remove(kissLand);
        frame.remove(trilogy);

        /* New Frame */

        JFrame frame1 = new JFrame();
        frame1.setTitle("Oxcy's Lyric Retriever");
        frame1.getContentPane().setBackground(Color.BLACK);
        frame1.setSize(1200,600);
        //frame1.setBackground(Color.BLACK);
        frame1.setVisible(true);
        //frame1.getContentPane().setBackground(Color.BLACK);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("logo.png"); //create logo
        frame1.setIconImage(logo.getImage()); //set logo



        if (album == "afterHours"){


            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridLayout(7,2,20,10));


            JButton t1 = (new JButton("Alone Again"));
            t1.setBackground(new Color(0x1fc9f));
            t1.setFont(new Font("Arial", Font.BOLD, 20));
            t1.setForeground(Color.WHITE);
            t1.setFocusable(false);
            t1.setVisible(true);

            JButton t2 = (new JButton("Too Late"));
            t2.setBackground(new Color(0x1fc9f));
            t2.setFont(new Font("Arial", Font.BOLD, 20));
            t2.setForeground(Color.WHITE);
            t2.setFocusable(false);
            t2.setVisible(true);

            JButton t3 = (new JButton("Hardest to Love"));
            t3.setBackground(new Color(0x1fc9f));
            t3.setFont(new Font("Arial", Font.BOLD, 20));
            t3.setForeground(Color.WHITE);
            t3.setFocusable(false);
            t3.setVisible(true);

            JButton t4 = (new JButton("Scared to Live"));
            t4.setBackground(new Color(0x1fc9f));
            t4.setFont(new Font("Arial", Font.BOLD, 20));
            t4.setForeground(Color.WHITE);
            t4.setFocusable(false);
            t4.setVisible(true);

            JButton t5 = (new JButton("Snowchild"));
            t5.setBackground(new Color(0x1fc9f));
            t5.setFont(new Font("Arial", Font.BOLD, 20));
            t5.setForeground(Color.WHITE);
            t5.setFocusable(false);
            t5.setVisible(true);

            JButton t6 = (new JButton("Escape From LA"));
            t6.setBackground(new Color(0x1fc9f));
            t6.setFont(new Font("Arial", Font.BOLD, 20));
            t6.setForeground(Color.WHITE);
            t6.setFocusable(false);
            t6.setVisible(true);

            JButton t7 = (new JButton("Heartless"));
            t7.setBackground(new Color(0x1fc9f));
            t7.setFont(new Font("Arial", Font.BOLD, 20));
            t7.setForeground(Color.WHITE);
            t7.setFocusable(false);
            t7.setVisible(true);

            JButton t8 = (new JButton("Faith"));
            t8.setBackground(new Color(0x1fc9f));
            t8.setFont(new Font("Arial", Font.BOLD, 20));
            t8.setForeground(Color.WHITE);
            t8.setFocusable(false);
            t8.setVisible(true);

            JButton t9 = (new JButton("Blinding Lights"));
            t9.setBackground(new Color(0x1fc9f));
            t9.setFont(new Font("Arial", Font.BOLD, 20));
            t9.setForeground(Color.WHITE);
            t9.setFocusable(false);
            t9.setVisible(true);

            JButton t10 = (new JButton("In Your Eyes"));
            t10.setBackground(new Color(0x1fc9f));
            t10.setFont(new Font("Arial", Font.BOLD, 20));
            t10.setForeground(Color.WHITE);
            t10.setFocusable(false);
            t10.setVisible(true);

            JButton t11 = (new JButton("Save Your Tears"));
            t11.setBackground(new Color(0x1fc9f));
            t11.setFont(new Font("Arial", Font.BOLD, 20));
            t11.setForeground(Color.WHITE);
            t11.setFocusable(false);
            t11.setVisible(true);

            JButton t12 = (new JButton("Repeat After Me"));
            t12.setBackground(new Color(0x1fc9f));
            t12.setFont(new Font("Arial", Font.BOLD, 20));
            t12.setForeground(Color.WHITE);
            t12.setFocusable(false);
            t12.setVisible(true);

            JButton t13 = (new JButton("After Hours"));
            t13.setBackground(new Color(0x1fc9f));
            t13.setFont(new Font("Arial", Font.BOLD, 20));
            t13.setForeground(Color.WHITE);
            t13.setFocusable(false);
            t13.setVisible(true);

            JButton t14 = (new JButton("Until I Bleed Out"));
            t14.setBackground(new Color(0x1fc9f));
            t14.setFont(new Font("Arial", Font.BOLD, 20));
            t14.setForeground(Color.WHITE);
            t14.setFocusable(false);
            t14.setVisible(true);

            panel1.add(t1);
            panel1.add(t2);
            panel1.add(t3);
            panel1.add(t4);
            panel1.add(t5);
            panel1.add(t6);
            panel1.add(t7);
            panel1.add(t8);
            panel1.add(t9);
            panel1.add(t10);
            panel1.add(t11);
            panel1.add(t12);
            panel1.add(t13);
            panel1.add(t14);
            frame1.add(panel1);

            panel1.setBackground(Color.BLACK);

        }
        else if (album == "myDearMelancholy"){
            JPanel panel2 = new JPanel();
            panel2.setLayout(new GridLayout(3,2,20,10));


            JButton t15 = (new JButton("Call Out My Name"));
            t15.setBackground(new Color(0x1fc9f));
            t15.setFont(new Font("Arial", Font.BOLD, 20));
            t15.setForeground(Color.WHITE);
            t15.setFocusable(false);
            t15.setVisible(true);

            JButton t16 = (new JButton("Try Me"));
            t16.setBackground(new Color(0x1fc9f));
            t16.setFont(new Font("Arial", Font.BOLD, 20));
            t16.setForeground(Color.WHITE);
            t16.setFocusable(false);
            t16.setVisible(true);

            JButton t17 = (new JButton("Wasted Times"));
            t17.setBackground(new Color(0x1fc9f));
            t17.setFont(new Font("Arial", Font.BOLD, 20));
            t17.setForeground(Color.WHITE);
            t17.setFocusable(false);
            t17.setVisible(true);

            JButton t18 = (new JButton("I Was Never There"));
            t18.setBackground(new Color(0x1fc9f));
            t18.setFont(new Font("Arial", Font.BOLD, 20));
            t18.setForeground(Color.WHITE);
            t18.setFocusable(false);
            t18.setVisible(true);

            JButton t19 = (new JButton("Hurt You"));
            t19.setBackground(new Color(0x1fc9f));
            t19.setFont(new Font("Arial", Font.BOLD, 20));
            t19.setForeground(Color.WHITE);
            t19.setFocusable(false);
            t19.setVisible(true);

            JButton t20 = (new JButton("Privilege"));
            t20.setBackground(new Color(0x1fc9f));
            t20.setFont(new Font("Arial", Font.BOLD, 20));
            t20.setForeground(Color.WHITE);
            t20.setFocusable(false);
            t20.setVisible(true);

            panel2.add(t15);
            panel2.add(t16);
            panel2.add(t17);
            panel2.add(t18);
            panel2.add(t19);
            panel2.add(t20);
            frame1.add(panel2);
            frame1.setSize(700,400);

            panel2.setBackground(Color.BLACK);
        }
        else if (album == "starboy"){

        }
        else if (album == "beautyBehindTheMadness"){

        }
        else if (album == "kissLand"){

        }
        else if (album == "trilogy"){

        }
        else
            System.out.println("Error: Invalid Album");

    }

}
