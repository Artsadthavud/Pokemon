package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAINGAMES extends JFrame {
public static void main(String[] args) {

    EventQueue.invokeLater(new Runnable() {
        public void run() {
            MAINGAMES form = new MAINGAMES();
                form.setVisible(true);
        }
    });
}

public MAINGAMES() {
    // Create Form Frame
    super("GUNGEMON");

    setSize(800, 600);
    setLocation(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    // Create Label
    JLabel labelHead = new JLabel(" Welcome to GUNGEMON ");
    labelHead.setBounds(320, 43, 300,14);
    JLabel label = new JLabel(" GUNGEMON the WORLD of GEMON ");
    label.setBounds(290, 83, 300, 14);

    JLabel bagPic = new JLabel(new ImageIcon(getClass().getResource("/bagg.png")));
    bagPic.setSize(150, 150);
    bagPic.setLocation(600, 50);
    // Create Button
    JButton btnInventory = new JButton("INVENTORY");
    btnInventory.setBounds(300, 125, 200, 23);
    JButton btnMeet = new JButton("MEET PARTNER");
    btnMeet.setBounds(300, 175, 200, 23);
    JButton btnGym = new JButton(" GYM ");
    btnGym.setBounds(300, 225, 200, 23);

    // Create Event for Button
    btnInventory.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        INVENTORY form1 = new INVENTORY();
        form1.setVisible(true);
        // Hide Current Form
        setVisible(false);
    }   
    });    
    btnMeet.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            // New Form
            MEET form1 = new MEET();
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
    }); 
    btnGym.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
           // New Form
            GYM form1 = new GYM();
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        }); 
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(bagPic);
getContentPane().add(btnInventory);
getContentPane().add(btnMeet);
getContentPane().add(btnGym);
}   
}