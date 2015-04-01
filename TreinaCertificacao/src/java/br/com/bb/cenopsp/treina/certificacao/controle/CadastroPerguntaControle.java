
package br.com.bb.cenopsp.treina.certificacao.controle;

import br.com.bb.cenopsp.treina.certificacao.entidade.Pergunta;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean(name="CadastroPerguntaControle")
@SessionScoped
public class CadastroPerguntaControle implements Serializable {
    private Pergunta pergunta;
    
    public String IniciarTela(){
        this.pergunta = new Pergunta();
        return "cadastroPergunta";
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    
    public void salvar(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage("Controle"));
    }
    
public void EspacoBranco(FacesContext contexto, UIComponent componente, Object valor){
        String valString = (String) valor;
        if(valString.trim().equals("")){
            ((UIInput) componente).setValid(false);
            
            String mensagem = componente.getAttributes().get("label") + ":Favor preencher campo corretamente";
            
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
            
            contexto.addMessage(componente.getClientId(contexto), facesMessage);
            
            
          }
    }
    
    
}
