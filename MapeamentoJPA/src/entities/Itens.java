/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author vilso
 */
@Entity
public class Itens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iditem;
    private float preco;
    private float quantidade;
    @OneToOne
    @JoinColumn(name = "idvenda")
    private Venda venda;
    @OneToOne
    @JoinColumn(name = "idproduto")        
    Produto produto;

    public Itens(float preco, float quantidade, Venda venda, Produto produto) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.venda = venda;
        this.produto = produto;
    }

    public Itens() {
    }

    
    public Long getIditem() {
        return iditem;
    }

    public void setIditem(Long iditem) {
        this.iditem = iditem;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.iditem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Itens other = (Itens) obj;
        if (!Objects.equals(this.iditem, other.iditem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens{iditem=").append(iditem);
        sb.append(", preco=").append(preco);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", venda=").append(venda);
        sb.append(", produto=").append(produto);
        sb.append('}');
        return sb.toString();
    }

    
    
     
    
}
