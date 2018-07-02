/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "uniteenseignement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uniteenseignement.findAll", query = "SELECT u FROM Uniteenseignement u")
    , @NamedQuery(name = "Uniteenseignement.findByIdue", query = "SELECT u FROM Uniteenseignement u WHERE u.idue = :idue")
    , @NamedQuery(name = "Uniteenseignement.findByLibelleue", query = "SELECT u FROM Uniteenseignement u WHERE u.libelleue = :libelleue")
    , @NamedQuery(name = "Uniteenseignement.findByUsrcreate", query = "SELECT u FROM Uniteenseignement u WHERE u.usrcreate = :usrcreate")
    , @NamedQuery(name = "Uniteenseignement.findByUserlastupdate", query = "SELECT u FROM Uniteenseignement u WHERE u.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Uniteenseignement.findByUserdelete", query = "SELECT u FROM Uniteenseignement u WHERE u.userdelete = :userdelete")})
public class Uniteenseignement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idue")
    private Integer idue;
    @Size(max = 20)
    @Column(name = "libelleue")
    private String libelleue;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idue")
    private List<Enseignantmatiereclasse> enseignantmatiereclasseList;

    public Uniteenseignement() {
    }

    public Uniteenseignement(Integer idue) {
        this.idue = idue;
    }

    public Integer getIdue() {
        return idue;
    }

    public void setIdue(Integer idue) {
        this.idue = idue;
    }

    public String getLibelleue() {
        return libelleue;
    }

    public void setLibelleue(String libelleue) {
        this.libelleue = libelleue;
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
    public List<Enseignantmatiereclasse> getEnseignantmatiereclasseList() {
        return enseignantmatiereclasseList;
    }

    public void setEnseignantmatiereclasseList(List<Enseignantmatiereclasse> enseignantmatiereclasseList) {
        this.enseignantmatiereclasseList = enseignantmatiereclasseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idue != null ? idue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uniteenseignement)) {
            return false;
        }
        Uniteenseignement other = (Uniteenseignement) object;
        if ((this.idue == null && other.idue != null) || (this.idue != null && !this.idue.equals(other.idue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Uniteenseignement[ idue=" + idue + " ]";
    }
    
}
