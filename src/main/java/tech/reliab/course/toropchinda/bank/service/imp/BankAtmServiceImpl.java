package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.entity.enums.StatusEnum;
import tech.reliab.course.toropchinda.bank.service.BankAtmService;

public class BankAtmServiceImpl implements BankAtmService {

    private final EntityHolder entityHolder;


    public BankAtmServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public BankAtm createBankAtm(String name, BankOffice office, StatusEnum status, Bank bank, Employee employee,
                                 boolean withdrawMoney, boolean depositMoney, int atmServingCost) {
        var bankAtm = new BankAtm(name, office, status, bank, employee, withdrawMoney, depositMoney, atmServingCost);
        entityHolder.setBankAtm(bankAtm);
        return bankAtm;
    }

    @Override
    public BankAtm getEntity() {
        return entityHolder.getBankAtm();
    }

    @Override
    public void updateEntity(BankAtm bankAtm) {
        this.entityHolder.setBankAtm(bankAtm);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setBankAtm(null);
    }

}
