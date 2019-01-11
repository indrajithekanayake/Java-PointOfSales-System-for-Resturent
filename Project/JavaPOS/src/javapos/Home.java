/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapos;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author SEWMAL THARINDU
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private final int timeLimit = 60000;
    private final int timeLimitEmailClear = 20000;
    private int lastTable;

    public void setLastTable(int tableNo) {
        this.lastTable = tableNo;
    }

    public int getLastTable() {
        return this.lastTable;
    }

    public Home() {
        /*this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);*/
        initComponents();
        /*Toolkit tk =Toolkit.getDefaultToolkit();
        int xsize =(int) tk.getScreenSize().getWidth();
        int ysize =(int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);*/
        showDate();
        showTime();
        showDate2();
        refreshTableStatus();
    }

    public void tableStatusRefreshTimer() {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                refreshTableStatus();
            }
        },
                timeLimit
        );
    }

    public void refreshTableStatus() {

        for (int i = 1; i <= 12; i++) {
            if (tableStatusChecker(i) == 1) {
                switch (i) {
                    case 1:
                        TableOneButton.setEnabled(false);
                        break;
                    case 2:
                        TableTwoButton.setEnabled(false);
                        break;
                    case 3:
                        TableThreeButton.setEnabled(false);
                        break;
                    case 4:
                        TableFourButton.setEnabled(false);
                        break;
                    case 5:
                        TableFiveButton.setEnabled(false);
                        break;
                    case 6:
                        TableSixButton.setEnabled(false);
                        break;
                    case 7:
                        TableSevenButton.setEnabled(false);
                        break;
                    case 8:
                        TableEightButton.setEnabled(false);
                        break;
                    case 9:
                        TableNineButton.setEnabled(false);
                        break;
                    case 10:
                        TableTenButton.setEnabled(false);
                        break;
                    case 11:
                        TableElevenButton.setEnabled(false);
                        break;
                    case 12:
                        TableTwelveButton.setEnabled(false);
                        break;
                }
            }
        }
    }

    public int tableStatusChecker(int tableNo) {

        String query = "SELECT * FROM reservedtables WHERE tableNO=" + tableNo;
        try {
            Statement st = MyConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.absolute(1)) {
                st.close();
                rs.close();
                return 1;

            } else {
                st.close();
                rs.close();
                return 0;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return 0;

    }

    //..................END OF TABLE STATUS REFRESH................................
    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        dateLab.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
                timeLab.setText(s.format(d));
            }

        }
        ).start();
    }

    void showDate2() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("EE");
        dateLab2.setText(s.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_tb_txt1 = new javax.swing.JLabel();
        lbl_tb_txt2 = new javax.swing.JLabel();
        lbl_tb_txt3 = new javax.swing.JLabel();
        lbl_tb_txt4 = new javax.swing.JLabel();
        lbl_tb_txt5 = new javax.swing.JLabel();
        lbl_tb_txt6 = new javax.swing.JLabel();
        lbl_tb_txt7 = new javax.swing.JLabel();
        lbl_tb_txt8 = new javax.swing.JLabel();
        lbl_tb_txt9 = new javax.swing.JLabel();
        lbl_tb_txt10 = new javax.swing.JLabel();
        lbl_tb_txt11 = new javax.swing.JLabel();
        lbl_tb_txt12 = new javax.swing.JLabel();
        TableOneButton = new javax.swing.JButton();
        TableTwoButton = new javax.swing.JButton();
        TableThreeButton = new javax.swing.JButton();
        TableFourButton = new javax.swing.JButton();
        TableSixButton = new javax.swing.JButton();
        TableSevenButton = new javax.swing.JButton();
        TableEightButton = new javax.swing.JButton();
        TableNineButton = new javax.swing.JButton();
        TableTenButton = new javax.swing.JButton();
        TableElevenButton = new javax.swing.JButton();
        TableTwelveButton = new javax.swing.JButton();
        TableFiveButton = new javax.swing.JButton();
        lbl_tb_txt_topic = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clearEmail = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_login_logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLab2 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();
        btn_go_to_kitchen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS System - Home Page");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_tb_txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt1.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt1.setText("Table 1");

        lbl_tb_txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt2.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt2.setText("Table 2");

        lbl_tb_txt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt3.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt3.setText("Table 3");

        lbl_tb_txt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt4.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt4.setText("Table 4");

        lbl_tb_txt5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt5.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt5.setText("Table 5");

        lbl_tb_txt6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt6.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt6.setText("Table 6");

        lbl_tb_txt7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt7.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt7.setText("Table 7");

        lbl_tb_txt8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt8.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt8.setText("Table 8");

        lbl_tb_txt9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt9.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt9.setText("Table 9");

        lbl_tb_txt10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt10.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt10.setText("Table 10");

        lbl_tb_txt11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt11.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt11.setText("Table 11");

        lbl_tb_txt12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tb_txt12.setForeground(new java.awt.Color(0, 51, 255));
        lbl_tb_txt12.setText("Table 12");

        TableOneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableOneButtonActionPerformed(evt);
            }
        });

        TableTwoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableTwoButtonActionPerformed(evt);
            }
        });

        TableThreeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableThreeButtonActionPerformed(evt);
            }
        });

        TableFourButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableFourButtonActionPerformed(evt);
            }
        });

        TableSixButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/family_table.png"))); // NOI18N
        TableSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableSixButtonActionPerformed(evt);
            }
        });

        TableSevenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/family_table.png"))); // NOI18N
        TableSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableSevenButtonActionPerformed(evt);
            }
        });

        TableEightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/family_table.png"))); // NOI18N
        TableEightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableEightButtonActionPerformed(evt);
            }
        });

        TableNineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableNineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableNineButtonActionPerformed(evt);
            }
        });

        TableTenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableTenButtonActionPerformed(evt);
            }
        });

        TableElevenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableElevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableElevenButtonActionPerformed(evt);
            }
        });

        TableTwelveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/table.png"))); // NOI18N
        TableTwelveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableTwelveButtonActionPerformed(evt);
            }
        });

        TableFiveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/family_table.png"))); // NOI18N
        TableFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableFiveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_tb_txt10)
                        .addGap(215, 215, 215)
                        .addComponent(lbl_tb_txt11)
                        .addGap(219, 219, 219)
                        .addComponent(lbl_tb_txt12)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_tb_txt7)
                                        .addGap(203, 203, 203))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_tb_txt3)
                                        .addGap(202, 202, 202))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(TableElevenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(174, 174, 174)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TableEightButton)
                            .addComponent(TableTwelveButton)
                            .addComponent(TableFourButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbl_tb_txt4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lbl_tb_txt8)))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TableOneButton)
                                                .addGap(192, 192, 192))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(lbl_tb_txt1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TableTwoButton)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbl_tb_txt2)
                                                .addGap(31, 31, 31))
                                            .addComponent(TableSixButton)))
                                    .addComponent(TableTenButton)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lbl_tb_txt5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_tb_txt6)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(lbl_tb_txt9)
                                        .addGap(44, 44, 44)))
                                .addGap(172, 172, 172)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TableThreeButton, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TableSevenButton, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(TableNineButton)
                            .addComponent(TableFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableTwoButton)
                    .addComponent(TableThreeButton)
                    .addComponent(TableFourButton)
                    .addComponent(TableOneButton))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_tb_txt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableEightButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tb_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tb_txt1)
                            .addComponent(lbl_tb_txt3))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TableSixButton)
                            .addComponent(TableSevenButton)
                            .addComponent(TableFiveButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tb_txt5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tb_txt7)
                        .addComponent(lbl_tb_txt8))
                    .addComponent(lbl_tb_txt6))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TableNineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tb_txt9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TableTenButton)
                            .addComponent(TableElevenButton)
                            .addComponent(TableTwelveButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tb_txt10)
                            .addComponent(lbl_tb_txt11)
                            .addComponent(lbl_tb_txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lbl_tb_txt_topic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tb_txt_topic.setText("  Select a table for dining");

        Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Enter your email here");

        clearEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearEmail.setText("Clear");
        clearEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(lbl_tb_txt_topic, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearEmail)))
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_tb_txt_topic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearEmail)))
                .addGap(159, 159, 159))
        );

        jPanel2.setBackground(new java.awt.Color(7, 198, 168));

        jLabel1.setFont(new java.awt.Font("French Script MT", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Knukles");

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resturent");

        btn_login_logout.setText("Login");
        btn_login_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_logoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Select a table from the right ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("click button above to start.");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setText("                  AND");

        dateLab2.setBackground(new java.awt.Color(7, 198, 168));
        dateLab2.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        dateLab2.setForeground(new java.awt.Color(255, 255, 255));
        dateLab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLab2.setOpaque(true);

        dateLab.setBackground(new java.awt.Color(7, 198, 168));
        dateLab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dateLab.setForeground(new java.awt.Color(255, 255, 255));
        dateLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLab.setOpaque(true);

        timeLab.setBackground(new java.awt.Color(7, 198, 168));
        timeLab.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        timeLab.setForeground(new java.awt.Color(255, 255, 255));
        timeLab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLab.setOpaque(true);

        btn_go_to_kitchen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_go_to_kitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/kitchen.png"))); // NOI18N
        btn_go_to_kitchen.setText("Go to Kitchen");
        btn_go_to_kitchen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_go_to_kitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_go_to_kitchenActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("© 2018 Team CODE RIPPERS All Rights Reserved");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapos/images/InterfaceImages/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_go_to_kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(btn_login_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_login_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_go_to_kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1816, 995));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_go_to_kitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_go_to_kitchenActionPerformed
        //Dining dining = new Dining(getLastTable());
        //dining.setVisible(true);
        TakeAway tk = new TakeAway();
        tk.setLastTable(getLastTable());
        tk.setVisible(true);

    }//GEN-LAST:event_btn_go_to_kitchenActionPerformed

    private void btn_login_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_logoutActionPerformed
        SignUp signup = new SignUp();
        signup.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_login_logoutActionPerformed

    private void TableTwelveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableTwelveButtonActionPerformed

        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableTwelveButton.setEnabled(false);
                insertReservation(12);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableTwelveButton.setEnabled(true);
                        deleteReservation(12);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableTwelveButton.setEnabled(true);
            }

        }

    }//GEN-LAST:event_TableTwelveButtonActionPerformed

    private void TableElevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableElevenButtonActionPerformed

        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableElevenButton.setEnabled(false);
                insertReservation(11);
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableElevenButton.setEnabled(true);
                        deleteReservation(11);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableElevenButton.setEnabled(true);
            }
        }


    }//GEN-LAST:event_TableElevenButtonActionPerformed

    private void TableOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableOneButtonActionPerformed

        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableOneButton.setEnabled(false);

                insertReservation(1);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableOneButton.setEnabled(true);
                        deleteReservation(1);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableOneButton.setEnabled(true);
            }
        }


    }//GEN-LAST:event_TableOneButtonActionPerformed

    private void TableTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableTwoButtonActionPerformed
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableTwoButton.setEnabled(false);
                insertReservation(2);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableTwoButton.setEnabled(true);
                        deleteReservation(2);
                    }
                },
                        timeLimit
                );// TODO add your handling code here:
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableTwoButton.setEnabled(true);
            }
 }
        

    }//GEN-LAST:event_TableTwoButtonActionPerformed

    private void TableThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableThreeButtonActionPerformed
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableThreeButton.setEnabled(false);
                insertReservation(3);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableThreeButton.setEnabled(true);
                        deleteReservation(3);
                    }
                },
                        timeLimit
                );// TODO add your handling code here:
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableThreeButton.setEnabled(true);
            }
 }
       

    }//GEN-LAST:event_TableThreeButtonActionPerformed

    private void TableFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableFourButtonActionPerformed
       
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableFourButton.setEnabled(false);
                insertReservation(4);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableFourButton.setEnabled(true);
                        deleteReservation(4);
                    }
                },
                        timeLimit
                );// TODO add your handling code here:
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableFourButton.setEnabled(true);
            }
        }
       

    }//GEN-LAST:event_TableFourButtonActionPerformed

    private void TableFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableFiveButtonActionPerformed
       
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableFiveButton.setEnabled(false);
                insertReservation(5);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableFiveButton.setEnabled(true);
                        deleteReservation(5);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableFiveButton.setEnabled(true);
            }
        }
       

    }//GEN-LAST:event_TableFiveButtonActionPerformed

    private void TableSixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableSixButtonActionPerformed

        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableSixButton.setEnabled(false);
                insertReservation(6);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableSixButton.setEnabled(true);
                        deleteReservation(6);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableSixButton.setEnabled(true);
            }
        }
        

    }//GEN-LAST:event_TableSixButtonActionPerformed

    private void TableSevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableSevenButtonActionPerformed
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableSevenButton.setEnabled(false);
                insertReservation(7);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableSevenButton.setEnabled(true);
                        deleteReservation(7);
                    }
                },
                        timeLimit
                );

            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableSevenButton.setEnabled(true);
            }
 }
        

    }//GEN-LAST:event_TableSevenButtonActionPerformed

    private void TableEightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableEightButtonActionPerformed
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {

            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableEightButton.setEnabled(false);
                insertReservation(8);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableEightButton.setEnabled(true);
                        deleteReservation(8);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableEightButton.setEnabled(true);
            }
}

    }//GEN-LAST:event_TableEightButtonActionPerformed

    private void TableNineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableNineButtonActionPerformed

        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableNineButton.setEnabled(false);
                insertReservation(9);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableNineButton.setEnabled(true);
                        deleteReservation(9);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableNineButton.setEnabled(true);
            }
        }
        

    }//GEN-LAST:event_TableNineButtonActionPerformed

    private void TableTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableTenButtonActionPerformed
        if (Email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email for notification");
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to reserve this table? You won't be able to unreserve it once you reserve", "Exit Program Message Box",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                TableTenButton.setEnabled(false);
                insertReservation(10);

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        TableTenButton.setEnabled(true);
                        deleteReservation(10);
                    }
                },
                        timeLimit
                );
            } else if (confirmed == JOptionPane.NO_OPTION) {
                TableTenButton.setEnabled(true);
            }
        }
       

    }//GEN-LAST:event_TableTenButtonActionPerformed

    private void clearEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEmailActionPerformed
        Email.setText(null);
    }//GEN-LAST:event_clearEmailActionPerformed

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
         new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                Email.setText(null);
            }
        },
                timeLimitEmailClear
        );
    }//GEN-LAST:event_EmailMouseClicked
    /*
    public void insertReservation(int tableNo)
    {
           String query="INSERT INTO reservedtables(tableNo) VALUES(?)";
           try{
               PreparedStatement obj = MyConnection.getConnection().prepareStatement(query);
               obj.setInt(1,tableNo);
               
                 if(obj.executeUpdate()>0){
                    //JOptionPane.showMessageDialog(null, "Reserved");
                }
                 obj.close();
           }
           catch(SQLException ex){
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
           }catch(Exception ex)
           {
               ex.printStackTrace();
            
           }
    }
public void  deleteReservation(int tableNo)
    {
    
    String query="DELETE FROM reservedtables WHERE tableNo="+tableNo;
    try
    {
        PreparedStatement obj = MyConnection.getConnection().prepareStatement(query);
        obj.executeUpdate(query);
        obj.close();
    }
    catch(SQLException ex){
        Logger.getLogger(Register.class.getName()).log(Level.SEVERE,null,ex);
    }
    }*/

    public void insertReservation(int tableNo) {
        String query = "INSERT INTO reservedtables(tableNo,Email) VALUES(?,?)";
        String selectquery = "SELECT * FROM reservedtables WHERE tableNo=" + tableNo;
        try {
            Statement st = MyConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(selectquery);
            if (rs.absolute(1)) {
                JOptionPane.showMessageDialog(null, "This table is already reserved");
                MyConnection.getConnection().close();
            } else {
                PreparedStatement obj = MyConnection.getConnection().prepareStatement(query);
                obj.setInt(1, tableNo);
                obj.setString(2, Email.getText());
                setLastTable(tableNo);

                if (obj.executeUpdate() > 0) {
                    //JOptionPane.showMessageDialog(null, "Reserved");
                }
                MyConnection.getConnection().close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    public void deleteReservation(int tableNo) {

        String query = "DELETE FROM reservedtables WHERE tableNo=" + tableNo;
        try {
            PreparedStatement obj = MyConnection.getConnection().prepareStatement(query);
            obj.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton TableEightButton;
    private javax.swing.JButton TableElevenButton;
    private javax.swing.JButton TableFiveButton;
    private javax.swing.JButton TableFourButton;
    private javax.swing.JButton TableNineButton;
    private javax.swing.JButton TableOneButton;
    private javax.swing.JButton TableSevenButton;
    private javax.swing.JButton TableSixButton;
    private javax.swing.JButton TableTenButton;
    private javax.swing.JButton TableThreeButton;
    private javax.swing.JButton TableTwelveButton;
    private javax.swing.JButton TableTwoButton;
    private javax.swing.JButton btn_go_to_kitchen;
    private javax.swing.JButton btn_login_logout;
    private javax.swing.JButton clearEmail;
    private javax.swing.JLabel dateLab;
    private javax.swing.JLabel dateLab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_tb_txt1;
    private javax.swing.JLabel lbl_tb_txt10;
    private javax.swing.JLabel lbl_tb_txt11;
    private javax.swing.JLabel lbl_tb_txt12;
    private javax.swing.JLabel lbl_tb_txt2;
    private javax.swing.JLabel lbl_tb_txt3;
    private javax.swing.JLabel lbl_tb_txt4;
    private javax.swing.JLabel lbl_tb_txt5;
    private javax.swing.JLabel lbl_tb_txt6;
    private javax.swing.JLabel lbl_tb_txt7;
    private javax.swing.JLabel lbl_tb_txt8;
    private javax.swing.JLabel lbl_tb_txt9;
    private javax.swing.JLabel lbl_tb_txt_topic;
    private javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables
}
