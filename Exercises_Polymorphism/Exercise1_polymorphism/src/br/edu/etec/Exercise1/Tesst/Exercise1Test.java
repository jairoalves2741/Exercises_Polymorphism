/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.Exercise1.Tesst;

import br.edu.etecExercise1.Model.Animal;
import br.edu.etecExercise1.Model.Cat;
import br.edu.etecExercise1.Model.Dog;

/**
 *
 * @author Admin
 */
public class Exercise1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        
        cat.MakeSound();
        dog.MakeSound();
    }

}
