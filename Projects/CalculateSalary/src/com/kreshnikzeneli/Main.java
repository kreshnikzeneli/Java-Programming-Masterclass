package com.kreshnikzeneli;

public class Main {

    public static void main(String[] args) {

        double coefficient = 7;
        double coefficientRate = 60.60;
        int additionalInSalary = 30;
        int additionSalary = 400;
        double BrutoSalary = coefficient * coefficientRate + additionalInSalary + additionSalary;
        System.out.println("Bruto Salary is: " + BrutoSalary);

        double employeePercentContribution = 0.05; // 5%
        double employerPercentContribution = 0.05;
        double employeeContribution = BrutoSalary * employeePercentContribution;
        double employerContribution = BrutoSalary * employerPercentContribution;
        System.out.println("Employee Contribution: " + employeeContribution);
        System.out.println("Employer Contribution: " + employerContribution);

        double totalContribution = employeeContribution + employerContribution;
        System.out.println("Total Contributions: " + totalContribution);

        double taxableSalary = BrutoSalary - employeeContribution;
        System.out.println("Taxable Salary is: " + taxableSalary);


/*        if ((taxableSalary >= 0) && (taxableSalary <= 80)) {
            double percentLevel1 = taxableSalary * 0.00;
            System.out.println(percentLevel1);
        } else if ((taxableSalary >= 80) && (taxableSalary <= 250)) {
            double percentLevel2 = taxableSalary * 0.04;
            System.out.println(percentLevel2);
        } else if ((taxableSalary >= 250) && (taxableSalary <= 450)) {
            double percentLevel3 = taxableSalary * 0.08;
            System.out.println(percentLevel3);
        }
*/


    }
}
