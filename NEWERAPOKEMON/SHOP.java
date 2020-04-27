package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

public class SHOP extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SHOP form = new SHOP();
        
                form.setVisible(true);
            }
        });
    }

    public SHOP() {
// Create Form Frame
super("GUNGEMON");
setSize(800, 600);
setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


Icon imageGOLD = new ImageIcon(getClass().getResource("/goldz.png"));
Icon imagePotion = new ImageIcon(getClass().getResource("/potionz.png"));
Icon imageMana = new ImageIcon(getClass().getResource("/manaz.png"));
Icon imageFood = new ImageIcon(getClass().getResource("/foodz.png"));

getContentPane().setLayout(null);
// Create Label
JLabel labelHead = new JLabel("Wellcome to Shop " + ACTIONONWORLD.getNamePlayer());
labelHead.setBounds(380, 23, 300,50);

JLabel goal = new JLabel(" You have GOLD "+ MONEY.getMoney() +" Stung");
goal.setBounds(250, 103, 200, 30);


JLabel potion = new JLabel(" You have POTION " + INVENTORYSYSYEM.checkThing("Potion"));
potion.setBounds(250, 200, 200, 30);

JLabel mana = new JLabel(" You have MANA " + INVENTORYSYSYEM.checkThing("Mana"));
mana.setBounds(250, 310, 200, 30);

JLabel food = new JLabel(" You have FOOD " + INVENTORYSYSYEM.checkThing("Food"));
food.setBounds(250, 420, 200, 30);

JLabel label = new JLabel("Choose Item you need");
label.setBounds(480, 115, 200, 14);

// Create Button
JButton btnOpen = new JButton("1 : POTION x1");  
btnOpen.setBounds(480, 165, 120, 30);
JButton btnOpen1 = new JButton("2 : MANA x1");
btnOpen1.setBounds(480, 215, 120, 30);
JButton btnOpen2 = new JButton("3 : FOOD x1");
btnOpen2.setBounds(480, 265, 120, 30);
JButton btnBack = new JButton("4 : BACK");
btnBack.setBounds(560, 365, 100, 23);

JButton btnBuyPotion = new JButton("BUY");   // buy potion
btnBuyPotion.setBounds(670, 170, 60, 18);
getContentPane().add(btnBuyPotion);

JButton btnBuyMana = new JButton("BUY");    // buy mana
btnBuyMana.setBounds(670, 220, 60, 18);
getContentPane().add(btnBuyMana);

JButton btnBuyFood = new JButton("BUY");   // buy food
btnBuyFood.setBounds(670, 270, 60, 18);
getContentPane().add(btnBuyFood);

JTextField numbuyPotion;
    numbuyPotion = new JTextField(25);
numbuyPotion.setBounds(620, 170, 40, 20);
getContentPane().add(numbuyPotion);
JTextField numbuyMana;
    numbuyMana = new JTextField(25);
numbuyMana.setBounds(620, 220, 40, 20);
getContentPane().add(numbuyMana);
JTextField numbuyFood;
    numbuyFood = new JTextField(25);
numbuyFood.setBounds(620, 270, 40, 20);
getContentPane().add(numbuyFood);


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
btnBuyPotion.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
    int amount = 0;
    try {

        amount = btnBuyPotion.getInputContext();

        if(MONEY.getMoney() > 0 && MONEY.getMoney() - 100 >= 0){
            MONEY.updateMoney(-100 * amount);
            INVENTORYSYSYEM.addManyItemInventory("Potion",amount);
            goal.setText("You have GOLD "+ MONEY.getMoney() +"Stung");
            potion.setText(" You have POTION " + INVENTORYSYSYEM.checkThing("Potion"));
        }
        else{
            final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_potion.png"));
            JOptionPane.showMessageDialog(null," FAIL to BUY  Potion ","BUY POTION",JOptionPane.ERROR_MESSAGE,icon);
        }
        
    } catch (InputMismatchException e) {
        final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_potion.png"));
        JOptionPane.showMessageDialog(null," FAIL to BUY  Potion \n Please fill amount with Integer ","BUY POTION",JOptionPane.ERROR_MESSAGE,icon);
    }

    
}
}); 

    btnOpen.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if(MONEY.getMoney() > 0 && MONEY.getMoney() - 100 >= 0){
                MONEY.updateMoney(-100);
                INVENTORYSYSYEM.addItemInventory("Potion");
                goal.setText("You have GOLD "+ MONEY.getMoney() +"Stung");
                potion.setText(" You have POTION " + INVENTORYSYSYEM.checkThing("Potion"));
            }
            else{
                final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_potion.png"));
                JOptionPane.showMessageDialog(null," FAIL to BUY  Potion ","BUY POTION",JOptionPane.ERROR_MESSAGE,icon);
            }
        }
    }); 
   
    getContentPane().add(goal);
   

btnOpen1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        if(MONEY.getMoney() > 0 && MONEY.getMoney() - 100 >= 0){
            MONEY.updateMoney(-100);
            INVENTORYSYSYEM.addItemInventory("Mana");
            goal.setText("You have GOLD "+ MONEY.getMoney() +"Stung");
            mana.setText(" You have MANA " + INVENTORYSYSYEM.checkThing("Mana"));
          
        }
        else{
            final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_mana.png"));
            JOptionPane.showMessageDialog(null," FAIL to BUY  Mana ","BUY MANA",JOptionPane.ERROR_MESSAGE,icon);
        }
    }
    });   

    btnOpen2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if(MONEY.getMoney() > 0 && MONEY.getMoney() - 100 >= 0){
                MONEY.updateMoney(-200);
                INVENTORYSYSYEM.addItemInventory("Food");
                goal.setText("You have GOLD "+ MONEY.getMoney() +"Stung");
                food.setText(" You have FOOD " + INVENTORYSYSYEM.checkThing("Food"));
              
            }
            else{
                final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_food.png"));
                JOptionPane.showMessageDialog(null," FAIL to BUY  FOOD ","BUY FOOD",JOptionPane.ERROR_MESSAGE,icon);
            }
        }
        });  

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                    INVENTORY nShop = new INVENTORY();
                    nShop.setVisible(true);
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
getContentPane().add(btnBack);
}   
}