package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Loading extends JFrame implements Runnable{

    Thread thread;

    JLabel textLabel,loadingLabel,userNameLabel;
    JProgressBar bar;
    String userName;
    Loading(String userName){
       this.userName = userName;

        setBounds(360,180,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        textLabel =new JLabel("Travel and Tourism Application");
        textLabel.setBounds(50,20,600,40);
        textLabel.setFont(new Font("Raleway",Font.BOLD,35));
        textLabel.setForeground(Color.blue);
        add(textLabel);

        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setBorder(BorderFactory.createEmptyBorder());
        bar.setStringPainted(true);
        add(bar);

        loadingLabel = new JLabel("Loading......");
        loadingLabel.setBounds(200,140,150,30);
        loadingLabel.setFont(new Font("Raleway",Font.BOLD,20));
        loadingLabel.setForeground(Color.red);
        add(loadingLabel);

        userNameLabel=new JLabel("Welcome "+ userName );
        userNameLabel.setBounds(20,250,400,40);
        userNameLabel.setFont(new Font("Raleway",Font.BOLD,20));
        userNameLabel.setForeground(Color.red);
        add(userNameLabel);

        thread = new Thread(this);
        thread.start();


        setVisible(true);


    }

    public static void main(String[] args) {
        new Loading("");
    }

    @Override
    public void run() {

        try{
            for ( int i = 1 ; i <= 101 ; i++ ) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if(value < max ){
                    bar.setValue( value + 1);
                }
                else {

                    setVisible(false);
                }
                Thread.sleep(60);
            }

        }catch(Exception exception){
            exception.printStackTrace();
        }

    }
}
