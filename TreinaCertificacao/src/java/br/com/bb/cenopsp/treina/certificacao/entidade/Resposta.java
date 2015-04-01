/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.cenopsp.treina.certificacao.entidade;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauricio
 */
@Entity
@Table(name = "resposta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resposta.findAll", query = "SELECT r FROM Resposta r"),
    @NamedQuery(name = "Resposta.findByIdResposta", query = "SELECT r FROM Resposta r WHERE r.idResposta = :idResposta"),
    @NamedQuery(name = "Resposta.findByAcerto", query = "SELECT r FROM Resposta r WHERE r.acerto = :acerto"),
    @NamedQuery(name = "Resposta.findByDataResposta", query = "SELECT r FROM Resposta r WHERE r.dataResposta = :dataResposta")})
public class Resposta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idResposta")
    private Integer idResposta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acerto")
    private boolean acerto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataResposta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataResposta;
    @JoinColumn(name = "funcionario", referencedColumnName = "idFuncionario")
    @ManyToOne(optional = false)
    private Funcionario funcionario;
    @JoinColumn(name = "pergunta", referencedColumnName = "idPergunta")
    @ManyToOne(optional = false)
    private Pergunta pergunta;

    public Resposta() {
    }

    public Resposta(Integer idResposta) {
        this.idResposta = idResposta;
    }

    public Resposta(Integer idResposta, boolean acerto, Date dataResposta) {
        this.idResposta = idResposta;
        this.acerto = acerto;
        this.dataResposta = dataResposta;
    }

    public Integer getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(Integer idResposta) {
        this.idResposta = idResposta;
    }

    public boolean getAcerto() {
        return acerto;
    }

    public void setAcerto(boolean acerto) {
        this.acerto = acerto;
    }

    public Date getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(Date dataResposta) {
        this.dataResposta = dataResposta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResposta != null ? idResposta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resposta)) {
            return false;
        }
        Resposta other = (Resposta) object;
        if ((this.idResposta == null && other.idResposta != null) || (this.idResposta != null && !this.idResposta.equals(other.idResposta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.cenopsp.treina.certificacao.entidade.Resposta[ idResposta=" + idResposta + " ]";
    }
    
}
