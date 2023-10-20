package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {

    private final EntityHolder entityHolder;

    public BankOfficeServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public BankOffice createBankOffice(String name, String address, Bank bank, boolean canApplyLoan, boolean withdrawMoney, boolean depositMoney, int rentCost, boolean isWork, boolean hasSpaceToPlaceAtm) {
        BankOffice bankOffice = new BankOffice(name, address, bank, canApplyLoan, withdrawMoney, depositMoney, rentCost, isWork, hasSpaceToPlaceAtm);
        entityHolder.setBankOffice(bankOffice);
        return bankOffice;
    }

    @Override
    public BankOffice getEntity() {
        return entityHolder.getBankOffice();
    }

    @Override
    public void updateEntity(BankOffice office) {
        entityHolder.setBankOffice(office);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setBankOffice(null);
    }
}
