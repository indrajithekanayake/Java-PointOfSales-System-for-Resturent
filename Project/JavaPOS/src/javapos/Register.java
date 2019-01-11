package javapos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javapos.MyConnection.getConnection;//import Connection file is inside MyConnection.java

//Register class inherits form javax.swing.Jframe parent class
public class Register extends javax.swing.JFrame {

    //create constructor Register
    public Register() {
        initComponents();//create new Register form
        showDate();//calling function for show system date
        showTime();//calling function for show system time
        showDate2();
    }

    void showDate() {
        Date d = new Date();//Create object for get system date
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");//Create object for get system date format
        dateLab.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {//this is a timer
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();//Create object for get system date
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");//Create object for get system date format
                timeLab.setText(s.format(d));
            }

        }
        ).start();//Start the timer
    }

    void showDate2() {
        Date d = new Date();//Create object for get system date
        SimpleDateFormat s = new SimpleDateFormat("EE");//Create object for get system date format
        dateLab2.setText(s.format(d));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2_photo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        dateLab2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5_upload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2_PW2 = new javax.swing.JPasswordField();
        jPasswordField3_AdminPW = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4_UN = new javax.swing.JTextField();
        jButton4_register = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField3_PW1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(7, 198, 168));

        jLabel2_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/javapos/images/InterfaceImages/default_profile.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Knukles ");

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RESTURENT");

        timeLab.setBackground(new java.awt.Color(243, 91, 57));
        timeLab.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        timeLab.setForeground(new java.awt.Color(255, 255, 255));
        timeLab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        dateLab.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dateLab.setForeground(new java.awt.Color(255, 255, 255));
        dateLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dateLab2.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        dateLab2.setForeground(new java.awt.Color(255, 255, 255));
        dateLab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("© 2018 Team CODE RIPPERS All Rights Reserved");

        jButton5_upload.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton5_upload.setText("Upload photo");
        jButton5_upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_uploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton5_upload)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-20, 0, 400, 510);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Register New Employee");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 10, 400, 50);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Affiliation");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 180, 190, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Retype Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 300, 210, 60);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 240, 190, 60);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AdminID");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 60, 190, 60);

        jPasswordField2_PW2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPasswordField2_PW2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2_PW2.setToolTipText("");
        jPasswordField2_PW2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPasswordField2_PW2);
        jPasswordField2_PW2.setBounds(640, 300, 260, 60);

        jPasswordField3_AdminPW.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPasswordField3_AdminPW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField3_AdminPW.setToolTipText("");
        jPasswordField3_AdminPW.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPasswordField3_AdminPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3_AdminPWActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField3_AdminPW);
        jPasswordField3_AdminPW.setBounds(580, 60, 320, 60);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Username");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(390, 120, 190, 60);

        jTextField4_UN.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextField4_UN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField4_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_UNActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4_UN);
        jTextField4_UN.setBounds(580, 120, 320, 60);

        jButton4_register.setBackground(new java.awt.Color(255, 255, 255));
        jButton4_register.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton4_register.setText("Register");
        jButton4_register.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4_register.setContentAreaFilled(false);
        jButton4_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4_register.setSelected(true);
        jButton4_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_registerActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_register);
        jButton4_register.setBounds(590, 380, 200, 60);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jRadioButton1.setText("Cheff");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(690, 200, 107, 40);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jRadioButton3.setText("Admin");
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(570, 200, 97, 37);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(880, 0, 32, 32);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(920, 0, 32, 32);

        jPasswordField3_PW1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPasswordField3_PW1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField3_PW1.setToolTipText("");
        jPasswordField3_PW1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPasswordField3_PW1);
        jPasswordField3_PW1.setBounds(580, 240, 320, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/javapos/images/InterfaceImages/goback.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 410, 80, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(974, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_UNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_UNActionPerformed

    private void jButton4_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_registerActionPerformed
        String uname = jTextField4_UN.getText();//get text from textfield and store variable uname
        String adminpw=String.valueOf(jPasswordField3_AdminPW.getPassword());//get text from passwordfield then convert it into string and store in the variable adminpw
        String adminpass="123asd";//one of the issue in my login system, this feature added later so there is no database field for admin password thats why I give it through the system(temporarily)
        String pass = String.valueOf(jPasswordField3_PW1.getPassword());//get text from passwordfield then convert it into string and store in the variable pass
        String re_pass = String.valueOf(jPasswordField2_PW2.getPassword());//get text from passwordfield then convert it into string and store in the variable re_pass
        
        //Registration form validation
        if(adminpw.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Admin's special pasword is needed to register a new employee");
        }
        else if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username Required");
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password Required");
        }
        else if(affiliation.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Affiliation Required");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Passwords does not match");
        }
        else if(checkUsername(uname))//CheckUsername function is in line 442
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        else if(!adminpass.equals(adminpw))
        {
            JOptionPane.showMessageDialog(null, "Admin's special password is incorrect");
        }
        else if(jLabel2_photo==null)
        {
            JOptionPane.showMessageDialog(null, "Please enter an image");
        }
        else{
        
        String query = "INSERT INTO user(username, affiliation, password, photo) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(query);//inbuilt class to run sql query and connect with the database
            InputStream is = new FileInputStream(new File(s));
            ps.setString(1, uname);//insert username
            ps.setString(2, affiliation);//insert affiliation
            ps.setString(3, pass);//insert password
            ps.setBlob(4, is);//insert image
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "New user added");
            }
            ps.close();//close the connection
            
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
            }
    }//GEN-LAST:event_jButton4_registerActionPerformed

    public boolean checkUsername(String username){//check the user is already exist or not
        
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser=false;
        String query = "SELECT * FROM `user` WHERE `username`=? ";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser=true;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return checkUser;//return true or falce 
        
    }
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton5_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_uploadActionPerformed
        //upload image
        jButton5_upload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
                fileChooser.addChoosableFileFilter(filter);
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    jLabel2_photo.setIcon(ResizeImage(path));
                    s = path;
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("No Data");
                }
            }
        });

    }//GEN-LAST:event_jButton5_uploadActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        affiliation = "Admin";

    }//GEN-LAST:event_jRadioButton3ActionPerformed
public String getRadioButtonValue(){
    
    String value=jRadioButton3.getText();
    return value;
    
}
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        affiliation = "Cheff";

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jPasswordField3_AdminPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3_AdminPWActionPerformed
        
    }//GEN-LAST:event_jPasswordField3_AdminPWActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SignUp signup = new SignUp();
        signup.setVisible(true);
        this.dispose();
        //go back button
    }//GEN-LAST:event_jButton2ActionPerformed

    //Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(jLabel2_photo.getWidth(), jLabel2_photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel dateLab;
    private javax.swing.JLabel dateLab2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4_register;
    private javax.swing.JButton jButton5_upload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2_photo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2_PW2;
    private javax.swing.JPasswordField jPasswordField3_AdminPW;
    private javax.swing.JPasswordField jPasswordField3_PW1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField4_UN;
    private javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables
private String affiliation;
    String s;
}
