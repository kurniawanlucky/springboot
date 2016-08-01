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
@Table(name = "t_add_storage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAddStorage.findAll", query = "SELECT t FROM TAddStorage t")})
public class TAddStorage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAddStorage")
    private Integer iDAddStorage;
    @Column(name = "QtyLama")
    private Integer qtyLama;
    @Column(name = "QtyBaru")
    private Integer qtyBaru;
    @Column(name = "DateCrete")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCrete;
    @Column(name = "DateModify")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModify;
    @Column(name = "HargaLama")
    private BigInteger hargaLama;
    @Column(name = "HargaBaru")
    private BigInteger hargaBaru;

    public TAddStorage() {
    }

    public TAddStorage(Integer iDAddStorage) {
        this.iDAddStorage = iDAddStorage;
    }

    public Integer getIDAddStorage() {
        return iDAddStorage;
    }

    public void setIDAddStorage(Integer iDAddStorage) {
        this.iDAddStorage = iDAddStorage;
    }

    public Integer getQtyLama() {
        return qtyLama;
    }

    public void setQtyLama(Integer qtyLama) {
        this.qtyLama = qtyLama;
    }

    public Integer getQtyBaru() {
        return qtyBaru;
    }

    public void setQtyBaru(Integer qtyBaru) {
        this.qtyBaru = qtyBaru;
    }

    public Date getDateCrete() {
        return dateCrete;
    }

    public void setDateCrete(Date dateCrete) {
        this.dateCrete = dateCrete;
    }

    public Date getDateModify() {
        return dateModify;
    }

    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    public BigInteger getHargaLama() {
        return hargaLama;
    }

    public void setHargaLama(BigInteger hargaLama) {
        this.hargaLama = hargaLama;
    }

    public BigInteger getHargaBaru() {
        return hargaBaru;
    }

    public void setHargaBaru(BigInteger hargaBaru) {
        this.hargaBaru = hargaBaru;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAddStorage != null ? iDAddStorage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAddStorage)) {
            return false;
        }
        TAddStorage other = (TAddStorage) object;
        if ((this.iDAddStorage == null && other.iDAddStorage != null) || (this.iDAddStorage != null && !this.iDAddStorage.equals(other.iDAddStorage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.TAddStorage[ iDAddStorage=" + iDAddStorage + " ]";
    }
    
}
