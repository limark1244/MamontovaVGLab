package tech.reliab.course.toropchinda.bank.entity;

public class BankAtm extends BaseEntity<Long> {

    public BankAtm(Long id, String name, BankOffice office, StatusEnum status, Bank bank, Employee employee, boolean withdrawMoney, boolean depositMoney, int atmServingCost) {
        super(id);
        this.name = name;
        this.address = office.getAddress();
        this.status = status;
        this.ownerBank = bank;
        this.atmDislocate = office.getAddress();
        this.servingEmployee = employee;
        this.withdrawMoney = withdrawMoney;
        this.depositMoney = depositMoney;
        this.totalMoney = bank.getTotalMoney();
        this.atmServingCost = atmServingCost;
        bank.upraiseAtmCount();
    }

    private String name;
    private String address;
    private StatusEnum status;
    private Bank ownerBank;
    private String atmDislocate;
    private Employee servingEmployee;
    private boolean withdrawMoney;
    private boolean depositMoney;
    private int totalMoney;
    private int atmServingCost;
}
