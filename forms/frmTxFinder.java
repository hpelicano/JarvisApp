/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.fiserv.jarvis.forms;

/**
 *
 * @author F1W1JF7
 */
public class frmTxFinder extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTxFinder
     */
    public frmTxFinder() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnAcq = new javax.swing.JRadioButton();
        rbtnIss = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        chkCardNumber = new javax.swing.JCheckBox();
        chkInvoiceNumber = new javax.swing.JCheckBox();
        chkSequenceNumber = new javax.swing.JCheckBox();
        chlTicketNumber = new javax.swing.JCheckBox();
        txtCardNumber = new javax.swing.JTextField();
        txtInvoiceNumber = new javax.swing.JTextField();
        txtSequenceNumber = new javax.swing.JTextField();
        txtTicketNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtnTest = new javax.swing.JRadioButton();
        rbtnDvlp = new javax.swing.JRadioButton();
        rbtnProd = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageViewer = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeTestCases = new javax.swing.JTree();
        btnSearch = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlowTransaction = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMesageDetail = new javax.swing.JTextPane();
        btnSavePdf = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPtlfRecord = new javax.swing.JTextPane();

        setClosable(true);
        setIconifiable(true);
        setTitle("Transactional Tracker");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnAcq.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnAcq);
        rbtnAcq.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAcq.setText("ACQ");
        jPanel1.add(rbtnAcq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, -1));

        rbtnIss.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnIss);
        rbtnIss.setForeground(new java.awt.Color(255, 255, 255));
        rbtnIss.setText("ISS");
        jPanel1.add(rbtnIss, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 50, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Tx Mode:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 60));

        chkCardNumber.setBackground(new java.awt.Color(51, 51, 51));
        chkCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        chkCardNumber.setText("Card Number");
        jPanel1.add(chkCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        chkInvoiceNumber.setBackground(new java.awt.Color(51, 51, 51));
        chkInvoiceNumber.setForeground(new java.awt.Color(255, 255, 255));
        chkInvoiceNumber.setText("Invoice Number");
        jPanel1.add(chkInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        chkSequenceNumber.setBackground(new java.awt.Color(51, 51, 51));
        chkSequenceNumber.setForeground(new java.awt.Color(255, 255, 255));
        chkSequenceNumber.setText("Sequence Number");
        jPanel1.add(chkSequenceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));

        chlTicketNumber.setBackground(new java.awt.Color(51, 51, 51));
        chlTicketNumber.setForeground(new java.awt.Color(255, 255, 255));
        chlTicketNumber.setText("Ticket Number");
        jPanel1.add(chlTicketNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));
        jPanel1.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 280, -1));
        jPanel1.add(txtInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 280, -1));
        jPanel1.add(txtSequenceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 280, -1));
        jPanel1.add(txtTicketNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 280, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Search Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 150));

        rbtnTest.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rbtnTest);
        rbtnTest.setForeground(new java.awt.Color(255, 255, 255));
        rbtnTest.setText("TEST");
        jPanel1.add(rbtnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 60, -1));

        rbtnDvlp.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rbtnDvlp);
        rbtnDvlp.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDvlp.setText("DVLP");
        jPanel1.add(rbtnDvlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, -1));

        rbtnProd.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rbtnProd);
        rbtnProd.setForeground(new java.awt.Color(255, 255, 255));
        rbtnProd.setText("PROD");
        jPanel1.add(rbtnProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 60, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Enviroment:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 60));

        txtMessageViewer.setEditable(false);
        txtMessageViewer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Message Viewer:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(txtMessageViewer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 290, 310));

        treeTestCases.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Test Cases:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(treeTestCases);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 310));

        btnSearch.setText("Search");
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 340, 30));

        btnDefault.setText("Default");
        jPanel1.add(btnDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 590));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFlowTransaction.setBackground(new java.awt.Color(153, 204, 255));
        tblFlowTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Flow Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFlowTransaction);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 340));

        txtMesageDetail.setEditable(false);
        txtMesageDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Message Detail:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N
        jScrollPane4.setViewportView(txtMesageDetail);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 470, 340));

        btnSavePdf.setText("Save PDF");
        jPanel2.add(btnSavePdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 100, 80));

        txtPtlfRecord.setEditable(false);
        txtPtlfRecord.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "PTLF Record:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N
        jScrollPane5.setViewportView(txtPtlfRecord);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 610, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 810, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnSavePdf;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkCardNumber;
    private javax.swing.JCheckBox chkInvoiceNumber;
    private javax.swing.JCheckBox chkSequenceNumber;
    private javax.swing.JCheckBox chlTicketNumber;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rbtnAcq;
    private javax.swing.JRadioButton rbtnDvlp;
    private javax.swing.JRadioButton rbtnIss;
    private javax.swing.JRadioButton rbtnProd;
    private javax.swing.JRadioButton rbtnTest;
    private javax.swing.JTable tblFlowTransaction;
    private javax.swing.JTree treeTestCases;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextPane txtMesageDetail;
    private javax.swing.JTextPane txtMessageViewer;
    private javax.swing.JTextPane txtPtlfRecord;
    private javax.swing.JTextField txtSequenceNumber;
    private javax.swing.JTextField txtTicketNumber;
    // End of variables declaration//GEN-END:variables
}