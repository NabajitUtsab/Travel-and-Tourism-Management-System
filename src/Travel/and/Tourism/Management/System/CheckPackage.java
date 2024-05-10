package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage(){
        setBounds(250,100,900,600);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);


        JLabel packageType=new JLabel("Gold Package");
        packageType.setBounds(50,5,300,40);
        packageType.setFont(new Font("Tahoma",Font.BOLD,30));
        packageType.setForeground(new Color(217, 217, 23));
        panel1.add(packageType);

        JLabel featuresLabel=new JLabel("6 days 7 nights");
        featuresLabel.setBounds(30,60,300,30);
        featuresLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        featuresLabel.setForeground(Color.red);
        panel1.add(featuresLabel);

        JLabel airportAssistLabel=new JLabel("Airport Assitance");
        airportAssistLabel.setBounds(30,110,300,30);
        airportAssistLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        airportAssistLabel.setForeground(Color.blue);
        panel1.add(airportAssistLabel);

        JLabel dayTourLabel=new JLabel("Hallf day city Tour");
        dayTourLabel.setBounds(30,160,300,30);
        dayTourLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        dayTourLabel.setForeground(Color.red);
        panel1.add(dayTourLabel);

        JLabel buffetLabel=new JLabel("Daily Buffet");
        buffetLabel.setBounds(30,210,300,30);
        buffetLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        buffetLabel.setForeground(Color.blue);
        panel1.add(buffetLabel);



        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.addTab("Package 1",null,panel1);

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {

        new CheckPackage();
    }
}
