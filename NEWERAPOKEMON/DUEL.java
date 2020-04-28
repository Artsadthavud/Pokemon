package NEWERAPOKEMON;
import javax.swing.*;
import java.awt.event.*;

public class DUEL extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
   
    public DUEL(LIFEPOKEMON lifepokemon,LIFEPOKEMON foes, PROFILEPARTNER profilepartner,PROFILEFOES profilefoes) {
// Create Form Frame
        super("GUNGEMON");
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
            fNamex.setBounds(450, 190, 400, 50);
            JLabel Namex = new JLabel(lifepokemon.getName());
            Namex.setBounds(450, 280, 400, 50);

            JLabel statefNamex = new JLabel();
            statefNamex.setBounds(450, 210, 400, 50);
            JLabel stateNamex = new JLabel();
            stateNamex.setBounds(450, 300, 400, 50);
       
            JLabel statusfHP = new JLabel(" HP :  " + foes.getfHP() + " / " + foes.getMaxHP());
            statusfHP.setBounds(340, 30, 200, 50);
            JLabel fName = new JLabel(foes.getfName());
            fName.setBounds(360, 10, 200, 50);

            JLabel Name = new JLabel(lifepokemon.getName());
            Name.setBounds(35, 160, 200, 50);
            JLabel statusHP = new JLabel(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
            statusHP.setBounds(20, 180, 200, 50);

            JLabel statusSP = new JLabel(" SP :  " + lifepokemon.getSP() + " / " + lifepokemon.getMaxSP());
            statusSP.setBounds(20, 200, 200, 50);

            JLabel playerPic = new JLabel(new ImageIcon(getClass().getResource(profilepartner.getProfilePic())));
            playerPic.setSize(250, 300);
            playerPic.setLocation(20, 250);

            JButton btnBack = new JButton(" escape ");
            btnBack.setBounds(500, 540, 200, 23);

            JButton foesPic = new JButton(new ImageIcon(getClass().getResource(profilefoes.getsProfilePic())));
            foesPic.setSize(200, 100);
            foesPic.setLocation(550, 20);

            // add skill
            JButton btnAtk = new JButton(new ImageIcon(getClass().getResource(profilepartner.getAtkPic())));
            btnAtk.setBounds(320, 250, 50, 50);
            JLabel AtkDMG = new JLabel("Damage : " + lifepokemon.getDMG());
            AtkDMG.setBounds(300, 280, 200, 50);

            JButton btnS1 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS1Pic())));
            btnS1.setBounds(320, 350, 50, 50);
            JLabel s1DMG = new JLabel("Damage : " + lifepokemon.gets1DMG() + " sp : 150");
            s1DMG.setBounds(300, 380, 200, 50);

            JButton btnS2 = new JButton(new ImageIcon(getClass().getResource(profilepartner.getS2Pic())));
            btnS2.setBounds(320, 460, 50, 50);
            JLabel s2DMG = new JLabel("Damage : " + lifepokemon.gets2DMG()+" sp : 300");
            s2DMG.setBounds(300, 490, 200, 50);

            JButton btnfAtk = new JButton(new ImageIcon(getClass().getResource(profilefoes.getAtkPic())));
            btnfAtk.setBounds(280, 70, 50, 50);

            JButton btnfS1 = new JButton(new ImageIcon(getClass().getResource(profilefoes.getS1Pic())));
            btnfS1.setBounds(360, 70, 50, 50);

            JButton btnfS2 = new JButton(new ImageIcon(getClass().getResource(profilefoes.getS2Pic())));
            btnfS2.setBounds(440, 70, 50, 50);

            // item
            JButton btnUsePotion = new JButton(new ImageIcon(getClass().getResource("/logo_potion.png")));
            btnUsePotion.setBounds(120, 190, 50, 50);

            JButton btnUseMana = new JButton(new ImageIcon(getClass().getResource("/logo_mana.png")));
            btnUseMana.setBounds(200, 190, 50, 50);
        
            JLabel potion = new JLabel(" X " + INVENTORYSYSYEM.checkThing("Potion"));
            potion.setBounds(170, 200, 200, 30);

            JLabel mana = new JLabel(" X " + INVENTORYSYSYEM.checkThing("Mana"));
            mana.setBounds(250, 200, 200, 30);

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

        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.getDMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),foes.attackFoes()));


        Namex.setText(lifepokemon.getName() + " : HIT FOES BY NOMAL ATTACK ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName());

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + foes.attackFoes());
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
        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.gets1DMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),foes.attackFoes()));
        lifepokemon.useSP(150);

        Namex.setText(lifepokemon.getName() + " : HIT FOES BY SKILL 1 ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName());

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + foes.attackFoes());
        statefNamex.setText(foes.getfName() + " : Recieve damage " + lifepokemon.gets1DMG());

        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusfHP.setText(" HP :  " + foes.getfHP() + " / 2000");
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
        foes.updatefHP(COMBATSYSTEM.calculateSystem(foes.fHP, lifepokemon.gets2DMG()));
        lifepokemon.updateHP(COMBATSYSTEM.calculateSystem(lifepokemon.getHP(),foes.attackFoes()));
        lifepokemon.useSP(300);

        Namex.setText(lifepokemon.getName() + " : HIT FOES BY SKILL 2 ");
        fNamex.setText(foes.getfName() + " : HIT " + lifepokemon.getName());

        stateNamex.setText(lifepokemon.getName() + " : Recieve damage " + foes.attackFoes());
        statefNamex.setText(foes.getfName() + " : Recieve damage " + lifepokemon.gets2DMG());

        statusHP.setText(" HP :  " + lifepokemon.getHP() + " / " + lifepokemon.getMaxHP());
        statusfHP.setText(" HP :  " + foes.getfHP() + " / 2000");
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
getContentPane().add(btnUsePotion);
getContentPane().add(btnUseMana);
getContentPane().add(potion);
getContentPane().add(mana);
getContentPane().add(fNamex);
getContentPane().add(Namex);
getContentPane().add(statefNamex);
getContentPane().add(stateNamex);
getContentPane().add(btnBack);
}   
}