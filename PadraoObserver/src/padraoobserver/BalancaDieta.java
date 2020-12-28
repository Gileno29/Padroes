/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

/**
 *
 * @author silva
 */
class BalancaDieta implements Observer {
      
       public void update(double novoPeso) {
        if (novoPeso >= 100) {
            System.out.println("Você ultrapassou o peso limite no sistema!");
            System.out.println("Peso Atual: "+ novoPeso);
        }
       }

 
  
}


