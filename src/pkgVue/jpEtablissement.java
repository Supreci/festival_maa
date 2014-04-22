/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVue;

import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pkgEntite.Etablissement;
import pkgEntite.HibernateUtil;

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

        radGroup_type = new javax.swing.ButtonGroup();
        rad_Group_civilite = new javax.swing.ButtonGroup();
        lab_nomEtabl = new javax.swing.JLabel();
        lab_rue = new javax.swing.JLabel();
        lab_ville = new javax.swing.JLabel();
        lab_cp4 = new javax.swing.JLabel();
        lab_tel = new javax.swing.JLabel();
        lab_mail = new javax.swing.JLabel();
        lab_type = new javax.swing.JLabel();
        lab_resp = new javax.swing.JLabel();
        lab_civilite = new javax.swing.JLabel();
        txt_rue = new javax.swing.JTextField();
        txt_ville = new javax.swing.JTextField();
        txt_cp = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        rad_mr = new javax.swing.JRadioButton();
        txt_nomResp = new javax.swing.JTextField();
        txt_prenomResp = new javax.swing.JTextField();
        lab_nomResp = new javax.swing.JLabel();
        lab_prenomResp = new javax.swing.JLabel();
        rad_etabl = new javax.swing.JRadioButton();
        rad_autre = new javax.swing.JRadioButton();
        txt_nomEtabl = new javax.swing.JTextField();
        btn_ajt = new javax.swing.JButton();
        rad_mme = new javax.swing.JRadioButton();
        btn_annuler = new javax.swing.JButton();
        lst_etabl = new javax.swing.JComboBox();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setPreferredSize(new java.awt.Dimension(675, 400));
        setRequestFocusEnabled(false);

        lab_nomEtabl.setText("Nom");

        lab_rue.setText("Rue");

        lab_ville.setText("Ville");

        lab_cp4.setText("Code postal");

        lab_tel.setText("Téléphone");

        lab_mail.setText("Mail");

        lab_type.setText("Type");

        lab_resp.setText("Responsable :");

        lab_civilite.setText("Civilité");

        txt_rue.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_ville.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_cp.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_tel.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_mail.setPreferredSize(new java.awt.Dimension(120, 20));

        rad_Group_civilite.add(rad_mr);
        rad_mr.setText("Mr");

        txt_nomResp.setPreferredSize(new java.awt.Dimension(120, 20));

        txt_prenomResp.setPreferredSize(new java.awt.Dimension(120, 20));

        lab_nomResp.setText("Nom");

        lab_prenomResp.setText("Prénom");

        radGroup_type.add(rad_etabl);
        rad_etabl.setSelected(true);
        rad_etabl.setText("Etablissement scolaire");

        radGroup_type.add(rad_autre);
        rad_autre.setText("Autre");

        txt_nomEtabl.setPreferredSize(new java.awt.Dimension(120, 20));
        txt_nomEtabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomEtablActionPerformed(evt);
            }
        });

        btn_ajt.setText("Ajouter");
        btn_ajt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ajtMouseClicked(evt);
            }
        });

        rad_Group_civilite.add(rad_mme);
        rad_mme.setSelected(true);

        btn_annuler.setText("Annuler");
        btn_annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_annulerMouseClicked(evt);
            }
        });

        lst_etabl.setPreferredSize(new java.awt.Dimension(120, 20));
        lst_etabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_etablActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_ajt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_annuler))
                    .addComponent(lab_resp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_nomEtabl)
                            .addComponent(lab_rue)
                            .addComponent(lab_ville)
                            .addComponent(lab_cp4)
                            .addComponent(lab_tel)
                            .addComponent(lab_mail)
                            .addComponent(lab_type)
                            .addComponent(lab_civilite)
                            .addComponent(lab_nomResp)
                            .addComponent(lab_prenomResp))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad_mme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rad_mr))
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_prenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad_etabl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_autre))
                            .addComponent(txt_nomEtabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lst_etabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lst_etabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_nomEtabl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nomEtabl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lab_type)
                    .addComponent(rad_etabl)
                    .addComponent(rad_autre))
                .addGap(7, 7, 7)
                .addComponent(lab_resp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_civilite)
                    .addComponent(rad_mr)
                    .addComponent(rad_mme))
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
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajtMouseClicked
        // Quand on clic sur "Ajouter"
    Session session = HibernateUtil.getSessionFactory().openSession();
    String i = "01"; //ID temporaire
    String civilite ;
    
    //Récupérer valeur des boutons radio
    if(rad_mme.isSelected()){
        civilite = "madame";
    }
    else{
        civilite = "monsieur";
    }
    boolean type ;
    if(rad_etabl.isSelected()){
        type = true;
    }
    else{
        type = false;
    }
    
    Etablissement unEtabl = new Etablissement(i, txt_nomEtabl.getText(), txt_rue.getText(), txt_cp.getText(), txt_ville.getText(), txt_tel.getText(), type, civilite, txt_nomResp.getText(), txt_prenomResp.getText());
    //unEtabl.getEtaId();
   // unEtabl.setEtaNom(txt_nomEtabl.getText());


    Transaction tx = session.beginTransaction();
    session.save(unEtabl);
    
    System.out.println(unEtabl.getEtaNom());
    tx.commit();
    System.out.println(unEtabl.getEtaNom());
    
    
    
    }//GEN-LAST:event_btn_ajtMouseClicked
   
    private void ChargerListeEtablissement(){
            lst_etabl.removeAllItems(); //vider la liste deroulante
            String sReq= "from Etablissement";
            jfPrincipal.getSession().beginTransaction();
            Query q = jfPrincipal.getSession().createQuery(sReq);
            Iterator itEtabl = q.iterate();

            while(itEtabl.hasNext()){
               Etablissement unetablissement = (Etablissement)itEtabl.next();
               lst_etabl.addItem(unetablissement.getEtaNom());
            }
               // bcharge = true;
           }
    private void btn_annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_annulerMouseClicked
        // Quand on clic sur "Annuler"
    }//GEN-LAST:event_btn_annulerMouseClicked

    private void txt_nomEtablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomEtablActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomEtablActionPerformed

    private void lst_etablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_etablActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lst_etablActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajt;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JLabel lab_civilite;
    private javax.swing.JLabel lab_cp4;
    private javax.swing.JLabel lab_mail;
    private javax.swing.JLabel lab_nomEtabl;
    private javax.swing.JLabel lab_nomResp;
    private javax.swing.JLabel lab_prenomResp;
    private javax.swing.JLabel lab_resp;
    private javax.swing.JLabel lab_rue;
    private javax.swing.JLabel lab_tel;
    private javax.swing.JLabel lab_type;
    private javax.swing.JLabel lab_ville;
    private javax.swing.JComboBox lst_etabl;
    private javax.swing.ButtonGroup radGroup_type;
    private javax.swing.ButtonGroup rad_Group_civilite;
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
