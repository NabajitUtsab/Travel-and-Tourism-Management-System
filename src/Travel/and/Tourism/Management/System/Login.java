package Travel.and.Tourism.Management.System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel userName,password;
    JTextField userNameText,passwordText;
    JButton loginButton,signupButton,forgetPassButton;
    Login(){
        super("LogIN");
        setBounds(235,200,900,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel1= new JPanel();
        panel1.setBackground(new Color(131,193,233));
        panel1.setBounds(0,0,400,400);
        add(panel1);

        panel1.setLayout(null);
        ImageIcon imageIcon1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image image = imageIcon1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(image);
        JLabel imageLabel= new JLabel(imageIcon2);
        imageLabel.setBounds(100,120,200,200);
        panel1.add(imageLabel);


        JPanel panel2= new JPanel();
        panel2.setBounds(400,0,450,400);
        add(panel2);

        panel2.setLayout(null);

        userName = new JLabel("Username");
        userName.setBounds(60,20,100,25);
        userName.setFont(new Font("San serif",Font.BOLD,20));
        panel2.add(userName);

        userNameText = new JTextField();
        userNameText.setBounds(60,60,300,30);
        userNameText.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(userNameText);

        password = new JLabel("Password");
        password.setBounds(60,100,100,25);
        password.setFont(new Font("San serif",Font.BOLD,20));
        panel2.add(password);

        passwordText = new JTextField();
        passwordText.setBounds(60,140,300,30);
        passwordText.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(passwordText);


        loginButton=new JButton("Login");
        loginButton.setBounds(90,200,100,25);
        loginButton.setBackground(new Color(131,193,233));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorder(new LineBorder(new Color(131,193,233)));
        loginButton.addActionListener(this);
        panel2.add(loginButton);

        signupButton=new JButton("Signup");
        signupButton.setBounds(230,200,100,25);
        signupButton.setBackground(new Color(131,193,233));
        signupButton.setForeground(Color.WHITE);
        signupButton.setBorder(new LineBorder(new Color(131,193,233)));
        signupButton.addActionListener(this);
        panel2.add(signupButton);

        forgetPassButton=new JButton("Forget Password");
        forgetPassButton.setBounds(150,240,120,25);
        forgetPassButton.setBackground(new Color(131,193,233));
        forgetPassButton.setForeground(Color.WHITE);
        forgetPassButton.setBorder(new LineBorder(new Color(131,193,233)));
        forgetPassButton.addActionListener(this);
        panel2.add(forgetPassButton);

        JLabel label=new JLabel("Trouble in Login...");
        label.setBounds(290,240,150,25);
        label.setForeground(Color.red);
        panel2.add(label);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==signupButton){
            new Signup();
            setVisible(false);
        }
        else if (e.getSource()==forgetPassButton) {
            setVisible(false);
            new ForgetPassword();

        }
        else if (e.getSource()==loginButton) {
            String sUserName = userNameText.getText();
            String sPassword = passwordText.getText();

            try{
                Database database = new Database();
                ResultSet resultSet= database.statement.executeQuery("SELECT * FROM signup where Username='"+sUserName+"' AND Password='"+sPassword+"' ");

                if (resultSet.next()){
                    JOptionPane.showMessageDialog(null,"Login Successful");

                    new Loading(sUserName);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Login");
                }
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }
}
