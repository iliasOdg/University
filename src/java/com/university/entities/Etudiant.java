/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e")
    , @NamedQuery(name = "Etudiant.findByIdetudiant", query = "SELECT e FROM Etudiant e WHERE e.idetudiant = :idetudiant")
    , @NamedQuery(name = "Etudiant.findByMatricule", query = "SELECT e FROM Etudiant e WHERE e.matricule = :matricule")
    , @NamedQuery(name = "Etudiant.findByNometudiant", query = "SELECT e FROM Etudiant e WHERE e.nometudiant = :nometudiant")
    , @NamedQuery(name = "Etudiant.findByPrenometudiant", query = "SELECT e FROM Etudiant e WHERE e.prenometudiant = :prenometudiant")
    , @NamedQuery(name = "Etudiant.findByDatenaissance", query = "SELECT e FROM Etudiant e WHERE e.datenaissance = :datenaissance")
    , @NamedQuery(name = "Etudiant.findByAdresse", query = "SELECT e FROM Etudiant e WHERE e.adresse = :adresse")
    , @NamedQuery(name = "Etudiant.findByPhoto", query = "SELECT e FROM Etudiant e WHERE e.photo = :photo")
    , @NamedQuery(name = "Etudiant.findByEtat", query = "SELECT e FROM Etudiant e WHERE e.etat = :etat")
    , @NamedQuery(name = "Etudiant.findByUsrcreate", query = "SELECT e FROM Etudiant e WHERE e.usrcreate = :usrcreate")
    , @NamedQuery(name = "Etudiant.findByUserlastupdate", query = "SELECT e FROM Etudiant e WHERE e.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Etudiant.findByUserdelete", query = "SELECT e FROM Etudiant e WHERE e.userdelete = :userdelete")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idetudiant")
    private Integer idetudiant;
    @Size(max = 20)
    @Column(name = "matricule")
    private String matricule;
    @Size(max = 50)
    @Column(name = "nometudiant")
    private String nometudiant;
    @Size(max = 50)
    @Column(name = "prenometudiant")
    private String prenometudiant;
    @Column(name = "datenaissance")
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    @Size(max = 150)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 50)
    @Column(name = "photo")
    private String photo;
    @Size(max = 20)
    @Column(name = "etat")
    private String etat;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idetudiant")
    private List<Note> noteList;
    @OneToMany(mappedBy = "idetudiant")
    private List<Inscription> inscriptionList;

    public Etudiant() {
    }

    public Etudiant(Integer idetudiant) {
        this.idetudiant = idetudiant;
    }

    public Integer getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(Integer idetudiant) {
        this.idetudiant = idetudiant;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNometudiant() {
        return nometudiant;
    }

    public void setNometudiant(String nometudiant) {
        this.nometudiant = nometudiant;
    }

    public String getPrenometudiant() {
        return prenometudiant;
    }

    public void setPrenometudiant(String prenometudiant) {
        this.prenometudiant = prenometudiant;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
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
    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
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
        hash += (idetudiant != null ? idetudiant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.idetudiant == null && other.idetudiant != null) || (this.idetudiant != null && !this.idetudiant.equals(other.idetudiant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Etudiant[ idetudiant=" + idetudiant + " ]";
    }
    
}
