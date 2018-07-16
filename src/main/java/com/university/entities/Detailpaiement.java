/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "detailpaiement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailpaiement.findAll", query = "SELECT d FROM Detailpaiement d")
    , @NamedQuery(name = "Detailpaiement.findByIddetailpaiement", query = "SELECT d FROM Detailpaiement d WHERE d.iddetailpaiement = :iddetailpaiement")
    , @NamedQuery(name = "Detailpaiement.findByMontantpaye", query = "SELECT d FROM Detailpaiement d WHERE d.montantpaye = :montantpaye")
    , @NamedQuery(name = "Detailpaiement.findByDatepaiement", query = "SELECT d FROM Detailpaiement d WHERE d.datepaiement = :datepaiement")
    , @NamedQuery(name = "Detailpaiement.findByUsercreate", query = "SELECT d FROM Detailpaiement d WHERE d.usercreate = :usercreate")
    , @NamedQuery(name = "Detailpaiement.findByUserlastupdate", query = "SELECT d FROM Detailpaiement d WHERE d.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Detailpaiement.findByUserdelete", query = "SELECT d FROM Detailpaiement d WHERE d.userdelete = :userdelete")
    , @NamedQuery(name = "Detailpaiement.findByEtat", query = "SELECT d FROM Detailpaiement d WHERE d.etat = :etat")})
public class Detailpaiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetailpaiement")
    private Integer iddetailpaiement;
    @Column(name = "montantpaye")
    private BigInteger montantpaye;
    @Column(name = "datepaiement")
    @Temporal(TemporalType.DATE)
    private Date datepaiement;
    @Size(max = 50)
    @Column(name = "usercreate")
    private String usercreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @Size(max = 20)
    @Column(name = "etat")
    private String etat;
    @JoinColumn(name = "idinscription", referencedColumnName = "idinscription")
    @ManyToOne
    private Inscription idinscription;

    public Detailpaiement() {
    }

    public Detailpaiement(Integer iddetailpaiement) {
        this.iddetailpaiement = iddetailpaiement;
    }

    public Integer getIddetailpaiement() {
        return iddetailpaiement;
    }

    public void setIddetailpaiement(Integer iddetailpaiement) {
        this.iddetailpaiement = iddetailpaiement;
    }

    public BigInteger getMontantpaye() {
        return montantpaye;
    }

    public void setMontantpaye(BigInteger montantpaye) {
        this.montantpaye = montantpaye;
    }

    public Date getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
    }

    public String getUsercreate() {
        return usercreate;
    }

    public void setUsercreate(String usercreate) {
        this.usercreate = usercreate;
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Inscription getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Inscription idinscription) {
        this.idinscription = idinscription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetailpaiement != null ? iddetailpaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailpaiement)) {
            return false;
        }
        Detailpaiement other = (Detailpaiement) object;
        if ((this.iddetailpaiement == null && other.iddetailpaiement != null) || (this.iddetailpaiement != null && !this.iddetailpaiement.equals(other.iddetailpaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Detailpaiement[ iddetailpaiement=" + iddetailpaiement + " ]";
    }
    
}
