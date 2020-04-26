package NEWERAPOKEMON;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class MEET extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                MEET form = new MEET();
                form.setVisible(true);
            }
        });
    }

    public MEET() {
        // Create Form Frame
        super("GUNGEMON");

        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        

        // Create Label
        JLabel profilePic = new JLabel(new ImageIcon(getClass().getResource(PROFILEPARTNER.getProfilePic())));
        profilePic.setSize(250, 300);
        profilePic.setLocation(50, 100);

        JLabel label = new JLabel("MEET YOUR PARTNER ");
        label.setBounds(330, 45, 200, 50);

       

        JLabel statusHP = new JLabel(" HP :  " + LIFEPOKEMON.getHP() + " /  " + LIFEPOKEMON.getMaxHP());
        statusHP.setBounds(80, 400, 200, 50);

        JLabel statusSP = new JLabel(" SP :  " + LIFEPOKEMON.getSP() + " / " + LIFEPOKEMON.getMaxSP());
        statusSP.setBounds(80, 430, 200, 50);

        JLabel namePart = new JLabel(LIFEPOKEMON.getName());
        namePart.setBounds(100, 55, 100, 40);

        JButton namePartmer = new JButton("Set New Partner Name");
        namePartmer.setBounds(470, 320, 200, 20);
    
        JButton btnFeedFood = new JButton(" FEED FOOD ");
        btnFeedFood.setBounds(470, 100, 200, 23);

        JButton btnUsePotion = new JButton(" USE POTION ");
        btnUsePotion.setBounds(470, 150, 200, 23);

        JButton btnUseMana = new JButton(" USE MANA ");
        btnUseMana.setBounds(470, 200, 200, 23);

        JButton btnAtk = new JButton(new ImageIcon(getClass().getResource(PROFILEPARTNER.getAtkPic())));
        btnAtk.setBounds(360, 140, 50, 50);

        JButton btnS1 = new JButton(new ImageIcon(getClass().getResource(PROFILEPARTNER.getS1Pic())));
        btnS1.setBounds(360, 220, 50, 50);

        JButton btnS2 = new JButton(new ImageIcon(getClass().getResource(PROFILEPARTNER.getS2Pic())));
        btnS2.setBounds(360, 300, 50, 50);

      

            namePartmer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                  CHANGNAME changname = new CHANGNAME();
                  changname.setVisible(true);
                  setVisible(false);
                }

            });

        btnFeedFood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
                final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_food.png"));

                if(INVENTORYSYSYEM.checkThing("Food") > 0){
                    INVENTORYSYSYEM.useIteminventory("Food");
                    JOptionPane.showMessageDialog(null," Success to Feed  Your Food -1 ","FEED FOOD",JOptionPane.INFORMATION_MESSAGE,icon);
                }
                else{
                    JOptionPane.showMessageDialog(null," Fail to Feed  You have no Food ","FEED FOOD",JOptionPane.INFORMATION_MESSAGE,icon);
                }
            }});
            btnUsePotion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                   
                    final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_potion.png"));
    
                    if(INVENTORYSYSYEM.checkThing("Potion") > 0){
                        INVENTORYSYSYEM.useIteminventory("Potion");
                        JOptionPane.showMessageDialog(null," Success to Use  Your Potion -1 ","USE POTION",JOptionPane.INFORMATION_MESSAGE,icon);
                    }
                    else{
                        JOptionPane.showMessageDialog(null," Fail to Use  You have no Potion ","USE POTION",JOptionPane.INFORMATION_MESSAGE,icon);
                    }
                }});
                btnUseMana.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                       
                        final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_mana.png"));
        
                        if(INVENTORYSYSYEM.checkThing("Mana") > 0){
                            INVENTORYSYSYEM.useIteminventory("Mana");
                            JOptionPane.showMessageDialog(null," Success to Use  Your Mana -1 ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                        }
                        else{
                            JOptionPane.showMessageDialog(null," Fail to Use  You have no Mana ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                        }
                    }});

        btnAtk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
        final ImageIcon icon = new ImageIcon(getClass().getResource(PROFILEPARTNER.getAtkPic()));
        JOptionPane.showMessageDialog(null,PROFILEPARTNER.detailAtk + " : DAMAGE : " + LIFEPOKEMON.getDMG(),"NORMAL ATTACK",JOptionPane.INFORMATION_MESSAGE,icon);
            }});
            btnS1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
            final ImageIcon icon = new ImageIcon(getClass().getResource(PROFILEPARTNER.getS1Pic()));
            JOptionPane.showMessageDialog(null,PROFILEPARTNER.details1 + " : DAMAGE : " + LIFEPOKEMON.gets1DMG(),"SKILL 1",JOptionPane.INFORMATION_MESSAGE,icon);
                }});
                btnS2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                final ImageIcon icon = new ImageIcon(getClass().getResource(PROFILEPARTNER.getS2Pic()));
                JOptionPane.showMessageDialog(null,PROFILEPARTNER.details2 + " : DAMAGE : " + LIFEPOKEMON.gets2DMG(),"SKILL 2",JOptionPane.INFORMATION_MESSAGE,icon);
                    }});
                    
        JButton fire3 = new JButton("3 : BACK");
        fire3.setBounds(400, 500, 200, 23);

        fire3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                MAINGAMES form1 = new MAINGAMES();
                    form1.setVisible(true);
                     // Hide Current Form
                     setVisible(false);
            }
        });          

getContentPane().add(profilePic);
getContentPane().add(label);

getContentPane().add(namePart);
getContentPane().add(namePartmer);
getContentPane().add(statusHP);
getContentPane().add(statusSP);
getContentPane().add(btnFeedFood); 
getContentPane().add(btnUsePotion);
getContentPane().add(btnUseMana);  
getContentPane().add(btnS1); 
getContentPane().add(btnS2);
getContentPane().add(btnAtk);
getContentPane().add(fire3); 
}  
}