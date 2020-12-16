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
public class frutas extends adicionais {

         public frutas(String tipo, double preco, pedido pedido) {
                   super(tipo, preco, pedido);
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
