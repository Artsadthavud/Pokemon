package NEWERAPOKEMON;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class DUEL extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
   
    public DUEL(LIFEPOKEMON lifepokemon,LIFEPOKEMON foes, PROFILEPARTNER profilepartner,PROFILEFOES profilefoes) {
// Create Form Frame
        super("NEWERAPOGEMON");
        setSize(800, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

            // Create Label
            JLabel labelHead = new JLabel(" Wellcome to GUNGEMON GYM");
            labelHead.setBounds(320, 43, 300,14);
            JLabel label = new JLabel(" GUNGEMON the WORLD of GEMON ");
            label.setBounds(290, 83, 300, 14);

            JLabel fNamex = new JLabel(foes.getfName());
            fNamex.setBounds(450, 290, 400, 50);
            fNamex.setForeground(Color.red);
            JLabel Namex = new JLabel(lifepokemon.getName());
            Namex.setBounds(450, 380, 400, 50);
            Namex.setForeground(Color.red);

            JLabel statefNamex = new JLabel();
            statefNamex.setBounds(450, 320, 400, 50);
            statefNamex.setForeground(Color.red);
            JLabel stateNamex = new JLabel();
            stateNamex.setBounds(450, 420, 400, 50);
            stateNamex.setForeground(Color.red);
       
            JButton statusfHP = new JButton(" HP :  " + foes.getfHP() + " / " + foes.getMaxHP());
            statusfHP.setBounds(340, 40, 200, 20);
            statusfHP.setForeground(Color.white);
            statusfHP.setBackground(Color.black);

            JButton fName = new JButton(foes.getfName());
            fName.setBounds(340, 10, 200, 25);
            fName.setForeground(Color.white);
            fName.setBackground(Color.black);
       

            JButton Name = new  JButton(lifepokemon.getName());
            Name.setBounds(25, 150, 100, 30);
            Name.setForeground(Color.white);
            Name.setBackground(Color.black);

            JButton statusHP = new  JButton(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
            statusHP.setBounds(10, 180, 130, 20);
            statusHP.setForeground(Color.white);
            statusHP.setBackground(Color.black);

            JButton statusSP = new JButton(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
            statusSP.setBounds(10, 200, 130, 20);
            statusSP.setForeground(Color.white);
            statusSP.setBackground(Color.black);



            JButton playerPic = new  JButton(new ImageIcon(getClass().getResource(profilepartner.getProfilePic())));
            playerPic.setSize(250, 300);
            playerPic.setLocation(20, 250);

            JButton btnBack = new JButton(" escape ");
            btnBack.setBounds(500, 540, 200, 23);
            btnBack.setForeground(Color.white);
            btnBack.setBackground(Color.black);

            JButton foesPic = new JButton(new ImageIcon(getClass().getResource(profilefoes.getsProfilePic())));
            foesPic.setSize(200, 100);
            foesPic.setLocation(550, 20);

            // add skill
            JButton btnAtk = new JButton(new ImageIcon(getClass().getResource(profilepartner.getAtkPic())));
            btnAtk.setBounds(320, 250, 50, 50);
            JButton AtkDMG = new JButton("Damage : " + lifepokemon.getDMG());
            AtkDMG.setBounds(300, 300, 120, 20);
            AtkDMG.setForeground(Color.white);
            AtkDMG.setBackground(Color.black);

            JButton btnS1 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS1Pic())));
            btnS1.setBounds(320, 350, 50, 50);
            JButton s1DMG = new JButton("Damage : " + lifepokemon.gets1DMG() + " sp : 150");
            s1DMG.setBounds(285, 400, 155, 20);
            s1DMG.setForeground(Color.white);
            s1DMG.setBackground(Color.black);

            JButton btnS2 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS2Pic())));
            btnS2.setBounds(320, 460, 50, 50);
            JButton s2DMG = new JButton("Damage : " + lifepokemon.gets2DMG()+" sp : 300");
            s2DMG.setBounds(285, 510, 155, 20);
            s2DMG.setForeground(Color.white);
            s2DMG.setBackground(Color.black);

            JButton btnfAtk = new JButton(new ImageIcon(getClass().getResource(profilefoes.getAtkPic())));
            btnfAtk.setBounds(280, 70, 50, 50);

            JButton btnfS1 = new JButton(new ImageIcon(getClass().getResource(profilefoes.getS1Pic())));
            btnfS1.setBounds(360, 70, 50, 50);

            JButton btnfS2 = new JButton(new ImageIcon(getClass().getResource(profilefoes.getS2Pic())));
            btnfS2.setBounds(440, 70, 50, 50);

            // item
            JButton btnUsePotion = new JButton(new ImageIcon(getClass().getResource("/logo_potion.png")));
            btnUsePotion.setBounds(155, 160, 50, 50);
            btnUsePotion.setBackground(Color.black);

            JButton btnUseMana = new JButton(new ImageIcon(getClass().getResource("/logo_mana.png")));
            btnUseMana.setBounds(220, 160, 50, 50);
            btnUseMana.setBackground(Color.black);
        
            JButton potion = new JButton("X" + INVENTORYSYSYEM.checkThing("Potion"));
            potion.setBounds(145, 210, 70, 25);
            potion.setForeground(Color.red);
            potion.setBackground(Color.black);

            JButton mana = new JButton("X" + INVENTORYSYSYEM.checkThing("Mana"));
            mana.setBounds(210, 210, 70, 25);
            mana.setForeground(Color.red);
            mana.setBackground(Color.black);

            btnUsePotion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_potion.png"));

            if(INVENTORYSYSYEM.checkThing("Potion") > 0){
                INVENTORYSYSYEM.useIteminventory("Potion");
                lifepokemon.healHP(100);
                potion.setText(" X " +  INVENTORYSYSYEM.checkThing("Potion")); 
                statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
            }
            else{
                JOptionPane.showMessageDialog(null," Fail to Use  You have no Potion ","USE POTION",JOptionPane.INFORMATION_MESSAGE,icon);
            }
        }});
        btnUseMana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
                final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_mana.png"));

                if(INVENTORYSYSYEM.checkThing("Mana") > 0){
                    INVENTORYSYSYEM.useIteminventory("Mana");
                    lifepokemon.healSP(100);           
                    mana.setText(" X " +  INVENTORYSYSYEM.checkThing("Mana"));      
                    statusSP.setText(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
                }
                else{
                    JOptionPane.showMessageDialog(null," Fail to Use  You have no Mana ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                }
            }});


            foesPic.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                final ImageIcon icon = new ImageIcon(getClass().getResource(profilefoes.getsProfilePic()));
                int reward = 0 ;
                if(foes.getfName() == "ROSHAN"){
                    reward = 5000;
                    profilepartner.setgetAEGIS(true); 
                }
                else if(foes.getfName() == "TERRORBLADE"){
                    reward  = 8000;
                    profilepartner.setgetTB(true);
                }
                else if(foes.getfName() == "ZEUS"){
                    reward = 12000 ;
                }
                JOptionPane.showMessageDialog(null," " + profilefoes.getCall() + " \n " + "  Reward  GOLD "+ reward +"  Stung ",foes.getName(),JOptionPane.INFORMATION_MESSAGE,icon);
                }});


        btnfAtk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            final ImageIcon icon = new ImageIcon(getClass().getResource(profilefoes.getAtkPic()));
            JOptionPane.showMessageDialog(null,profilefoes.detailAtkf + " : DAMAGE : " + foes.getfDMG(),"NORMAL ATTACK",JOptionPane.INFORMATION_MESSAGE,icon);
    }});
    
        btnfS1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        final ImageIcon icon = new ImageIcon(getClass().getResource(profilefoes.getS1Pic()));
        JOptionPane.showMessageDialog(null,profilefoes.details1f + " : DAMAGE : " +  foes.getfs1DMG(),"SKILL 1",JOptionPane.INFORMATION_MESSAGE,icon);
    }});
    
        btnfS2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        final ImageIcon icon = new ImageIcon(getClass().getResource(profilefoes.getS2Pic()));
        JOptionPane.showMessageDialog(null, profilefoes.details2f + " : DAMAGE : " + foes.getfs2DMG(),"SKILL 2",JOptionPane.INFORMATION_MESSAGE,icon);
    }});

    
btnAtk.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        int damage = foes.attackFoes() ;

        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.getDMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),damage));


        Namex.setText(lifepokemon.getName() + " : HIT FOES BY NOMAL ATTACK ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName() + foes.nameSkill);

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + damage);
        statefNamex.setText(foes.getfName() + " : Recieve damage " + lifepokemon.getDMG());

        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusfHP.setText(" HP :  " + foes.getfHP() + " / 2000");

            if(foes.getfHP() == 0 ){

                int reward = 0 ;
                if(foes.getfName() == "ROSHAN"){
                    reward = 5000;
                    profilepartner.setgetAEGIS(true); 
                }
                else if(foes.getfName() == "TERRORBLADE"){
                    reward  = 8000;
                    profilepartner.setgetTB(true);
                }
                else if(foes.getfName() == "ZEUS"){
                    reward = 12000 ;
                }

                final ImageIcon icon = new ImageIcon(getClass().getResource("/win.png"));
                JOptionPane.showMessageDialog(null," YOU WIN !! \n Your reward Gold "+ reward+" Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(reward);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }
            else if(lifepokemon.getHP() == 0){
                final ImageIcon icon = new ImageIcon(getClass().getResource("/lose.png"));
                JOptionPane.showMessageDialog(null," YOU LOSE !! \n Your reward Gold 1000 Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(1000);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }

    }});

btnS1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
    if( lifepokemon.SP - 150 >= 0){
        int damage = foes.attackFoes() ;
        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.gets1DMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),damage));
        lifepokemon.useSP(150);

        Namex.setText(lifepokemon.getName() + " : HIT FOES BY SKILL 1 ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName() + foes.nameSkill);

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + damage);
        statefNamex.setText(foes.getfName() + " : Recieve damage " + lifepokemon.gets1DMG());

        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusfHP.setText(" HP :  " + foes.getfHP() + " / "+ foes.MaxHP);
        statusSP.setText(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());

            if(foes.getfHP() == 0 ){
                final ImageIcon icon = new ImageIcon(getClass().getResource("/win.png"));
                int reward = 0 ;
                if(foes.getfName() == "ROSHAN"){
                    reward = 5000;
                    profilepartner.setgetAEGIS(true); 
                }
                else if(foes.getfName() == "TERRORBLADE"){
                    reward  = 8000;
                    profilepartner.setgetTB(true);
                }
                else if(foes.getfName() == "ZEUS"){
                    reward = 12000 ;
                }
                

                JOptionPane.showMessageDialog(null," YOU WIN !! \n Your reward Gold "+ reward +" Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(reward);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }
            else if(lifepokemon.getHP() == 0){
                final ImageIcon icon = new ImageIcon(getClass().getResource("/lose.png"));
                JOptionPane.showMessageDialog(null," YOU LOSE !! \n Your reward Gold 1000 Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(1000);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }
        }
        else if(lifepokemon.getSP() - 150 < 0){
            final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_mana.png"));
            JOptionPane.showMessageDialog(null," YOU HAVE NO MANA TO USE SKILL" ," BATTLE ",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    
}
});    
btnS2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        if( lifepokemon.getSP() - 300 >= 0){
            int damage = foes.attackFoes() ;
        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.gets2DMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),damage));
        lifepokemon.useSP(300);

        Namex.setText(lifepokemon.getName() + " : HIT FOES BY SKILL 2 ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName() + foes.nameSkill);

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + damage);
        statefNamex.setText(foes.getfName() + " : Recieve damage " + lifepokemon.gets2DMG());

        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusfHP.setText(" HP :  " + foes.getfHP() + " / " + foes.getMaxHP());
        statusSP.setText(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());

        
            if(foes.getfHP() == 0 ){
                int reward = 0 ;
                if(foes.getfName() == "ROSHAN"){
                    reward = 5000;
                    profilepartner.setgetAEGIS(true); 
                }
                else if(foes.getfName() == "TERRORBLADE"){
                    reward  = 8000;
                    profilepartner.setgetTB(true);
                }
                else if(foes.getfName() == "ZEUS"){
                    reward = 12000 ;
                }
                final ImageIcon icon = new ImageIcon(getClass().getResource("/win.png"));
                JOptionPane.showMessageDialog(null," YOU WIN !! \n Your reward Gold " + reward +" Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(reward);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }
            else if(lifepokemon.getHP() == 0){
                final ImageIcon icon = new ImageIcon(getClass().getResource("/lose.png"));
                JOptionPane.showMessageDialog(null," YOU LOSE !! \n Your reward Gold 1000 Stung" ,"RESULT OF BATTLE",JOptionPane.INFORMATION_MESSAGE,icon);
                MONEY.updateMoney(1000);

                    GYM back = new GYM(lifepokemon,profilepartner);
                        back.setVisible(true);
                        setVisible(false);
            }
        }
        else if(lifepokemon.getSP() - 300 < 0){
            final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_mana.png"));
            JOptionPane.showMessageDialog(null," YOU HAVE NO MANA TO USE SKILL" ," BATTLE ",JOptionPane.INFORMATION_MESSAGE,icon);
        }
       
    }
    }); 


     btnBack.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            final ImageIcon icon = new ImageIcon(getClass().getResource("/escape.png"));
            JOptionPane.showMessageDialog(null,"  KRAJOKKK  " ,"  ESCAPE  ",JOptionPane.INFORMATION_MESSAGE,icon);
        // New Form
        GYM form1 = new GYM(lifepokemon,profilepartner);
            form1.setVisible(true);
             // Hide Current Form
             setVisible(false);
    }
});          
//getContentPane().add(labelHead);
//getContentPane().add(label);
getContentPane().add(foesPic);
getContentPane().add(playerPic);
getContentPane().add(btnS1); 
getContentPane().add(btnS2);
getContentPane().add(btnAtk);
getContentPane().add(btnfS1); 
getContentPane().add(btnfS2);
getContentPane().add(btnfAtk);
getContentPane().add(statusfHP);
getContentPane().add(statusHP);
getContentPane().add(statusSP);
getContentPane().add(fName);
getContentPane().add(Name);
getContentPane().add(AtkDMG);
getContentPane().add(s1DMG);
getContentPane().add(s2DMG);

getContentPane().add(potion);
getContentPane().add(mana);
getContentPane().add(fNamex);
getContentPane().add(Namex);
getContentPane().add(statefNamex);
getContentPane().add(stateNamex);
getContentPane().add(btnBack);

getContentPane().add(btnUsePotion);
getContentPane().add(btnUseMana);


Icon imageBG = new ImageIcon(getClass().getResource(profilefoes.getbgF()));          // FOOD
JLabel imgBg = new JLabel(imageBG);
imgBg.setBounds(0, 0, 800, 600);
getContentPane().add(imgBg);
}   
}