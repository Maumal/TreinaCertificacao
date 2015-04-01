
package br.com.bb.cenopsp.treina.certificacao.Beans;


import br.com.bb.cenopsp.treina.certificacao.entidade.Pergunta1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
//@ViewScoped
@SessionScoped
public class PerguntaBeanbd  implements Serializable {    
  private int numeroDeQuestoes; 
  private Pergunta1 pergunta ;
  private List<Pergunta1> listaPerguntas;
 
  @PostConstruct
 public void PerguntaBean() { 
        pergunta=new Pergunta1();
        listaPerguntas=new ArrayList<>();
        listaPerguntas.add(new Pergunta1("Agronegócios", "2009_1","12", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Atendimento Bancário", "2009_1","23", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Comércio Exterior", "2009_1","25", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Conhecimentos Jurídicos", "2009_1","2", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Controles Internos e Risco Operacional", "2009_1","5", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("DRS/RSA", "2009_1","4", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão do Crédito", "2009_1","24", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão Organizacional e de Pessoas", "2009_1","12", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão da Segurança", "2009_1","47", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Marketing", "2009_1","20", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Setor Público", "2009_1","14", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Tecnologia da Informação", "2009_1","12", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Economia e Finanças", "2009_1","18", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        
        listaPerguntas.add(new Pergunta1("Agronegócios", "2009_2","25", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Atendimento Bancário", "2009_2","4", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Comércio Exterior", "2009_2","5", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Conhecimentos Jurídicos", "2009_2","13", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Controles Internos e Risco Operacional","12", "2009_2", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("DRS/RSA", "2009_2","16", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão do Crédito", "2009_2","17", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão Organizacional e de Pessoas", "2009_2","7", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Gestão da Segurança", "2009_2","1", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Marketing", "2009_2","2", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Setor Público", "2009_2","16", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Tecnologia da Informação", "2009_2","1", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));
        listaPerguntas.add(new Pergunta1("Economia e Finanças", "2009_2","18", "P 1", "A1", "A2", "A3", "A4", "A5", "C",null));   
        
    
        this.numeroDeQuestoes=listaPerguntas.size();
      
        
    }
    
 
 
 public void inserirPergunta(){
        listaPerguntas.add(pergunta);
        pergunta=new Pergunta1();
    }

    public int getNumeroDeQuestoes() {
        return numeroDeQuestoes;
    }

   

    public Pergunta1 getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta1 pergunta) {
        this.pergunta = pergunta;
    }

    public List<Pergunta1> getListaPerguntas() {
        return listaPerguntas;
    }

    public void setListaPerguntas(List<Pergunta1> listaPerguntas) {
        this.listaPerguntas = listaPerguntas;
    }
 
 
 
 
 
 
 
 
 
 
    
}