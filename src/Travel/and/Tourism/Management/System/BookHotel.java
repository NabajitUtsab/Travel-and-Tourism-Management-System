package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {

    JLabel userNameLabel,selectHotelLabel,totalPersonLabel,daysNoLabel,acLabel,foodLabel,idLabel,numberLabel,phoneLabel,totalPriceLabel;
    JLabel userNameTextLabel,idTextLabel,numberTextLabel,phoneTextLabel,totalPriceTextLabel;
    JTextField totalPersonText,daysNoText;
    Choice selectHotelChoice,acChoice,foodChoice;

    JButton checkPriceButton,bookHotelButton,backButton;

    BookHotel(){
        setBounds(140,60,1100,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Book Hotel");
        heading.setBounds(100,10,200,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(heading);

        userNameLabel=new JLabel("Username");
        userNameLabel.setBounds(40,70,100,20);
        userNameLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(userNameLabel);

        userNameTextLabel =new JLabel("");
        userNameTextLabel.setBounds(200,70,200,20);
        userNameTextLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(userNameTextLabel);

        selectHotelLabel =new JLabel("Select Hotel");
        selectHotelLabel.setBounds(40,110,150,20);
        selectHotelLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(selectHotelLabel);

        selectHotelChoice =new Choice();
        selectHotelChoice.setBounds(200,110,200,20);
        selectHotelChoice.setFont(new Font("Tahoma",Font.PLAIN,16));
        selectHotelChoice.setCursor(new Cursor(HAND_CURSOR));
        add(selectHotelChoice);

        try{
            Database database=new Database();
            ResultSet resultSet=database.statement.executeQuery("SELECT * From hotel");
            while(resultSet.next()){
                selectHotelChoice.add(resultSet.getString("hotelname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        totalPersonLabel =new JLabel("Total Persons");
        totalPersonLabel.setBounds(40,150,150,20);
        totalPersonLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPersonLabel);

        totalPersonText =new JTextField();
        totalPersonText.setBounds(200,150,200,20);
        totalPersonText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPersonText);

        daysNoLabel =new JLabel("No of Days");
        daysNoLabel.setBounds(40,190,150,20);
        daysNoLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(daysNoLabel);

        daysNoText =new JTextField();
        daysNoText.setBounds(200,190,200,20);
        daysNoText.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(daysNoText);

        acLabel =new JLabel("AC/Non AC");
        acLabel.setBounds(40,230,150,20);
        acLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(acLabel);

        acChoice =new Choice();
        acChoice.setBounds(200,230,200,20);
        acChoice.setFont(new Font("Tahoma",Font.PLAIN,16));
        acChoice.setCursor(new Cursor(Cursor.HAND_CURSOR));
        acChoice.add("Yes");
        acChoice.add("No");
        add(acChoice);

        foodLabel =new JLabel("Food included");
        foodLabel.setBounds(40,270,150,20);
        foodLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(foodLabel);

        foodChoice =new Choice();
        foodChoice.setBounds(200,270,200,20);
        foodChoice.setFont(new Font("Tahoma",Font.PLAIN,16));
        foodChoice.setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodChoice.add("Yes");
        foodChoice.add("No");
        add(foodChoice);

        idLabel =new JLabel("ID");
        idLabel.setBounds(40,310,150,20);
        idLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idLabel);

        idTextLabel =new JLabel("");
        idTextLabel.setBounds(200,310,200,20);
        idTextLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(idTextLabel);

        numberLabel =new JLabel("Number");
        numberLabel.setBounds(40,340,150,20);
        numberLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(numberLabel);

        numberTextLabel =new JLabel("");
        numberTextLabel.setBounds(200,340,200,20);
        numberTextLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(numberTextLabel);

        phoneLabel =new JLabel("Phone");
        phoneLabel.setBounds(40,380,150,20);
        phoneLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(phoneLabel);

        phoneTextLabel =new JLabel("");
        phoneTextLabel.setBounds(200,380,200,20);
        phoneTextLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(phoneTextLabel);

        totalPriceLabel =new JLabel("Total Price");
        totalPriceLabel.setBounds(40,420,150,20);
        totalPriceLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPriceLabel);

        totalPriceTextLabel =new JLabel("");
        totalPriceTextLabel.setBounds(200,420,200,20);
        totalPriceTextLabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(totalPriceTextLabel);


        checkPriceButton= new JButton("Check Price");
        checkPriceButton.setBounds(40,490,120,25);
        checkPriceButton.setBackground(Color.BLACK);
        checkPriceButton.setForeground(Color.WHITE);
        checkPriceButton.setBorder(BorderFactory.createEmptyBorder());
        checkPriceButton.addActionListener(this);
        add(checkPriceButton);

        bookHotelButton= new JButton("Book Hotel");
        bookHotelButton.setBounds(180,490,120,25);
        bookHotelButton.setBackground(Color.BLACK);
        bookHotelButton.setForeground(Color.WHITE);
        bookHotelButton.setBorder(BorderFactory.createEmptyBorder());
        bookHotelButton.addActionListener(this);
        add(bookHotelButton);

        backButton= new JButton("Back");
        backButton.setBounds(320,490,120,25);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        add(backButton);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg" ));
        Image image= icon.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        JLabel imageLabel=new JLabel(imageIcon);
        imageLabel.setBounds(550,50,500,450);
        add(imageLabel);


        setVisible(true);

    }


    public static void main(String[] args) {
        new BookHotel();
    }

    @Override
    public void actionPerformed(ActionEvent e ) {

    }
}
