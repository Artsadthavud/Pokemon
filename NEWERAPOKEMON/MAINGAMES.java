package NEWERAPOKEMON;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MAINGAMES extends JFrame {

    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;
    
    public MAINGAMES(LIFEPOKEMON lifepokemon, PROFILEPARTNER profilepartner) {
    // Create Form Frame
    super("NEWERAPOGEMON");

    setSize(800, 600);
    setLocation(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    // Create Label
    JLabel labelHead = new JLabel(" Welcome to GUNGEMON ");
    labelHead.setBounds(320, 43, 300,14);
    labelHead.setForeground(Color.WHITE);

    JLabel label = new JLabel(" GUNGEMON the WORLD of GEMON ");
    label.setBounds(290, 83, 300, 14);
    label.setForeground(Color.WHITE);

    JLabel bagPic = new JLabel(new ImageIcon(getClass().getResource("/bagg.png")));
    bagPic.setSize(150, 150);
    bagPic.setLocation(180, 60);

    JLabel psPic = new JLabel(new ImageIcon(getClass().getResource(profilepartner.getsProfilePic())));
    psPic.setSize(150, 150);
    psPic.setLocation(480, 110);

    JLabel roPic = new JLabel(new ImageIcon(getClass().getResource("/roc.png")));
    roPic.setSize(150, 150);
    roPic.setLocation(180, 150);
    // Create Button
    JButton btnInventory = new JButton("INVENTORY");
    btnInventory.setBounds(300, 125, 200, 23);
    JButton btnMeet = new JButton("MEET PARTNER");
    btnMeet.setBounds(300, 175, 200, 23);
    JButton btnGym = new JButton(" GYM ");
    btnGym.setBounds(300, 225, 200, 23);

    // Create Event for Button
    btnInventory.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        // New Form
        INVENTORY form1 = new INVENTORY(lifepokemon,profilepartner);
        form1.setVisible(true);
        // Hide Current Form
        setVisible(false);
    }   
    });    
    btnMeet.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            // New Form
            MEET form1 = new MEET(lifepokemon,profilepartner);
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
    }); 
    btnGym.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
           // New Form
            GYM form1 = new GYM(lifepokemon,profilepartner);
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
        }
        }); 
    getContentPane().add(labelHead);
    getContentPane().add(label);
    getContentPane().add(bagPic);
    getContentPane().add(psPic);
    getContentPane().add(roPic);
    getContentPane().add(btnInventory);
    getContentPane().add(btnMeet);
    getContentPane().add(btnGym);

    Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/dpcc.png"));          // FOOD
    JLabel imgBg = new JLabel(imageBG);
    imgBg.setBounds(0, 0, 800, 600);
    getContentPane().add(imgBg);


    }  
}