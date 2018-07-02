/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscription.findAll", query = "SELECT i FROM Inscription i")
    , @NamedQuery(name = "Inscription.findByIdinscription", query = "SELECT i FROM Inscription i WHERE i.idinscription = :idinscription")
    , @NamedQuery(name = "Inscription.findByScolarite", query = "SELECT i FROM Inscription i WHERE i.scolarite = :scolarite")
    , @NamedQuery(name = "Inscription.findByMontantscolaritepaye", query = "SELECT i FROM Inscription i WHERE i.montantscolaritepaye = :montantscolaritepaye")
    , @NamedQuery(name = "Inscription.findByAnnee", query = "SELECT i FROM Inscription i WHERE i.annee = :annee")
    , @NamedQuery(name = "Inscription.findByUsrcreate", query = "SELECT i FROM Inscription i WHERE i.usrcreate = :usrcreate")
    , @NamedQuery(name = "Inscription.findByUserlastupdate", query = "SELECT i FROM Inscription i WHERE i.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Inscription.findByUserdelete", query = "SELECT i FROM Inscription i WHERE i.userdelete = :userdelete")})
public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idinscription")
    private Integer idinscription;
    @Column(name = "scolarite")
    private BigInteger scolarite;
    @Column(name = "montantscolaritepaye")
    private Integer montantscolaritepaye;
    @Size(max = 20)
    @Column(name = "annee")
    private String annee;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idinscription")
    private List<Detailpaiement> detailpaiementList;
    @JoinColumn(name = "idclasse", referencedColumnName = "idclasse")
    @ManyToOne
    private Classe idclasse;
    @JoinColumn(name = "idetudiant", referencedColumnName = "idetudiant")
    @ManyToOne
    private Etudiant idetudiant;
    @OneToMany(mappedBy = "idinscription")
    private List<Piecejustificative> piecejustificativeList;
    @OneToMany(mappedBy = "idinscription")
    private List<Moyenne> moyenneList;

    public Inscription() {
    }

    public Inscription(Integer idinscription) {
        this.idinscription = idinscription;
    }

    public Integer getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Integer idinscription) {
        this.idinscription = idinscription;
    }

    public BigInteger getScolarite() {
        return scolarite;
    }

    public void setScolarite(BigInteger scolarite) {
        this.scolarite = scolarite;
    }

    public Integer getMontantscolaritepaye() {
        return montantscolaritepaye;
    }

    public void setMontantscolaritepaye(Integer montantscolaritepaye) {
        this.montantscolaritepaye = montantscolaritepaye;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getUsrcreate() {
        return usrcreate;
    }

    public void setUsrcreate(String usrcreate) {
        this.usrcreate = usrcreate;
    }

    public String getUserlastupdate() {
        return userlastupdate;
    }

    public void setUserlastupdate(String userlastupdate) {
        this.userlastupdate = userlastupdate;
    }

    public String getUserdelete() {
        return userdelete;
    }

    public void setUserdelete(String userdelete) {
        this.userdelete = userdelete;
    }

    @XmlTransient
    public List<Detailpaiement> getDetailpaiementList() {
        return detailpaiementList;
    }

    public void setDetailpaiementList(List<Detailpaiement> detailpaiementList) {
        this.detailpaiementList = detailpaiementList;
    }

    public Classe getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Classe idclasse) {
        this.idclasse = idclasse;
    }

    public Etudiant getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(Etudiant idetudiant) {
        this.idetudiant = idetudiant;
    }

    @XmlTransient
    public List<Piecejustificative> getPiecejustificativeList() {
        return piecejustificativeList;
    }

    public void setPiecejustificativeList(List<Piecejustificative> piecejustificativeList) {
        this.piecejustificativeList = piecejustificativeList;
    }

    @XmlTransient
    public List<Moyenne> getMoyenneList() {
        return moyenneList;
    }

    public void setMoyenneList(List<Moyenne> moyenneList) {
        this.moyenneList = moyenneList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinscription != null ? idinscription.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscription)) {
            return false;
        }
        Inscription other = (Inscription) object;
        if ((this.idinscription == null && other.idinscription != null) || (this.idinscription != null && !this.idinscription.equals(other.idinscription))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Inscription[ idinscription=" + idinscription + " ]";
    }
    
}
