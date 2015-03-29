package br.com.bb.cenopsp.treina.certificacao.entidade;

import java.util.ArrayList;

public class Pergunta {
    private String materia;
    private String ano;
    private String NumeroQuestao;
    private String enunciado;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaE;
    private String Resposta;
    private  ArrayList<String> comentarios;

    public Pergunta() {
    }

    public Pergunta(String marteria, String ano, String NumeroQuestao, String enunciado, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String alternativaE, String Resposta, ArrayList<String> comentarios) {
        this.materia = marteria;
        this.ano = ano;
        this.NumeroQuestao = NumeroQuestao;
        this.enunciado = enunciado;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;
        this.Resposta = Resposta;
        this.comentarios = comentarios;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }


    
    

    public String getNumeroQuestao() {
        return NumeroQuestao;
    }

    public void setNumeroQuestao(String NumeroQuestao) {
        this.NumeroQuestao = NumeroQuestao;
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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

    public String getResposta() {
        return Resposta;
    }

    public void setResposta(String Resposta) {
        this.Resposta = Resposta;
    }
  
    
    
    
}