package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (choice == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                persons.add(new Individual(name, income, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                persons.add(new Company(name, income, numberEmployees));
            }
        }

        double total = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person person : persons) {
            System.out.println(person.taxesPaid());
            total += person.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", total);

        sc.close();
    }
}
