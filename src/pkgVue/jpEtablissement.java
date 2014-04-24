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
    private String etat;
    /**
     * Creates new form jpEtablissement
     */
    public jpEtablissement() {
        initComponents();
        ChargerListeEtablissement();
        this.etat = "ajt" ;
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
        txt_id = new javax.swing.JTextField();
        lab_id = new javax.swing.JLabel();
        btn_voir = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setPreferredSize(new java.awt.Dimension(675, 500));
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
        rad_mme.setText("Mme");

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

        txt_id.setMinimumSize(new java.awt.Dimension(120, 20));
        txt_id.setPreferredSize(new java.awt.Dimension(120, 20));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        lab_id.setText("Identifiant");

        btn_voir.setText("Voir");
        btn_voir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voirMouseClicked(evt);
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
                            .addComponent(lab_prenomResp)
                            .addComponent(lab_id))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lst_etabl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_voir))
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(rad_mme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_mr)))))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lst_etabl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voir))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_id))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lab_nomEtabl))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomEtabl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_rue)
                    .addComponent(txt_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_ville)
                    .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_cp4)
                    .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_tel)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_mail)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_type)
                    .addComponent(rad_etabl)
                    .addComponent(rad_autre))
                .addGap(7, 7, 7)
                .addComponent(lab_resp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rad_mme, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lab_civilite)
                        .addComponent(rad_mr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_nomResp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lab_prenomResp))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_prenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajt)
                    .addComponent(btn_annuler))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajtMouseClicked
    // Quand on clic sur "Ajouter" ou "Modifier"
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    //Récupérer valeur des boutons radio
    String civilite = "monsieur";
    if(rad_mme.isSelected()){
        civilite = "madame";
    }
    boolean type = false;
    if(rad_etabl.isSelected()){
        type = true;
    }

    Etablissement unEtabl = new Etablissement(txt_id.getText(), txt_nomEtabl.getText(), txt_rue.getText(), txt_cp.getText(), txt_ville.getText(), txt_tel.getText(), type, civilite, txt_nomResp.getText(), txt_prenomResp.getText());

    Transaction tx = session.beginTransaction();
    
    if(this.etat.equals("ajt")){ //Si on est sur ajouter->On ajoute
        session.save(unEtabl);
    }
    else //si non on modifie 
    {
        session.update(unEtabl);
        ChargerListeEtablissement();//Rechargement de la liste
        retourPageAjout();
       
    }
    tx.commit();
    ChargerListeEtablissement();//Rechargement de la liste
    
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
    private void retourPageAjout(){
        txt_id.enable(true);
        txt_id.setText("");
        txt_nomEtabl.setText("");
        txt_rue.setText("");
        txt_ville.setText("");
        txt_cp.setText("");
        txt_tel.setText("");
        txt_mail.setText("");
        txt_nomResp.setText("");
        txt_prenomResp.setText("");
       
        btn_ajt.setText("Ajouter");//Bouton ajt -> modifier
        btn_annuler.setText("Annuler");//Bouton annuler -> supprimer
        
        this.etat = "ajt";
    }
    
    
    private void btn_annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_annulerMouseClicked
        // Quand on clic sur "Annuler" ou "supprimer"
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    //Récupérer valeur des boutons radio
    String civilite = "monsieur";
    if(rad_mme.isSelected()){
        civilite = "madame";
    }
    boolean type = false;
    if(rad_etabl.isSelected()){
        type = true;
    }

    Etablissement unEtabl = new Etablissement(txt_id.getText(), txt_nomEtabl.getText(), txt_rue.getText(), txt_cp.getText(), txt_ville.getText(), txt_tel.getText(), type, civilite, txt_nomResp.getText(), txt_prenomResp.getText());

    Transaction tx = session.beginTransaction();
    
    if(this.etat.equals("voir")){ //Si on est sur voir->On supprime
        session.delete(unEtabl);
        retourPageAjout();
    }
    else //si non on annule simplement 
    {
        //à faire
    }
    tx.commit();
    ChargerListeEtablissement();//Rechargement de la liste
    this.etat = "ajt";
    }//GEN-LAST:event_btn_annulerMouseClicked

    private void txt_nomEtablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomEtablActionPerformed
        // Event à supprimer
    }//GEN-LAST:event_txt_nomEtablActionPerformed

    private void lst_etablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_etablActionPerformed
        //  Event à supprimer
    }//GEN-LAST:event_lst_etablActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // Event à supprimer
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_voirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voirMouseClicked
        // Quand on clic sur le bouton "Voir" (Afficher l'établissement de la liste déroulante)
        btn_ajt.setText("Modifier");//Bouton ajt -> modifier
        btn_annuler.setText("Supprimer");//Bouton annuler -> supprimer
        String sNom;
        Etablissement unEtabl;
  
        //if (bCharge = true){
            sNom = (String) lst_etabl.getSelectedItem();
            sNom = sNom.replace("'","''");
            //System.out.println(sNom);
                    
                    
            //BigDecimal i = new BigDecimal(BigInteger.ONE);
            String sQuery;
            sQuery = "From Etablissement where Eta_Nom = '"+ sNom + "'";     
            jfPrincipal.getSession().beginTransaction();
            Query q=jfPrincipal.getSession().createQuery(sQuery);
            unEtabl = (Etablissement) q.uniqueResult();
            
            
            // System.out.println(unEtabl.getEtaNom());
             
            txt_id.enable(false);
            txt_id.setText(unEtabl.getEtaId());
            txt_nomEtabl.setText(unEtabl.getEtaNom());
            txt_rue.setText(unEtabl.getEtaRue());
            txt_ville.setText(unEtabl.getEtaVille());
            txt_cp.setText(unEtabl.getEtaCp());
            txt_tel.setText(unEtabl.getEtaTel());
            txt_mail.setText(unEtabl.getEtaMail());
            txt_nomResp.setText(unEtabl.getEtaNomresp());
            txt_prenomResp.setText(unEtabl.getEtaPrenomresp());
            
            //Boutons radios
            if((unEtabl.getEtaCivilresp().equals("madame")))
            {
                rad_mme.setSelected(true);
            }
            else
            {
                rad_mr.setSelected(true);
            }
            //rad_Group_civilite.setText(unetablissement.getEtaCivilresp());
            if((unEtabl.isEtaType() == true ))
            {
                rad_etabl.setSelected(true);
            }
            else
            {
                rad_autre.setSelected(true);
            }
            
            this.etat = "voir" ; 
            //radGroup_type.setText(unetablissement.isEtaType());
        //} 
    }//GEN-LAST:event_btn_voirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajt;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JButton btn_voir;
    private javax.swing.JLabel lab_civilite;
    private javax.swing.JLabel lab_cp4;
    private javax.swing.JLabel lab_id;
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
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nomEtabl;
    private javax.swing.JTextField txt_nomResp;
    private javax.swing.JTextField txt_prenomResp;
    private javax.swing.JTextField txt_rue;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_ville;
    // End of variables declaration//GEN-END:variables
}
