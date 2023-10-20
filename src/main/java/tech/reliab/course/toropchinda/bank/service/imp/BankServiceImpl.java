package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.service.BankService;

public class BankServiceImpl implements BankService {

    private final EntityHolder entityHolder;

    public BankServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public Bank getEntity() {
        return entityHolder.getBank();
    }

    @Override
    public void updateEntity(Bank bank) {
        entityHolder.setBank(bank);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setBank(null);
    }

    @Override
    public Bank createBank(String name) {
        Bank bank = new Bank(name);
        entityHolder.setBank(bank);
        return bank;
    }
}
