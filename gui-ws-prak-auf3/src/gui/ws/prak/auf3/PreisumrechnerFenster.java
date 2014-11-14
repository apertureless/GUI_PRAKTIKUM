package gui.ws.prak.auf3;


import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */

/**
 *
 * @author Jakub Juszczak <juszczak.j@googlemail.com>
 */
public class PreisumrechnerFenster extends javax.swing.JFrame {
    
    
    private static final String ERLAUBTE_ZEICHEN ="0123456789,.";
    
    private static final EingabeCheck ec = new EingabeCheck();

    /**
     * Creates new form PreisumrechnerFenster
     */
    public PreisumrechnerFenster() {
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
        jLFenstergroesse = new javax.swing.JLabel();
        jCFlaschengroesse = new javax.swing.JComboBox();
        jLFlaschenpreis = new javax.swing.JLabel();
        jTPreisEingabe = new javax.swing.JTextField();
        jLEuro = new javax.swing.JLabel();
        jBUmrechnenUp = new javax.swing.JButton();
        jBDown = new javax.swing.JButton();
        jLPreisProLiter = new javax.swing.JLabel();
        jTPreisAusgabe = new javax.swing.JTextField();
        jLEuro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Preisumrechner");
        setMaximumSize(new java.awt.Dimension(400, 300));
        setName("Hauptfenster"); // NOI18N
        setResizable(false);

        jLFenstergroesse.setLabelFor(jCFlaschengroesse);
        jLFenstergroesse.setText("Flaschengröße");

        jCFlaschengroesse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,187 l", "0,25 l", "0,375 l", "0,5 l", "0,62 l", "0,7 l", "0,75 l", "0,8 l", "1 l", "1,5 l " }));
        jCFlaschengroesse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFlaschengroesseActionPerformed(evt);
            }
        });
        jCFlaschengroesse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCFlaschengroesseKeyPressed(evt);
            }
        });

        jLFlaschenpreis.setText("Flaschenpreis");

        jTPreisEingabe.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTPreisEingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPreisEingabeActionPerformed(evt);
            }
        });
        jTPreisEingabe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEingabeKey(evt);
            }
        });

        jLEuro.setText("€");

        jBUmrechnenUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ws/prak/auf3/arrow-down.png"))); // NOI18N
        jBUmrechnenUp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBUmrechnenUp.setMaximumSize(new java.awt.Dimension(69, 69));
        jBUmrechnenUp.setMinimumSize(new java.awt.Dimension(69, 69));
        jBUmrechnenUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUmrechnenUpActionPerformed(evt);
            }
        });

        jBDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ws/prak/auf3/arrow-up.png"))); // NOI18N
        jBDown.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBDown.setMaximumSize(new java.awt.Dimension(69, 69));
        jBDown.setMinimumSize(new java.awt.Dimension(69, 69));
        jBDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDownActionPerformed(evt);
            }
        });

        jLPreisProLiter.setText("Preis pro Liter");

        jTPreisAusgabe.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTPreisAusgabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPreisAusgabeActionPerformed(evt);
            }
        });

        jLEuro1.setText("€");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFenstergroesse)
                    .addComponent(jLFlaschenpreis)
                    .addComponent(jLPreisProLiter))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBUmrechnenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jBDown, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTPreisAusgabe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCFlaschengroesse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTPreisEingabe))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEuro)
                    .addComponent(jLEuro1))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFenstergroesse)
                    .addComponent(jCFlaschengroesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFlaschenpreis)
                    .addComponent(jTPreisEingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEuro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBDown, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBUmrechnenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreisProLiter)
                    .addComponent(jTPreisAusgabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEuro1))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDownActionPerformed

    /**
     * Berechent den Literpreis wenn der Button mit dem Pfeil nach Unten gedrückt wird.
     * @param evt 
     */
    private void jBUmrechnenUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUmrechnenUpActionPerformed
        Berechne();
    }//GEN-LAST:event_jBUmrechnenUpActionPerformed

    private void jTPreisAusgabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPreisAusgabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPreisAusgabeActionPerformed
    /**
     * Setzt die Preisausgabe zurück wenn die Combobox neu ausgewählt wird.
     * @param evt 
     */
    private void jCFlaschengroesseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFlaschengroesseActionPerformed
       jTPreisAusgabe.setText("" + 0);
    }//GEN-LAST:event_jCFlaschengroesseActionPerformed
    /**
     * Berechnet den Literpreis wenn Enter in der Combobox gedrückt wird.
     * @param evt 
     */
    private void jCFlaschengroesseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCFlaschengroesseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           Berechne();
       }
    }//GEN-LAST:event_jCFlaschengroesseKeyPressed
    /**
     * Berechnet den Literpreis wenn Enter im Textfeld gedrückt wird.
     * @param evt 
     */
    private void jTEingabeKey(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEingabeKey
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           Berechne();
       }
    }//GEN-LAST:event_jTEingabeKey

    private void jTPreisEingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPreisEingabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPreisEingabeActionPerformed

    private void Berechne() {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        String sPreis = jTPreisEingabe.getText().toString();
        
        try {
            if (!ec.verify(jTPreisEingabe)) {
                throw new ParseException ("Fehler", 0);
            }
            
            double flaschengroesse = nf.parse(jCFlaschengroesse.getItemAt(jCFlaschengroesse.getSelectedIndex()).toString()).doubleValue();          
            double preis = nf.parse(sPreis).doubleValue();
            double literPreis = preis / flaschengroesse;
            
            jTPreisAusgabe.setText(nf.format(literPreis));
            
        } catch (ParseException e) {
            
            jTPreisEingabe.setText("");
            jTPreisEingabe.requestFocusInWindow();
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PreisumrechnerFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreisumrechnerFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreisumrechnerFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreisumrechnerFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PreisumrechnerFenster().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDown;
    private javax.swing.JButton jBUmrechnenUp;
    private javax.swing.JComboBox jCFlaschengroesse;
    private javax.swing.JLabel jLEuro;
    private javax.swing.JLabel jLEuro1;
    private javax.swing.JLabel jLFenstergroesse;
    private javax.swing.JLabel jLFlaschenpreis;
    private javax.swing.JLabel jLPreisProLiter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTPreisAusgabe;
    private javax.swing.JTextField jTPreisEingabe;
    // End of variables declaration//GEN-END:variables
}
