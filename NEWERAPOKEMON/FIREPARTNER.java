package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.event.*;

public class FIREPARTNER extends JFrame {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public FIREPARTNER() {
        // Create Form Frame
        super("GUNGEMON");
        PROFILEPARTNER profilepartner = new PROFILEPARTNER();
        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        // Create Label
        JLabel harute1 = new JLabel(new ImageIcon(getClass().getResource("/jugs.jpg")));
        harute1.setSize(250, 300);
        harute1.setLocation(50, 100);

        JLabel lina = new JLabel(new ImageIcon(getClass().getResource("/linaz.jpg")));
        lina.setSize(250, 300);
        lina.setLocation(475, 100);

        JLabel label = new JLabel("Choose your Partner");
        label.setBounds(330, 65, 200, 23);

        JButton fire1 = new JButton("1 : YURNERO");
        fire1.setBounds(75, 400, 200, 23);
        JButton fire2 = new JButton("2 : LINA");
        fire2.setBounds(500, 400, 200, 23);
        JButton fire3 = new JButton("3 : BACK");
        fire3.setBounds(300, 500, 200, 23);

        fire1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // add to bag
                LIFEPOKEMON YURNERO = new FIRE();
                YURNERO.addStatusPokemon("YURNERO","FIRE", 850, 450, 120, 125,200);
                YURNERO.setMaxStatus(850, 450);
                BAG.partner(YURNERO);
                // set profile partner
                profilepartner.setProfilePic("" + "/jugs.jpg" + "");
                profilepartner.setAtkPic("" + "/image/Sred1.png" + "");
                profilepartner.setS1Pic("" + "/image/Sred2.png" + "");
                profilepartner.setS2Pic("" + "/image/Sred3.png" + "");
                profilepartner.setsProfilePic("" + "/jugc.png" + "");
                profilepartner.setDetailAtk("MELEE ATTACK");
                profilepartner.setDetailS1("BREAK SHIELD");
                profilepartner.setDetailS2("BURN BABY BURN");

                // New Form
                MAINGAMES form2 = new MAINGAMES(YURNERO,profilepartner);
                form2.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        });
        fire2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // add to bag
                LIFEPOKEMON LINA = new FIRE();
                LINA.addStatusPokemon("LINA","FIRE", 825, 455, 112,152,212);
                LINA.setMaxStatus(825, 455);
                BAG.partner(LINA);
                profilepartner.setProfilePic("" + "/linaz.jpg" + "");
                profilepartner.setAtkPic("" + "/image/Sred4.png" + "");
                profilepartner.setS1Pic("" + "/image/Sred6.png" + "");
                profilepartner.setS2Pic("" + "/image/Sred5.png" + "");
                profilepartner.setsProfilePic("" + "/linac.png" + "");
                profilepartner.setDetailAtk("RANGE ATTACK");
                profilepartner.setDetailS1("SUPER ARROW");
                profilepartner.setDetailS2("SET FIRE TO THE RAIN");
                
                // New Form
                MAINGAMES form2 = new MAINGAMES(LINA,profilepartner);
            form2.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        }); 
fire3.addActionListener(new ActionListener() {
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
getContentPane().add(fire1);  
getContentPane().add(fire2);  
getContentPane().add(fire3); 
}  
}
