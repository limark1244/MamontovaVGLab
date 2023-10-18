package tech.reliab.course.toropchinda.bank.entity;

public class BankOffice extends BaseEntity<Long> {

    public BankOffice(Long id, String name, String address, Bank bank, boolean canApplyLoan, boolean withdrawMoney, boolean depositMoney, int rentCost, boolean isWork, boolean hasSpaceToPlaceAtm) {
        super(id);
        this.name = name;
        this.address = address;
        this.isWork = isWork;
        this.hasSpaceToPlaceAtm = hasSpaceToPlaceAtm;
        this.atmCount = bank.getAtmCount();
        this.canApplyLoan = canApplyLoan;
        this.withdrawMoney = withdrawMoney;
        this.depositMoney = depositMoney;
        this.totalMoney = bank.getTotalMoney();
        this.rentCost = rentCost;
        bank.upraiseOfficeCount();
    }

    private String name;
    private String address;
    private boolean isWork;
    private boolean hasSpaceToPlaceAtm;
    private int atmCount;
    private boolean canApplyLoan;
    private boolean withdrawMoney;
    private boolean depositMoney;
    private int totalMoney;
    private int rentCost;

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

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public boolean isHasSpaceToPlaceAtm() {
        return hasSpaceToPlaceAtm;
    }

    public void setHasSpaceToPlaceAtm(boolean hasSpaceToPlaceAtm) {
        this.hasSpaceToPlaceAtm = hasSpaceToPlaceAtm;
    }

    public int getAtmCount() {
        return atmCount;
    }

    public void setAtmCount(int atmCount) {
        this.atmCount = atmCount;
    }

    public boolean isCanApplyLoan() {
        return canApplyLoan;
    }

    public void setCanApplyLoan(boolean canApplyLoan) {
        this.canApplyLoan = canApplyLoan;
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

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }
}
