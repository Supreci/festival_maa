/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVue;

import org.hibernate.Session;
import pkgEntite.HibernateUtil;

/**
 *
 * @author etudsio
 */
public class jfPrincipal extends javax.swing.JFrame {

    /* Déclaration d'une session commune aux différentes interfaces*/
    private static Session session = HibernateUtil.getSessionFactory().openSession();    
    //Déclaration d'un panel jpHebergement
    protected jpHebergement pnlHebergement = new jpHebergement();
    protected jpAccueil pnlAccueil = new jpAccueil();      
    protected jpEtablissement pnlEtablissement = new jpEtablissement();
    protected jpChambre pnlChambre = new jpChambre();
    protected jpChambres pnlChambres = new jpChambres();
   
    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
        this.setContentPane(pnlAccueil);
    }

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        jfPrincipal.session = session;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jmnAccueil = new javax.swing.JMenu();
        jmnEtablissement = new javax.swing.JMenu();
        jmnTypChambre = new javax.swing.JMenu();
        jmniListe2 = new javax.swing.JMenuItem();
        jmniAjout2 = new javax.swing.JMenuItem();
        jmnHebergement = new javax.swing.JMenu();
        jmnChambre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmnAccueil.setText("Accueil");
        jmnAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnAccueilMouseClicked(evt);
            }
        });
        jMenuBar.add(jmnAccueil);

        jmnEtablissement.setText("Etablissments");
        jmnEtablissement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnEtablissementMouseClicked(evt);
            }
        });
        jmnEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnEtablissementActionPerformed(evt);
            }
        });
        jMenuBar.add(jmnEtablissement);

        jmnTypChambre.setText("Types chambres");

        jmniListe2.setText("Liste");
        jmniListe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniListe2ActionPerformed(evt);
            }
        });
        jmnTypChambre.add(jmniListe2);

        jmniAjout2.setText("Ajout");
        jmniAjout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAjout2ActionPerformed(evt);
            }
        });
        jmnTypChambre.add(jmniAjout2);

        jMenuBar.add(jmnTypChambre);

        jmnHebergement.setText("Hébergement");
        jmnHebergement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnHebergementMouseClicked(evt);
            }
        });
        jMenuBar.add(jmnHebergement);

        jmnChambre.setText("Attribution");
        jMenuBar.add(jmnChambre);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnHebergementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnHebergementMouseClicked
       this.setContentPane(pnlHebergement);
       pack(); //pour raffraichir l'affichage
    }//GEN-LAST:event_jmnHebergementMouseClicked

    private void jmnAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnAccueilMouseClicked
       this.setContentPane(pnlAccueil);
       pack(); //pour raffraichir l'affichage
    }//GEN-LAST:event_jmnAccueilMouseClicked

    private void jmniListe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniListe2ActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pnlChambres);
        //pnlChambres.chargerTabl();
        pack();
    }//GEN-LAST:event_jmniListe2ActionPerformed

    private void jmniAjout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAjout2ActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pnlChambre);
        pack();
    }//GEN-LAST:event_jmniAjout2ActionPerformed

    private void jmnEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnEtablissementActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pnlEtablissement);
        pack();
    }//GEN-LAST:event_jmnEtablissementActionPerformed

    private void jmnEtablissementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnEtablissementMouseClicked
        // TODO add your handling code here:
        this.setContentPane(pnlEtablissement);
        pack();
    }//GEN-LAST:event_jmnEtablissementMouseClicked


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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jmnAccueil;
    private javax.swing.JMenu jmnChambre;
    private javax.swing.JMenu jmnEtablissement;
    private javax.swing.JMenu jmnHebergement;
    private javax.swing.JMenu jmnTypChambre;
    private javax.swing.JMenuItem jmniAjout2;
    private javax.swing.JMenuItem jmniListe2;
    // End of variables declaration//GEN-END:variables
}
