/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import modelo.DAO.DaoContato;
import modelo.entidades.Contato;

@ManagedBean
public class BeanContato {

    private int idcontato;
    private String nome;
    private String fone;
    private String email;
    private int idusuario;

    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = null;

        if (nome.isEmpty()) {
            msg = new FacesMessage("Informe nome");
            context.addMessage(null, msg);
        }

        if (fone.isEmpty()) {
            msg = new FacesMessage("Informe fone");
            context.addMessage(null, msg);
        }

        if (email.isEmpty()) {
            msg = new FacesMessage("Informe email");
            context.addMessage(null, msg);
        }

        if (msg == null) {
            Contato contato = new Contato(this.nome, fone, email, 1);
            if (DaoContato.salvar(contato)) {
                msg = new FacesMessage("Contato salvo com sucesso");
                context.addMessage(null, msg);
            }
        }

    }

    public int getIdcontato() {
        return idcontato;
    }

    public void setIdcontato(int idcontato) {
        this.idcontato = idcontato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

}
