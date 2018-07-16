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
@Table(name = "classe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classe.findAll", query = "SELECT c FROM Classe c")
    , @NamedQuery(name = "Classe.findByIdclasse", query = "SELECT c FROM Classe c WHERE c.idclasse = :idclasse")
    , @NamedQuery(name = "Classe.findByLibelleclasse", query = "SELECT c FROM Classe c WHERE c.libelleclasse = :libelleclasse")
    , @NamedQuery(name = "Classe.findByScolarite", query = "SELECT c FROM Classe c WHERE c.scolarite = :scolarite")
    , @NamedQuery(name = "Classe.findByUsrcreate", query = "SELECT c FROM Classe c WHERE c.usrcreate = :usrcreate")
    , @NamedQuery(name = "Classe.findByUserlastupdate", query = "SELECT c FROM Classe c WHERE c.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Classe.findByUserdelete", query = "SELECT c FROM Classe c WHERE c.userdelete = :userdelete")})
public class Classe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclasse")
    private Integer idclasse;
    @Size(max = 50)
    @Column(name = "libelleclasse")
    private String libelleclasse;
    @Column(name = "scolarite")
    private BigInteger scolarite;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @JoinColumn(name = "idfiliere", referencedColumnName = "idfiliere")
    @ManyToOne
    private Filiere idfiliere;
    @OneToMany(mappedBy = "idclasse")
    private List<Enseignantmatiereclasse> enseignantmatiereclasseList;
    @OneToMany(mappedBy = "idclasse")
    private List<Inscription> inscriptionList;

    public Classe() {
    }

    public Classe(Integer idclasse) {
        this.idclasse = idclasse;
    }

    public Integer getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Integer idclasse) {
        this.idclasse = idclasse;
    }

    public String getLibelleclasse() {
        return libelleclasse;
    }

    public void setLibelleclasse(String libelleclasse) {
        this.libelleclasse = libelleclasse;
    }

    public BigInteger getScolarite() {
        return scolarite;
    }

    public void setScolarite(BigInteger scolarite) {
        this.scolarite = scolarite;
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

    public Filiere getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(Filiere idfiliere) {
        this.idfiliere = idfiliere;
    }

    @XmlTransient
    public List<Enseignantmatiereclasse> getEnseignantmatiereclasseList() {
        return enseignantmatiereclasseList;
    }

    public void setEnseignantmatiereclasseList(List<Enseignantmatiereclasse> enseignantmatiereclasseList) {
        this.enseignantmatiereclasseList = enseignantmatiereclasseList;
    }

    @XmlTransient
    public List<Inscription> getInscriptionList() {
        return inscriptionList;
    }

    public void setInscriptionList(List<Inscription> inscriptionList) {
        this.inscriptionList = inscriptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclasse != null ? idclasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classe)) {
            return false;
        }
        Classe other = (Classe) object;
        if ((this.idclasse == null && other.idclasse != null) || (this.idclasse != null && !this.idclasse.equals(other.idclasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Classe[ idclasse=" + idclasse + " ]";
    }
    
}
