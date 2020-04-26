package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GYM extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                GYM form = new GYM();
                form.setVisible(true);
            }
        });
    }

    public GYM() {
// Create Form Frame
super("GUNGEMON");

setSize(800, 600);
setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

getContentPane().setLayout(null);
// Create Label
JLabel labelHead = new JLabel(" Wellcome to GUNGEMON GYM");
labelHead.setBounds(320, 43, 300,14);
JLabel label = new JLabel(" GUNGEMON the WORLD of GEMON ");
label.setBounds(290, 83, 300, 14);

// Create Button
JButton btnMeet = new JButton(" FIGHT WITH FOES ");
btnMeet.setBounds(300, 175, 200, 23);

JButton btnBack = new JButton(" BACK ");
btnBack.setBounds(300, 220, 200, 23);

// Create Event for Button
btnMeet.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
       // New Form

        DUEL form1 = new DUEL();
        form1.setVisible(true);
        // Hide Current Form
        setVisible(false);
    }
    }); 
    btnBack.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
           // New Form
    
            MAINGAMES form1 = new MAINGAMES();
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        }); 
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(btnMeet);
getContentPane().add(btnBack);
}   
}