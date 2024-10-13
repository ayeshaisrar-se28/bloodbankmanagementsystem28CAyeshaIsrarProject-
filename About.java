package bloodbanksystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Back");
        add(b1);
        b1.setBounds(260, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

         s =    " Welcome to our Blood Bank System,\n  "
                + "\na compassionate platform designed to bridge the gap between donors and recipients in  "
                + "times of critical need. Our system is dedicated to saving lives by  "
                + "facilitating the seamless exchange of life-saving blood units. With "
                + "the ability to add new donors, request specific blood types, and  "
                + "view a comprehensive list of generous donors. \n\n"
                + "Our meticulously curated blood rate list ensures transparency and "
                + "fairness, while bills are generated effortlessly when recipients purchase blood. \n\n"
                + "The real-time stock updates capture the heart of "
                + "our mission, reflecting the impact of every selfless donation made by our dedicated donors. \n"
                
                + "TOOLS AND TECHNOLOGIES USED:\n"
                + "\nTechnology :-  Java"
                + "\nDatabase  :- Mysql"
                + "\nConcepts :- OOP core concepts including abstraction, Java Swing, JOptionPane etc."; 
        
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 625, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        Color darkRed = new Color(139, 0, 0);
        contentPane.setBackground(darkRed);
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(260, 10, 180, 80);

        l1.setForeground(new Color(255,255,255));

        Font f2 = new Font("RALEWAY", Font.BOLD, 25);
        l1.setFont(f2);

        setBounds(400, 100, 700, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        mainp su = new mainp();
	su.setVisible(true);
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
