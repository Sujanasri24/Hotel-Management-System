/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;
//import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author SUJANASRI KADARLA
 */
public class HotelManagementSystem extends JFrame implements ActionListener{

    
    HotelManagementSystem()
    {
//        setSize(1366,565);                //These are for frame
//        setLocation(100, 100);             //all thse setting frame coordinate are wrt desktop screen
        setBounds(100,100,1366,565);       //(x,y) on desktop (length (horizontal),width(vertical)) of frame size
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));           // These are for image on frame
        JLabel image = new JLabel(i1);  //image component
        image.setBounds(0,0,1366,565);  // wrt frame
        add(image);  // by default takes border layout centre position, can be changed by using setLayout
        
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.ITALIC,50));
        image.add(text);  //if u say add(text) then the text will be added backside of image. so use image.add(text) to add on image.
        
        JButton next = new JButton("Next");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.DARK_GRAY);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.ITALIC,30));
        image.add(next);
        
        setVisible(true);  // by default frame visibility will be false
        
        while(true)
        {
            text.setVisible(false);
            try {
                
                    Thread.sleep(500);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            text.setVisible(true);
            try {
                
                    Thread.sleep(500);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            
    }
        public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Login();
            
        }
        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }
    
}
