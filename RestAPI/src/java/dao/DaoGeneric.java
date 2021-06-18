/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Compromisso;
import entities.Contato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author vilso
 */
public class DaoGeneric {

    public static void persist(Object object) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static Contato getById(long id){
      EntityManager em = getEntityManager();
      return em.find(Contato.class, id);  
    }
            
    public static void alterar(Object object) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void excluir(long id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        try {
            Contato ct = em.find(Contato.class, id);
            em.remove(ct);
            em.getTransaction().commit();
        } catch (Exception e) {
           em.getTransaction().rollback();
           throw new RuntimeException(e.getMessage());
        } finally {
            em.close();
        }
    }
    static EntityManager getEntityManager(){
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("RestAPIPU");
        return emf.createEntityManager();
    }
    
    public static List<Contato> getAll(){
       TypedQuery<Contato> tq = 
               getEntityManager().createQuery("select c from Contato c",
                Contato.class);
        return tq.getResultList();
    }    
    
    public static List<Compromisso> getAllCompromissos(){
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Compromisso.findAll");
        return q.getResultList();
    }
}
