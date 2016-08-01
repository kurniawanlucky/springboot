/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucky
 */
@Entity
@Table(name = "m_member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MMember.findAll", query = "SELECT m FROM MMember m")})
public class MMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMember")
    private Integer iDMember;
    @Size(max = 100)
    @Column(name = "Nama")
    private String nama;
    @Size(max = 50)
    @Column(name = "Alamat")
    private String alamat;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "Email")
    private String email;
    @Column(name = "NoHandphome")
    private Integer noHandphome;
    @JoinColumn(name = "IDUser", referencedColumnName = "id")
    @ManyToOne
    private MUser iDUser;

    public MMember() {
    }

    public MMember(Integer iDMember) {
        this.iDMember = iDMember;
    }

    public Integer getIDMember() {
        return iDMember;
    }

    public void setIDMember(Integer iDMember) {
        this.iDMember = iDMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNoHandphome() {
        return noHandphome;
    }

    public void setNoHandphome(Integer noHandphome) {
        this.noHandphome = noHandphome;
    }

    public MUser getIDUser() {
        return iDUser;
    }

    public void setIDUser(MUser iDUser) {
        this.iDUser = iDUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMember != null ? iDMember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MMember)) {
            return false;
        }
        MMember other = (MMember) object;
        if ((this.iDMember == null && other.iDMember != null) || (this.iDMember != null && !this.iDMember.equals(other.iDMember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.MMember[ iDMember=" + iDMember + " ]";
    }
    
}
