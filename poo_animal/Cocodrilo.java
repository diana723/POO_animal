/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_animal;

/**
 *
 * @author diana
 */
public class Cocodrilo extends Animal implements Carnivoro {
     private String nombre; // Atributo privado

    public Cocodrilo ( String nombre) {
        this.nombre = nombre;
    }

    // Método getter para acceder al nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el nombre (opcional, dependiendo de tus necesidades)
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Método para imprimir un saludo (utiliza el atributo encapsulado)
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + ".");
    }

    @Override
    public void pais_de_origen() {
    System.out.println("Pais de origen: Australia " );    }

    @Override
    public void nombre_cientifico() {
    System.out.println("Nombre cientifico : Crocodylidae ");    }

    @Override
    public void edad() {
    System.out.println("Edad : 3 Años");    }

    @Override
    public void emitir_sonido() {
    System.out.println("El cocodrilo ruge,gruñe y silba");    }

    @Override
    public void acecha() {
    System.out.println("El cocodrilo esta acechando");    }

    @Override
    public void caza() {
    System.out.println("El cocodrilo esta cazando");    }

    @Override
    public void come() {
    System.out.println("el cocodrilo esta comiendo");    }
}
