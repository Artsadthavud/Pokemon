package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SELECTFOES extends JFrame {
   
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SELECTFOES form = new SELECTFOES(new FIRE(),null);
                    form.setVisible(true);
            }
        });
    }

   protected String foesPics1;
   protected String foesPics2;
   protected String foesName1 ;
   protected String foesName2 ;
    

    public SELECTFOES(LIFEPOKEMON lifepokemon ,PROFILEPARTNER profilepartner) {
        // Create Form Frame
        super("GUNGEMON");
        PROFILEFOES profilefoes = new PROFILEFOES();
        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create Label
        JLabel label = new JLabel(" WELCOME TO BATTLE CHOOSE YOUR FOES ");
        label.setBounds(270, 23, 300, 14);

        // Create Button
      





        if(profilepartner.getAEGIS == false){
            this.foesName1 = "SECRET";
            foesPics1 = "" + "/bg.png" + "";
        }
        else if(profilepartner.getAEGIS == true){
            this.foesName1 = "TERRORBLADE";
            foesPics1 =  "" + "/image/boss/tb.png" + "" ;
        }

        
        if(profilepartner.getTB == false){
            foesName2 = "SECRET";
            foesPics2 = "" + "/bg.png" + "";

        }
        else if(profilepartner.getTB == true){
            foesName2 = "ZEUS";
            foesPics2 = "" + "/image/boss/zeus.png" + "";

        }

        JButton btnFoes0 = new JButton(" FIGHT WITH ROSHAN");
        btnFoes0.setBounds(30, 500, 220, 23);

        JButton btnFoes1 = new JButton(" FIGHT WITH " + foesName1);
        btnFoes1.setBounds(285, 500, 220, 23);

        JButton btnFoes2 = new JButton(" FIGHT WITH "+ foesName2);
        btnFoes2.setBounds(540, 500, 220, 23);



        JButton btnPicFoes0 = new JButton(new ImageIcon(getClass().getResource("/image/boss/ro.png")));
        btnPicFoes0.setBounds(30, 90, 220, 400);

        JButton btnPicFoes1 = new JButton(new ImageIcon(getClass().getResource(foesPics1)));
        btnPicFoes1.setBounds(285, 90, 220, 400);

        JButton btnPicFoes2 = new JButton(new ImageIcon(getClass().getResource(foesPics2)));
        btnPicFoes2.setBounds(540, 90, 220, 400);

        JButton btnBack = new JButton(" BACK ");
        btnBack.setBounds(350, 530, 100, 23);

        // Create Event for Button
        btnFoes0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                LIFEPOKEMON foes = new DARK();
                foes.addFoesStatus("ROSHAN", "DARK", 2000, 120,200,350);
                foes.setMaxStatus(2000, 0);
                profilefoes.setProfilePic("" + "/image/boss/ro.png" + "");
                profilefoes.setsProfilePic("" + "/roz.png" + "");
                profilefoes.setAtkPic("" + "/image/Sro1.png" + "");
                profilefoes.setS1Pic("" + "/image/Sro2.png" + "");
                profilefoes.setS2Pic("" + "/image/Sro3.png" + "");
                profilefoes.setDetailAtk("MELEE ATTACK");
                profilefoes.setDetailS1("ELDER DRAGON");
                profilefoes.setDetailS2("LORD OF DEATH");
                profilefoes.setCall(" THE KING OF THE DEMON");

            // New Form
            DUEL form1 = new DUEL(lifepokemon,foes,profilepartner,profilefoes);
            form1.setVisible(true);
            // Hide Current Form
            setVisible(false);
            }
        }); 

        btnFoes1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            if(profilepartner.getAEGIS == true){
                LIFEPOKEMON foes = new DARK();
                foes.addFoesStatus("TERRORBLADE", "DARK", 6000, 200,370,550);
                foes.setMaxStatus(6000, 0);
                profilefoes.setProfilePic("" + "/image/boss/tb.png" + "");
                profilefoes.setsProfilePic("" + "/image/boss/tbP.png" + "");
                profilefoes.setAtkPic("" + "/image/boss/s1tb.png" + "");
                profilefoes.setS1Pic("" + "/image/boss/s2tb.png" + "");
                profilefoes.setS2Pic("" + "/image/boss/s3tb.png" + "");
                profilefoes.setDetailAtk("CONJURE IMAGE");
                profilefoes.setDetailS1("REFLECTION");
                profilefoes.setDetailS2("METAMLRPHOSIS");
                profilefoes.setCall(" THE KING OF THE DEMON SLAYER");
                
                // New Form
                DUEL form1 = new DUEL(lifepokemon,foes,profilepartner,profilefoes);
                form1.setVisible(true);
                // Hide Current Form
                setVisible(false);
            }
        
            else if (profilepartner.getAEGIS == false){
                final ImageIcon icon = new ImageIcon(getClass().getResource("/escape.png"));
                JOptionPane.showMessageDialog(null," WIN ROSHAN TO UNLOCK  " ,"  UNLOCK  ",JOptionPane.INFORMATION_MESSAGE,icon);

            }
        }});

        btnFoes2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(profilepartner.getTB == true){
                LIFEPOKEMON foes = new DARK();
                foes.addFoesStatus("ZEUS", "GOD", 10000, 280,370,650);
                foes.setMaxStatus(10000, 0);
                profilefoes.setProfilePic("" + "/image/boss/zeus.png" + "");
                profilefoes.setsProfilePic("" + "/image/boss/zeusP.png" + "");
                profilefoes.setAtkPic("" + "/image/boss/s1zeus.png" + "");
                profilefoes.setS1Pic("" + "/image/boss/s2zeus.png" + "");
                profilefoes.setS2Pic("" + "/image/boss/s3zeus.png" + "");
                profilefoes.setDetailAtk("ARC LIGHTNING");
                profilefoes.setDetailS1("STATIC FIELD");
                profilefoes.setDetailS2("THUNDERGOD WRATH");
                profilefoes.setCall(" THE GOD OF THE WORLD");

                // New Form
                DUEL form1 = new DUEL(lifepokemon,foes,profilepartner,profilefoes);
                form1.setVisible(true);
                // Hide Current Form
                setVisible(false);
                }
                else if(profilepartner.getTB == false){
                    final ImageIcon icon = new ImageIcon(getClass().getResource("/escape.png"));
                    JOptionPane.showMessageDialog(null,"  SLAY THEM BEFORE COME TO ME  " ,"  UNLOCK  ",JOptionPane.INFORMATION_MESSAGE,icon);
                }
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

    getContentPane().add(label);
    getContentPane().add(btnFoes0);
    getContentPane().add(btnFoes1);
    getContentPane().add(btnFoes2);
    getContentPane().add(btnPicFoes0);
    getContentPane().add(btnPicFoes1);
    getContentPane().add(btnPicFoes2);
    getContentPane().add(btnBack);
    }   
}