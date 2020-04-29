package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm1 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
        super("NEWERAPOGEMON");
        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

            // Set image fo use
            Icon imageGOLD = new ImageIcon(getClass().getResource("/goldz.png"));          // GOLD
            Icon imagePotion = new ImageIcon(getClass().getResource("/potionz.png"));      // POTION
            Icon imageMana = new ImageIcon(getClass().getResource("/manaz.png"));          // MANA
            Icon imageFood = new ImageIcon(getClass().getResource("/foodz.png"));          // FOOD
                    // FOOD
           
            // Create Label
            JLabel labelHead = new JLabel("Welcome " + ACTIONONWORLD.getNamePlayer());   
            labelHead.setForeground(Color.WHITE);

            JLabel goal = new JLabel(" You have GOLD " +MONEY.getMoney()+" Stung");
            goal.setForeground(Color.WHITE);
         
            JLabel potion = new JLabel(" You have POTION " + INVENTORYSYSYEM.checkThing("Potion"));
            potion.setForeground(Color.WHITE);

            JLabel mana = new JLabel(" You have MANA " + INVENTORYSYSYEM.checkThing("Mana"));
            mana.setForeground(Color.WHITE);

            JLabel food = new JLabel(" You have FOOD " + INVENTORYSYSYEM.checkThing("Food"));
            food.setForeground(Color.WHITE);

            JLabel label = new JLabel("Choose Class Of Partner");
            label.setForeground(Color.WHITE);
            // Create image Label
            JLabel imgGold = new JLabel(imageGOLD);
            JLabel imgPotion = new JLabel(imagePotion);
            JLabel imgMana = new JLabel(imageMana);
            JLabel imgFood = new JLabel(imageFood);
          
            // Create Button
            JButton btnOpen = new JButton("1 : FIRE");
            JButton btnOpen1 = new JButton("2 : WATER");
            JButton btnOpen2 = new JButton("3 : DIRT");
            // Set x,y,w,h
                // Label
                labelHead.setBounds(380, 23, 300,50);
                goal.setBounds(250, 103, 200, 30);
                potion.setBounds(250, 200, 200, 30);
                mana.setBounds(250, 310, 200, 30);
                food.setBounds(250, 420, 200, 30);
                label.setBounds(480, 115, 200, 14);
                imgGold.setBounds(100, 50, 100, 100);
                imgPotion.setBounds(100, 170, 100, 100);
                imgMana.setBounds(100, 280, 100, 100);
                imgFood.setBounds(100, 390, 100, 100);
                btnOpen.setBounds(500, 165, 100, 23);
                btnOpen1.setBounds(500, 215, 100, 23);
                btnOpen2.setBounds(500, 265, 100, 23);

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

                // Call to Layout  
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
              

                Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/dpcc.png"));          // FOOD
    JLabel imgBg = new JLabel(imageBG);
    imgBg.setBounds(0, 0, 800, 600);
    getContentPane().add(imgBg);
              
    }   
}