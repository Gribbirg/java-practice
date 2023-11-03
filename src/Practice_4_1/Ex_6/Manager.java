package Practice_4_1.Ex_6;

public class Manager extends Employer {
    public double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income); // вызов конструктора родителя
        this.averageSum = averageSum;
    }

    // пересчет зарплаты
    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
