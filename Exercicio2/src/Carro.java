/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matheus
 */
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public  double valor;
    public double valor_final;
    
    
    public Carro() {
    }

        public Carro(String marca, String modelo, double valor, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.valor = valor;
            this.ano = ano;
    }
        public void vender(int formaPagamento) {
        if (formaPagamento == 1) {
            this.valor_final = this.valor * 0.90; 
        } else if (formaPagamento == 2) {
            this.valor_final = this.valor * 1.10; 
        }
    }


}
