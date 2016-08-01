/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author lucky
 */
@Entity
@Table(name = "m_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MCategory.findAll", query = "SELECT m FROM MCategory m")})
public class MCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCategori")
    private Integer iDCategori;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;

    public MCategory() {
    }

    public MCategory(Integer iDCategori) {
        this.iDCategori = iDCategori;
    }

    public MCategory(Integer iDCategori, String nama, boolean status) {
        this.iDCategori = iDCategori;
        this.nama = nama;
        this.status = status;
    }

    public Integer getIDCategori() {
        return iDCategori;
    }

    public void setIDCategori(Integer iDCategori) {
        this.iDCategori = iDCategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCategori != null ? iDCategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MCategory)) {
            return false;
        }
        MCategory other = (MCategory) object;
        if ((this.iDCategori == null && other.iDCategori != null) || (this.iDCategori != null && !this.iDCategori.equals(other.iDCategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.MCategory[ iDCategori=" + iDCategori + " ]";
    }
    
}
