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
public class complementos extends adicionais{

         public complementos(String tipo, double preco, pedido pedido) {
                   super(tipo, preco, pedido);
         }

         public Double preco() {
                   return this.preco+pedido.Preco();
         }

   

    @Override
    public double Preco() {
        return this.preco+pedido.Preco();
    }

    @Override
    public String tipo() {
        return pedido.tipo()+ "," + this.tipo;
    }

}