package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WATERPARTNER extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                WATERPARTNER form = new WATERPARTNER();
                form.setVisible(true);
            }

        });

    }
    public WATERPARTNER() {
        // Create Form Frame
        super("NEWERAPOGEMON");
        PROFILEPARTNER profilepartner = new PROFILEPARTNER();
        setSize(800, 600);

        setLocation(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        // Create Label

        JLabel harute1 = new JLabel(new ImageIcon(getClass().getResource("/kunla.jpg")));
        harute1.setSize(250, 300);
        harute1.setLocation(50, 100);

        JLabel lina = new JLabel(new ImageIcon(getClass().getResource("/Slark.jpg")));
        lina.setSize(250, 300);
        lina.setLocation(475, 100);

        JLabel label = new JLabel("Choose your Partner");
        label.setBounds(330, 65, 200, 23);
        label.setForeground(Color.WHITE);

        JButton water1 = new JButton("1 : kunka");
        water1.setBounds(75, 400, 200, 23);
        JButton water2 = new JButton("2 : Slark");
        water2.setBounds(500, 400, 200, 23);
        JButton water3 = new JButton("3 : BACK");
        water3.setBounds(300, 500, 200, 23);

        water1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
           

                LIFEPOKEMON KUNKA = new FIRE();
                KUNKA.addStatusPokemon("KUNKA","WATER", 825, 455, 112,152,212);
                KUNKA.setMaxStatus(825, 455);
                BAG.partner(KUNKA);


                profilepartner.setProfilePic("" + "/kunla.jpg" + "");
                profilepartner.setAtkPic("" + "/image/Sblue1.png" + "");
                profilepartner.setS1Pic("" + "/image/Sblue2.png" + "");
                profilepartner.setS2Pic("" + "/image/Sblue3.png" + "");
                profilepartner.setsProfilePic("" + "/kkc.png" + "");
                profilepartner.setDetailAtk("MELEE ATTACK");
                profilepartner.setDetailS1("HOLY SHIELD");
                profilepartner.setDetailS2("HEARTEATER");
                
                // New Form
                MAINGAMES form2 = new MAINGAMES(KUNKA,profilepartner);
            form2.setVisible(true);
            // Hide Current Form
            setVisible(false);
            }
        });
        water2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                 // add to bag
                 LIFEPOKEMON SLARK = new WATER();
                 SLARK.addStatusPokemon("SLARK","WATER", 895, 460, 115,125,200);
                 SLARK.setMaxStatus(895, 460);
                 BAG.partner(SLARK);
                
               // set profile partner
               profilepartner.setProfilePic("" + "/Slark.jpg" + "");
               profilepartner.setAtkPic("" + "/image/Sblue1.png" + "");
               profilepartner.setS1Pic("" + "/image/Sblue4.png" + "");
               profilepartner.setS2Pic("" + "/image/Sblue5.png" + "");
               profilepartner.setsProfilePic("" + "/Slarkc.png" + "");
               profilepartner.setDetailAtk("MELEE ATTACK");
               profilepartner.setDetailS1("FEATHER SWORD");
               profilepartner.setDetailS2("DEMON FORM");
                // New Form
                MAINGAMES form2 = new MAINGAMES(SLARK,profilepartner);
            form2.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        }); 
water3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        MyForm1 form1 = new MyForm1();
        form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
    }
});          

getContentPane().add(harute1);
getContentPane().add(lina);
getContentPane().add(label);
getContentPane().add(water1);  
getContentPane().add(water2);  
getContentPane().add(water3); 

Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/dpcc.png"));          // FOOD
JLabel imgBg = new JLabel(imageBG);
imgBg.setBounds(0, 0, 800, 600);
getContentPane().add(imgBg);

}  
}
