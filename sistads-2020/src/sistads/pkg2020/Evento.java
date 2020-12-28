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
import java.util.ArrayList;
import java.util.List;
 
public class Evento {
 
    private String nome;
    private List participantes;
 
    public Evento(String nome) {
        this.nome = nome;
        participantes = new ArrayList();
    }
 
    public String getNome() {
        return nome;
    }
 
    public int getTotalParticipantes() {
        int totalParticipantes = 0;
         for(int i=0;i<participantes.size();i++){
             if (participantes.get(i) instanceof Individuo) {
          totalParticipantes++;
        } else if (participantes.get(i) instanceof Instituicao) {
          Instituicao instituicao = (Instituicao) participantes.get(i);
          totalParticipantes += instituicao.getMembros().size();
        }
         }
        return totalParticipantes;
    }
 
    public void adicionarParticipante(Participante participante) {
 
        participantes.add(participante);
        Instituicao t = (Instituicao) participante;
 
    }
 
    public void imprimeParticipantes() {
      System.out.println("----- Listagem de Participantes -----");
      for (int i=0;i<participantes.size();i++) {
        if (participantes.get(i) instanceof Individuo) {
         System.out.println(participantes.get(i) + " - Instituição: Sem Filiação");
        } else if (participantes.get(i) instanceof Instituicao) {
         Instituicao instituicao = (Instituicao) participantes.get(i);
         instituicao.imprimeMembros();
        }
      }
    }
 
    @Override
    public String toString() {
       return this.nome 
        + " - Participantes: " + getTotalParticipantes();
    }
}
