package Travel.and.Tourism.Management.System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomerDetails extends JFrame implements ActionListener {

    JLabel userNameLabel, idChoiceLabel, idNumberLabel, nameLabel, genderLabel, countryLabel, addressLabel, phoneLabel, emailLabel;
    JLabel userNameLabelText;

    JTextField nameLabelText, idChoiceLabelText, idNumberLabelText, countryLabelText, addressLabelText, phoneLabelText, emailLabelText, genderLabeltext;

    JButton updateButton, backButton;

    String userName;

    UpdateCustomerDetails(String userName) {
        super("Update Details");
        this.userName = userName;

        setBounds(250, 100, 850, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 550);
        panel.setBackground(new Color(180, 180, 222));
        panel.setLayout(null);
        add(panel);

        JLabel headingtext = new JLabel("Update Customer Details");
        headingtext.setBounds(90, 0, 250, 20);
        headingtext.setFont(new Font("Tahoma", Font.ITALIC, 20));
        panel.add(headingtext);

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(30, 30, 150, 25);
        userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(userNameLabel);

        userNameLabelText = new JLabel("");
        userNameLabelText.setBounds(200, 30, 150, 25);
        userNameLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(userNameLabelText);

        idChoiceLabel = new JLabel("Select ID");
        idChoiceLabel.setBounds(30, 70, 150, 25);
        idChoiceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(idChoiceLabel);

        idChoiceLabelText = new JTextField();
        idChoiceLabelText.setBounds(200, 70, 150, 25);
        idChoiceLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(idChoiceLabelText);

        idNumberLabel = new JLabel("ID Number");
        idNumberLabel.setBounds(30, 110, 150, 25);
        idNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(idNumberLabel);

        idNumberLabelText = new JTextField();
        idNumberLabelText.setBounds(200, 110, 150, 25);
        idNumberLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        idNumberLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(idNumberLabelText);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(30, 150, 150, 25);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(nameLabel);

        nameLabelText = new JTextField();
        nameLabelText.setBounds(200, 150, 150, 25);
        nameLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        nameLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(nameLabelText);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(30, 190, 150, 25);
        genderLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(genderLabel);

        genderLabeltext = new JTextField();
        genderLabeltext.setBounds(200, 190, 150, 25);
        genderLabeltext.setFont(new Font("Tahoma", Font.BOLD, 12));
        genderLabeltext.setBorder(BorderFactory.createEmptyBorder());
        panel.add(genderLabeltext);


        countryLabel = new JLabel("Country");
        countryLabel.setBounds(30, 230, 150, 25);
        countryLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(countryLabel);

        countryLabelText = new JTextField();
        countryLabelText.setBounds(200, 230, 150, 25);
        countryLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        countryLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(countryLabelText);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(30, 270, 150, 25);
        addressLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(addressLabel);

        addressLabelText = new JTextField();
        addressLabelText.setBounds(200, 270, 150, 25);
        addressLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        addressLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(addressLabelText);

        phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(30, 310, 150, 25);
        phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(phoneLabel);

        phoneLabelText = new JTextField();
        phoneLabelText.setBounds(200, 310, 150, 25);
        phoneLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        phoneLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(phoneLabelText);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(30, 350, 150, 25);
        emailLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(emailLabel);

        emailLabelText = new JTextField();
        emailLabelText.setBounds(200, 350, 150, 25);
        emailLabelText.setFont(new Font("Tahoma", Font.BOLD, 12));
        emailLabelText.setBorder(BorderFactory.createEmptyBorder());
        panel.add(emailLabelText);

        updateButton = new JButton("UPDATE");
        updateButton.setBounds(70, 430, 100, 25);
        updateButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        updateButton.setBackground(Color.WHITE);
        updateButton.setBorder(new LineBorder(new Color(111, 222, 136)));
        updateButton.addActionListener(this);
        panel.add(updateButton);

        backButton = new JButton("BACK");
        backButton.setBounds(240, 430, 100, 25);
        backButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        backButton.setBackground(Color.WHITE);
        backButton.setBorder(new LineBorder(new Color(111, 222, 136)));
        backButton.addActionListener(this);
        panel.add(backButton);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(510, 100, 200, 400);
        add(imageLabel);


        try {
            Database database = new Database();
            ResultSet resultSet = database.statement.executeQuery("SELECT * FROM signup WHERE Username ='" + userName + "'");
            while (resultSet.next()) {
                userNameLabelText.setText(resultSet.getString("Username"));
            }

        } catch (Exception e) {

            e.printStackTrace();
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateCustomerDetails("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==updateButton){

        }
    }
}

