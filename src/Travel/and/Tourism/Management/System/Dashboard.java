package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    JButton addPersonalDetailsButton,updatePersonalDetailsButton,viewPersonalDetailsButton,deletePersonalDetailsButton;
    JButton checkPackagesButton,bookPackagesButton,viewPackagesButton;
    JButton viewHotelsButton,bookHotelsButton,viewBookHotelsButton;
    JButton destinationsButton,paymentsButton,calculatorButton,notepadButton,aboutButton;
    Dashboard(){
        super("Dashboard");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,1600,65);
        panel1.setBackground(new Color(0,0,102));
        add(panel1);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image image = icon.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon imageIcon= new ImageIcon(image);
        JLabel imageLabel= new JLabel(imageIcon);
        imageLabel.setBounds(5,0,70,70);
        panel1.add(imageLabel);

        JLabel heading = new JLabel("DASHBOARD");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        panel1.add(heading);


        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,65,300,900);
        panel2.setBackground(new Color(0,0,102));
        add(panel2);

        addPersonalDetailsButton = new JButton("Add Personal Details");
        addPersonalDetailsButton.setBounds(0,0,300,30);
        addPersonalDetailsButton.setBackground(new Color(0,0,102));
        addPersonalDetailsButton.setForeground(Color.WHITE);
        addPersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        addPersonalDetailsButton.setMargin(new Insets(0,0,0,65));
        panel2.add(addPersonalDetailsButton);

        updatePersonalDetailsButton = new JButton("Update Personal Details");
        updatePersonalDetailsButton.setBounds(0,50,300,30);
        updatePersonalDetailsButton.setBackground(new Color(0,0,102));
        updatePersonalDetailsButton.setForeground(Color.WHITE);
        updatePersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        updatePersonalDetailsButton.setMargin(new Insets(0,0,0,36));
        panel2.add(updatePersonalDetailsButton);

        viewPersonalDetailsButton = new JButton("View Personal Details");
        viewPersonalDetailsButton.setBounds(0,100,300,30);
        viewPersonalDetailsButton.setBackground(new Color(0,0,102));
        viewPersonalDetailsButton.setForeground(Color.WHITE);
        viewPersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewPersonalDetailsButton.setMargin(new Insets(0,0,0,55));
        panel2.add(viewPersonalDetailsButton);

        deletePersonalDetailsButton = new JButton("Delete Personal Details");
        deletePersonalDetailsButton.setBounds(0,150,300,30);
        deletePersonalDetailsButton.setBackground(new Color(0,0,102));
        deletePersonalDetailsButton.setForeground(Color.WHITE);
        deletePersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        deletePersonalDetailsButton.setMargin(new Insets(0,0,0,36));
        panel2.add(deletePersonalDetailsButton);



        viewHotelsButton = new JButton("View Hotels");
        viewHotelsButton.setBounds(0,200,300,30);
        viewHotelsButton.setBackground(new Color(0,0,102));
        viewHotelsButton.setForeground(Color.WHITE);
        viewHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewHotelsButton.setMargin(new Insets(0,0,0,135));
        panel2.add(viewHotelsButton);

        bookHotelsButton = new JButton("Book Hotels");
        bookHotelsButton.setBounds(0,250,300,30);
        bookHotelsButton.setBackground(new Color(0,0,102));
        bookHotelsButton.setForeground(Color.WHITE);
        bookHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        bookHotelsButton.setMargin(new Insets(0,0,0,135));
        panel2.add(bookHotelsButton);

        viewBookHotelsButton = new JButton("View Booked Hotels");
        viewBookHotelsButton.setBounds(0,300,300,30);
        viewBookHotelsButton.setBackground(new Color(0,0,102));
        viewBookHotelsButton.setForeground(Color.WHITE);
        viewBookHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewBookHotelsButton.setMargin(new Insets(0,0,0,65));
        panel2.add(viewBookHotelsButton);



        destinationsButton = new JButton("Destinations");
        destinationsButton.setBounds(0,350,300,30);
        destinationsButton.setBackground(new Color(0,0,102));
        destinationsButton.setForeground(Color.WHITE);
        destinationsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        destinationsButton.setMargin(new Insets(0,0,0,135));
        panel2.add(destinationsButton);

        paymentsButton = new JButton("Payments");
        paymentsButton.setBounds(0,400,300,30);
        paymentsButton.setBackground(new Color(0,0,102));
        paymentsButton.setForeground(Color.WHITE);
        paymentsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        paymentsButton.setMargin(new Insets(0,0,0,155));
        panel2.add(paymentsButton);

        calculatorButton = new JButton("Calculator");
        calculatorButton.setBounds(0,450,300,30);
        calculatorButton.setBackground(new Color(0,0,102));
        calculatorButton.setForeground(Color.WHITE);
        calculatorButton.setFont(new Font("Tahoma",Font.BOLD,18));
        calculatorButton.setMargin(new Insets(0,0,0,155));
        panel2.add(calculatorButton);

        notepadButton = new JButton("Notepad");
        notepadButton.setBounds(0,500,300,30);
        notepadButton.setBackground(new Color(0,0,102));
        notepadButton.setForeground(Color.WHITE);
        notepadButton.setFont(new Font("Tahoma",Font.BOLD,18));
        notepadButton.setMargin(new Insets(0,0,0,170));
        panel2.add(notepadButton);

        aboutButton = new JButton("About");
        aboutButton.setBounds(0,550,300,30);
        aboutButton.setBackground(new Color(0,0,102));
        aboutButton.setForeground(Color.WHITE);
        aboutButton.setFont(new Font("Tahoma",Font.BOLD,18));
        aboutButton.setMargin(new Insets(0,0,0,195));
        panel2.add(aboutButton);


        setVisible(true);

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
