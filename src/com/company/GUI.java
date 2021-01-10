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

    public GUI() {

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

            JPanel panel3 = new JPanel();
            panel3.setLayout(new GridLayout(6,3,20,10));


            JButton t21 = (new JButton("Starboy"));
            t21.setBackground(new Color(0x1fc9f));
            t21.setFont(new Font("Arial", Font.BOLD, 20));
            t21.setForeground(Color.WHITE);
            t21.setFocusable(false);
            t21.setVisible(true);

            JButton t22 = (new JButton("Party Monster"));
            t22.setBackground(new Color(0x1fc9f));
            t22.setFont(new Font("Arial", Font.BOLD, 20));
            t22.setForeground(Color.WHITE);
            t22.setFocusable(false);
            t22.setVisible(true);

            JButton t23 = (new JButton("False Alarm"));
            t23.setBackground(new Color(0x1fc9f));
            t23.setFont(new Font("Arial", Font.BOLD, 20));
            t23.setForeground(Color.WHITE);
            t23.setFocusable(false);
            t23.setVisible(true);

            JButton t24 = (new JButton("Reminder"));
            t24.setBackground(new Color(0x1fc9f));
            t24.setFont(new Font("Arial", Font.BOLD, 20));
            t24.setForeground(Color.WHITE);
            t24.setFocusable(false);
            t24.setVisible(true);

            JButton t25 = (new JButton("Rockin'"));
            t25.setBackground(new Color(0x1fc9f));
            t25.setFont(new Font("Arial", Font.BOLD, 20));
            t25.setForeground(Color.WHITE);
            t25.setFocusable(false);
            t25.setVisible(true);

            JButton t26 = (new JButton("Secrets"));
            t26.setBackground(new Color(0x1fc9f));
            t26.setFont(new Font("Arial", Font.BOLD, 20));
            t26.setForeground(Color.WHITE);
            t26.setFocusable(false);
            t26.setVisible(true);

            JButton t27 = (new JButton("True Colors"));
            t27.setBackground(new Color(0x1fc9f));
            t27.setFont(new Font("Arial", Font.BOLD, 20));
            t27.setForeground(Color.WHITE);
            t27.setFocusable(false);
            t27.setVisible(true);

            JButton t28 = (new JButton("Stargirl Interlude"));
            t28.setBackground(new Color(0x1fc9f));
            t28.setFont(new Font("Arial", Font.BOLD, 20));
            t28.setForeground(Color.WHITE);
            t28.setFocusable(false);
            t28.setVisible(true);

            JButton t29 = (new JButton("Sidewalks"));
            t29.setBackground(new Color(0x1fc9f));
            t29.setFont(new Font("Arial", Font.BOLD, 20));
            t29.setForeground(Color.WHITE);
            t29.setFocusable(false);
            t29.setVisible(true);

            JButton t30 = (new JButton("Six Feet Under"));
            t30.setBackground(new Color(0x1fc9f));
            t30.setFont(new Font("Arial", Font.BOLD, 20));
            t30.setForeground(Color.WHITE);
            t30.setFocusable(false);
            t30.setVisible(true);

            JButton t31 = (new JButton("Love To Lay"));
            t31.setBackground(new Color(0x1fc9f));
            t31.setFont(new Font("Arial", Font.BOLD, 20));
            t31.setForeground(Color.WHITE);
            t31.setFocusable(false);
            t31.setVisible(true);

            JButton t32 = (new JButton("A Lonely Night"));
            t32.setBackground(new Color(0x1fc9f));
            t32.setFont(new Font("Arial", Font.BOLD, 20));
            t32.setForeground(Color.WHITE);
            t32.setFocusable(false);
            t32.setVisible(true);

            JButton t33 = (new JButton("Attention"));
            t33.setBackground(new Color(0x1fc9f));
            t33.setFont(new Font("Arial", Font.BOLD, 20));
            t33.setForeground(Color.WHITE);
            t33.setFocusable(false);
            t33.setVisible(true);

            JButton t34 = (new JButton("Ordinary Life"));
            t34.setBackground(new Color(0x1fc9f));
            t34.setFont(new Font("Arial", Font.BOLD, 20));
            t34.setForeground(Color.WHITE);
            t34.setFocusable(false);
            t34.setVisible(true);

            JButton t35 = (new JButton("Nothing Without You"));
            t35.setBackground(new Color(0x1fc9f));
            t35.setFont(new Font("Arial", Font.BOLD, 20));
            t35.setForeground(Color.WHITE);
            t35.setFocusable(false);
            t35.setVisible(true);

            JButton t36 = (new JButton("All I Know"));
            t36.setBackground(new Color(0x1fc9f));
            t36.setFont(new Font("Arial", Font.BOLD, 20));
            t36.setForeground(Color.WHITE);
            t36.setFocusable(false);
            t36.setVisible(true);

            JButton t37 = (new JButton("Die For You"));
            t37.setBackground(new Color(0x1fc9f));
            t37.setFont(new Font("Arial", Font.BOLD, 20));
            t37.setForeground(Color.WHITE);
            t37.setFocusable(false);
            t37.setVisible(true);

            JButton t38 = (new JButton("I Feel It Coming"));
            t38.setBackground(new Color(0x1fc9f));
            t38.setFont(new Font("Arial", Font.BOLD, 20));
            t38.setForeground(Color.WHITE);
            t38.setFocusable(false);
            t38.setVisible(true);

            panel3.add(t21);
            panel3.add(t22);
            panel3.add(t23);
            panel3.add(t24);
            panel3.add(t25);
            panel3.add(t26);
            panel3.add(t27);
            panel3.add(t28);
            panel3.add(t29);
            panel3.add(t30);
            panel3.add(t31);
            panel3.add(t32);
            panel3.add(t33);
            panel3.add(t34);
            panel3.add(t35);
            panel3.add(t36);
            panel3.add(t37);
            panel3.add(t38);
            frame1.add(panel3);

            panel3.setBackground(Color.BLACK);

        }


        else if (album == "beautyBehindTheMadness"){

            JPanel panel4 = new JPanel();
            panel4.setLayout(new GridLayout(7,2,20,10));


            JButton t39 = (new JButton("Real Life"));
            t39.setBackground(new Color(0x1fc9f));
            t39.setFont(new Font("Arial", Font.BOLD, 20));
            t39.setForeground(Color.WHITE);
            t39.setFocusable(false);
            t39.setVisible(true);

            JButton t40 = (new JButton("Losers"));
            t40.setBackground(new Color(0x1fc9f));
            t40.setFont(new Font("Arial", Font.BOLD, 20));
            t40.setForeground(Color.WHITE);
            t40.setFocusable(false);
            t40.setVisible(true);

            JButton t41 = (new JButton("Tell Your Friends"));
            t41.setBackground(new Color(0x1fc9f));
            t41.setFont(new Font("Arial", Font.BOLD, 20));
            t41.setForeground(Color.WHITE);
            t41.setFocusable(false);
            t41.setVisible(true);

            JButton t42 = (new JButton("Often"));
            t42.setBackground(new Color(0x1fc9f));
            t42.setFont(new Font("Arial", Font.BOLD, 20));
            t42.setForeground(Color.WHITE);
            t42.setFocusable(false);
            t42.setVisible(true);

            JButton t43 = (new JButton("The Hills"));
            t43.setBackground(new Color(0x1fc9f));
            t43.setFont(new Font("Arial", Font.BOLD, 20));
            t43.setForeground(Color.WHITE);
            t43.setFocusable(false);
            t43.setVisible(true);

            JButton t44 = (new JButton("Acquainted"));
            t44.setBackground(new Color(0x1fc9f));
            t44.setFont(new Font("Arial", Font.BOLD, 20));
            t44.setForeground(Color.WHITE);
            t44.setFocusable(false);
            t44.setVisible(true);

            JButton t45 = (new JButton("Can't Feel My Face"));
            t45.setBackground(new Color(0x1fc9f));
            t45.setFont(new Font("Arial", Font.BOLD, 20));
            t45.setForeground(Color.WHITE);
            t45.setFocusable(false);
            t45.setVisible(true);

            JButton t46 = (new JButton("Shameless"));
            t46.setBackground(new Color(0x1fc9f));
            t46.setFont(new Font("Arial", Font.BOLD, 20));
            t46.setForeground(Color.WHITE);
            t46.setFocusable(false);
            t46.setVisible(true);

            JButton t47 = (new JButton("Earned It"));
            t47.setBackground(new Color(0x1fc9f));
            t47.setFont(new Font("Arial", Font.BOLD, 20));
            t47.setForeground(Color.WHITE);
            t47.setFocusable(false);
            t47.setVisible(true);

            JButton t48 = (new JButton("In The Night"));
            t48.setBackground(new Color(0x1fc9f));
            t48.setFont(new Font("Arial", Font.BOLD, 20));
            t48.setForeground(Color.WHITE);
            t48.setFocusable(false);
            t48.setVisible(true);

            JButton t49 = (new JButton("As You Are"));
            t49.setBackground(new Color(0x1fc9f));
            t49.setFont(new Font("Arial", Font.BOLD, 20));
            t49.setForeground(Color.WHITE);
            t49.setFocusable(false);
            t49.setVisible(true);

            JButton t50 = (new JButton("Dark Times"));
            t50.setBackground(new Color(0x1fc9f));
            t50.setFont(new Font("Arial", Font.BOLD, 20));
            t50.setForeground(Color.WHITE);
            t50.setFocusable(false);
            t50.setVisible(true);

            JButton t51 = (new JButton("Prisoner"));
            t51.setBackground(new Color(0x1fc9f));
            t51.setFont(new Font("Arial", Font.BOLD, 20));
            t51.setForeground(Color.WHITE);
            t51.setFocusable(false);
            t51.setVisible(true);

            JButton t52 = (new JButton("Angel"));
            t52.setBackground(new Color(0x1fc9f));
            t52.setFont(new Font("Arial", Font.BOLD, 20));
            t52.setForeground(Color.WHITE);
            t52.setFocusable(false);
            t52.setVisible(true);

            panel4.add(t39);
            panel4.add(t40);
            panel4.add(t41);
            panel4.add(t42);
            panel4.add(t43);
            panel4.add(t44);
            panel4.add(t45);
            panel4.add(t46);
            panel4.add(t47);
            panel4.add(t48);
            panel4.add(t49);
            panel4.add(t50);
            panel4.add(t51);
            panel4.add(t52);
            frame1.add(panel4);

            panel4.setBackground(Color.BLACK);

        }


        else if (album == "kissLand"){

            JPanel panel5 = new JPanel();
            panel5.setLayout(new GridLayout(5,2,20,10));


            JButton t53 = (new JButton("Professional"));
            t53.setBackground(new Color(0x1fc9f));
            t53.setFont(new Font("Arial", Font.BOLD, 20));
            t53.setForeground(Color.WHITE);
            t53.setFocusable(false);
            t53.setVisible(true);

            JButton t54 = (new JButton("The Town"));
            t54.setBackground(new Color(0x1fc9f));
            t54.setFont(new Font("Arial", Font.BOLD, 20));
            t54.setForeground(Color.WHITE);
            t54.setFocusable(false);
            t54.setVisible(true);

            JButton t55 = (new JButton("Adaptation"));
            t55.setBackground(new Color(0x1fc9f));
            t55.setFont(new Font("Arial", Font.BOLD, 20));
            t55.setForeground(Color.WHITE);
            t55.setFocusable(false);
            t55.setVisible(true);

            JButton t56 = (new JButton("Love In The Sky"));
            t56.setBackground(new Color(0x1fc9f));
            t56.setFont(new Font("Arial", Font.BOLD, 20));
            t56.setForeground(Color.WHITE);
            t56.setFocusable(false);
            t56.setVisible(true);

            JButton t57 = (new JButton("Belong To The World"));
            t57.setBackground(new Color(0x1fc9f));
            t57.setFont(new Font("Arial", Font.BOLD, 20));
            t57.setForeground(Color.WHITE);
            t57.setFocusable(false);
            t57.setVisible(true);

            JButton t58 = (new JButton("Live For"));
            t58.setBackground(new Color(0x1fc9f));
            t58.setFont(new Font("Arial", Font.BOLD, 20));
            t58.setForeground(Color.WHITE);
            t58.setFocusable(false);
            t58.setVisible(true);

            JButton t59 = (new JButton("Wanderlust"));
            t59.setBackground(new Color(0x1fc9f));
            t59.setFont(new Font("Arial", Font.BOLD, 20));
            t59.setForeground(Color.WHITE);
            t59.setFocusable(false);
            t59.setVisible(true);

            JButton t60 = (new JButton("Kiss Land"));
            t60.setBackground(new Color(0x1fc9f));
            t60.setFont(new Font("Arial", Font.BOLD, 20));
            t60.setForeground(Color.WHITE);
            t60.setFocusable(false);
            t60.setVisible(true);

            JButton t61 = (new JButton("Pretty"));
            t61.setBackground(new Color(0x1fc9f));
            t61.setFont(new Font("Arial", Font.BOLD, 20));
            t61.setForeground(Color.WHITE);
            t61.setFocusable(false);
            t61.setVisible(true);

            JButton t62 = (new JButton("Tears In The Rain"));
            t62.setBackground(new Color(0x1fc9f));
            t62.setFont(new Font("Arial", Font.BOLD, 20));
            t62.setForeground(Color.WHITE);
            t62.setFocusable(false);
            t62.setVisible(true);

            panel5.add(t53);
            panel5.add(t54);
            panel5.add(t55);
            panel5.add(t56);
            panel5.add(t57);
            panel5.add(t58);
            panel5.add(t59);
            panel5.add(t60);
            panel5.add(t61);
            panel5.add(t62);
            frame1.add(panel5);

            panel5.setBackground(Color.BLACK);

        }


        else if (album == "trilogy"){
            JLabel label6 = new JLabel("Under Construction!");
            label6.setHorizontalAlignment(JLabel.CENTER);
            label6.setFont(new Font("Arial", Font.BOLD, 20));
            label6.setForeground(Color.WHITE);
            frame1.add(label6);
        }
        else
            System.out.println("Error: Invalid Album");

    }

}
