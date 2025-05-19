
package ec.edu.espoch.clase6_figuras_geometricas;

/**
 *
 * @author Usuario
 */
public class Clase6_Figuras_Geometricas {

    public static void main(String[] args) {
        //CALCULO DE AREA Y PERIMETRO DE LAS FIGURAS GEOMETRICAS(Circulo, Rectangulo, Triangulo, Cuadrado)
        //CIRCULO...........
        Circulo objCirculo = new Circulo();
        objCirculo.radio= 9; 
        /*EL claculo del area y perimetro  de la figura CIRCULAR*/
        double areacirculo= objCirculo.area_Circular();
        System.out.println("El area del circulo es:  "+areacirculo);
        double perimetrocirculo= objCirculo.perimetor();
        System.out.println("El area del circulo es:  "+perimetrocirculo);
        
        //RECTANGULO........
        Rectangulo objRectangulo = new Rectangulo();
        objRectangulo.base = 10;
        objRectangulo.altura = 6;
        /*EL claculo del area y perimetro de la figura RECTANGULAR*/
        double areaRectangulo = objRectangulo.area_Rectangular();
        System.out.println("El area del rectangulo es: "+areaRectangulo);
        double perimetroRectangulo = objRectangulo.perimetro_Rectangular();
        System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo);
        
        
        //CUADRADO.........
        
        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.longitud =  20;
        /*EL claculo del area y perimetro de la figura CUADRADA*/
        double areacuadrado = objCuadrado. area_cuadrada();
        System.out.println("El area del cuadrado es: "+areacuadrado);
        double perimetrocuadrado = objCuadrado. perimetro_cuadrado();
        System.out.println("El area del cuadrado es: "+perimetrocuadrado);
        
        
        //TRIANGULO.........
        
        Triangulo objTriangulo = new Triangulo();
        objTriangulo.Altura_Triangulo = 28;
        objTriangulo.base_Triangulo = 19;
        /*EL claculo del area, perimetro y hipotenusa de la figura TRIANGULO*/
        double areatriangulo = objTriangulo.area_tri();
        System.out.println("el area del triangulo es: "+areatriangulo);
        double perimetroTriangulo = objTriangulo.perimetro_tri();
        System.out.println("El perimetro del triangulo es:" +perimetroTriangulo);
        double hipotenusa = objTriangulo.hipotenusa();
        System.out.println("la hipotenusa del triangulo es: "+hipotenusa);
        
        Tipo_Triangulo tipo= objTriangulo.identificadorTriangulo();
        System.out.println("El triangulo es del tipo: "+tipo);
    }
}
