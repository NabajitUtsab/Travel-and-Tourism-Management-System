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



        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.addTab("Package 1",null,panel1);

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {

        new CheckPackage();
    }
}
