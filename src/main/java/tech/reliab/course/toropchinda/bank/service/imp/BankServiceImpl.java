package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.service.BankService;

public class BankServiceImpl implements BankService {

    private Bank bank;

    @Override
    public Bank getEntity() {
        return bank;
    }

    @Override
    public void updateEntity(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void deleteEntity() {
        bank = null;
    }

    @Override
    public Bank createBank(Long id, String name) {
        return new Bank(id, name);
    }
}
