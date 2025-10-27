/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercise2.Model;

/**
 *
 * @author Admin
 */
public class Circulo extends Forma {

    double ray;

    public Circulo(double ray) {
        this.ray = ray;
    }

    public double AreaValueCirculo() {
        return 3.14 * this.ray * this.ray;
    }

    @Override
    public void CalculateArea() {
        System.out.println("Valor de Raio do Circulo :" + this.ray);
        System.out.println("Valor de PI: 3.14");
        System.out.println("Valor de Area do Circulo: " + this.AreaValueCirculo());
    }
}
