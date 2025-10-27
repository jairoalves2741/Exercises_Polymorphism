/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercise4.Model;

/**
 *
 * @author Admin
 */
public class Salesperson extends Employee {

    String nome;
    double base_salary; //Salario base
    double goal; //meta
    double sales; //vemdas

    public Salesperson(double base_salary, String nome, double sales) {
        this.base_salary = base_salary;
        this.nome = nome;
        this.sales = sales;
    }

    public double CalculateCommission() {
        double commission = 0.0;

        if (this.sales > 1000) {
            commission = this.sales * 0.15;
        } else {
            commission = 0.0;
        }

        return commission;
    }

    //calculando salario bruto
    public double CalculateGrossSalary() {
        double sum = this.base_salary + this.CalculateCommission();
        return sum;
    }

    @Override
    public void ViewSalary() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario Base: R$ " + this.base_salary);
        System.out.println("Meta estabelecida de R$ 1.000,00");
        System.out.println("Voce vendeu este mes: " + this.sales);
        System.out.println("Comissao do mes: R$ " + this.CalculateCommission());
        System.out.println("Salario Bruto: R$ " + this.CalculateGrossSalary());

    }

}
