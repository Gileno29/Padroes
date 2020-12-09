
package lojavirtual;

public class DescontoDiaDaMulher implements Desconto {

    @Override
    public double desconto(double valor) {
       return valor * 0.7 ;
    }
    
}
