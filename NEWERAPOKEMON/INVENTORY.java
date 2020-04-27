package NEWERAPOKEMON;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class INVENTORY extends JFrame {

    public INVENTORY(LIFEPOKEMON lifepokemon) {
        // Create Form Frame
        super("GUNGEMON");

        setSize(800, 600);

        setLocation(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        // Create Label

        JLabel Money = new JLabel(new ImageIcon(getClass().getResource("/GOLD.png")));
        Money.setSize(200, 200);
        Money.setLocation(50, 100);

        JLabel Potion = new JLabel(new ImageIcon(getClass().getResource("/Potion.png")));
        Potion.setSize(200, 200);
        Potion.setLocation(200, 100);

        JLabel Mana = new JLabel(new ImageIcon(getClass().getResource("/Manax.png")));
        Mana.setSize(200, 200);
        Mana.setLocation(350, 100);

        
        JLabel Food = new JLabel(new ImageIcon(getClass().getResource("/Food.png")));
        Food.setSize(200, 200);
        Food.setLocation(500, 100);

        JLabel label = new JLabel(" YOUR INVENTORY ");
        label.setBounds(330, 65, 200, 50);

        JLabel statusMoney = new JLabel("Your Money : \n" + MONEY.getMoney() + " Stung");
        statusMoney.setBounds(75, 300, 150, 23);
        JLabel statusPotion = new JLabel("Your Potion : " + INVENTORYSYSYEM.checkThing("Potion"));
        statusPotion.setBounds(260, 300, 150, 23);
        JLabel statusMana = new JLabel("Your Mana : " + INVENTORYSYSYEM.checkThing("Mana"));
        statusMana.setBounds(410, 300, 150, 23);
        JLabel statusFood = new JLabel("Your Food : " + INVENTORYSYSYEM.checkThing("Food"));
        statusFood.setBounds(560, 300, 150, 23);

        JButton fire3 = new JButton("3 : BACK");
        fire3.setBounds(300, 500, 200, 23);

        JButton shop = new JButton(" --- GO TO SHOP ---");
        shop.setBounds(300, 400, 200, 23);

    fire3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        MAINGAMES form1 = new MAINGAMES(lifepokemon);
        form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
    }
});  

shop.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        SHOP form1 = new SHOP(lifepokemon);
        form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
    }
});     

getContentPane().add(Money);
getContentPane().add(Potion);
getContentPane().add(Mana);
getContentPane().add(Food);
getContentPane().add(label);
getContentPane().add(statusPotion);  
getContentPane().add(statusMoney); 
getContentPane().add(statusMana); 
getContentPane().add(statusFood);  
getContentPane().add(fire3); 
getContentPane().add(shop); 
}  
}
