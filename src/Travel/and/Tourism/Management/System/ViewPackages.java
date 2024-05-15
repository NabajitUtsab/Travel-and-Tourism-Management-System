package Travel.and.Tourism.Management.System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackages extends JFrame implements ActionListener {
    JLabel userNameLabel,selectPackageLabel,totalPersonLabel,idLabel,idNumberLabel,phoneLabel,totalPriceLabel;
    JLabel userNameText,selectPackageText,totalPersonText,idText,idNumberText,phoneText,totalPriceText;


    JButton backButton;

    String userName;

    ViewPackages(String userName){

        this.userName=userName;


        setBounds(250,80,890,450);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,870,400);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("View Package");
        heading.setBounds(60,0,300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(heading);



        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(30,50,150,25);
        userNameLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        userNameLabel.setForeground(Color.red);
        panel.add(userNameLabel);

        userNameText= new JLabel("");
        userNameText.setBounds(200,50,150,25);
        userNameText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(userNameText);

        selectPackageLabel= new JLabel("Package");
        selectPackageLabel.setBounds(30,90,150,25);
        selectPackageLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        selectPackageLabel.setForeground(Color.red);
        panel.add(selectPackageLabel);

        selectPackageText = new JLabel("");
        selectPackageText.setBounds(200,90,150,25);
        selectPackageText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(selectPackageText);

        totalPersonLabel= new JLabel("Total Person");
        totalPersonLabel.setBounds(30,130,150,25);
        totalPersonLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        totalPersonLabel.setForeground(Color.red);
        panel.add(totalPersonLabel);

        totalPersonText = new JLabel("");
        totalPersonText.setBounds(200,130,150,25);
        totalPersonText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(totalPersonText);

        idLabel= new JLabel("ID");
        idLabel.setBounds(30,170,150,25);
        idLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        idLabel.setForeground(Color.red);
        panel.add(idLabel);

        idText = new JLabel("");
        idText.setBounds(200,170,150,25);
        idText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idText);

        idNumberLabel= new JLabel("Gender");
        idNumberLabel.setBounds(30,210,150,25);
        idNumberLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        idNumberLabel.setForeground(Color.red);
        panel.add(idNumberLabel);

        idNumberText = new JLabel("");
        idNumberText.setBounds(200,210,150,25);
        idNumberText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idNumberText);

        phoneLabel= new JLabel("Phone");
        phoneLabel.setBounds(30,250,150,25);
        phoneLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        phoneLabel.setForeground(Color.red);
        panel.add(phoneLabel);

        phoneText = new JLabel("");
        phoneText.setBounds(200,250,150,25);
        phoneText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(phoneText);

        totalPriceLabel= new JLabel("Total Price");
        totalPriceLabel.setBounds(30,290,150,25);
        totalPriceLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        totalPriceLabel.setForeground(Color.red);
        panel.add(totalPriceLabel);

        totalPriceText = new JLabel("");
        totalPriceText.setBounds(200,290,150,25);
        totalPriceText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(totalPriceText);


        backButton = new JButton("BACK");
        backButton.setBounds(100,350,100,25);
        backButton.setFont(new Font("Tahoma",Font.BOLD,12));
        backButton.setBackground(new Color(24, 118, 212));
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(new LineBorder(new Color(24, 118, 212)));
        backButton.addActionListener(this);
        panel.add(backButton);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(370,0,500,400);
        panel.add(imageLabel);





        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewPackages("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
