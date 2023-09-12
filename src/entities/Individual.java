package entities;

public class Individual extends  Person{

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double income, double healthExpenditures) {
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if(getIncome() < 20000.00) {
            return getIncome() * 0.15;
        }
        else if (healthExpenditures > 0) {
                return (getIncome() * 0.25) - (healthExpenditures * 0.50);
            }
        else {
            return getIncome() * 0.25;
        }

    }

    @Override
    public String taxesPaid() {
        return super.taxesPaid();
    }
}
