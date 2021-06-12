/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
 * @author vilso
 */
@Entity
@Table(name = "compromisso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compromisso.findAll", query = "SELECT c FROM Compromisso c"),
    @NamedQuery(name = "Compromisso.findByIdcompromisso", query = "SELECT c FROM Compromisso c WHERE c.idcompromisso = :idcompromisso"),
    @NamedQuery(name = "Compromisso.findByData", query = "SELECT c FROM Compromisso c WHERE c.data = :data"),
    @NamedQuery(name = "Compromisso.findByLocal", query = "SELECT c FROM Compromisso c WHERE c.local = :local")})
public class Compromisso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcompromisso")
    private Integer idcompromisso;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "local")
    private String local;

    public Compromisso() {
    }

    public Compromisso(Integer idcompromisso) {
        this.idcompromisso = idcompromisso;
    }

    public Integer getIdcompromisso() {
        return idcompromisso;
    }

    public void setIdcompromisso(Integer idcompromisso) {
        this.idcompromisso = idcompromisso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompromisso != null ? idcompromisso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compromisso)) {
            return false;
        }
        Compromisso other = (Compromisso) object;
        if ((this.idcompromisso == null && other.idcompromisso != null) || (this.idcompromisso != null && !this.idcompromisso.equals(other.idcompromisso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compromisso{" + "idcompromisso=" + idcompromisso + ", data=" + data + ", local=" + local + '}';
    }

  
    
}
