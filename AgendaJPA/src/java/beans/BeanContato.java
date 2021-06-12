/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Contato;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author vilso
 */
@ManagedBean
public class BeanContato {
    private Long id;
    private String nome;
    private String fone;
    private String email;

    public void salvar(){
        Contato contato = new Contato(nome, fone, email);
        dao.DaoGeneric.persist(contato);
    }
    
    public BeanContato() {
    }

    public BeanContato(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    
}
