/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercise2.Model;

/**
 *
 * @author Admin
 */
public class Retangulo extends Forma {

    double base;
    double height;

    public Retangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double AreaValueRetangulo() {
        return this.base * this.height;
    }

    @Override
    public void CalculateArea() {
        System.out.println("Valor de Base: " + this.base);
        System.out.println("Valor da Altura: " + this.height);
        System.out.println("Valor de Area: " + this.AreaValueRetangulo());

    }
}
