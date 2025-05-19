
package ec.edu.espoch.clase6_figuras_geometricas;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    
    public double base;
    public double altura;
    
    public double area_Rectangular(){
        double area_Rectangular = base*altura;
        return area_Rectangular;
    }
    
    public double perimetro_Rectangular(){
     double perimetro_Rectangular=(base*2)+(altura*2);
     return perimetro_Rectangular;
    }

}
