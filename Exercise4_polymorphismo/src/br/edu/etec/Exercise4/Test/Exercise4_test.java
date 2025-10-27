/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.Exercise4.Test;

import br.edu.etec.Exercise4.Model.Employee;
import br.edu.etec.Exercise4.Model.Manager;
import br.edu.etec.Exercise4.Model.Salesperson;

/**
 *
 * @author Admin
 */
public class Exercise4_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===================== GERENTES ====================");
        Employee m1 = new Manager(2000, "Marcos Tulio");
        m1.ViewSalary();
        System.out.println("---------------------------------------------------");
        Employee m2 = new Manager(2500, "Marcia Cruz");
        m2.ViewSalary();

        System.out.println("==================== VENDEDORES ====================");
        Salesperson v1 = new Salesperson(1600, "Veronica Matos", 2000);
        v1.ViewSalary();
        System.out.println("---------------------------------------------------");
        Salesperson v2 = new Salesperson(1900, "Godoi Ferraz", 1200);
        v2.ViewSalary();
    }

}
