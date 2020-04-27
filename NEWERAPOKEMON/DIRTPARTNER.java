package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DIRTPARTNER extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                DIRTPARTNER form = new DIRTPARTNER();
                form.setVisible(true);
            }
        });
    }

    public DIRTPARTNER() {
        // Create Form Frame
        super("GUNGEMON");

        setSize(800, 600);

        setLocation(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        // Create Label

        JLabel harute1 = new JLabel(new ImageIcon(getClass().getResource("/Earthshaker.jpg")));
        harute1.setSize(250, 300);
        harute1.setLocation(50, 100);

        JLabel lina = new JLabel(new ImageIcon(getClass().getResource("/Sandking.jpg")));
        lina.setSize(250, 300);
        lina.setLocation(475, 100);

        JLabel label = new JLabel("Choose your Partner");
        label.setBounds(330, 65, 200, 23);

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
                 PROFILEPARTNER.setProfilePic("" + "/Earthshaker.jpg" + "");
                 PROFILEPARTNER.setAtkPic("" + "/image/Sdirt1.png" + "");
                 PROFILEPARTNER.setS1Pic("" + "/image/Sdirt2.png" + "");
                 PROFILEPARTNER.setS2Pic("" + "/image/Sdirt3.png" + "");
                 PROFILEPARTNER.setDetailAtk("MELEE ATTACK");
                PROFILEPARTNER.setDetailS1("SAND STORM");
                PROFILEPARTNER.setDetailS2("METEO");
                // New Form
                MAINGAMES form2 = new MAINGAMES(EARTHSHAKER);
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
                 PROFILEPARTNER.setProfilePic("" + "/Sandking.jpg" + "");
                 PROFILEPARTNER.setAtkPic("" + "/image/Sdirt1.png" + "");
                 PROFILEPARTNER.setS1Pic("" + "/image/Sdirt4.png" + "");
                 PROFILEPARTNER.setS2Pic("" + "/image/Sdirt5.png" + "");
                 PROFILEPARTNER.setDetailAtk("MELEE ATTACK");
                PROFILEPARTNER.setDetailS1("DIRT HAND");
                PROFILEPARTNER.setDetailS2("ANCIENT ORDER");
                // New Form
                MAINGAMES form2 = new MAINGAMES(SANDKING);
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

getContentPane().add(harute1);
getContentPane().add(lina);
getContentPane().add(label);
getContentPane().add(dirt1);  
getContentPane().add(dirt2);  
getContentPane().add(dirt3); 
}  
}
