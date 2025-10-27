/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.Exercise3.Test;

import br.edu.etec.Exercise3.Model.Bike;
import br.edu.etec.Exercise3.Model.Car;
import br.edu.etec.Exercise3.Model.Vehicle;

/**
 *
 * @author Admin
 */
public class Exercise3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("========== VEICULO CARRO ===========");
        car.Move();
        System.out.println("========== VEICULO BICICLETA ===========");
        bike.Move();
    }

}
