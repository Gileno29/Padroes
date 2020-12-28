/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistads.pkg2020;

import java.util.ArrayList;
import java.util.List;
 
public class Instituicao extends Participante {
 
    private String nome;
 
    private List membros;
 
    public Instituicao(String nome) {
        this.nome = nome;
        membros = new ArrayList();
    }
 
    @Override
    public void adicionar(Participante participante) {
        membros.add(participante);
    }
 
    @Override
    public void remover(Participante participante) {
        membros.remove(participante);
    }
 
    @Override
    public String getNome() {
        return nome;
    }
 
    public List getMembros() {
        return membros;
    }
 
    @Override
    public String toString() {
        return "Instituição: " + this.nome;
    }
 
    public void imprimeMembros() {
       for(int i=0;i<membros.size();i++){
                  System.out.println(membros.get(i) + " - Instituição: " + this.nome);
                }
    }
}
