/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVue;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pkgEntite.HibernateUtil;
import pkgEntite.Typechambre;

/**
 *
 * @author etudsio
 */
public class jpChambre extends javax.swing.JPanel {

    /**
     * Creates new form jpChambre
     */
    public jpChambre() {
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

        jlblTitre = new javax.swing.JLabel();
        jlblId = new javax.swing.JLabel();
        jlblLibelle = new javax.swing.JLabel();
        jtxtCode = new javax.swing.JTextField();
        jtxtLibelle = new javax.swing.JTextField();
        jbtnAnnuler = new javax.swing.JButton();
        jbtnValider = new javax.swing.JButton();

        jlblTitre.setText("Ajout d'un nouveau type de chambre");

        jlblId.setText("Id");

        jlblLibelle.setText("Libelle");

        jbtnAnnuler.setText("Annuler");

        jbtnValider.setText("Valider");
        jbtnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnValiderActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlblId)
                            .add(jlblLibelle))
                        .add(45, 45, 45)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtnAnnuler)
                            .add(jbtnValider)
                            .add(jtxtLibelle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtxtCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(89, 89, 89)
                        .add(jlblTitre)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jlblTitre)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlblId)
                    .add(jtxtCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlblLibelle)
                    .add(jtxtLibelle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jbtnAnnuler)
                .add(18, 18, 18)
                .add(jbtnValider)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnValiderActionPerformed
        // TODO add your handling code here:
        Session session = HibernateUtil.getSessionFactory().openSession();

        Typechambre unTypeChambre = new Typechambre(jtxtCode.getText(), jtxtLibelle.getText());
        //unEtabl.getEtaId();
       // unEtabl.setEtaNom(txt_nomEtabl.getText());


        Transaction tx = session.beginTransaction();
        session.save(unTypeChambre);
        tx.commit();

        System.out.println(unTypeChambre.getTchId());
        System.out.println(unTypeChambre.getTchLibelle());
    }//GEN-LAST:event_jbtnValiderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAnnuler;
    private javax.swing.JButton jbtnValider;
    private javax.swing.JLabel jlblId;
    private javax.swing.JLabel jlblLibelle;
    private javax.swing.JLabel jlblTitre;
    private javax.swing.JTextField jtxtCode;
    private javax.swing.JTextField jtxtLibelle;
    // End of variables declaration//GEN-END:variables
}
