
package FormasyColores_Bridge;


public abstract class forma {
    protected Color color;
    
    public forma(Color color){
        this.color = color;
    }
    public abstract void dibujar();
}
