/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosjpa;

import entities.Contato;
import java.util.List;

/**
 *
 * @author vilso
 */
public class ConceitosJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Contato contato = new Contato("Jose", "123", "jose@gmail.com");
        dao.DaoGeneric.persist(contato);
        
         Contato ct = new Contato("Antonio", "123", "antonio@gmail.com");
        dao.DaoGeneric.persist(ct);
        
        System.out.println("Registro inserido");
      /* Contato contato = dao.DaoGeneric.getById(1l);
       System.out.println(contato.toString());
       
       contato.setNome("José da Silva");
       contato.setFone("3395-0228");
       dao.DaoGeneric.alterar(contato);
       */
      
      /* Contato ct = dao.DaoGeneric.getById(1l);
       System.out.println(ct.toString());
       dao.DaoGeneric.excluir(1l);
       System.out.println("Excluido");*/
       
       List<Contato> lista = dao.DaoGeneric.getAll();
       for(Contato ct : lista){
           System.out.println(ct.toString());
       }
       
    }
    
}
