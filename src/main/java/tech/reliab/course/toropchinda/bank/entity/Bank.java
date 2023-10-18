package tech.reliab.course.toropchinda.bank.entity;

public class Bank extends BaseEntity<Long> {

    public Bank(Long id, String name) {
        super(id);
        this.name = name;
        this.rating = (int) (Math.random() * 100.0D);
        this.totalMoney = (int) (Math.random() * 1_000_000.0D);
        double maxRate = Math.random() * 20D;
        double sale = 0.1 * rating;
        this.interestRate = maxRate <= sale ? 3 : maxRate - sale;
    }

    private String name;
    private int officeCount;
    private int atmCount;
    private int employeeCount;
    private int clientCount;
    private int rating;
    private int totalMoney;
    private double interestRate;

    public String getName() {
        return name;
    }

    public int getOfficeCount() {
        return officeCount;
    }

    public int getAtmCount() {
        return atmCount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public int getClientCount() {
        return clientCount;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void upraiseEmployeeCount() {
        employeeCount++;
    }

    public void upraiseAtmCount() {
        atmCount++;
    }

    public void upraiseClientCount() {
        clientCount++;
    }

    public void upraiseOfficeCount() {
        officeCount++;
    }
}
