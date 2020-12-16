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
public class main {
    public static void main(String[] args) {
        
        pedido p = new acai("Tropical",15);
        
        p = new caldas("morango", 2, p);
        p = new complementos("amendoin", 1, p);
        p = new frutas ("morango", 3, p);
        System.out.println(p.tipo());
        System.out.println(p.Preco());
    }
    
}
