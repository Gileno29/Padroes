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
public class Produto {
 
    private String nome;
 
    private double valor;
 
    private Desconto promocao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setPromocao(Desconto promocao) {
         this.promocao = promocao;
      }
    public void darDesconto() {
        System.out.println("Valor com desconto: "
            + promocao.desconto(this.valor));
    }

    public Desconto getPromocao() {
        return promocao;
    }
 
   
}
