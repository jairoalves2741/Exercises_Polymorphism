/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercise4.Model;

/**
 *
 * @author Admin
 */
public class Manager extends Employee {

    String name;
    double base_salary; //Salario base
    double minimum_wage = 1.518; //Salario Minimo

    public Manager(double base_salary, String name) {
        this.base_salary = base_salary;
        this.name = name;
    }

    //Calculando INSS
    public double CalculateINSS() {
        double INSS = 0.075; // 7,5%
        double calculate = this.base_salary * INSS;
        return calculate;
    }

    //Calculando IRRF
    public double CalculateIRRF() {
        double IRRF = 0.0;
        if (this.base_salary > this.minimum_wage) {
            IRRF = this.base_salary * 0.075;
        }
        return IRRF;
    }

    //Calulando o Salario liquido
    public double CalculatingNetSalary() {
        double operation = this.base_salary - this.CalculateINSS() - this.CalculateIRRF();
        return operation;
    }

    @Override
    public void ViewSalary() {
        System.out.println("Nome: " + this.name);
        System.out.println("Salario Base: R$ " + this.base_salary);
        System.out.println("INSS de 7.5% aplicado: R$ " + this.CalculateINSS());
        System.out.println("IRRF de 7.5% aplicado: R$ " + this.CalculateIRRF());
        System.out.println("Salario Liquido: R$ " + this.CalculatingNetSalary());
    }

}
