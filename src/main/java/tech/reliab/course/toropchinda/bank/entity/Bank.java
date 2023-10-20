package tech.reliab.course.toropchinda.bank.entity;

public class Bank extends BaseEntity<Long> {

    private static final int DEFAULT_RATE = 3;
    private static long idCount = 0;

    public Bank(String name) {
        super(idCount++);
        this.name = name;
        this.rating = (int) (Math.random() * 100.0D);
        this.totalMoney = (int) (Math.random() * 1_000_000.0D);
        double maxRate = Math.random() * 20D;
        double sale = 0.1 * rating;
        this.interestRate = maxRate <= sale ? DEFAULT_RATE : maxRate - sale;
    }

    private String name;
    private int officeCount;
    private int atmCount;
    private int employeeCount;
    private int clientCount;
    private int rating;
    private int totalMoney;
    private double interestRate;

    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        Bank.idCount = idCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeCount(int officeCount) {
        this.officeCount = officeCount;
    }

    public void setAtmCount(int atmCount) {
        this.atmCount = atmCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

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

    @Override
    public String toString() {
        return STR
                . """
                BANK: {
                bank id = \{ getId() }
                bank name = \{ name }
                office count =\{ officeCount }
                atm count = \{ atmCount }
                employee count = \{ employeeCount }
                client count = \{ clientCount }
                rating = \{ rating }
                total money = \{ totalMoney }
                interest rate = \{ interestRate } }
                """ ;

    }
}
