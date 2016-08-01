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
@Table(name = "m_market")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MMarket.findAll", query = "SELECT m FROM MMarket m")})
public class MMarket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMarket")
    private Integer iDMarket;
    @Size(max = 255)
    @Column(name = "Nama")
    private String nama;
    @Column(name = "Status")
    private Boolean status;

    public MMarket() {
    }

    public MMarket(Integer iDMarket) {
        this.iDMarket = iDMarket;
    }

    public Integer getIDMarket() {
        return iDMarket;
    }

    public void setIDMarket(Integer iDMarket) {
        this.iDMarket = iDMarket;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMarket != null ? iDMarket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MMarket)) {
            return false;
        }
        MMarket other = (MMarket) object;
        if ((this.iDMarket == null && other.iDMarket != null) || (this.iDMarket != null && !this.iDMarket.equals(other.iDMarket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.MMarket[ iDMarket=" + iDMarket + " ]";
    }
    
}
