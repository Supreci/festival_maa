/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVue;

/**
 *
 * @author etudsio
 */
public class jpEtablissement extends javax.swing.JPanel {

    /**
     * Creates new form jpEtablissement
     */
    public jpEtablissement() {
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

        lab_nomEtabl = new javax.swing.JLabel();
        lab_rue = new javax.swing.JLabel();
        lab_ville = new javax.swing.JLabel();
        lab_cp4 = new javax.swing.JLabel();
        lab_tel = new javax.swing.JLabel();
        lab_mail = new javax.swing.JLabel();
        la_type = new javax.swing.JLabel();
        lab_resp = new javax.swing.JLabel();
        lab_civilite = new javax.swing.JLabel();
        txt_nomEtabl = new javax.swing.JTextField();
        txt_rue = new javax.swing.JTextField();
        txt_ville = new javax.swing.JTextField();
        txt_cp = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        rad_mme = new javax.swing.JRadioButton();
        rad_mr = new javax.swing.JRadioButton();
        txt_nomResp = new javax.swing.JTextField();
        txt_prenomResp = new javax.swing.JTextField();
        lab_nomResp = new javax.swing.JLabel();
        lab_prenomResp = new javax.swing.JLabel();
        rad_etabl = new javax.swing.JRadioButton();
        rad_autre = new javax.swing.JRadioButton();
        btn_ajt = new javax.swing.JButton();
        btn_annuler = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setPreferredSize(new java.awt.Dimension(675, 300));
        setRequestFocusEnabled(false);

        lab_nomEtabl.setText("Nom");

        lab_rue.setText("Rue");

        lab_ville.setText("Ville");

        lab_cp4.setText("Code postal");

        lab_tel.setText("Téléphone");

        lab_mail.setText("Mail");

        la_type.setText("Type");

        lab_resp.setText("Responsable :");

        lab_civilite.setText("Civilité");

        txt_nomEtabl.setPreferredSize(new java.awt.Dimension(120, 20));
        txt_nomEtabl.setRequestFocusEnabled(false);

        txt_rue.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_ville.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_cp.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_tel.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_mail.setPreferredSize(new java.awt.Dimension(120, 20));

        rad_mme.setText("Mme");
        rad_mme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_mmeActionPerformed(evt);
            }
        });

        rad_mr.setText("Mr");

        txt_nomResp.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_prenomResp.setPreferredSize(new java.awt.Dimension(120, 20));

        lab_nomResp.setText("Nom");

        lab_prenomResp.setText("Prénom");

        rad_etabl.setText("Etablissement scolaire");

        rad_autre.setText("Autre");

        btn_ajt.setText("Ajouter");

        btn_annuler.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btn_ajt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_annuler))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_resp)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lab_nomEtabl)
                                    .addComponent(lab_rue)
                                    .addComponent(lab_ville)
                                    .addComponent(lab_cp4)
                                    .addComponent(lab_tel)
                                    .addComponent(lab_mail)
                                    .addComponent(la_type)
                                    .addComponent(lab_civilite)
                                    .addComponent(lab_nomResp)
                                    .addComponent(lab_prenomResp))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rad_mme)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_mr))
                                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nomEtabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_prenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rad_etabl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_autre)))))))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_nomEtabl)
                    .addComponent(txt_nomEtabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_rue)
                    .addComponent(txt_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_ville)
                    .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_cp4)
                    .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_tel)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_mail)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_type)
                    .addComponent(rad_etabl)
                    .addComponent(rad_autre))
                .addGap(7, 7, 7)
                .addComponent(lab_resp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_civilite)
                    .addComponent(rad_mme)
                    .addComponent(rad_mr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_nomResp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_prenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_prenomResp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajt)
                    .addComponent(btn_annuler))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rad_mmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_mmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad_mmeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajt;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JLabel la_type;
    private javax.swing.JLabel lab_civilite;
    private javax.swing.JLabel lab_cp4;
    private javax.swing.JLabel lab_mail;
    private javax.swing.JLabel lab_nomEtabl;
    private javax.swing.JLabel lab_nomResp;
    private javax.swing.JLabel lab_prenomResp;
    private javax.swing.JLabel lab_resp;
    private javax.swing.JLabel lab_rue;
    private javax.swing.JLabel lab_tel;
    private javax.swing.JLabel lab_ville;
    private javax.swing.JRadioButton rad_autre;
    private javax.swing.JRadioButton rad_etabl;
    private javax.swing.JRadioButton rad_mme;
    private javax.swing.JRadioButton rad_mr;
    private javax.swing.JTextField txt_cp;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nomEtabl;
    private javax.swing.JTextField txt_nomResp;
    private javax.swing.JTextField txt_prenomResp;
    private javax.swing.JTextField txt_rue;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_ville;
    // End of variables declaration//GEN-END:variables
}