package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class BookPackage extends JFrame implements ActionListener
{
    JLabel userNameLabel,selectPackageLabel,totalPersonLabel,idLabel,idNumberLabel,phoneLabel,totalPriceLabel;

    JLabel userNameLabelText,idLabelText,idNumberLabelText,phoneLabelText,totalPriceLabelText;

    Choice selectPackageChoice;
    JTextField totalPersonText;
    JButton checkPriceButton,bookPackageButton,backButton;
    String userName;

    BookPackage(String userName){
        this.userName=userName;

        setBounds(150,100,1100,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Book Package");
        heading.setBounds(100,10,200,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);

        userNameLabel =new JLabel("Username");
        userNameLabel.setBounds(40,70,100,20);
        userNameLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(userNameLabel);

        userNameLabelText =new JLabel("");
        userNameLabelText.setBounds(200,70,200,20);
        userNameLabelText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(userNameLabelText);

        selectPackageLabel =new JLabel("Select Package");
        selectPackageLabel.setBounds(40,110,150,20);
        selectPackageLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(selectPackageLabel);

        selectPackageChoice =new Choice();
        selectPackageChoice.setBounds(200,110,200,20);
        selectPackageChoice.setFont(new Font("Tahoma",Font.PLAIN,16));
        selectPackageChoice.setCursor(new Cursor(HAND_CURSOR));
        selectPackageChoice.add("Gold Package");
        selectPackageChoice.add("Silver Package");
        selectPackageChoice.add("Bronze Package");
        add(selectPackageChoice);

        totalPersonLabel =new JLabel("Total Persons");
        totalPersonLabel.setBounds(40,150,150,20);
        totalPersonLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPersonLabel);

        totalPersonText =new JTextField();
        totalPersonText.setBounds(200,150,200,20);
        totalPersonText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPersonText);

        idLabel =new JLabel("ID");
        idLabel.setBounds(40,190,150,20);
        idLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idLabel);

        idLabelText =new JLabel("");
        idLabelText.setBounds(200,190,200,20);
        idLabelText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idLabelText);

        idNumberLabel =new JLabel("ID Number");
        idNumberLabel.setBounds(40,230,150,20);
        idNumberLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idNumberLabel);

        idNumberLabelText =new JLabel("");
        idNumberLabelText.setBounds(200,230,200,20);
        idNumberLabelText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idNumberLabelText);

        phoneLabel =new JLabel("Phone");
        phoneLabel.setBounds(40,270,150,20);
        phoneLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(phoneLabel);

        phoneLabelText =new JLabel("");
        phoneLabelText.setBounds(200,270,200,20);
        phoneLabelText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(phoneLabelText);

        totalPriceLabel =new JLabel("Total Price");
        totalPriceLabel.setBounds(40,310,150,20);
        totalPriceLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPriceLabel);

        totalPriceLabelText =new JLabel("");
        totalPriceLabelText.setBounds(200,310,200,20);
        totalPriceLabelText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPriceLabelText);

        checkPriceButton= new JButton("Check Price");
        checkPriceButton.setBounds(40,380,120,25);
        checkPriceButton.setBackground(Color.BLACK);
        checkPriceButton.setForeground(Color.WHITE);
        checkPriceButton.setBorder(BorderFactory.createEmptyBorder());
        add(checkPriceButton);

        bookPackageButton= new JButton("Book Package");
        bookPackageButton.setBounds(180,380,120,25);
        bookPackageButton.setBackground(Color.BLACK);
        bookPackageButton.setForeground(Color.WHITE);
        bookPackageButton.setBorder(BorderFactory.createEmptyBorder());
        add(bookPackageButton);

        backButton= new JButton("Back");
        backButton.setBounds(320,380,120,25);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        add(backButton);

        try{
           // userNameLabelText,idLabelText,idNumberLabelText,phoneLabelText,totalPriceLabelText;
          //  username, id, id_no, name, gender, country, address, phone, email
            Database database = new Database();
            ResultSet resultSet = database.statement.executeQuery("SELECT * FROM customer WHERE username='"+userName+"'");
            while(resultSet.next()){
                userNameLabelText.setText(resultSet.getString("username"));
                idLabelText.setText(resultSet.getString("id"));
                idNumberLabelText.setText(resultSet.getString("id_no"));
                phoneLabelText.setText(resultSet.getString("phone"));

            }


        }catch(Exception e){
            e.printStackTrace();
        }




        setVisible(true);
    }
    public static void main(String[] args){

        new BookPackage("");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
