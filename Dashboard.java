
package hotel.management.system;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame{
    
    Dashboard(){
        
        setBounds(0,0,1550,1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();  //menu bar is added on image present on total frame
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");   //menu is added on menubar
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");  //menu item is added on menu
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");  //menu item is added on menu
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");  //menu item is added on menu
        admin.add(addrooms);
        
        JMenuItem adddrivers = new JMenuItem("ADD DRIVERS");  //menu item is added on menu
        admin.add(adddrivers);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Dashboard();
    }
    
}
