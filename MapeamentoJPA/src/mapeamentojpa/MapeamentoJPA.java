/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamentojpa;

import entities.Cliente;
import entities.Itens;
import entities.Produto;
import entities.Venda;
import java.sql.Date;

/**
 *
 * @author vilso
 */
public class MapeamentoJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "123", "ana@gmail.com");
        dao.DaoGeneric.persist(cliente);
        
        Produto produto = new Produto("Milho", 200, 15);
        dao.DaoGeneric.persist(produto);
        
        Produto farinha = new Produto("farina", 200, 15);
        dao.DaoGeneric.persist(farinha);
        
        Venda venda = new Venda('A', Date.valueOf("2021-06-16") , cliente);
        dao.DaoGeneric.persist(venda);
        
        Itens item = new Itens(100, 10, venda, produto);
        dao.DaoGeneric.persist(item);
        
        Itens item2 = new Itens(100, 10, venda, farinha);
        dao.DaoGeneric.persist(item2);
        
        System.out.println("finalizado");
    }
    
}
