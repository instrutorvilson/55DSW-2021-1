/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author vilso
 */
@ManagedBean
public class BeanContato {
   private String nome = "";
   private String sobrenome = "";
   private int idade;
   private String mensagem;

   public void verIdade(){
       FacesContext context = FacesContext.getCurrentInstance();
       FacesMessage msg = null;
            
       if(nome.equals("")){
          msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Informe um nome","");
          context.addMessage(null, msg);
       }
       
       if(sobrenome.equals("")){
          msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Informe um sobrenome","");
          context.addMessage(null, msg);      
       }
       
       if(idade < 0){
          msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Informe uma idadea","");
          context.addMessage(null, msg);      
       }
       
       if(msg == null){
           mensagem = nome + " " + sobrenome + " voce é maior de idade";
           if(idade < 18)
           mensagem = nome + " " + sobrenome + " voce é menor de idade";
       }
       
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMensagem() {
        return mensagem;
    }
    
}
