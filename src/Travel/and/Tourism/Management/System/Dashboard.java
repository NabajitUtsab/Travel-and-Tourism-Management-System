package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton addPersonalDetailsButton,updatePersonalDetailsButton,viewPersonalDetailsButton,deletePersonalDetailsButton;
    JButton checkPackagesButton,bookPackagesButton,viewPackagesButton;
    JButton viewHotelsButton,bookHotelsButton,viewBookHotelsButton;
    JButton destinationsButton,paymentsButton,calculatorButton,notepadButton,aboutButton;

    String userName;
    Dashboard(String userName){
        super("Dashboard");

        this.userName=userName;
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
        addPersonalDetailsButton.setBounds(0,0,300,40);
        addPersonalDetailsButton.setBackground(new Color(0,0,102));
        addPersonalDetailsButton.setForeground(Color.WHITE);
        addPersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        addPersonalDetailsButton.setMargin(new Insets(0,0,0,65));
        addPersonalDetailsButton.addActionListener(this);
        panel2.add(addPersonalDetailsButton);

        updatePersonalDetailsButton = new JButton("Update Personal Details");
        updatePersonalDetailsButton.setBounds(0,40,300,40);
        updatePersonalDetailsButton.setBackground(new Color(0,0,102));
        updatePersonalDetailsButton.setForeground(Color.WHITE);
        updatePersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        updatePersonalDetailsButton.setMargin(new Insets(0,0,0,36));
        updatePersonalDetailsButton.addActionListener(this);
        panel2.add(updatePersonalDetailsButton);

        viewPersonalDetailsButton = new JButton("View Personal Details");
        viewPersonalDetailsButton.setBounds(0,80,300,40);
        viewPersonalDetailsButton.setBackground(new Color(0,0,102));
        viewPersonalDetailsButton.setForeground(Color.WHITE);
        viewPersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewPersonalDetailsButton.setMargin(new Insets(0,0,0,55));
        viewPersonalDetailsButton.addActionListener(this);
        panel2.add(viewPersonalDetailsButton);

        deletePersonalDetailsButton = new JButton("Delete Personal Details");
        deletePersonalDetailsButton.setBounds(0,120,300,40);
        deletePersonalDetailsButton.setBackground(new Color(0,0,102));
        deletePersonalDetailsButton.setForeground(Color.WHITE);
        deletePersonalDetailsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        deletePersonalDetailsButton.setMargin(new Insets(0,0,0,36));
        deletePersonalDetailsButton.addActionListener(this);
        panel2.add(deletePersonalDetailsButton);



        checkPackagesButton = new JButton("Check Packages");
        checkPackagesButton.setBounds(0,160,300,40);
        checkPackagesButton.setBackground(new Color(0,0,102));
        checkPackagesButton.setForeground(Color.WHITE);
        checkPackagesButton.setFont(new Font("Tahoma",Font.BOLD,18));
        checkPackagesButton.setMargin(new Insets(0,0,0,100));
        checkPackagesButton.addActionListener(this);
        panel2.add(checkPackagesButton);

        bookPackagesButton = new JButton("Book Packages");
        bookPackagesButton.setBounds(0,200,300,40);
        bookPackagesButton.setBackground(new Color(0,0,102));
        bookPackagesButton.setForeground(Color.WHITE);
        bookPackagesButton.setFont(new Font("Tahoma",Font.BOLD,18));
        bookPackagesButton.setMargin(new Insets(0,0,0,105));
        bookPackagesButton.addActionListener(this);
        panel2.add(bookPackagesButton);

        viewPackagesButton = new JButton("View Packages");
        viewPackagesButton.setBounds(0,240,300,40);
        viewPackagesButton.setBackground(new Color(0,0,102));
        viewPackagesButton.setForeground(Color.WHITE);
        viewPackagesButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewPackagesButton.setMargin(new Insets(0,0,0,105));
        viewPackagesButton.addActionListener(this);
        panel2.add(viewPackagesButton);



        viewHotelsButton = new JButton("View Hotels");
        viewHotelsButton.setBounds(0,280,300,40);
        viewHotelsButton.setBackground(new Color(0,0,102));
        viewHotelsButton.setForeground(Color.WHITE);
        viewHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewHotelsButton.setMargin(new Insets(0,0,0,135));
        viewHotelsButton.addActionListener(this);
        panel2.add(viewHotelsButton);

        bookHotelsButton = new JButton("Book Hotels");
        bookHotelsButton.setBounds(0,320,300,40);
        bookHotelsButton.setBackground(new Color(0,0,102));
        bookHotelsButton.setForeground(Color.WHITE);
        bookHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        bookHotelsButton.setMargin(new Insets(0,0,0,135));
        bookHotelsButton.addActionListener(this);
        panel2.add(bookHotelsButton);

        viewBookHotelsButton = new JButton("View Booked Hotels");
        viewBookHotelsButton.setBounds(0,360,300,40);
        viewBookHotelsButton.setBackground(new Color(0,0,102));
        viewBookHotelsButton.setForeground(Color.WHITE);
        viewBookHotelsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        viewBookHotelsButton.setMargin(new Insets(0,0,0,65));
        viewBookHotelsButton.addActionListener(this);
        panel2.add(viewBookHotelsButton);



        destinationsButton = new JButton("Destinations");
        destinationsButton.setBounds(0,400,300,40);
        destinationsButton.setBackground(new Color(0,0,102));
        destinationsButton.setForeground(Color.WHITE);
        destinationsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        destinationsButton.setMargin(new Insets(0,0,0,135));
        destinationsButton.addActionListener(this);
        panel2.add(destinationsButton);

        paymentsButton = new JButton("Payments");
        paymentsButton.setBounds(0,440,300,40);
        paymentsButton.setBackground(new Color(0,0,102));
        paymentsButton.setForeground(Color.WHITE);
        paymentsButton.setFont(new Font("Tahoma",Font.BOLD,18));
        paymentsButton.setMargin(new Insets(0,0,0,155));
        paymentsButton.addActionListener(this);
        panel2.add(paymentsButton);

        calculatorButton = new JButton("Calculator");
        calculatorButton.setBounds(0,480,300,40);
        calculatorButton.setBackground(new Color(0,0,102));
        calculatorButton.setForeground(Color.WHITE);
        calculatorButton.setFont(new Font("Tahoma",Font.BOLD,18));
        calculatorButton.setMargin(new Insets(0,0,0,155));
        calculatorButton.addActionListener(this);
        panel2.add(calculatorButton);

        notepadButton = new JButton("Notepad");
        notepadButton.setBounds(0,520,300,40);
        notepadButton.setBackground(new Color(0,0,102));
        notepadButton.setForeground(Color.WHITE);
        notepadButton.setFont(new Font("Tahoma",Font.BOLD,18));
        notepadButton.setMargin(new Insets(0,0,0,170));
        notepadButton.addActionListener(this);
        panel2.add(notepadButton);

        aboutButton = new JButton("About");
        aboutButton.setBounds(0,560,300,40);
        aboutButton.setBackground(new Color(0,0,102));
        aboutButton.setForeground(Color.WHITE);
        aboutButton.setFont(new Font("Tahoma",Font.BOLD,18));
        aboutButton.setMargin(new Insets(0,0,0,195));
        aboutButton.addActionListener(this);
        panel2.add(aboutButton);



        ImageIcon iconForHome = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image imageForHome = iconForHome.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon imageIconForHome= new ImageIcon(imageForHome);
        JLabel imageLabel2= new JLabel(imageIconForHome);
        imageLabel2.setBounds(0,0,1650,1000);
        add(imageLabel2);

        JLabel textLabel = new JLabel("Travel and Tourism Management");
        textLabel.setBounds(400,70,1000,60);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Railway",Font.BOLD,40));
        imageLabel2.add(textLabel);


        setVisible(true);

    }

    public static void main(String[] args) {
        new Dashboard("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addPersonalDetailsButton){
            new AddCustomerDetails(userName);
            setVisible(false);

        } else if (e.getSource()==viewPersonalDetailsButton) {
            new ViewPersonalDetails(userName);
            setVisible(false);

        } else if (e.getSource()==updatePersonalDetailsButton) {
            new UpdateCustomerDetails(userName);
            setVisible(false);

        }


    }
}
