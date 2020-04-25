package NEWERAPOKEMON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WATERPARTNER extends JFrame {
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
        super("GUNGEMON");

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

        JButton water1 = new JButton("1 : kunka");
        water1.setBounds(75, 400, 200, 23);
        JButton water2 = new JButton("2 : Slark");
        water2.setBounds(500, 400, 200, 23);
        JButton water3 = new JButton("3 : BACK");
        water3.setBounds(300, 500, 200, 23);

        water1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                WATERPARTNER form2 = new WATERPARTNER();
                form2.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        });
        water2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // New Form
                WATERPARTNER form2 = new WATERPARTNER();
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
}  
}
