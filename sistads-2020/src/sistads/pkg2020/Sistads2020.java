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
public class Sistads2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Instituicao i = new Instituicao("IFPB");
        Instituicao t = new Instituicao("IFRN");
        
        Individuo mi = new Individuo("Milena");
        Individuo bella = new Individuo("Isabelle");
        Individuo gil = new Individuo("Gileno");
        Individuo b = new Individuo("Bruno");
        
        i.adicionar(b);
        t.adicionar(mi);
        t.adicionar(bella);
        t.adicionar(gil);
        //t.imprimeMembros();
        
        Evento e= new Evento("Sitads-2020");
        e.adicionarParticipante(i);
        e.adicionarParticipante(t);
        e.imprimeParticipantes();
        
        System.out.println("Total de participantes: "+e.getTotalParticipantes());
    }
    
}
