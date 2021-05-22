/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import modelo.Contato;

/**
 *
 * @author vilso
 */
@ManagedBean
public class BeanContato {
    private List<Contato> contatos = new ArrayList<>();
    
    @PostConstruct
    public void init() {
       contatos.add(new Contato(1, "jose", "123", "jose@gmail.com"));
       contatos.add(new Contato(2, "Maria", "123", "maria@gmail.com"));
       contatos.add(new Contato(3, "Joao", "123", "joao@gmail.com"));
       contatos.add(new Contato(4, "Pedro", "123", "pedro@gmail.com"));
       contatos.add(new Contato(5, "antonio", "123", "antonio@gmail.com"));
    }

    public List<Contato> getContatos() {
        return contatos;
    }
    
    
}
