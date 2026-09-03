/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matheus
 */
public class Produto {
    public int estoque;
    public double valor_compra;
    public double valor_venda;
    public String descricao;
    
    public Produto() {
    }

        public Produto(String descricao, double valor_compra, int estoque) {
            this.descricao = descricao;
            this.valor_compra = valor_compra;
            this.estoque = estoque;
            this.valor_venda = valor_compra * 1.5; 
        }
    
   
        public void vender(int quantidade) {
            this.estoque = this.estoque - quantidade;
        }

}

