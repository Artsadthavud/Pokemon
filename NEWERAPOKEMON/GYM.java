package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;

public class GYM extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GYM(LIFEPOKEMON lifepokemon,PROFILEPARTNER profilepartner) {
        // Create Form Frame
        super("NEWERAPOGEMON");
        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create Label
        JLabel labelHead = new JLabel(" Wellcome to GUNGEMON GYM");
        labelHead.setBounds(540, 13, 300,14);
        labelHead.setForeground(Color.white);
        JLabel label = new JLabel(" GUNGEMON the WORLD of GEMON ");
        label.setBounds(290, 23, 300, 14);
        label.setForeground(Color.white);

        // Create Button
        JButton btnMeet = new JButton(" FIGHT WITH FOES ");
        btnMeet.setBounds(200, 175, 150, 23);
        btnMeet.setForeground(Color.red);
        btnMeet.setBackground(Color.black);

        JButton btnBack = new JButton(" BACK ");
        btnBack.setBounds(600, 520, 200, 23);

        // Create Event for Button
        btnMeet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            // New Form
            SELECTFOES form1 = new SELECTFOES(lifepokemon,profilepartner);
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
            }
        }); 

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                MAINGAMES form1 = new MAINGAMES(lifepokemon,profilepartner);
                form1.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        }); 

    getContentPane().add(labelHead);
    getContentPane().add(label);
    getContentPane().add(btnMeet);
    getContentPane().add(btnBack);

    Icon imageBG = new ImageIcon(getClass().getResource("/image/gif/mainCombo.png"));          // FOOD
    JLabel imgBg = new JLabel(imageBG);
    imgBg.setBounds(0, 0, 800, 600);
    getContentPane().add(imgBg);
    

    }
  
}