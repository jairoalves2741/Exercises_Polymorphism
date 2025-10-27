/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etc.Exercise2.Test;

import br.edu.etec.Exercise2.Model.Circulo;
import br.edu.etec.Exercise2.Model.Forma;
import br.edu.etec.Exercise2.Model.Retangulo;

/**
 *
 * @author Admin
 */
public class Exercise2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);

        Retangulo retangulo = new Retangulo(4.0, 6.0);

        System.out.println("=========== Area do Circulo ============");
        circulo.CalculateArea();

        System.out.println("=========== Area do Retangulo ============");
        retangulo.CalculateArea();

    }
}
