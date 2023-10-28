
package FormasyColores_Bridge;

public class Cuadrado extends forma {
    public Cuadrado(Color color) {
        super(color);
    }

    public void dibujar() {
        System.out.print("Dibujando un cuadrado. ");
        color.aplicarColor();
    }
}
