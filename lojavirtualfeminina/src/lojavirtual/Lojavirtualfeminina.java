/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;

/**
 *
 * @author silva
 */
public class Lojavirtualfeminina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Produto vestuario = new Vestuario();
         vestuario.setNome("Blusa");
         vestuario.setValor(50.00);
         
         Produto Acessorio = new Acessorios();
         Acessorio.setNome("Bolsa");
         Acessorio.setValor(60.00);
         
         
        System.out.println("Valor roupa: " + vestuario.getValor());
        vestuario.setPromocao(new DescontoDiaDaMulher());
        vestuario.darDesconto();
        
        
        System.out.println("Valor do acessorio: "+ Acessorio.getValor());
        Acessorio.setPromocao(new DescontoBlackFriday());
        Acessorio.darDesconto();
    }
    
}
