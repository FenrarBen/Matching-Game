/*
 * Title: 	Greymageddon
 * Project:	Group 2 Project for CS 321
 * Authors: 	Tim Prishtina, Chris Parker, Gabriel Moore, Ben Strawbridge
 * Date:	11/19/2015
 * Instructor:	Daniel M Rochowiak
 * Disclaimer:	This program is entirely our own work.	
 */

/** greymageddon package contains the FrmMain.java class file. */
package greymageddon;
import java.awt.Image;
import javax.swing.ImageIcon;
import game_model.Board;
import game_timer.NTimer;

/**
 * FrmMain creates the GUI component. Also calls constructor in Board and NTimer.
 * Much of this class is auto generated code when the GUI was drawn. The Button
 * btnCardActionPerformed methods handle calling scanBoard from the Board Class.
 * Below is a list of the constructors and methods found in the FrmMain Class.
 * <ul>
 * <li> FrmMain() Class default constructor.
 * <li> endGameTimer() Public Static method used to call instantiated timer.
 * <li> setLabel() Public Static method to display "Waiting..." on startup.
 * <li> updateLabel() Public Static method updates the time and lives labels.
 * <li> getTime() Public Static method gets the current time of timer.
 * <li> restart() Public method gets theme, difficulty, resets cards and timer.
 * <li> resetCards() Public method enables the buttons and makes icons empty.
 * <li> hideExtraCards() Private method sets cards to invisible.
 * <li> cbxDifficultyActionPerformed(} Private method sets number of visible cards.
 * <li> btnCard*1 - 36*ActionPerformed() 36 Private methods creates thread and calls scanBoard.
 * <li> cbxThemesActionPerformed() Private method passes theme and restarts timer.
 * <li> btnRestartActionPerformed() Private method calls restart method.
 * <li> public static void main() Public Static method runs the program.
 * </ul>
 * 
 * @author Tim Prishtina
 * @version 2.6.4
 */
public class FrmMain extends javax.swing.JFrame
{
    static Board board;
    static NTimer timer;
    public static boolean enabled = true;
    String difficulty;
    String theme;
    
    /** Default Constructor creates new board and timer. */
    public FrmMain()
    {
        initComponents();
        hideExtraCards();
        this.board = new Board(cbxDifficulty.getSelectedItem().toString(), 
                     cbxThemes.getSelectedItem().toString());
        this.timer = new NTimer(true, 0);
        timer.startTimer();
        pack();
    }
    
    /** endGameTimer method calls stopTimer method on the timer instance. */
    public static void endGameTimer()
    {
        timer.stopTimer();
    }
    
    /** setLabel method sets the timer text to "Waiting..." on startup. */
    public static void setLabel()
    {
        jLabel1.setText("Waiting...");
    }
    
    /**
     * updateLabel method updates the Time and Lives Remaining labels. 
     * 
     * @param time is the current int time passed in to update the Time: label.
     */
    public static void updateLabel(int time)
    {
        jLabel1.setText("Time: " + time);
        jLabel4.setText("Lives Remaining: " + board.gameLoseCondition);
    }
    
    /**
     * getTime method returns the instantiated timer time.
     * 
     * @return the current time int of the instantiated timer time.
     */ 
    public static int getTime()
    {
        return timer.time;
    }
    
    /**
     * restart method restarts every part of the game. This method sets the 
     * current theme and difficulty, calls resetCards, calls stopTimer creates 
     * a new timer, and calls startTimer.
     * 
     */
    public void restart()
    {
        theme = cbxThemes.getSelectedItem().toString();
        resetCards();

        if (theme.equals("Retro Video Game Characters")) 
        {
            this.board = new Board(cbxDifficulty.getSelectedItem().toString(), theme);
        }
        else
        {
            this.board = new Board(cbxDifficulty.getSelectedItem().toString(), theme);
        }
        timer.stopTimer();
        this.timer = new NTimer(true, 0);
        timer.startTimer();
    }
    
    /** resetCards method enables all 36 buttons and sets the icons to empty. */
    public void resetCards()
    {
        ImageIcon emptyIcon = new ImageIcon();
        btnCard1.setEnabled(true);
        btnCard2.setEnabled(true);
        btnCard3.setEnabled(true);
        btnCard4.setEnabled(true);
        btnCard5.setEnabled(true);
        btnCard6.setEnabled(true);
        btnCard7.setEnabled(true);
        btnCard8.setEnabled(true);
        btnCard9.setEnabled(true);
        btnCard10.setEnabled(true);
        btnCard11.setEnabled(true);
        btnCard12.setEnabled(true);
        btnCard13.setEnabled(true);
        btnCard14.setEnabled(true);
        btnCard15.setEnabled(true);
        btnCard16.setEnabled(true);
        btnCard17.setEnabled(true);
        btnCard18.setEnabled(true);
        btnCard19.setEnabled(true);
        btnCard20.setEnabled(true);
        btnCard21.setEnabled(true);
        btnCard22.setEnabled(true);
        btnCard23.setEnabled(true);
        btnCard24.setEnabled(true);
        btnCard25.setEnabled(true);
        btnCard26.setEnabled(true);
        btnCard27.setEnabled(true);
        btnCard28.setEnabled(true);
        btnCard29.setEnabled(true);
        btnCard30.setEnabled(true);
        btnCard31.setEnabled(true);
        btnCard32.setEnabled(true);
        btnCard33.setEnabled(true);
        btnCard34.setEnabled(true);
        btnCard35.setEnabled(true);
        btnCard36.setEnabled(true);
        
        btnCard1.setIcon(emptyIcon);
        btnCard2.setIcon(emptyIcon);
        btnCard3.setIcon(emptyIcon);
        btnCard4.setIcon(emptyIcon);
        btnCard5.setIcon(emptyIcon);
        btnCard6.setIcon(emptyIcon);
        btnCard7.setIcon(emptyIcon);
        btnCard8.setIcon(emptyIcon);
        btnCard9.setIcon(emptyIcon);
        btnCard10.setIcon(emptyIcon);
        btnCard11.setIcon(emptyIcon);
        btnCard12.setIcon(emptyIcon);
        btnCard13.setIcon(emptyIcon);
        btnCard14.setIcon(emptyIcon);
        btnCard15.setIcon(emptyIcon);
        btnCard16.setIcon(emptyIcon);
        btnCard17.setIcon(emptyIcon);
        btnCard18.setIcon(emptyIcon);
        btnCard19.setIcon(emptyIcon);
        btnCard20.setIcon(emptyIcon);
        btnCard21.setIcon(emptyIcon);
        btnCard22.setIcon(emptyIcon);
        btnCard23.setIcon(emptyIcon);
        btnCard24.setIcon(emptyIcon);
        btnCard25.setIcon(emptyIcon);
        btnCard26.setIcon(emptyIcon);
        btnCard27.setIcon(emptyIcon);
        btnCard28.setIcon(emptyIcon);
        btnCard29.setIcon(emptyIcon);
        btnCard30.setIcon(emptyIcon);
        btnCard31.setIcon(emptyIcon);
        btnCard32.setIcon(emptyIcon);
        btnCard33.setIcon(emptyIcon);
        btnCard34.setIcon(emptyIcon);
        btnCard35.setIcon(emptyIcon);
        btnCard36.setIcon(emptyIcon);
    }
    
    /**
     * hideExtraCards method hides all the buttons not used in the default 
     * difficulty. Sets all buttons to invisible except 1-4 and 7-10. Private 
     * so javadoc comment not necessary, just changed from public to private.
     */
    private void hideExtraCards()
    {
        btnCard5.setVisible(false);
        btnCard6.setVisible(false);
        btnCard11.setVisible(false);
        btnCard12.setVisible(false);
        btnCard13.setVisible(false);
        btnCard14.setVisible(false);
        btnCard15.setVisible(false);
        btnCard16.setVisible(false);
        btnCard17.setVisible(false);
        btnCard18.setVisible(false);
        btnCard19.setVisible(false);
        btnCard20.setVisible(false);
        btnCard21.setVisible(false);
        btnCard22.setVisible(false);
        btnCard23.setVisible(false);
        btnCard24.setVisible(false);
        btnCard25.setVisible(false);
        btnCard26.setVisible(false);
        btnCard27.setVisible(false);
        btnCard28.setVisible(false);
        btnCard29.setVisible(false);
        btnCard30.setVisible(false);
        btnCard31.setVisible(false);
        btnCard32.setVisible(false);
        btnCard33.setVisible(false);
        btnCard34.setVisible(false);
        btnCard35.setVisible(false);
        btnCard36.setVisible(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnCard2 = new javax.swing.JButton();
        btnCard3 = new javax.swing.JButton();
        btnCard1 = new javax.swing.JButton();
        btnCard4 = new javax.swing.JButton();
        btnCard5 = new javax.swing.JButton();
        btnCard6 = new javax.swing.JButton();
        btnCard8 = new javax.swing.JButton();
        btnCard9 = new javax.swing.JButton();
        btnCard7 = new javax.swing.JButton();
        btnCard10 = new javax.swing.JButton();
        btnCard11 = new javax.swing.JButton();
        btnCard12 = new javax.swing.JButton();
        btnCard14 = new javax.swing.JButton();
        btnCard15 = new javax.swing.JButton();
        btnCard13 = new javax.swing.JButton();
        btnCard16 = new javax.swing.JButton();
        btnCard17 = new javax.swing.JButton();
        btnCard18 = new javax.swing.JButton();
        btnCard20 = new javax.swing.JButton();
        btnCard21 = new javax.swing.JButton();
        btnCard19 = new javax.swing.JButton();
        btnCard22 = new javax.swing.JButton();
        btnCard23 = new javax.swing.JButton();
        btnCard24 = new javax.swing.JButton();
        btnCard26 = new javax.swing.JButton();
        btnCard27 = new javax.swing.JButton();
        btnCard25 = new javax.swing.JButton();
        btnCard28 = new javax.swing.JButton();
        btnCard29 = new javax.swing.JButton();
        btnCard30 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxThemes = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnCard31 = new javax.swing.JButton();
        btnCard32 = new javax.swing.JButton();
        btnCard33 = new javax.swing.JButton();
        btnCard34 = new javax.swing.JButton();
        btnCard35 = new javax.swing.JButton();
        btnCard36 = new javax.swing.JButton();
        cbxDifficulty = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Greymageddon");
        setResizable(false);
        setSize(new java.awt.Dimension(797, 519));

        btnCard2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard2ActionPerformed(evt);
            }
        });

        btnCard3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard3ActionPerformed(evt);
            }
        });

        btnCard1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard1ActionPerformed(evt);
            }
        });

        btnCard4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard4ActionPerformed(evt);
            }
        });

        btnCard5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard5ActionPerformed(evt);
            }
        });

        btnCard6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard6ActionPerformed(evt);
            }
        });

        btnCard8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard8ActionPerformed(evt);
            }
        });

        btnCard9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard9ActionPerformed(evt);
            }
        });

        btnCard7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard7ActionPerformed(evt);
            }
        });

        btnCard10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard10ActionPerformed(evt);
            }
        });

        btnCard11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard11ActionPerformed(evt);
            }
        });

        btnCard12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard12ActionPerformed(evt);
            }
        });

        btnCard14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard14ActionPerformed(evt);
            }
        });

        btnCard15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard15ActionPerformed(evt);
            }
        });

        btnCard13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard13ActionPerformed(evt);
            }
        });

        btnCard16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard16ActionPerformed(evt);
            }
        });

        btnCard17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard17ActionPerformed(evt);
            }
        });

        btnCard18.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard18ActionPerformed(evt);
            }
        });

        btnCard20.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard20ActionPerformed(evt);
            }
        });

        btnCard21.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard21ActionPerformed(evt);
            }
        });

        btnCard19.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard19ActionPerformed(evt);
            }
        });

        btnCard22.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard22ActionPerformed(evt);
            }
        });

        btnCard23.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard23ActionPerformed(evt);
            }
        });

        btnCard24.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard24ActionPerformed(evt);
            }
        });

        btnCard26.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard26ActionPerformed(evt);
            }
        });

        btnCard27.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard27ActionPerformed(evt);
            }
        });

        btnCard25.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard25ActionPerformed(evt);
            }
        });

        btnCard28.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard28ActionPerformed(evt);
            }
        });

        btnCard29.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard29ActionPerformed(evt);
            }
        });

        btnCard30.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard30ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Timer Placeholder");
        jLabel1.setName(""); // NOI18N

        cbxThemes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Retro Video Game Characters", "Animals" }));
        cbxThemes.setMaximumSize(new java.awt.Dimension(167, 20));
        cbxThemes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxThemesActionPerformed(evt);
            }
        });

        jLabel2.setText("Card Themes");

        btnCard31.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard31ActionPerformed(evt);
            }
        });

        btnCard32.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard32ActionPerformed(evt);
            }
        });

        btnCard33.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard33ActionPerformed(evt);
            }
        });

        btnCard34.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard34ActionPerformed(evt);
            }
        });

        btnCard35.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard35ActionPerformed(evt);
            }
        });

        btnCard36.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCard36ActionPerformed(evt);
            }
        });

        cbxDifficulty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4x2 Easy", "4x4 Intermediate", "6x6 Hard" }));
        cbxDifficulty.setMaximumSize(new java.awt.Dimension(167, 20));
        cbxDifficulty.setMinimumSize(new java.awt.Dimension(167, 20));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbxThemes, org.jdesktop.beansbinding.ELProperty.create("${preferredSize}"), cbxDifficulty, org.jdesktop.beansbinding.BeanProperty.create("preferredSize"));
        bindingGroup.addBinding(binding);

        cbxDifficulty.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxDifficultyActionPerformed(evt);
            }
        });

        jLabel3.setText("Difficulty");

        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRestartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setText("Lives Remaining");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCard31, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard33, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard34, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard35, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard36, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCard25, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCard26, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCard27, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCard28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCard29, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCard30, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCard19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard24, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCard13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard18, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCard7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxThemes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnRestart)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCard8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCard14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCard18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxThemes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestart))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCard20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCard26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard28, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCard31, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCard33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCard34, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCard35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCard36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCard32, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCard1.getAccessibleContext().setAccessibleDescription("");

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * cbxDifficultyActionPerformed enables all 36 buttons, then sets the proper 
     * number of button visible based on the difficulty selected, stops the 
     * timer, and restarts the timer. Private method, javadoc comment not
     * required.
     * 
     * @param evt is the user selected difficulty combo box event.
     */
    private void cbxDifficultyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxDifficultyActionPerformed
    {//GEN-HEADEREND:event_cbxDifficultyActionPerformed
        difficulty = cbxDifficulty.getSelectedItem().toString();
        ImageIcon emptyIcon = new ImageIcon();
        btnCard1.setEnabled(true);
        btnCard2.setEnabled(true);
        btnCard3.setEnabled(true);
        btnCard4.setEnabled(true);
        btnCard5.setEnabled(true);
        btnCard6.setEnabled(true);
        btnCard7.setEnabled(true);
        btnCard8.setEnabled(true);
        btnCard9.setEnabled(true);
        btnCard10.setEnabled(true);
        btnCard11.setEnabled(true);
        btnCard12.setEnabled(true);
        btnCard13.setEnabled(true);
        btnCard14.setEnabled(true);
        btnCard15.setEnabled(true);
        btnCard16.setEnabled(true);
        btnCard17.setEnabled(true);
        btnCard18.setEnabled(true);
        btnCard19.setEnabled(true);
        btnCard20.setEnabled(true);
        btnCard21.setEnabled(true);
        btnCard22.setEnabled(true);
        btnCard23.setEnabled(true);
        btnCard24.setEnabled(true);
        btnCard25.setEnabled(true);
        btnCard26.setEnabled(true);
        btnCard27.setEnabled(true);
        btnCard28.setEnabled(true);
        btnCard29.setEnabled(true);
        btnCard30.setEnabled(true);
        btnCard31.setEnabled(true);
        btnCard32.setEnabled(true);
        btnCard33.setEnabled(true);
        btnCard34.setEnabled(true);
        btnCard35.setEnabled(true);
        btnCard36.setEnabled(true);
        
        btnCard1.setIcon(emptyIcon);
        btnCard2.setIcon(emptyIcon);
        btnCard3.setIcon(emptyIcon);
        btnCard4.setIcon(emptyIcon);
        btnCard5.setIcon(emptyIcon);
        btnCard6.setIcon(emptyIcon);
        btnCard7.setIcon(emptyIcon);
        btnCard8.setIcon(emptyIcon);
        btnCard9.setIcon(emptyIcon);
        btnCard10.setIcon(emptyIcon);
        btnCard11.setIcon(emptyIcon);
        btnCard12.setIcon(emptyIcon);
        btnCard13.setIcon(emptyIcon);
        btnCard14.setIcon(emptyIcon);
        btnCard15.setIcon(emptyIcon);
        btnCard16.setIcon(emptyIcon);
        btnCard17.setIcon(emptyIcon);
        btnCard18.setIcon(emptyIcon);
        btnCard19.setIcon(emptyIcon);
        btnCard20.setIcon(emptyIcon);
        btnCard21.setIcon(emptyIcon);
        btnCard22.setIcon(emptyIcon);
        btnCard23.setIcon(emptyIcon);
        btnCard24.setIcon(emptyIcon);
        btnCard25.setIcon(emptyIcon);
        btnCard26.setIcon(emptyIcon);
        btnCard27.setIcon(emptyIcon);
        btnCard28.setIcon(emptyIcon);
        btnCard29.setIcon(emptyIcon);
        btnCard30.setIcon(emptyIcon);
        btnCard31.setIcon(emptyIcon);
        btnCard32.setIcon(emptyIcon);
        btnCard33.setIcon(emptyIcon);
        btnCard34.setIcon(emptyIcon);
        btnCard35.setIcon(emptyIcon);
        btnCard36.setIcon(emptyIcon);
        if (difficulty.equals("4x2 Easy")) 
        {
            btnCard5.setVisible(false);
            btnCard6.setVisible(false);
            btnCard11.setVisible(false);
            btnCard12.setVisible(false);
            btnCard13.setVisible(false);
            btnCard14.setVisible(false);
            btnCard15.setVisible(false);
            btnCard16.setVisible(false);
            btnCard17.setVisible(false);
            btnCard18.setVisible(false);
            btnCard19.setVisible(false);
            btnCard20.setVisible(false);
            btnCard21.setVisible(false);
            btnCard22.setVisible(false);
            btnCard23.setVisible(false);
            btnCard24.setVisible(false);
            btnCard25.setVisible(false);
            btnCard26.setVisible(false);
            btnCard27.setVisible(false);
            btnCard28.setVisible(false);
            btnCard29.setVisible(false);
            btnCard30.setVisible(false);
            btnCard31.setVisible(false);
            btnCard32.setVisible(false);
            btnCard33.setVisible(false);
            btnCard34.setVisible(false);
            btnCard35.setVisible(false);
            btnCard36.setVisible(false);
            this.board = new Board(difficulty, cbxThemes.getSelectedItem().toString());
            pack();
        }
        else if (difficulty == "4x4 Intermediate") 
        {
            btnCard13.setVisible(true);
            btnCard14.setVisible(true);
            btnCard15.setVisible(true);
            btnCard16.setVisible(true);
            btnCard19.setVisible(true);
            btnCard20.setVisible(true);
            btnCard21.setVisible(true);
            btnCard22.setVisible(true);
            btnCard5.setVisible(false);
            btnCard6.setVisible(false);
            btnCard11.setVisible(false);
            btnCard12.setVisible(false);
            btnCard17.setVisible(false);
            btnCard18.setVisible(false);
            btnCard23.setVisible(false);
            btnCard24.setVisible(false);
            btnCard25.setVisible(false);
            btnCard26.setVisible(false);
            btnCard27.setVisible(false);
            btnCard28.setVisible(false);
            btnCard29.setVisible(false);
            btnCard30.setVisible(false);
            btnCard31.setVisible(false);
            btnCard32.setVisible(false);
            btnCard33.setVisible(false);
            btnCard34.setVisible(false);
            btnCard35.setVisible(false);
            btnCard36.setVisible(false);
            this.board = new Board(difficulty, cbxThemes.getSelectedItem().toString());
            pack();
        }
        else
        {
            btnCard5.setVisible(true);
            btnCard6.setVisible(true);
            btnCard11.setVisible(true);
            btnCard12.setVisible(true);
            btnCard13.setVisible(true);
            btnCard14.setVisible(true);
            btnCard15.setVisible(true);
            btnCard16.setVisible(true);
            btnCard17.setVisible(true);
            btnCard18.setVisible(true);
            btnCard19.setVisible(true);
            btnCard20.setVisible(true);
            btnCard21.setVisible(true);
            btnCard22.setVisible(true);
            btnCard23.setVisible(true);
            btnCard24.setVisible(true);
            btnCard25.setVisible(true);
            btnCard26.setVisible(true);
            btnCard27.setVisible(true);
            btnCard28.setVisible(true);
            btnCard29.setVisible(true);
            btnCard30.setVisible(true);
            btnCard31.setVisible(true);
            btnCard32.setVisible(true);
            btnCard33.setVisible(true);
            btnCard34.setVisible(true);
            btnCard35.setVisible(true);
            btnCard36.setVisible(true);
            this.board = new Board(difficulty, cbxThemes.getSelectedItem().toString());
            pack();
        }
        timer.stopTimer();
        this.timer = new NTimer(true, 0);
        timer.startTimer();
    }//GEN-LAST:event_cbxDifficultyActionPerformed
    /**
     * btnCard1ActionPerformed displays image of card in corresponding board 
     * element and creates new thread to run scanBoard. NOTE: all button 
     * ActionPerformed functions perform similar actions only difference being 
     * it works on different board elements. Private method, javadoc comment 
     * not required.
     * 
     * @param evt is the button press event.
     */
    private void btnCard1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard1ActionPerformed
    {//GEN-HEADEREND:event_btnCard1ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard1.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 0, btnCard1);
            }
        }.start();
    }//GEN-LAST:event_btnCard1ActionPerformed

    private void btnCard2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard2ActionPerformed
    {//GEN-HEADEREND:event_btnCard2ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard2.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 1, btnCard2);
            }
        }.start();
    }//GEN-LAST:event_btnCard2ActionPerformed

    private void btnCard3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard3ActionPerformed
    {//GEN-HEADEREND:event_btnCard3ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard3.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 2, btnCard3);
            }
        }.start();
    }//GEN-LAST:event_btnCard3ActionPerformed

    private void btnCard4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard4ActionPerformed
    {//GEN-HEADEREND:event_btnCard4ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard4.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 3, btnCard4);            
            }
        }.start();
    }//GEN-LAST:event_btnCard4ActionPerformed

    private void btnCard5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard5ActionPerformed
    {//GEN-HEADEREND:event_btnCard5ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard5.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 4, btnCard5);            
            }
        }.start();
    }//GEN-LAST:event_btnCard5ActionPerformed

    private void btnCard6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard6ActionPerformed
    {//GEN-HEADEREND:event_btnCard6ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[0][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard6.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(0, 5, btnCard6);            
            }
        }.start();
    }//GEN-LAST:event_btnCard6ActionPerformed

    private void btnCard7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard7ActionPerformed
    {//GEN-HEADEREND:event_btnCard7ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard7.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 0, btnCard7);            
            }
        }.start();
    }//GEN-LAST:event_btnCard7ActionPerformed

    private void btnCard8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard8ActionPerformed
    {//GEN-HEADEREND:event_btnCard8ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard8.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 1, btnCard8);            
            }
        }.start();
    }//GEN-LAST:event_btnCard8ActionPerformed

    private void btnCard9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard9ActionPerformed
    {//GEN-HEADEREND:event_btnCard9ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard9.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 2, btnCard9);            
            }
        }.start();
    }//GEN-LAST:event_btnCard9ActionPerformed

    private void btnCard10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard10ActionPerformed
    {//GEN-HEADEREND:event_btnCard10ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard10.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 3, btnCard10);            
            }
        }.start();
    }//GEN-LAST:event_btnCard10ActionPerformed

    private void btnCard11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard11ActionPerformed
    {//GEN-HEADEREND:event_btnCard11ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard11.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 4, btnCard11);            
            }
        }.start();
    }//GEN-LAST:event_btnCard11ActionPerformed

    private void btnCard12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard12ActionPerformed
    {//GEN-HEADEREND:event_btnCard12ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[1][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard12.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(1, 5, btnCard12);            
            }
        }.start();
    }//GEN-LAST:event_btnCard12ActionPerformed

    private void btnCard13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard13ActionPerformed
    {//GEN-HEADEREND:event_btnCard13ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard13.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 0, btnCard13);            
            }
        }.start();
    }//GEN-LAST:event_btnCard13ActionPerformed

    private void btnCard14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard14ActionPerformed
    {//GEN-HEADEREND:event_btnCard14ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard14.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 1, btnCard14);            
            }
        }.start();
    }//GEN-LAST:event_btnCard14ActionPerformed

    private void btnCard15ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard15ActionPerformed
    {//GEN-HEADEREND:event_btnCard15ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard15.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 2, btnCard15);            
            }
        }.start();
    }//GEN-LAST:event_btnCard15ActionPerformed

    private void btnCard16ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard16ActionPerformed
    {//GEN-HEADEREND:event_btnCard16ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard16.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 3, btnCard16);            
            }
        }.start();
    }//GEN-LAST:event_btnCard16ActionPerformed

    private void btnCard17ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard17ActionPerformed
    {//GEN-HEADEREND:event_btnCard17ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard17.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 4, btnCard17);            
            }
        }.start();
    }//GEN-LAST:event_btnCard17ActionPerformed

    private void btnCard18ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard18ActionPerformed
    {//GEN-HEADEREND:event_btnCard18ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[2][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard18.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(2, 5, btnCard18);            
            }
        }.start();
    }//GEN-LAST:event_btnCard18ActionPerformed

    private void btnCard19ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard19ActionPerformed
    {//GEN-HEADEREND:event_btnCard19ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard19.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 0, btnCard19);            
            }
        }.start();
    }//GEN-LAST:event_btnCard19ActionPerformed

    private void btnCard20ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard20ActionPerformed
    {//GEN-HEADEREND:event_btnCard20ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard20.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 1, btnCard20);            
            }
        }.start();
    }//GEN-LAST:event_btnCard20ActionPerformed

    private void btnCard21ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard21ActionPerformed
    {//GEN-HEADEREND:event_btnCard21ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard21.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 2, btnCard21);            
            }
        }.start();
    }//GEN-LAST:event_btnCard21ActionPerformed

    private void btnCard22ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard22ActionPerformed
    {//GEN-HEADEREND:event_btnCard22ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard22.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 3, btnCard22);            
            }
        }.start();
    }//GEN-LAST:event_btnCard22ActionPerformed

    private void btnCard23ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard23ActionPerformed
    {//GEN-HEADEREND:event_btnCard23ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard23.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 4, btnCard23);            
            }
        }.start();
    }//GEN-LAST:event_btnCard23ActionPerformed

    private void btnCard24ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard24ActionPerformed
    {//GEN-HEADEREND:event_btnCard24ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[3][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard24.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(3, 5, btnCard24);            
            }
        }.start();
    }//GEN-LAST:event_btnCard24ActionPerformed

    private void btnCard25ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard25ActionPerformed
    {//GEN-HEADEREND:event_btnCard25ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard25.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 0, btnCard25);            
            }
        }.start();
    }//GEN-LAST:event_btnCard25ActionPerformed

    private void btnCard26ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard26ActionPerformed
    {//GEN-HEADEREND:event_btnCard26ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard26.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 1, btnCard26);            
            }
        }.start();
    }//GEN-LAST:event_btnCard26ActionPerformed

    private void btnCard27ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard27ActionPerformed
    {//GEN-HEADEREND:event_btnCard27ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard27.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 2, btnCard27);            
            }
        }.start();
    }//GEN-LAST:event_btnCard27ActionPerformed

    private void btnCard28ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard28ActionPerformed
    {//GEN-HEADEREND:event_btnCard28ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard28.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 3, btnCard28);            
            }
        }.start();
    }//GEN-LAST:event_btnCard28ActionPerformed

    private void btnCard29ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard29ActionPerformed
    {//GEN-HEADEREND:event_btnCard29ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard29.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 4, btnCard29);            
            }
        }.start();
    }//GEN-LAST:event_btnCard29ActionPerformed

    private void btnCard30ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard30ActionPerformed
    {//GEN-HEADEREND:event_btnCard30ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[4][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard30.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(4, 5, btnCard30);            
            }
        }.start();
    }//GEN-LAST:event_btnCard30ActionPerformed

    private void btnCard31ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard31ActionPerformed
    {//GEN-HEADEREND:event_btnCard31ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][0].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard31.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 0, btnCard31);            
            }
        }.start();
    }//GEN-LAST:event_btnCard31ActionPerformed

    private void btnCard32ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard32ActionPerformed
    {//GEN-HEADEREND:event_btnCard32ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][1].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard32.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 1, btnCard32);            
            }
        }.start();
    }//GEN-LAST:event_btnCard32ActionPerformed

    private void btnCard33ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard33ActionPerformed
    {//GEN-HEADEREND:event_btnCard33ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][2].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard33.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 2, btnCard33);            
            }
        }.start();
    }//GEN-LAST:event_btnCard33ActionPerformed

    private void btnCard34ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard34ActionPerformed
    {//GEN-HEADEREND:event_btnCard34ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][3].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard34.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 3, btnCard34);            
            }
        }.start();
    }//GEN-LAST:event_btnCard34ActionPerformed

    private void btnCard35ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard35ActionPerformed
    {//GEN-HEADEREND:event_btnCard35ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][4].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard35.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 4, btnCard35);            
            }
        }.start();
    }//GEN-LAST:event_btnCard35ActionPerformed

    private void btnCard36ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCard36ActionPerformed
    {//GEN-HEADEREND:event_btnCard36ActionPerformed
        ImageIcon icon = new ImageIcon(board.gameboard[5][5].pictureFile.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnCard36.setIcon(icon);
        new Thread()
        {
            public void run()
            {
                board.scanBoard(5, 5, btnCard36);            
            }
        }.start();
    }//GEN-LAST:event_btnCard36ActionPerformed

    /**
     * cbxThemesActionPerformed method enables all 36 buttons, sets the icons 
     * to empty, sets the theme, stops the timer, and restarts the timer. 
     * Private method, javadoc comment not required.
     * 
     * @param evt is the user selected theme combo box event.
     */
    private void cbxThemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThemesActionPerformed
        theme = cbxThemes.getSelectedItem().toString();
        ImageIcon emptyIcon = new ImageIcon();
        btnCard1.setEnabled(true);
        btnCard2.setEnabled(true);
        btnCard3.setEnabled(true);
        btnCard4.setEnabled(true);
        btnCard5.setEnabled(true);
        btnCard6.setEnabled(true);
        btnCard7.setEnabled(true);
        btnCard8.setEnabled(true);
        btnCard9.setEnabled(true);
        btnCard10.setEnabled(true);
        btnCard11.setEnabled(true);
        btnCard12.setEnabled(true);
        btnCard13.setEnabled(true);
        btnCard14.setEnabled(true);
        btnCard15.setEnabled(true);
        btnCard16.setEnabled(true);
        btnCard17.setEnabled(true);
        btnCard18.setEnabled(true);
        btnCard19.setEnabled(true);
        btnCard20.setEnabled(true);
        btnCard21.setEnabled(true);
        btnCard22.setEnabled(true);
        btnCard23.setEnabled(true);
        btnCard24.setEnabled(true);
        btnCard25.setEnabled(true);
        btnCard26.setEnabled(true);
        btnCard27.setEnabled(true);
        btnCard28.setEnabled(true);
        btnCard29.setEnabled(true);
        btnCard30.setEnabled(true);
        btnCard31.setEnabled(true);
        btnCard32.setEnabled(true);
        btnCard33.setEnabled(true);
        btnCard34.setEnabled(true);
        btnCard35.setEnabled(true);
        btnCard36.setEnabled(true);
        
        btnCard1.setIcon(emptyIcon);
        btnCard2.setIcon(emptyIcon);
        btnCard3.setIcon(emptyIcon);
        btnCard4.setIcon(emptyIcon);
        btnCard5.setIcon(emptyIcon);
        btnCard6.setIcon(emptyIcon);
        btnCard7.setIcon(emptyIcon);
        btnCard8.setIcon(emptyIcon);
        btnCard9.setIcon(emptyIcon);
        btnCard10.setIcon(emptyIcon);
        btnCard11.setIcon(emptyIcon);
        btnCard12.setIcon(emptyIcon);
        btnCard13.setIcon(emptyIcon);
        btnCard14.setIcon(emptyIcon);
        btnCard15.setIcon(emptyIcon);
        btnCard16.setIcon(emptyIcon);
        btnCard17.setIcon(emptyIcon);
        btnCard18.setIcon(emptyIcon);
        btnCard19.setIcon(emptyIcon);
        btnCard20.setIcon(emptyIcon);
        btnCard21.setIcon(emptyIcon);
        btnCard22.setIcon(emptyIcon);
        btnCard23.setIcon(emptyIcon);
        btnCard24.setIcon(emptyIcon);
        btnCard25.setIcon(emptyIcon);
        btnCard26.setIcon(emptyIcon);
        btnCard27.setIcon(emptyIcon);
        btnCard28.setIcon(emptyIcon);
        btnCard29.setIcon(emptyIcon);
        btnCard30.setIcon(emptyIcon);
        btnCard31.setIcon(emptyIcon);
        btnCard32.setIcon(emptyIcon);
        btnCard33.setIcon(emptyIcon);
        btnCard34.setIcon(emptyIcon);
        btnCard35.setIcon(emptyIcon);
        btnCard36.setIcon(emptyIcon);
        if (theme.equals("Retro Video Game Characters")) 
        {
            this.board = new Board(cbxDifficulty.getSelectedItem().toString(), theme);
        }
        else
        {
            this.board = new Board(cbxDifficulty.getSelectedItem().toString(), theme);
        }
        timer.stopTimer();
        this.timer = new NTimer(true, 0);
        timer.startTimer();
    }//GEN-LAST:event_cbxThemesActionPerformed
    
    /**
     * btnRestartActionPerformed method calls the restart method when the 
     * restart button press is detected. Private method, javadoc comment not
     * required.
     * 
     * @param evt is the restart button press event.
     */
    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        restart();
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * main method runs the program, creates a new instance of FrmMain, 
     * and sets it to visible.
     * 
     * @param args are the command line arguments.
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FrmMain().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCard1;
    private javax.swing.JButton btnCard10;
    private javax.swing.JButton btnCard11;
    private javax.swing.JButton btnCard12;
    private javax.swing.JButton btnCard13;
    private javax.swing.JButton btnCard14;
    private javax.swing.JButton btnCard15;
    private javax.swing.JButton btnCard16;
    private javax.swing.JButton btnCard17;
    private javax.swing.JButton btnCard18;
    private javax.swing.JButton btnCard19;
    private javax.swing.JButton btnCard2;
    private javax.swing.JButton btnCard20;
    private javax.swing.JButton btnCard21;
    private javax.swing.JButton btnCard22;
    private javax.swing.JButton btnCard23;
    private javax.swing.JButton btnCard24;
    private javax.swing.JButton btnCard25;
    private javax.swing.JButton btnCard26;
    private javax.swing.JButton btnCard27;
    private javax.swing.JButton btnCard28;
    private javax.swing.JButton btnCard29;
    private javax.swing.JButton btnCard3;
    private javax.swing.JButton btnCard30;
    private javax.swing.JButton btnCard31;
    private javax.swing.JButton btnCard32;
    private javax.swing.JButton btnCard33;
    private javax.swing.JButton btnCard34;
    private javax.swing.JButton btnCard35;
    private javax.swing.JButton btnCard36;
    private javax.swing.JButton btnCard4;
    private javax.swing.JButton btnCard5;
    private javax.swing.JButton btnCard6;
    private javax.swing.JButton btnCard7;
    private javax.swing.JButton btnCard8;
    private javax.swing.JButton btnCard9;
    public static javax.swing.JButton btnRestart;
    private javax.swing.JComboBox cbxDifficulty;
    private javax.swing.JComboBox cbxThemes;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
