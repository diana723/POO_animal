/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_animal;

/**
 *
 * @author diana
 */
public class Conejo extends Animal implements Herviboro {

    @Override
    public void emitir_sonido() {
        System.out.println("Los conejos chillan muy suave");
    }

    @Override
    public void come_verduras() {
        System.out.println("Sus verduras favoritas son las zanahorias y la lechuga");
    }

    @Override
    public void pais_de_origen() {
        System.out.println ("Pais de origen : China");
    }

    @Override
    public void nombre_cientifico() {
        System.out.println("Nombre Cientifico : Oryctalagus cuniculus");    }

    @Override
    public void edad() {
    System.out.println ( "Edad : 2 ");    }
    
 }