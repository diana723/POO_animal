/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_animal;

/**
 *
 * @author diana
 */
public class POO_animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
        Cocodrilo Coco = new Cocodrilo ("Coco");
        String nombreActual = Coco.getNombre();
        System.out.println("El nombre de el cocodrilo es: " + nombreActual); 
        Coco.come();
        Coco.emitir_sonido();
        String nombre;
        System.out.println("¡Hola! Mi nombre es " + nombreActual + ".");
    }
    
}
