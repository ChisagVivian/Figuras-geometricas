/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.clase6_figuras_geometricas;

/**
 *
 * @author Usuario
 */
public class Cuadrado {
    
    public double longitud;
    
    public double area_cuadrada(){
        double area_cuadrada = longitud*longitud;
        return area_cuadrada;
    }
    
    public double perimetro_cuadrado(){
        
        double perimetro_cuadrado = longitud*4;
        return perimetro_cuadrado;
    }
}
