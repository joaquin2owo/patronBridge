
package FormasyColores_Bridge;

public class Circulo extends forma{
          public Circulo(Color color){super(color);}
          public void dibujar(){
              System.out.print("Dibujando un círculo. ");
              color.aplicarColor();
          }
}
