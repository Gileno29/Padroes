/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author silva
 */
public class Dieta implements Observable{
       private List observers = new ArrayList <Observer>();
       private double peso;
 
       public Dieta() {
            this.observers = new ArrayList<Observer>();
       }
        
       public void setPeso(double peso) {
        this.peso = peso;
        this.notifyObservers();
    }
 
       @Override
       public void registerObserver(Observer observer) {
            observers.add(observer);
       }
 
       @Override
       public void removeObserver(Observer observer) {
            observers.remove(observer);
       }
 
       @Override
       public void notifyObservers() {
                System.out.println("");
		System.out.println("Nova Atualização");
		System.out.println("");
                for (Object o : observers) {
                Observer ob = (Observer) o;
                ob.update(this.peso);
           }
       }
}
