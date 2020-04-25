package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class MAINGAME extends JFrame {
        private JTextField jtf;
        int checkCloseName = 1;
        public MAINGAME() {
            super( "WELLCOME TO GUNGEMON " );
            Container c = getContentPane();
            c.setLayout( new FlowLayout() );
            JLabel jl0 = new JLabel("WELLCOME TO GUNGEMON ");
            JLabel jl = new JLabel("Enter your name:");
           
            jtf  = new JTextField(25);   // 25 chars wide
           
            c.add( jl0 );
            c.add( jl );
            c.add( jtf );
            
            jtf.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("You entered " + e.getActionCommand() );
                    jtf.setText("");
                    ACTIONONWORLD.setNamePlayer(e.getActionCommand());
                    System.out.println("You name " + ACTIONONWORLD.getNamePlayer() );
                    checkCloseName = 0 ;
                }
            });           
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,100);
        setVisible(true);

     
       }
      
}