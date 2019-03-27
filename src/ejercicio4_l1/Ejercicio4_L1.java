
package ejercicio4_l1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marym
 */
public class Ejercicio4_L1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList <String> NombreProducto = new ArrayList<>();
        ArrayList <Double> PrecioProducto = new ArrayList<>();
        ArrayList <Integer> CantidadProducto = new ArrayList<>();
        int opcionMenu,cantidad;
        double precio,total=0;
        String nombreP;
        boolean opcion= true;
        
        while (opcion){
            
            System.out.println("\n*********** MENU *****************");
            System.out.println("\r\n\t1.Ingreso de Producto\r\n\t2.Productos ingresados\r\n\t3.Total a pagar\r\n\t4.Salir");
            System.out.print("Opcion: ");
            opcionMenu = entrada.nextInt();
            
            switch (opcionMenu){
                case 1: 
                    System.out.print("\nNombre del producto: ");
                    nombreP= entrada.next();
                    NombreProducto.add(nombreP);
                    System.out.print("Precio del producto: ");
                    precio = entrada.nextFloat();
                    PrecioProducto.add(precio);
                    System.out.print("Cantidad: ");
                    cantidad=entrada.nextInt();
                    CantidadProducto.add(cantidad);
                    break;
                    
                case 2:
                    System.out.println("\nProductos ingresados:");
                    System.out.println("Productos:");
                    System.out.println(NombreProducto);
                    System.out.println("Precio: ");
                    System.out.println(PrecioProducto);
                    System.out.println("Cantidad: ");
                    System.out.println(CantidadProducto);
                    break;
                    
                case 3:
                    for (int i = 0; i < PrecioProducto.size(); i++) {
                        total = total + (PrecioProducto.get(i)*CantidadProducto.get(i));
                    }
                    System.out.println("\nTotal a pagar: $"+total);
                    break;
                    
                case 4:
                    opcion= false;
                    break;
            
            
            }       
            
        }
    
    
    
    
    
    
    }   
    
}
