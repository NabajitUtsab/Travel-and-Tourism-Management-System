package Travel.and.Tourism.Management.System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddCustomerDetails extends JFrame implements  ActionListener{

    JLabel userNameLabel,idChoiceLabel,idNumberLabel,nameLabel,genderLabel,countryLabel,addressLabel,phoneLabel,emailLabel;
    JLabel userNameLabelText,nameLabelText;
    Choice idChoiceLabelText;
    JTextField idNumberLabelText,countryLabelText,addressLabelText,phoneLabelText,emailLabelText;
    JRadioButton rMale,rFemale;
    JButton addButton,backButton;

    String userName;

    AddCustomerDetails(String userName){
        super("Add Details");
        this.userName=userName;

        setBounds(250,100,850,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,400,550);
        panel.setBackground(new Color(111, 222, 136));
        panel.setLayout(null);
        add(panel);

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(30,30,150,25);
        userNameLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(userNameLabel);

        userNameLabelText= new JLabel("");
        userNameLabelText.setBounds(200,30,150,25);
        userNameLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(userNameLabelText);

        idChoiceLabel= new JLabel("Select ID");
        idChoiceLabel.setBounds(30,70,150,25);
        idChoiceLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idChoiceLabel);

        idChoiceLabelText = new Choice();
        idChoiceLabelText.setBounds(200,70,150,25);
        idChoiceLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        idChoiceLabelText.setCursor(new Cursor(HAND_CURSOR));
        idChoiceLabelText.add("Passport");
        idChoiceLabelText.add("National ID");
        panel.add(idChoiceLabelText);

        idNumberLabel= new JLabel("ID Number");
        idNumberLabel.setBounds(30,110,150,25);
        idNumberLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(idNumberLabel);

        idNumberLabelText = new JTextField();
        idNumberLabelText.setBounds(200,110,150,25);
        idNumberLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        idNumberLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(idNumberLabelText);

        nameLabel= new JLabel("Name");
        nameLabel.setBounds(30,150,150,25);
        nameLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(nameLabel);

        nameLabelText = new JLabel("");
        nameLabelText.setBounds(200,150,150,25);
        nameLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(nameLabelText);

        genderLabel= new JLabel("Gender");
        genderLabel.setBounds(30,190,150,25);
        genderLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(genderLabel);

        rMale = new JRadioButton("MALE");
        rMale.setBounds(200,190,75,25);
        rMale.setFont(new Font("Tahoma",Font.BOLD,12));
        rMale.setBackground(new Color(111, 222, 136));
        rMale.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(rMale);

        rFemale = new JRadioButton("FEMALE");
        rFemale.setBounds(310,190,75,25);
        rFemale.setFont(new Font("Tahoma",Font.BOLD,12));
        rFemale.setBackground(new Color(111, 222, 136));
        rFemale.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(rFemale);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(rMale);
        buttonGroup.add(rFemale);

        countryLabel= new JLabel("Country");
        countryLabel.setBounds(30,230,150,25);
        countryLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(countryLabel);

        countryLabelText = new JTextField();
        countryLabelText.setBounds(200,230,150,25);
        countryLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        countryLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(countryLabelText);

        addressLabel= new JLabel("Address");
        addressLabel.setBounds(30,270,150,25);
        addressLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(addressLabel);

        addressLabelText = new JTextField();
        addressLabelText.setBounds(200,270,150,25);
        addressLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        addressLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(addressLabelText);

        phoneLabel= new JLabel("Phone");
        phoneLabel.setBounds(30,310,150,25);
        phoneLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(phoneLabel);

        phoneLabelText = new JTextField();
        phoneLabelText.setBounds(200,310,150,25);
        phoneLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        phoneLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(phoneLabelText);

        emailLabel= new JLabel("Email");
        emailLabel.setBounds(30,350,150,25);
        emailLabel.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(emailLabel);

        emailLabelText = new JTextField();
        emailLabelText.setBounds(200,350,150,25);
        emailLabelText.setFont(new Font("Tahoma",Font.BOLD,12));
        emailLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(emailLabelText);

        addButton = new JButton("ADD");
        addButton.setBounds(70,430,100,25);
        addButton.setFont(new Font("Tahoma",Font.BOLD,12));
        addButton.setBackground(Color.WHITE);
        addButton.setBorder(new LineBorder(new Color(111, 222, 136)));
        addButton.addActionListener(this);
        panel.add(addButton);

        backButton = new JButton("BACK");
        backButton.setBounds(240,430,100,25);
        backButton.setFont(new Font("Tahoma",Font.BOLD,12));
        backButton.setBackground(Color.WHITE);
        backButton.setBorder(new LineBorder(new Color(111, 222, 136)));
        backButton.addActionListener(this);
        panel.add(backButton);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(400,40,450,420);
        add(imageLabel);


        try{
            Database database=new Database();
            ResultSet resultSet=database.statement.executeQuery("SELECT * FROM signup WHERE Username ='"+userName+"'");
            while(resultSet.next()){
                userNameLabelText.setText(resultSet.getString("Username"));
                nameLabelText.setText(resultSet.getString("Name"));
            }

        }catch(Exception e){

            e.printStackTrace();
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new AddCustomerDetails("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton){
            String sId=idChoiceLabelText.getSelectedItem();
            String sIdNo=idNumberLabelText.getText();

            String sGender = null;
            if(rMale.isSelected()){
                sGender="Male";
            } else {
                sGender="Female";
            }

            String sCountry=countryLabelText.getText();
            String sAddress=addressLabelText.getText();
            String sPhone = phoneLabelText.getText();
            String sEmail = emailLabelText.getText();

            try {

                Database database = new Database();
                database.statement.executeUpdate("INSERT INTO customer (username, id, id_no, name, gender, country, address, phone, email)" +
                        " VALUES ('"+userName+"','"+sId+"','"+sIdNo+"','"+nameLabelText.getText()+"', '"+sGender+"','"+sCountry+"','"+sAddress+"','"+sPhone+"','"+sEmail+"')");

                JOptionPane.showMessageDialog(null,"Details added succesfully");
                new Dashboard(userName);
                setVisible(false);

            }
            catch(Exception exception){
                exception.getStackTrace();
            }
        }

        else{

            new Dashboard(userName);
            setVisible(false);
        }
    }
}
