package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CHANGNAME extends JFrame {
  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CHANGNAME(LIFEPOKEMON lifepokemon,PROFILEPARTNER profilepartner) {
        // Create Form Frame
        super("NEWERAPOGEMON");

        setSize(500, 400);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout() );

        // Create Label
        JLabel profilePic = new JLabel(new ImageIcon(getClass().getResource(profilepartner.getProfilePic())));
            profilePic.setSize(250, 300);
            profilePic.setLocation(125, 200);

        JLabel labelHead = new JLabel("Change Name Partner ");
            labelHead.setBounds(160, 43, 300,14);

        JLabel label = new JLabel("Please Enter your name ");
            label.setBounds(160, 53, 200, 14);

        // Create Button
        JButton btnOpen = new JButton(" OK ");
            btnOpen.setBounds(171, 95, 100, 23);

        // Create Textfield
        JTextField NamePlayer;
            NamePlayer  = new JTextField(25);

        // Create Event for Button
            btnOpen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
    
                    // set name form input
                    String Name = NamePlayer.getText();
                    lifepokemon.addName(Name);
                    // New Form
                    MEET form1 = new MEET(lifepokemon,profilepartner);
                    form1.setVisible(true);
                    // Hide Current Form
                    setVisible(false);
                }
            });    


        getContentPane().add(profilePic);
        getContentPane().add(labelHead);
        getContentPane().add(label);
        getContentPane().add(NamePlayer);
        getContentPane().add(btnOpen);
    }   
}