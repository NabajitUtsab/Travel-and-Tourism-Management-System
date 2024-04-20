package Travel.and.Tourism.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {

    JLabel userName,name,question,answer,password;
    JLabel nameTextLabel,questionTextLabel,passwordTextLabel;
    JTextField userNameText,answerText;

    JButton searchButton,retriveButton,backButton;
    ForgetPassword(){
        super("Forget Password");
        setBounds(235,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imageLabel= new JLabel(imageIcon1);
        imageLabel.setBounds(610,50,200,200);
        add(imageLabel);

        JPanel panel1= new JPanel();
        panel1.setBounds(30,10,500,280);
        add(panel1);

        panel1.setLayout(null);

        userName = new JLabel("Username");
        userName.setBounds(40,40,100,25);
        userName.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(userName);

        userNameText = new JTextField();
        userNameText.setBounds(200,40,150,25);
        userNameText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(userNameText);

        searchButton = new JButton("Search");
        searchButton.setBounds(370,40,100,25);
        searchButton.setBackground(new Color(167,167,211));
        searchButton.setBorder(BorderFactory.createEmptyBorder());
        searchButton.addActionListener(this);
        panel1.add(searchButton);

        name = new JLabel("Name");
        name.setBounds(40,80,100,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(name);

        nameTextLabel = new JLabel("");
        nameTextLabel.setBounds(200,80,150,25);
        nameTextLabel.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(nameTextLabel);

        question = new JLabel("Security Question");
        question.setBounds(40,120,150,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(question);

        questionTextLabel = new JLabel("");
        questionTextLabel.setBounds(200,120,200,25);
        questionTextLabel.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(questionTextLabel);

        answer = new JLabel("Answer");
        answer.setBounds(40,160,100,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(answer);

        answerText = new JTextField();
        answerText.setBounds(200,160,150,25);
        answerText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(answerText);

        retriveButton = new JButton("Retrive");
        retriveButton.setBounds(370,160,100,25);
        retriveButton.setBackground(new Color(167,167,211));
        retriveButton.setBorder(BorderFactory.createEmptyBorder());
        retriveButton.addActionListener(this);
        panel1.add(retriveButton);


        password = new JLabel("Password");
        password.setBounds(40,200,100,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(password);

        passwordTextLabel = new JLabel("");
        passwordTextLabel.setBounds(200,200,150,25);
        passwordTextLabel.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(passwordTextLabel);



        backButton = new JButton("Back");
        backButton.setBounds(370,240,100,25);
        backButton.setBackground(new Color(167,167,211));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        panel1.add(backButton);



        setVisible(true);
    }

    public static void main(String[] args) {
        new ForgetPassword();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==searchButton){

            String sUserName= userNameText.getText();
            try{
                Database database = new Database();
                ResultSet resultSet = database.statement.executeQuery("SELECT * FROM signup WHERE Username='"+sUserName+"'");

                while(resultSet.next()){
                    nameTextLabel.setText(resultSet.getString("Name"));
                    questionTextLabel.setText(resultSet.getString("Question"));
                }
            }
            catch (Exception exception){
                exception.printStackTrace();
            }


        }
        else if (e.getSource()==retriveButton) {

            String sAnswer = answerText.getText();
            try{
                Database database = new Database();
                ResultSet resultSet = database.statement.executeQuery("SELECT * FROM signup WHERE Answer='"+sAnswer+"'");
                while (resultSet.next()){
                    passwordTextLabel.setText(resultSet.getString("Password"));
                }

            }
            catch (Exception exception){
                exception.printStackTrace();
            }


        }

        else if(e.getSource()==backButton){
            setVisible(false);
            new Login();
        }

    }
}
