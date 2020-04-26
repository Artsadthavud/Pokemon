package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CHANGNAME extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                CHANGNAME form = new CHANGNAME();
                form.setVisible(true);
            }
        });
    }

    public CHANGNAME() {
// Create Form Frame
super("GUNGEMON");

setSize(500, 400);
setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

getContentPane().setLayout(new FlowLayout() );

JLabel profilePic = new JLabel(new ImageIcon(getClass().getResource(PROFILEPARTNER.getProfilePic())));
profilePic.setSize(250, 300);
profilePic.setLocation(125, 200);
// Create Label
JLabel labelHead = new JLabel("Change Name Partner ");
labelHead.setBounds(160, 43, 300,14);
JLabel label = new JLabel("Please Enter your name ");
label.setBounds(160, 53, 200, 14);
// Create Button
JButton btnOpen = new JButton(" OK ");
btnOpen.setBounds(171, 95, 100, 23);
// Create Event for Button

JTextField NamePlayer;
NamePlayer  = new JTextField(25);

 
btnOpen.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
    
    // set name form input
    String Name = NamePlayer.getText();
    LIFEPOKEMON.addName(Name);
   // New Form
    MEET form1 = new MEET();
    form1.setVisible(true);
    // Hide Current Form
    setVisible(false);
}
});    
getContentPane().add(profilePic);
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(NamePlayer);
getContentPane().add(btnOpen);
}   
}