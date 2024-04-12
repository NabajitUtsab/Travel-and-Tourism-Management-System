package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    Splash(){


        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image image=imageIcon.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon icon=new ImageIcon(image);
        JLabel imageLabel=new JLabel(icon);
        add(imageLabel);

        setVisible(true);

        Thread thread = new Thread(this);
        thread.start();

    }
    public static void main(String[] args) {
       Splash frame= new Splash();

       int x=1;
       for(int i=1;i<=500;x+=7,i+=6){
           frame.setBounds(690-(x+i)/2,380-(i/2),x+i,i);
           
           try
           {
               Thread.sleep(10);

        }
           catch(Exception e){
            e.printStackTrace();
        }
       }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
