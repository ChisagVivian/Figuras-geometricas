
package ec.edu.espoch.clase6_figuras_geometricas;

/**
 *
 * @author Usuario
 */
public class Circulo {
    
    public double radio;
    
    public double area_Circular(){
        double area_Circular = radio*3.14;
        return area_Circular;
    }
    
    public double perimetor(){
        double circulo=(3.14*2)*radio;
        return circulo;
    }
}
