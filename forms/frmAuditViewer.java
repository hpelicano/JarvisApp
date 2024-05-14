package com.fiserv.jarvis.forms;

import com.fiserv.jarvis.utils.Utils;
import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author F1W1JF7
 */
public class frmAuditViewer extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAuditViewer
     */
    public frmAuditViewer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstFiles = new javax.swing.JList<>();
        btnLoadFiles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetail = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Audit Viewer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("File Audit Viewer");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        lstFiles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        lstFiles.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lstFiles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFilesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstFiles);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 500));

        btnLoadFiles.setText("Audit Files");
        btnLoadFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFilesActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadFiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 210, 30));

        txtDetail.setEditable(false);
        txtDetail.setColumns(20);
        txtDetail.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDetail.setRows(5);
        jScrollPane1.setViewportView(txtDetail);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 990, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFilesActionPerformed
        File[] listAudit;
        DefaultListModel listModel = new DefaultListModel();
        
        String directory = Utils.getProperty( propertyFile , "directory.root.Audit");
        
        listAudit = Utils.getFilesFromDirectory(directory);
        
        if(listAudit.length > 0){
            
            for(File f : listAudit){
                listModel.addElement(f.toString());
            }
            
            lstFiles.setModel(listModel);
            
        }else{
            JOptionPane.showMessageDialog(null,"No hay archivo en la carpeta Audit.");
        }
        
        
    }//GEN-LAST:event_btnLoadFilesActionPerformed

    private void lstFilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFilesValueChanged
        if (!evt.getValueIsAdjusting()) {
            String fileSelected = lstFiles.getSelectedValue();
            
            txtDetail.setText("");
            
            List<String> file = Utils.readFile(fileSelected);

            if(!file.isEmpty()){
                for(String s : file){
                    txtDetail.append(s + "\n");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la lectura de archivo.");
            }
            
        }
    }//GEN-LAST:event_lstFilesValueChanged

    
    
    
    
    private static String propertyFile = "C:\\Jarvis\\Config\\Properties";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadFiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstFiles;
    private javax.swing.JTextArea txtDetail;
    // End of variables declaration//GEN-END:variables
}
