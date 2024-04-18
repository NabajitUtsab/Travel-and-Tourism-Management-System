package Travel.and.Tourism.Management.System;

import javax.lang.model.element.Name;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Signup extends JFrame implements ActionListener {
JLabel userName,name,password,question,answer;
JTextField userNameText,nameText,passwordText,answerText;
Choice questionChoice;
JButton createButton,backButton;
    Signup(){
        super("Signup");

        setBounds(235,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,500,360);
        add(panel1);

        panel1.setLayout(null);

        userName = new JLabel("Username");
        userName.setBounds(50,20,125,25);
        userName.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(userName);

        userNameText = new JTextField();
        userNameText.setBounds(190,20,250,25);
        userNameText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(userNameText);

        name = new JLabel("Name");
        name.setBounds(50,60,125,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(name);

        nameText = new JTextField();
        nameText.setBounds(190,60,250,25);
        nameText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(nameText);

        password = new JLabel("Password");
        password.setBounds(50,100,125,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(password);

        passwordText = new JTextField();
        passwordText.setBounds(190,100,250,25);
        passwordText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(passwordText);

        question = new JLabel("Security Question");
        question.setBounds(50,140,125,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(question);

        questionChoice = new Choice();
        questionChoice.setBounds(190,140,250,25);
        questionChoice.setCursor(new Cursor(Cursor.HAND_CURSOR));
        questionChoice.add("What's your father name?");
        questionChoice.add("What's your favourite place?");
        questionChoice.add("What is your hobby?");
        questionChoice.add("What is your favourite food?");
        panel1.add(questionChoice);

        answer = new JLabel("Answer");
        answer.setBounds(50,180,125,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(answer);

        answerText = new JTextField();
        answerText.setBounds(190,180,250,25);
        answerText.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(answerText);

        createButton = new JButton("Create");
        createButton.setBounds(100,250,100,25);
        createButton.setBackground(new Color(133,193,233));
        createButton.setForeground(Color.WHITE);
        createButton.setBorder(new LineBorder(new Color(133,193,233)));
        createButton.addActionListener(this);
        panel1.add(createButton);

        backButton = new JButton("Back");
        backButton.setBounds(280,250,100,25);
        backButton.setBackground(new Color(133,193,233));
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(new LineBorder(new Color(133,193,233)));
        backButton.addActionListener(this);
        panel1.add(backButton);



        JPanel panel2=new JPanel();
        panel2.setBackground(new Color(133,193,233));
        panel2.setBounds(500,0,400,360);
        add(panel2);

        panel2.setLayout(null);

        ImageIcon imageIcon1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image image = imageIcon1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(image);
        JLabel imageLabel= new JLabel(imageIcon2);
        imageLabel.setBounds(100,80,200,200);
        panel2.add(imageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==createButton){

            String sUserName=userNameText.getText();
            String sName=nameText.getText();
            String sPassword=passwordText.getText();
            String sQuestion= questionChoice.getSelectedItem();
            String sAnswer = answerText.getText();

            String query="insert into signup values ('"+sUserName+"','"+sName+"','"+sPassword+"','"+sQuestion+"','"+sAnswer+"')";
            try{
                Database database = new Database();
              database.statement.executeUpdate(query);

              JOptionPane.showMessageDialog(null,"Account Created successfully");
              setVisible(false);
              new Login();

            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
        else {
            setVisible(false);
            new Login();
        }

    }
}
