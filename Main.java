
package FormasyColores_Bridge;

public class Main {
    public static void main(String[] args){
        Color Rojo = new Rojo();
        Color Azul = new Azul();
        
        forma circuloRojo = new Circulo(Rojo);
        forma circuloAzul = new Circulo(Azul);
        forma cuadradoRojo = new Cuadrado(Rojo);
        forma cuadradoAzul = new Cuadrado(Azul);
        
        circuloRojo.dibujar();
        System.out.println("   ");
        circuloAzul.dibujar();
        System.out.println("   ");
        cuadradoRojo.dibujar();
        System.out.println("   ");
        cuadradoAzul.dibujar();
    }
}
