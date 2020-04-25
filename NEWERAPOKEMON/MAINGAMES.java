package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAINGAMES extends JFrame {
public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {
public void run() {
MyForm0 form = new MyForm0();
form.setVisible(true);
}
});
}
public MAINGAMES() {
// Create Form Frame
super("GUNGEMON");

setSize(500, 200);
setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

getContentPane().setLayout(new FlowLayout() );
// Create Label
JLabel labelHead = new JLabel(" Wellcome to GUNGEMON ");
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
    System.out.print(Name);
    ACTIONONWORLD.setNamePlayer(Name);
   // New Form
    MyForm1 form1 = new MyForm1();
    form1.setVisible(true);
    // Hide Current Form
    setVisible(false);
}
});    
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(NamePlayer);
getContentPane().add(btnOpen);
}   
}