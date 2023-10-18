package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.*;
import tech.reliab.course.toropchinda.bank.service.BankAtmService;

public class BankAtmServiceImpl implements BankAtmService {

    private BankAtm bankAtm;

    @Override
    public BankAtm createBankAtm(Long id, String name, BankOffice office, StatusEnum status, Bank bank, Employee employee, boolean withdrawMoney, boolean depositMoney, int atmServingCost) {
        bankAtm = new BankAtm(id, name, office, status, bank, employee, withdrawMoney, depositMoney, atmServingCost);
        return bankAtm;
    }

    @Override
    public BankAtm getEntity() {
        return bankAtm;
    }

    @Override
    public void updateEntity(BankAtm bankAtm) {
        this.bankAtm = bankAtm;
    }

    @Override
    public void deleteEntity() {
        this.bankAtm = null;
    }
}
