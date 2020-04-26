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

                // add base item
                ADDBASEITEM.addBaseItem();

Icon imageGOLD = new ImageIcon(getClass().getResource("/goldz.png"));
Icon imagePotion = new ImageIcon(getClass().getResource("/potionz.png"));
Icon imageMana = new ImageIcon(getClass().getResource("/manaz.png"));
Icon imageFood = new ImageIcon(getClass().getResource("/foodz.png"));

getContentPane().setLayout(null);
// Create Label
JLabel labelHead = new JLabel("Wellcome " + ACTIONONWORLD.getNamePlayer());
labelHead.setBounds(380, 23, 300,50);

JLabel goal = new JLabel(" You have GOLD 1000 Stung");
goal.setBounds(250, 103, 200, 30);

JLabel potion = new JLabel(" You have POTION 10");
potion.setBounds(250, 200, 200, 30);

JLabel mana = new JLabel(" You have MANA 10");
mana.setBounds(250, 310, 200, 30);

JLabel food = new JLabel(" You have FOOD 10");
food.setBounds(250, 420, 200, 30);

JLabel label = new JLabel("Choose Class Of Partner");
label.setBounds(480, 115, 200, 14);

// Create Button
JButton btnOpen = new JButton("1 : FIRE");
btnOpen.setBounds(500, 165, 100, 23);
JButton btnOpen1 = new JButton("2 : WATER");
btnOpen1.setBounds(500, 215, 100, 23);
JButton btnOpen2 = new JButton("3 : DIRT");
btnOpen2.setBounds(500, 265, 100, 23);

// img gold
JLabel imgGold = new JLabel(imageGOLD);
imgGold.setBounds(100, 50, 100, 100);

JLabel imgPotion = new JLabel(imagePotion);
imgPotion.setBounds(100, 170, 100, 100);

JLabel imgMana = new JLabel(imageMana);
imgMana.setBounds(100, 280, 100, 100);

JLabel imgFood = new JLabel(imageFood);
imgFood.setBounds(100, 390, 100, 100);


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
getContentPane().add(potion);
getContentPane().add(mana);
getContentPane().add(food);
getContentPane().add(imgGold);
getContentPane().add(imgPotion);
getContentPane().add(imgMana);
getContentPane().add(imgFood);
getContentPane().add(labelHead);
getContentPane().add(label);
getContentPane().add(btnOpen);
getContentPane().add(btnOpen1);  
getContentPane().add(btnOpen2);
}   
}