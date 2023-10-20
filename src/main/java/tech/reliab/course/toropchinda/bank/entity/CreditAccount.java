package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class CreditAccount extends BaseEntity<Long> {
    private static long idCount = 0;

    public CreditAccount(User user, Bank bank, LocalDate creditStartDate, LocalDate creditEndDate, int creditMonthCount,
                         double creditAmount, Employee employee, PaymentAccount paymentAccount) {
        super(idCount++);
        this.user = user;
        this.bankName = bank.getName();
        this.creditStartDate = creditStartDate;
        this.creditEndDate = creditEndDate;
        this.creditMonthCount = creditMonthCount;
        this.creditAmount = creditAmount;
        this.interestRate = bank.getInterestRate();
        this.employee = employee;
        this.paymentAccount = paymentAccount;
        this.monthPayment = creditAmount / creditMonthCount;
    }

    private User user;
    private String bankName;
    private LocalDate creditStartDate;
    private LocalDate creditEndDate;
    private int creditMonthCount;
    private double creditAmount;
    private double monthPayment;
    private double interestRate;
    private Employee employee;
    private PaymentAccount paymentAccount;


    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        CreditAccount.idCount = idCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getCreditStartDate() {
        return creditStartDate;
    }

    public void setCreditStartDate(LocalDate creditStartDate) {
        this.creditStartDate = creditStartDate;
    }

    public LocalDate getCreditEndDate() {
        return creditEndDate;
    }

    public void setCreditEndDate(LocalDate creditEndDate) {
        this.creditEndDate = creditEndDate;
    }

    public int getCreditMonthCount() {
        return creditMonthCount;
    }

    public void setCreditMonthCount(int creditMonthCount) {
        this.creditMonthCount = creditMonthCount;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public String toString() {
        return STR
                . """
                CREDIT_ACCOUNT: {
                credit id = \{ getId() }
                bank name = \{ bankName }
                credit start date = \{ creditStartDate }
                credit end date = \{ creditEndDate }
                credit month count = \{ creditMonthCount }
                credit amount = \{ creditAmount }
                month payment = \{ monthPayment }
                interest rate = \{ interestRate }
                employee = \n\t\{ employee.toString() }
                }
                """ ;
    }
}
