/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucky
 */
@Entity
@Table(name = "t_transaksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTransaksi.findAll", query = "SELECT t FROM TTransaksi t")})
public class TTransaksi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTransaksi")
    private Integer iDTransaksi;
    @Column(name = "HargaTotal")
    private BigInteger hargaTotal;
    @Column(name = "DateTransaksi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTransaksi;

    public TTransaksi() {
    }

    public TTransaksi(Integer iDTransaksi) {
        this.iDTransaksi = iDTransaksi;
    }

    public Integer getIDTransaksi() {
        return iDTransaksi;
    }

    public void setIDTransaksi(Integer iDTransaksi) {
        this.iDTransaksi = iDTransaksi;
    }

    public BigInteger getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(BigInteger hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Date getDateTransaksi() {
        return dateTransaksi;
    }

    public void setDateTransaksi(Date dateTransaksi) {
        this.dateTransaksi = dateTransaksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTransaksi != null ? iDTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTransaksi)) {
            return false;
        }
        TTransaksi other = (TTransaksi) object;
        if ((this.iDTransaksi == null && other.iDTransaksi != null) || (this.iDTransaksi != null && !this.iDTransaksi.equals(other.iDTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.TTransaksi[ iDTransaksi=" + iDTransaksi + " ]";
    }
    
}
