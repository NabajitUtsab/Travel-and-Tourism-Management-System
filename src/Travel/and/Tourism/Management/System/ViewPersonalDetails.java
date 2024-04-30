package Travel.and.Tourism.Management.System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPersonalDetails extends JFrame implements ActionListener{

    JLabel userNameLabel,idChoiceLabel,idNumberLabel,nameLabel,genderLabel,countryLabel,addressLabel,phoneLabel,emailLabel;
    JLabel userNameText,idText,idNumberText,nameText,genderText,countryText,addressText,phoneText,emailText;


    JButton backButton;

    String userName;

    ViewPersonalDetails(String userName){
        super("View Details");

        this.userName=userName;


        setBounds(250,80,870,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,870,350);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        add(panel);

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(30,50,150,25);
        userNameLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        userNameLabel.setForeground(Color.red);
        panel.add(userNameLabel);

        userNameText= new JLabel("");
        userNameText.setBounds(200,50,150,25);
        userNameText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(userNameText);

        idChoiceLabel= new JLabel("Select ID");
        idChoiceLabel.setBounds(30,100,150,25);
        idChoiceLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        idChoiceLabel.setForeground(Color.red);
        panel.add(idChoiceLabel);

        idText = new JLabel("");
        idText.setBounds(200,100,150,25);
        idText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idText);

        idNumberLabel= new JLabel("ID Number");
        idNumberLabel.setBounds(30,150,150,25);
        idNumberLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        idNumberLabel.setForeground(Color.red);
        panel.add(idNumberLabel);

        idNumberText = new JLabel("");
        idNumberText.setBounds(200,150,150,25);
        idNumberText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idNumberText);

        nameLabel= new JLabel("Name");
        nameLabel.setBounds(30,200,150,25);
        nameLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        nameLabel.setForeground(Color.red);
        panel.add(nameLabel);

        nameText = new JLabel("");
        nameText.setBounds(200,200,150,25);
        nameText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(nameText);

        genderLabel= new JLabel("Gender");
        genderLabel.setBounds(30,250,150,25);
        genderLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        genderLabel.setForeground(Color.red);
        panel.add(genderLabel);

        genderText = new JLabel("");
        genderText.setBounds(200,250,150,25);
        genderText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(genderText);


        countryLabel= new JLabel("Country");
        countryLabel.setBounds(370,50,150,25);
        countryLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        countryLabel.setForeground(Color.red);
        panel.add(countryLabel);

        countryText = new JLabel("");
        countryText.setBounds(520,50,150,25);
        countryText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(countryText);

        addressLabel= new JLabel("Address");
        addressLabel.setBounds(370,100,150,25);
        addressLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        addressLabel.setForeground(Color.red);
        panel.add(addressLabel);

        addressText = new JLabel("");
        addressText.setBounds(520,100,150,25);
        addressText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(addressText);

        phoneLabel= new JLabel("Phone");
        phoneLabel.setBounds(370,150,150,25);
        phoneLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        phoneLabel.setForeground(Color.red);
        panel.add(phoneLabel);

        phoneText = new JLabel("");
        phoneText.setBounds(520,150,150,25);
        phoneText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(phoneText);

        emailLabel= new JLabel("Email");
        emailLabel.setBounds(370,200,150,25);
        emailLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        emailLabel.setForeground(Color.red);
        panel.add(emailLabel);

        emailText = new JLabel("");
        emailText.setBounds(520,200,150,25);
        emailText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(emailText);


        backButton = new JButton("BACK");
        backButton.setBounds(370,300,100,25);
        backButton.setFont(new Font("Tahoma",Font.BOLD,12));
        backButton.setBackground(new Color(24, 118, 212));
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(new LineBorder(new Color(24, 118, 212)));
        backButton.addActionListener(this);
        panel.add(backButton);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(600,275,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(0,350,600,275);
        add(imageLabel);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall2.jpg"));
        Image image2 = imageIcon2.getImage().getScaledInstance(270,275,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3= new ImageIcon(image2);
        JLabel imageLabel2 = new JLabel(imageIcon3);
        imageLabel2.setBounds(600,350,270,275);
        add(imageLabel2);


        try{
            Database database=new Database();
            ResultSet resultSet=database.statement.executeQuery("SELECT * FROM customer WHERE Username ='"+userName+"'");

            while(resultSet.next()){
                userNameText.setText(resultSet.getString("username"));
                idText.setText(resultSet.getString("id"));
                idNumberText.setText(resultSet.getString("id_no"));
                nameText.setText(resultSet.getString("name"));
                genderText.setText(resultSet.getString("gender"));
                countryText.setText(resultSet.getString("country"));
                addressText.setText(resultSet.getString("address"));
                phoneText.setText(resultSet.getString("phone"));
                emailText.setText(resultSet.getString("email"));



            }

        }catch(Exception e){

            e.printStackTrace();
        }


        setVisible(true);
    }


    public static void main(String[] args) {
        new ViewPersonalDetails("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Dashboard(userName);
        setVisible(false);

    }
}
