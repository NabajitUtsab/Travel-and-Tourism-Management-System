package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BookPackage extends JFrame implements ActionListener
{
    JLabel userNameLabel,selectPackageLabel,totalPersonLabel,idLabel,idNumberLabel,phoneLabel,totalPriceLabel;

    JLabel userNameLabelText,idLabelText,idNumberLabelText,phoneLabelText,totalPriceLabelText;

    Choice selectPackageChoice;
    JTextField totalPersonText;

    BookPackage(){
        setBounds(150,100,1100,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Book Package");
        heading.setBounds(100,10,200,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);


        setVisible(true);
    }
    public static void main(String[] args){

        new BookPackage();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
