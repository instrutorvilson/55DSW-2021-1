/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosjpa;

import entities.Contato;

/**
 *
 * @author vilso
 */
public class ConceitosJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contato contato = new Contato("Maria", "123", "maria@gmail.com");
        dao.DaoGeneric.persist(contato);
        System.out.println("Registro inserido");
    }
    
}
