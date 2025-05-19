/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.clase6_figuras_geometricas;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    
    double base_Triangulo;
    double Altura_Triangulo;

    
    public double area_tri(){
        double area_tri = (base_Triangulo*Altura_Triangulo)/2;
        return area_tri;
    }
    
    public double hipotenusa(){
        double hipotenusa= Math.hypot(base_Triangulo, Altura_Triangulo);
        return hipotenusa;
    }
    public double perimetro_tri(){
        double perimetro_tri = base_Triangulo +Altura_Triangulo + hipotenusa();
        return perimetro_tri;
    }
    
    public Tipo_Triangulo identificadorTriangulo(){
        double hipotenusa = hipotenusa();
        if (base_Triangulo == Altura_Triangulo && base_Triangulo == hipotenusa) {
            return Tipo_Triangulo.EQUILATERO;
            
        } else if (base_Triangulo == Altura_Triangulo || base_Triangulo == hipotenusa || Altura_Triangulo == hipotenusa){
            return Tipo_Triangulo.ISOSCELES;   
        }else{
            return Tipo_Triangulo.ESCALENO;
        }
    }
    
    
    
    
    
    
}
