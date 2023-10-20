package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.entity.enums.StatusEnum;

public class BankAtm extends BaseEntity<Long> {

    private static long idCount = 0;

    public BankAtm(String name, BankOffice office, StatusEnum status, Bank bank, Employee employee, boolean withdrawMoney, boolean depositMoney, int atmServingCost) {
        super(idCount++);
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

    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        BankAtm.idCount = idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Bank getOwnerBank() {
        return ownerBank;
    }

    public void setOwnerBank(Bank ownerBank) {
        this.ownerBank = ownerBank;
    }

    public String getAtmDislocate() {
        return atmDislocate;
    }

    public void setAtmDislocate(String atmDislocate) {
        this.atmDislocate = atmDislocate;
    }

    public Employee getServingEmployee() {
        return servingEmployee;
    }

    public void setServingEmployee(Employee servingEmployee) {
        this.servingEmployee = servingEmployee;
    }

    public boolean isWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(boolean withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public boolean isDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(boolean depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getAtmServingCost() {
        return atmServingCost;
    }

    public void setAtmServingCost(int atmServingCost) {
        this.atmServingCost = atmServingCost;
    }

    @Override
    public String toString() {
        return STR
                . """
                ATM: {
                atm id = \{ getId() }
                name = \{ name }
                address = \{ address }
                status = \{ status }
                bank = \n\t\{ ownerBank.toString() }
                atm dislocate = \{ atmDislocate }
                employee = \n\t\{ servingEmployee.toString() }
                can withdraw = \{ withdrawMoney ? "can " : "can't" } withdraw
                can depostit = \{ depositMoney ? "can " : "can't" } deposit money
                total money = \{ totalMoney }
                atm serving cost = \{ atmServingCost }
                }
                """ ;
    }


}
