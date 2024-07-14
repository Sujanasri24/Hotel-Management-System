
package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    
    JTextField username, password;
    JButton login, cancel;

    Login() {
        
            getContentPane().setBackground(Color.WHITE);
            setBounds(500,200,700,300);
            
            setLayout(null);  // coz we are manually adding the components. setbounds wont work for adding components onto frame (i.e below setbounds, not above one) unless u keep setlayout as null.
           
           
           JLabel user = new JLabel("Username");
           user.setBounds(40,20,100,30);
           add(user);
           
           JLabel pass = new JLabel("Password");
           pass.setBounds(40,70,100,30);
           add(pass);
           
           username = new JTextField();
           username.setBounds(150,20,150,30);
           add(username);
           
           password = new JTextField();
           password.setBounds(150,70,150,30);
           add(password);
           
           login = new JButton("Login");
           login.setBounds(40,150,120,30);
           login.setBackground(Color.BLACK);
           login.setForeground(Color.WHITE);
           login.addActionListener(this);
           add(login);
           
           cancel = new JButton("Cancel");
           cancel.setBounds(180,150,120,30);
           cancel.setBackground(Color.BLACK);
           cancel.setForeground(Color.WHITE);
           cancel.addActionListener(this);
           add(cancel);
           
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
           Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);  //image is scaled to shorten its length. 
                                                                                      //Image object cannot be directly passed into JLabel. so change Image object to ImageIcon object.
           
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           image.setBounds(400,20,200,200);
           add(image);
           
           setVisible(true);
           
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            
        } else if (ae.getSource() == cancel){
            setVisible(false);
        }
        
        
    }
            
    
    
    public static void main(String[] args) {
        
        new Login();
        
    }
    
}
