package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {


    CheckPackage(){
        setBounds(250,100,900,600);

        String[] pack1 ={"GOLD PACKAGE","6 days 7 nights","Airport Assitance","Hallf day city Tour","Daily Buffet","Welcome Drinks on Arrival","Full day 3 Island Cruise","English Speaking Guide","BOOK NOW !!","Summer Special","Per person BDT 40,000/- ","package1.jpg"};

        String[] pack2 = {"SILVER PACKAGE","4 days and 3 Nights", "Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW !!", "Winter Special", "Per person BDT 30,000/-","package2.jpg"};

        String[] pack3 = {"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW !!", "Winter Special", "Per person BDT 25,000/-","package3.jpg"};


        JPanel panel1=createPackage(pack1);
        JPanel panel2=createPackage(pack2);
        JPanel panel3=createPackage(pack3);



        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.addTab("Package 1",null,panel1);
        tabbedPane.addTab("Package 2",null,panel2);
        tabbedPane.addTab("Package 3",null,panel3);


        add(tabbedPane);

        setVisible(true);
    }


    public JPanel createPackage(String [] pack){
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);


        JLabel packageType=new JLabel(pack[0]);
        packageType.setBounds(50,5,300,40);
        packageType.setFont(new Font("Tahoma",Font.BOLD,30));
        packageType.setForeground(new Color(217, 217, 23));
        panel1.add(packageType);

        JLabel featuresLabel=new JLabel(pack[1]);
        featuresLabel.setBounds(30,60,300,30);
        featuresLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        featuresLabel.setForeground(Color.red);
        panel1.add(featuresLabel);

        JLabel airportAssistLabel=new JLabel(pack[2]);
        airportAssistLabel.setBounds(30,110,300,30);
        airportAssistLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        airportAssistLabel.setForeground(Color.blue);
        panel1.add(airportAssistLabel);

        JLabel dayTourLabel=new JLabel(pack[3]);
        dayTourLabel.setBounds(30,160,300,30);
        dayTourLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        dayTourLabel.setForeground(Color.red);
        panel1.add(dayTourLabel);

        JLabel buffetLabel=new JLabel(pack[4]);
        buffetLabel.setBounds(30,210,300,30);
        buffetLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        buffetLabel.setForeground(Color.blue);
        panel1.add(buffetLabel);

        JLabel drinksLabel=new JLabel(pack[5]);
        drinksLabel.setBounds(30,260,300,30);
        drinksLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        drinksLabel.setForeground(Color.red);
        panel1.add(drinksLabel);

        JLabel cruiseLabel=new JLabel(pack[6]);
        cruiseLabel.setBounds(30,310,300,30);
        cruiseLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        cruiseLabel.setForeground(Color.blue);
        panel1.add(cruiseLabel);

        JLabel guideLabel=new JLabel(pack[7]);
        guideLabel.setBounds(30,360,300,30);
        guideLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        guideLabel.setForeground(Color.red);
        panel1.add(guideLabel);

        JLabel bookLabel=new JLabel(pack[8]);
        bookLabel.setBounds(100,410,300,30);
        bookLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        bookLabel.setForeground(Color.black);
        panel1.add(bookLabel);

        JLabel seasonLabel=new JLabel(pack[9]);
        seasonLabel.setBounds(100,460,300,30);
        seasonLabel.setFont(new Font("Tahoma",Font.BOLD,25));
        seasonLabel.setForeground(Color.MAGENTA);
        panel1.add(seasonLabel);

        JLabel costLabel=new JLabel(pack[10]);
        costLabel.setBounds(500,460,500,30);
        costLabel.setFont(new Font("Tahoma",Font.BOLD,25));
        costLabel.setForeground(Color.CYAN);
        panel1.add(costLabel);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11] ));
        Image image= icon.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        JLabel imageLabel=new JLabel(imageIcon);
        imageLabel.setBounds(350,20,500,300);
        panel1.add(imageLabel);

        return panel1;
    }


    public static void main(String[] args) {

        new CheckPackage();
    }
}
