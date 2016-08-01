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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucky
 */
@Entity
@Table(name = "m_user_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MUserRole.findAll", query = "SELECT m FROM MUserRole m")})
public class MUserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "id_user")
    private String idUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "id_role")
    private String idRole;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user-role")
    private Integer idUserRole;

    public MUserRole() {
    }

    public MUserRole(Integer idUserRole) {
        this.idUserRole = idUserRole;
    }

    public MUserRole(Integer idUserRole, String idUser, String idRole) {
        this.idUserRole = idUserRole;
        this.idUser = idUser;
        this.idRole = idRole;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public Integer getIdUserRole() {
        return idUserRole;
    }

    public void setIdUserRole(Integer idUserRole) {
        this.idUserRole = idUserRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserRole != null ? idUserRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MUserRole)) {
            return false;
        }
        MUserRole other = (MUserRole) object;
        if ((this.idUserRole == null && other.idUserRole != null) || (this.idUserRole != null && !this.idUserRole.equals(other.idUserRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gudang.entity.MUserRole[ idUserRole=" + idUserRole + " ]";
    }
    
}
