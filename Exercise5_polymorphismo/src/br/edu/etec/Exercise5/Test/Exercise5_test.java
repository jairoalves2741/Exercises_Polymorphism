/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.Exercise5.Test;

import br.edu.etec.Exercise5.Model.Guitar;
import br.edu.etec.Exercise5.Model.MusicalInstrument;
import br.edu.etec.Exercise5.Model.Piano;

/**
 *
 * @author Jairo
 */
public class Exercise5_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==================== GUITAR =======================");
        MusicalInstrument g1 = new Guitar();
        g1.touch();

        System.out.println("==================== PIANO =======================");
        MusicalInstrument p1 = new Piano();
        p1.touch();

    }

}
