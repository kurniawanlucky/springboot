/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucky
 */
@Entity
@Table(name = "t_transaksi_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTransaksiDetail.findAll", query = "SELECT t FROM TTransaksiDetail t")})
public class TTransaksiDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTransaksiDetail")
    private Integer iDTransaksiDetail;
    @Column(name = "Unit")
    private Integer unit;
    @Column(name = "HargaSatuan")
    private BigInteger hargaSatuan;
    @Column(name = "DateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Column(name = "DateModify")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModify;
    @JoinColumn(name = "IDTransaksi", referencedColumnName = "IDTransaksi")
    @ManyToOne
    private TTransaksi iDTransaksi;

    public TTransaksiDetail() {
    }

    public TTransaksiDetail(Integer iDTransaksiDetail) {
        this.iDTransaksiDetail = iDTransaksiDetail;
    }

    public Integer getIDTransaksiDetail() {
        return iDTransaksiDetail;
    }

    public void setIDTransaksiDetail(Integer iDTransaksiDetail) {
        this.iDTransaksiDetail = iDTransaksiDetail;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public BigInteger getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(BigInteger hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateModify() {
        return dateModify;
    }

    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    public TTransaksi getIDTransaksi() {
        return iDTransaksi;
    }

    public void setIDTransaksi(TTransaksi iDTransaksi) {
        this.iDTransaksi = iDTransaksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTransaksiDetail != null ? iDTransaksiDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTransaksiDetail)) {
            return false;
        }
        TTransaksiDetail other = (TTransaksiDetail) object;
        if ((this.iDTransaksiDetail == null && other.iDTransaksiDetail != null) || (this.iDTransaksiDetail != null && !this.iDTransaksiDetail.equals(other.iDTransaksiDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.TTransaksiDetail[ iDTransaksiDetail=" + iDTransaksiDetail + " ]";
    }
    
}
