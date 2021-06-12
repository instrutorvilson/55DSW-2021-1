/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosjpa;

import entities.Compromisso;
import entities.Contato;
import java.sql.Date;
import java.util.List;
import javax.print.DocFlavor;

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
       
      /* List<Contato> lista = dao.DaoGeneric.getAll();
       for(Contato ct : lista){
           System.out.println(ct.toString());
       }
       */
     /* Compromisso  cp = new Compromisso();
      cp.setData(Date.valueOf("2010-06-11"));
      cp.setLocal("sextou");      
      dao.DaoGeneric.persist(cp);
      
      Compromisso  cp2 = new Compromisso();
      cp2.setData(Date.valueOf("2010-06-11"));
      cp2.setLocal("Estudando... ");
      dao.DaoGeneric.persist(cp2);*/
     
     List<Compromisso> lista = dao.DaoGeneric.getAllCompromissos();
     for(Compromisso ct : lista){
           System.out.println(ct.toString());
       }
    }
    
}
