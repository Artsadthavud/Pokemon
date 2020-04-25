package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm1 extends JFrame {
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
MyForm1 form = new MyForm1();
form.setVisible(true);
}
});
}
public MyForm1() {

// Create Form Frame

super("GUNGEMON");

setSize(800, 600);

setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Icon imageGOLD = new ImageIcon(getClass().getResource("/GOLD.png"));

getContentPane().setLayout(null);
// Create Label
JLabel labelHead = new JLabel("Wellcome " + ACTIONONWORLD.getNamePlayer());
labelHead.setBounds(120, 43, 300,14);

JLabel goal = new JLabel(" You have GOLD 1000 Stung");
goal.setBounds(160, 83, 200, 14);

JLabel label = new JLabel("Choose Class Of Partner");
label.setBounds(160, 115, 200, 14);

// Create Button
JButton btnOpen = new JButton("1 : FIRE");
btnOpen.setBounds(171, 145, 100, 23);
JButton btnOpen1 = new JButton("2 : WATER");
btnOpen1.setBounds(171, 185, 100, 23);
JButton btnOpen2 = new JButton("3 : DIRT");
btnOpen2.setBounds(171, 225, 100, 23);

// img gold
JLabel imgGold = new JLabel(imageGOLD);
imgGold.setBounds(140, 78, 24, 26);

// Create Event for Button
btnOpen.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
    // New Form
    FIREPARTNER form2 = new FIREPARTNER();
    form2.setVisible(true);
    // Hide Current Form
    setVisible(false);
}
});    
btnOpen1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        WATERPARTNER form2 = new WATERPARTNER();
        form2.setVisible(true);
        // Hide Current Form
        setVisible(false);
    }
    });   
    btnOpen2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            // New Form
            DIRTPARTNER form2 = new DIRTPARTNER();
            form2.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        });  

getContentPane().add(goal);
getContentPane().add(imgGold);
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(btnOpen);
getContentPane().add(btnOpen1);  
getContentPane().add(btnOpen2);
}   
}