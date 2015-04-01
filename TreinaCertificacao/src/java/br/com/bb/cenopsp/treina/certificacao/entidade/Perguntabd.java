package br.com.bb.cenopsp.treina.certificacao.entidade;

import java.util.ArrayList;

public class Perguntabd {
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

    public Perguntabd() {
    }

    public Perguntabd(String marteria, String ano, String NumeroQuestao, String enunciado, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String alternativaE, String Resposta, ArrayList<String> comentarios) {
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
  
    
    
    /*CREATE table funcionario(
idFuncionario int not null,
chave VARCHAR(8) not null,
nome VARCHAR(50) not null,
PRIMARY key (idFuncionario)
);

CREATE table materia(
idMateria int not null,
materia VARCHAR(50) not null,
PRIMARY key (idMateria)
);


CREATE table pergunta(
idPergunta  int not null,
materia int not null,
prova VARCHAR(8) not null,
questao int not null,
enunciado VARCHAR(1000) not null,
alternativaA VARCHAR(200) not null,
alternativaB VARCHAR(200) not null,
alternativaC VARCHAR(200) not null,
alternativaD VARCHAR(200) not null,
alternativaE VARCHAR(200) not null,
resposta CHAR(1) not null,
PRIMARY key (idPergunta)
);
Alter TABLE pergunta ADD CONSTRAINT p1 FOREIGN KEY (materia) REFERENCES  materia(idMateria);

CREATE table comentario(
idComentario  int not null,
pergunta int not null,
cometario VARCHAR(200) not null,
PRIMARY key (idComentario)
);

Alter TABLE comentario ADD CONSTRAINT c1 FOREIGN KEY (pergunta) REFERENCES  pergunta(idPergunta);

CREATE table resposta(
idResposta  int not null,
funcionario int not null,
pergunta  int not null,
acerto  boolean not null,
dataResposta datetime not null,
PRIMARY key (idResposta)
);
Alter TABLE resposta ADD CONSTRAINT r1 FOREIGN KEY (funcionario) REFERENCES  funcionario(idFuncionario);
Alter TABLE resposta ADD CONSTRAINT r2 FOREIGN KEY (pergunta) REFERENCES  pergunta(idPergunta);*/
}