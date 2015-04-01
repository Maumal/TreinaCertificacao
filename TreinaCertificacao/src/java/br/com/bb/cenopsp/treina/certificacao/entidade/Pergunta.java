/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.cenopsp.treina.certificacao.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author mauricio
 */
@Entity
@Table(name = "pergunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pergunta.findAll", query = "SELECT p FROM Pergunta p"),
    @NamedQuery(name = "Pergunta.findByIdPergunta", query = "SELECT p FROM Pergunta p WHERE p.idPergunta = :idPergunta"),
    @NamedQuery(name = "Pergunta.findByProva", query = "SELECT p FROM Pergunta p WHERE p.prova = :prova"),
    @NamedQuery(name = "Pergunta.findByQuestao", query = "SELECT p FROM Pergunta p WHERE p.questao = :questao"),
    @NamedQuery(name = "Pergunta.findByEnunciado", query = "SELECT p FROM Pergunta p WHERE p.enunciado = :enunciado"),
    @NamedQuery(name = "Pergunta.findByAlternativaA", query = "SELECT p FROM Pergunta p WHERE p.alternativaA = :alternativaA"),
    @NamedQuery(name = "Pergunta.findByAlternativaB", query = "SELECT p FROM Pergunta p WHERE p.alternativaB = :alternativaB"),
    @NamedQuery(name = "Pergunta.findByAlternativaC", query = "SELECT p FROM Pergunta p WHERE p.alternativaC = :alternativaC"),
    @NamedQuery(name = "Pergunta.findByAlternativaD", query = "SELECT p FROM Pergunta p WHERE p.alternativaD = :alternativaD"),
    @NamedQuery(name = "Pergunta.findByAlternativaE", query = "SELECT p FROM Pergunta p WHERE p.alternativaE = :alternativaE"),
    @NamedQuery(name = "Pergunta.findByResposta", query = "SELECT p FROM Pergunta p WHERE p.resposta = :resposta")})
public class Pergunta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPergunta")
    private Integer idPergunta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "prova")
    private String prova;
    @Basic(optional = false)
    @NotNull
    @Column(name = "questao")
    private int questao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "enunciado")
    private String enunciado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alternativaA")
    private String alternativaA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alternativaB")
    private String alternativaB;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alternativaC")
    private String alternativaC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alternativaD")
    private String alternativaD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alternativaE")
    private String alternativaE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resposta")
    private Character resposta;
    @JoinColumn(name = "materia", referencedColumnName = "idMateria")
    @ManyToOne(optional = false)
    private Materia materia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pergunta")
    private List<Resposta> respostaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pergunta")
    private List<Comentario> comentarioList;

    public Pergunta() {
    }

    public Pergunta(Integer idPergunta) {
        this.idPergunta = idPergunta;
    }

    public Pergunta(Integer idPergunta, String prova, int questao, String enunciado, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String alternativaE, Character resposta) {
        this.idPergunta = idPergunta;
        this.prova = prova;
        this.questao = questao;
        this.enunciado = enunciado;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;
        this.resposta = resposta;
    }

    public Integer getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(Integer idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getProva() {
        return prova;
    }

    public void setProva(String prova) {
        this.prova = prova;
    }

    public int getQuestao() {
        return questao;
    }

    public void setQuestao(int questao) {
        this.questao = questao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public void setAlternativaA(String alternativaA) {
        this.alternativaA = alternativaA;
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public void setAlternativaB(String alternativaB) {
        this.alternativaB = alternativaB;
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public void setAlternativaC(String alternativaC) {
        this.alternativaC = alternativaC;
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public void setAlternativaD(String alternativaD) {
        this.alternativaD = alternativaD;
    }

    public String getAlternativaE() {
        return alternativaE;
    }

    public void setAlternativaE(String alternativaE) {
        this.alternativaE = alternativaE;
    }

    public Character getResposta() {
        return resposta;
    }

    public void setResposta(Character resposta) {
        this.resposta = resposta;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @XmlTransient
    public List<Resposta> getRespostaList() {
        return respostaList;
    }

    public void setRespostaList(List<Resposta> respostaList) {
        this.respostaList = respostaList;
    }

    @XmlTransient
    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPergunta != null ? idPergunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pergunta)) {
            return false;
        }
        Pergunta other = (Pergunta) object;
        if ((this.idPergunta == null && other.idPergunta != null) || (this.idPergunta != null && !this.idPergunta.equals(other.idPergunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.cenopsp.treina.certificacao.entidade.Pergunta[ idPergunta=" + idPergunta + " ]";
    }
    
}
