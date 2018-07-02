/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "note")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n")
    , @NamedQuery(name = "Note.findByIdnote", query = "SELECT n FROM Note n WHERE n.idnote = :idnote")
    , @NamedQuery(name = "Note.findByNote", query = "SELECT n FROM Note n WHERE n.note = :note")
    , @NamedQuery(name = "Note.findByNoterattrapage", query = "SELECT n FROM Note n WHERE n.noterattrapage = :noterattrapage")
    , @NamedQuery(name = "Note.findBySemestre", query = "SELECT n FROM Note n WHERE n.semestre = :semestre")
    , @NamedQuery(name = "Note.findByAnnee", query = "SELECT n FROM Note n WHERE n.annee = :annee")
    , @NamedQuery(name = "Note.findByEtat", query = "SELECT n FROM Note n WHERE n.etat = :etat")
    , @NamedQuery(name = "Note.findByUsrcreate", query = "SELECT n FROM Note n WHERE n.usrcreate = :usrcreate")
    , @NamedQuery(name = "Note.findByUserlastupdate", query = "SELECT n FROM Note n WHERE n.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Note.findByUserdelete", query = "SELECT n FROM Note n WHERE n.userdelete = :userdelete")})
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnote")
    private Integer idnote;
    @Column(name = "note")
    private Integer note;
    @Column(name = "noterattrapage")
    private Integer noterattrapage;
    @Column(name = "semestre")
    private Integer semestre;
    @Size(max = 20)
    @Column(name = "annee")
    private String annee;
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
    @JoinColumn(name = "idetudiant", referencedColumnName = "idetudiant")
    @ManyToOne
    private Etudiant idetudiant;
    @JoinColumn(name = "idmatiere", referencedColumnName = "idmatiere")
    @ManyToOne
    private Matiere idmatiere;

    public Note() {
    }

    public Note(Integer idnote) {
        this.idnote = idnote;
    }

    public Integer getIdnote() {
        return idnote;
    }

    public void setIdnote(Integer idnote) {
        this.idnote = idnote;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getNoterattrapage() {
        return noterattrapage;
    }

    public void setNoterattrapage(Integer noterattrapage) {
        this.noterattrapage = noterattrapage;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
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

    public Etudiant getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(Etudiant idetudiant) {
        this.idetudiant = idetudiant;
    }

    public Matiere getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(Matiere idmatiere) {
        this.idmatiere = idmatiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnote != null ? idnote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.idnote == null && other.idnote != null) || (this.idnote != null && !this.idnote.equals(other.idnote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Note[ idnote=" + idnote + " ]";
    }
    
}
