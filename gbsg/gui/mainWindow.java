/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg.gui;

import gbsg.ImageFileFilter;
import gbsg.ListDirectory;
import gbsg.NotDirectoryException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author gautam
 */
public  class mainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wallpaper_xml_path_textfield = new javax.swing.JTextField();
        wallpaper_xml_path_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        generate_xml_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        directory_listing_textarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        wallpaper_directory_path_button = new javax.swing.JButton();
        wallpaper_directory_path_textfield = new javax.swing.JTextField();
        about_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 229, 228));

        jLabel1.setText("Save wallpaper xml file at: ");

        wallpaper_xml_path_button.setText("Browse");
        wallpaper_xml_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallpaper_xml_path_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wallpaper_xml_path_textfield)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wallpaper_xml_path_button)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(wallpaper_xml_path_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(wallpaper_xml_path_button)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(230, 229, 228));

        generate_xml_button.setFont(new java.awt.Font("Ubuntu", 0, 24));
        generate_xml_button.setText("Generate");
        generate_xml_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_xml_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generate_xml_button, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generate_xml_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(230, 229, 228));

        directory_listing_textarea.setColumns(20);
        directory_listing_textarea.setEditable(false);
        directory_listing_textarea.setRows(5);
        jScrollPane1.setViewportView(directory_listing_textarea);

        jLabel2.setText("List of selected files:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(230, 229, 228));

        jLabel3.setText("Wallpaper Folder : ");

        wallpaper_directory_path_button.setText("Browse");
        wallpaper_directory_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallpaper_directory_path_buttonActionPerformed(evt);
            }
        });

        wallpaper_directory_path_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallpaper_directory_path_textfieldActionPerformed(evt);
            }
        });
        wallpaper_directory_path_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wallpaper_directory_path_textfieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wallpaper_directory_path_textfield)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wallpaper_directory_path_button)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wallpaper_directory_path_button)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(wallpaper_directory_path_textfield))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );

        about_button.setText("About");
        about_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(about_button)
                        .addGap(364, 364, 364)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(about_button)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wallpaper_xml_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallpaper_xml_path_buttonActionPerformed
        // TODO add your handling code here:
        final JFileChooser  jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jf.setFileFilter(new FileNameExtensionFilter("XML Files", "xml"));
        jf.setMultiSelectionEnabled(false);

        jf.addActionListener(new  ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().toString().equalsIgnoreCase("ApproveSelection")){
                    wallpaper_xml_path_textfield.setText(jf.getSelectedFile().getAbsolutePath().toString());
                }
            }
        });

        jf.showDialog(jPanel1, "Choose File");
    }//GEN-LAST:event_wallpaper_xml_path_buttonActionPerformed

    private void wallpaper_directory_path_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wallpaper_directory_path_textfieldFocusLost
        // TODO add your handling code here:
        setDirectoryListingTextArea(getWallpaperDirectoryListing());
    }//GEN-LAST:event_wallpaper_directory_path_textfieldFocusLost

    private void wallpaper_directory_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallpaper_directory_path_buttonActionPerformed
        // TODO add your handling code here:
        final JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.setMultiSelectionEnabled(false);
        jf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().toString().equalsIgnoreCase("ApproveSelection")){
                    wallpaper_directory_path_textfield.setText(
                            jf.getSelectedFile().getAbsolutePath().toString());
                    setDirectoryListingTextArea(getWallpaperDirectoryListing());
                }
            }
        });
        jf.showDialog(jPanel4, "Choose Directory");
    }//GEN-LAST:event_wallpaper_directory_path_buttonActionPerformed

    private void wallpaper_directory_path_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallpaper_directory_path_textfieldActionPerformed
        // TODO add your handling code here:
        setDirectoryListingTextArea(getWallpaperDirectoryListing());
    }//GEN-LAST:event_wallpaper_directory_path_textfieldActionPerformed

    private void generate_xml_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_xml_buttonActionPerformed
        try {
            try {

                new gbsg.GenerateWallpaperXMLFile(
                        new ListDirectory(
                            wallpaper_directory_path_textfield.getText(),new gbsg.ImageFileFilter() ),
                        new File(wallpaper_xml_path_textfield.getText()));
                JOptionPane.showMessageDialog(jPanel2, "Successfully Generated xml file " , "Success !!" , JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(jPanel2, "The xml file location is invalid","Invalid xml file location",JOptionPane.ERROR_MESSAGE);
            }
        } catch (NotDirectoryException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Wallpaper folder is invalid", "Wallpaper folder is not a valid directory", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generate_xml_buttonActionPerformed

    private void about_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_buttonActionPerformed
        // TODO add your handling code here:
        new gbsg.gui.Help().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_about_buttonActionPerformed

    private String[] getWallpaperDirectoryListing(){
        String path = wallpaper_directory_path_textfield.getText();
        String [] listing = null;

        try {
            gbsg.ListDirectory ld = new gbsg.ListDirectory(path, new gbsg.ImageFileFilter());
            listing = ld.getDirectoryListingAsStringArray(gbsg.ListDirectory.FILE_NAMES_ONLY);
        } catch (NotDirectoryException ex) {
            listing = new String[1];
            listing[0] = "Not a directory";
            return listing;

        }
        finally{
            return listing;
        }
    }
    private void setDirectoryListingTextArea(String [] listing){
        String Text = "";
        for(String l :listing){
            Text += (l+"\n") ;
        }
        directory_listing_textarea.setText(Text);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_button;
    private javax.swing.JTextArea directory_listing_textarea;
    private javax.swing.JButton generate_xml_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton wallpaper_directory_path_button;
    private javax.swing.JTextField wallpaper_directory_path_textfield;
    private javax.swing.JButton wallpaper_xml_path_button;
    private javax.swing.JTextField wallpaper_xml_path_textfield;
    // End of variables declaration//GEN-END:variables
}