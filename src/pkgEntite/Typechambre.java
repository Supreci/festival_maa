package pkgEntite;
// Generated 27 mars 2014 16:23:23 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Typechambre generated by hbm2java
 */
public class Typechambre  implements java.io.Serializable {


     private String tchId;
     private String tchLibelle;
     private Set offres = new HashSet(0);

    public Typechambre() {
    }

	
    public Typechambre(String tchId, String tchLibelle) {
        this.tchId = tchId;
        this.tchLibelle = tchLibelle;
    }
    public Typechambre(String tchId, String tchLibelle, Set offres) {
       this.tchId = tchId;
       this.tchLibelle = tchLibelle;
       this.offres = offres;
    }
   
    public String getTchId() {
        return this.tchId;
    }
    
    public void setTchId(String tchId) {
        this.tchId = tchId;
    }
    public String getTchLibelle() {
        return this.tchLibelle;
    }
    
    public void setTchLibelle(String tchLibelle) {
        this.tchLibelle = tchLibelle;
    }
    public Set getOffres() {
        return this.offres;
    }
    
    public void setOffres(Set offres) {
        this.offres = offres;
    }




}


