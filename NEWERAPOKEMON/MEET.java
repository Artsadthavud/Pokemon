package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MEET extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public MEET(LIFEPOKEMON lifepokemon,PROFILEPARTNER profilepartner) {
        // Create Form Frame
        super("NEWERAPOGEMON");
       
    

        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        

        // Create Label
        JLabel profilePic = new JLabel(new ImageIcon(getClass().getResource(profilepartner.getProfilePic())));
        profilePic.setSize(250, 300);
        profilePic.setLocation(50, 100);

        JLabel label = new JLabel("MEET YOUR PARTNER ");
        label.setBounds(330, 45, 200, 50);
        label.setForeground(Color.WHITE);

       

        JButton statusHP = new JButton(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusHP.setBounds(80, 400, 200, 20);
        statusHP.setForeground(Color.black);

        JButton statusSP = new JButton(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
        statusSP.setBounds(80, 430, 200, 20);
        statusSP.setForeground(Color.black);

        JLabel namePart = new JLabel(lifepokemon.getName());
        namePart.setBounds(100, 55, 100, 40);
        namePart.setForeground(Color.white);

        JButton namePartmer = new JButton("Set New Partner Name");
        namePartmer.setBounds(470, 320, 200, 20);
    
        JButton btnFeedFood = new JButton(" FEED FOOD ");
        btnFeedFood.setBounds(470, 100, 200, 23);

        JButton btnUsePotion = new JButton(" USE POTION ");
        btnUsePotion.setBounds(470, 150, 200, 23);

        JButton btnUseMana = new JButton(" USE MANA ");
        btnUseMana.setBounds(470, 200, 200, 23);

        JButton btnAtk = new JButton(new ImageIcon(getClass().getResource(profilepartner.getAtkPic())));
        btnAtk.setBounds(360, 140, 50, 50);

        JButton btnS1 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS1Pic())));
        btnS1.setBounds(360, 220, 50, 50);

        JButton btnS2 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS2Pic())));
        btnS2.setBounds(360, 300, 50, 50);

        JButton fire3 = new JButton("3 : BACK");
        fire3.setBounds(400, 500, 200, 23);      

        namePartmer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CHANGNAME changname = new CHANGNAME(lifepokemon,profilepartner);
                changname.setVisible(true);
                setVisible(false);
            }

        });

        btnFeedFood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
                final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_food.png"));

                if(INVENTORYSYSYEM.checkThing("Food") > 0){
                    INVENTORYSYSYEM.useIteminventory("Food");
                    lifepokemon.healHP(50);
                    lifepokemon.healSP(50);
                    JOptionPane.showMessageDialog(null," Success to Feed  Your Food -1 ","FEED FOOD",JOptionPane.INFORMATION_MESSAGE,icon);
                    statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
                    statusSP.setText(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
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
                        lifepokemon.healHP(100);
                        JOptionPane.showMessageDialog(null," Success to Use  Your Potion -1 ","USE POTION",JOptionPane.INFORMATION_MESSAGE,icon);
                        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
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
                            lifepokemon.healSP(100);
                            JOptionPane.showMessageDialog(null," Success to Use  Your Mana -1 ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                            statusSP.setText(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
                        }
                        else{
                            JOptionPane.showMessageDialog(null," Fail to Use  You have no Mana ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                        }
                    }});

        btnAtk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                final ImageIcon icon = new ImageIcon(getClass().getResource(profilepartner.getAtkPic()));
                JOptionPane.showMessageDialog(null,profilepartner.detailAtk + " : DAMAGE : " + lifepokemon.getDMG(),"NORMAL ATTACK",JOptionPane.INFORMATION_MESSAGE,icon);
            }});

            btnS1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    final ImageIcon icon = new ImageIcon(getClass().getResource(profilepartner.getS1Pic()));
                    JOptionPane.showMessageDialog(null,profilepartner.details1 + " : DAMAGE : " + lifepokemon.gets1DMG(),"SKILL 1",JOptionPane.INFORMATION_MESSAGE,icon);
            }});

                btnS2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                    final ImageIcon icon = new ImageIcon(getClass().getResource(profilepartner.getS2Pic()));
                    JOptionPane.showMessageDialog(null,profilepartner.details2 + " : DAMAGE : " + lifepokemon.gets2DMG(),"SKILL 2",JOptionPane.INFORMATION_MESSAGE,icon);
                }});
                    
     
            fire3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                // New Form
                MAINGAMES form1 = new MAINGAMES(lifepokemon,profilepartner);
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

    Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/dpcc.png"));          // FOOD
JLabel imgBg = new JLabel(imageBG);
imgBg.setBounds(0, 0, 800, 600);
getContentPane().add(imgBg);
    
    }

}