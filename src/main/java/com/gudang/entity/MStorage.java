/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.entity;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucky
 */
@Entity
@Table(name = "m_storage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MStorage.findAll", query = "SELECT m FROM MStorage m")})
public class MStorage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDStorage")
    private Integer iDStorage;
    @Size(max = 255)
    @Column(name = "Nama")
    private String nama;
    @Column(name = "Jumlah")
    private Integer jumlah;
    @Column(name = "Harga")
    private Integer harga;
    @Column(name = "DateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Column(name = "DateModify")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModify;
    @Column(name = "DateTransaction")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTransaction;
    @Size(max = 255)
    @Column(name = "Barcode")
    private String barcode;
    @Column(name = "Status")
    private Boolean status;
    @JoinColumn(name = "IDCategory", referencedColumnName = "IDCategori")
    @ManyToOne
    private MCategory iDCategory;
    @JoinColumn(name = "IDMember", referencedColumnName = "IDMember")
    @ManyToOne
    private MMember iDMember;

    public MStorage() {
    }

    public MStorage(Integer iDStorage) {
        this.iDStorage = iDStorage;
    }

    public Integer getIDStorage() {
        return iDStorage;
    }

    public void setIDStorage(Integer iDStorage) {
        this.iDStorage = iDStorage;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
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

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public MCategory getIDCategory() {
        return iDCategory;
    }

    public void setIDCategory(MCategory iDCategory) {
        this.iDCategory = iDCategory;
    }

    public MMember getIDMember() {
        return iDMember;
    }

    public void setIDMember(MMember iDMember) {
        this.iDMember = iDMember;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDStorage != null ? iDStorage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MStorage)) {
            return false;
        }
        MStorage other = (MStorage) object;
        if ((this.iDStorage == null && other.iDStorage != null) || (this.iDStorage != null && !this.iDStorage.equals(other.iDStorage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.MStorage[ iDStorage=" + iDStorage + " ]";
    }
    
}
