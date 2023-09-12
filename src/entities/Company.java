package entities;

public class Company extends Person{

    private Integer numberEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double income, Integer numberEmployees) {
        super(name, income);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        if (numberEmployees > 10) {
           return getIncome() * 0.14;
        }
        else {
            return getIncome() * 0.16;
        }
    }

    @Override
    public String taxesPaid() {
        return super.taxesPaid();
    }
}
