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
public abstract class adicionais implements pedido {

         protected pedido pedido;
         protected String tipo;
         protected double preco;

         public adicionais(String label, double preco, pedido pedido) {
                   this.tipo=label;
                   this.preco=preco;
                   this.pedido=pedido;
         }

      
         public double Preco(){
             return this.preco+pedido.Preco();
         }

    
         public String tipo() {
                   return pedido.tipo()+", "+this.tipo;
         }

}