/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;


public class Contato {
    private int idcontato;
    private String nome;
    private String fone;
    private String email;
    private int idusuario;

    public Contato() {
    }

    public Contato(String nome, String fone, String email, int idusuario) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.idusuario = idusuario;
    }

    public Contato(int idcontato, String nome, String fone, String email, int idusuario) {
        this.idcontato = idcontato;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.idusuario = idusuario;
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
