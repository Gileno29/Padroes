/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acai;

/**
 *
 * @author silva
 */

    public class acai implements pedido {
    private String tipo;
    private double preco;

    public acai(String tipo, double preco) {
    this.tipo=tipo;
    this.preco=preco;
    }
    
    public String tipo(){
     return this.tipo;
    }

    @Override
    public double Preco() {
     return this.preco;
    }
}