package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

    public class DIRTPARTNER extends JFrame {
         /**
         *
         */
         private static final long serialVersionUID = 1L;
         public DIRTPARTNER() {
        // Create Form Frame
        super("NEWERAPOGEMON");
        PROFILEPARTNER profilepartner = new PROFILEPARTNER();
        setSize(800, 600);

        setLocation(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        // Create Label

        JLabel es = new JLabel(new ImageIcon(getClass().getResource("/Earthshaker.jpg")));
        es.setSize(250, 300);
        es.setLocation(50, 100);

        JLabel sk = new JLabel(new ImageIcon(getClass().getResource("/Sandking.jpg")));
        sk.setSize(250, 300);
        sk.setLocation(475, 100);

        JLabel label = new JLabel("Choose your Partner");
        label.setBounds(330, 65, 200, 23);
        label.setForeground(Color.WHITE);

        JButton dirt1 = new JButton("1 : Earthshaker");
        dirt1.setBounds(75, 400, 200, 23);
        JButton dirt2 = new JButton("2 : Sandking");
        dirt2.setBounds(500, 400, 200, 23);
        JButton dirt3 = new JButton("3 : BACK");
        dirt3.setBounds(300, 500, 200, 23);

        dirt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                 // add to bag
                LIFEPOKEMON EARTHSHAKER = new DIRT();
                EARTHSHAKER.addStatusPokemon("EARTHSHAKER","DIRT", 920, 420, 110,125,200);
                EARTHSHAKER.setMaxStatus(920, 420);
                 BAG.partner(EARTHSHAKER);
              
                 // set profile partner
                 profilepartner.setProfilePic("" + "/Earthshaker.jpg" + "");
                 profilepartner.setAtkPic("" + "/image/Sdirt1.png" + "");
                 profilepartner.setS1Pic("" + "/image/Sdirt2.png" + "");
                 profilepartner.setS2Pic("" + "/image/Sdirt3.png" + "");
                 profilepartner.setsProfilePic("" + "/esc.png" + "");
                 profilepartner.setDetailAtk("MELEE ATTACK");
                 profilepartner.setDetailS1("SAND STORM");
                 profilepartner.setDetailS2("METEO");
                // New Form
                MAINGAMES form2 = new MAINGAMES(EARTHSHAKER,profilepartner);
                form2.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        });
        dirt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                 // add to bag
                LIFEPOKEMON SANDKING = new DIRT();
                SANDKING.addStatusPokemon("SANDKING","DIRT", 900, 400, 111,125,200);
                SANDKING.setMaxStatus(900, 400);
                BAG.partner(SANDKING);
                
                 // set profile partner
                 profilepartner.setProfilePic("" + "/Sandking.jpg" + "");
                 profilepartner.setAtkPic("" + "/image/Sdirt1.png" + "");
                 profilepartner.setS1Pic("" + "/image/Sdirt4.png" + "");
                 profilepartner.setS2Pic("" + "/image/Sdirt5.png" + "");
                 profilepartner.setsProfilePic("" + "/skc.png" + "");
                 profilepartner.setDetailAtk("MELEE ATTACK");
                 profilepartner.setDetailS1("DIRT HAND");
                 profilepartner.setDetailS2("ANCIENT ORDER");
                // New Form
                MAINGAMES form2 = new MAINGAMES(SANDKING,profilepartner);
                form2.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        }); 
        dirt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                MyForm1 form1 = new MyForm1();
                form1.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        });          

    getContentPane().add(sk);
    getContentPane().add(es);
    getContentPane().add(label);
    getContentPane().add(dirt1);  
    getContentPane().add(dirt2);  
    getContentPane().add(dirt3); 

    Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/dpcc.png"));          // FOOD
    JLabel imgBg = new JLabel(imageBG);
    imgBg.setBounds(0, 0, 800, 600);
    getContentPane().add(imgBg);


    }  
}
