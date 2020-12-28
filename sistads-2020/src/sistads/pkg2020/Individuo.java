/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistads.pkg2020;

/**
 *
 * @author silva
 */
public class Individuo extends Participante {
 
    private String nome;
 
 
    public Individuo(String nome) {
        this.nome = nome;
       
    }
 
    @Override
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
 
    @Override
    public String toString() {
        return "Nome: " + this.nome ;
    }
}
