
package lojavirtual;

public class DescontoBlackFriday implements Desconto{
    
     @Override
    public double desconto(double valor) {
       return valor * 0.8;
    }
    
}
