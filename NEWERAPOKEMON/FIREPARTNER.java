package NEWERAPOKEMON;

import javax.swing.*;

import GAMEPOKEMON2.MURASAME;

import java.awt.*;
import java.awt.event.*;

public class FIREPARTNER extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                FIREPARTNER form = new FIREPARTNER();
                form.setVisible(true);
            }

        });

    }

    public FIREPARTNER() {
        // Create Form Frame
        super("GUNGEMON");

        setSize(800, 600);

        setLocation(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);
        // Create Label

        JLabel harute1 = new JLabel(new ImageIcon(getClass().getResource("/ww.jpg")));
        harute1.setSize(250, 300);
        harute1.setLocation(50, 100);

        JLabel lina = new JLabel(new ImageIcon(getClass().getResource("/LINA.jpg")));
        lina.setSize(250, 300);
        lina.setLocation(475, 100);

        JLabel label = new JLabel("Choose your Partner");
        label.setBounds(330, 65, 200, 23);

        JButton fire1 = new JButton("1 : HARUTE");
        fire1.setBounds(75, 400, 200, 23);
        JButton fire2 = new JButton("2 : ASTRAY");
        fire2.setBounds(500, 400, 200, 23);
        JButton fire3 = new JButton("3 : BACK");
        fire3.setBounds(300, 500, 200, 23);

        fire1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                
                FIREPARTNER form2 = new FIREPARTNER();
                form2.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        });
        fire2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                FIREPARTNER form2 = new FIREPARTNER();
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
