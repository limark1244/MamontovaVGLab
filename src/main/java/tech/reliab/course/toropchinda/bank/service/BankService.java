package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;

public interface BankService extends BaseService<Bank> {

    Bank createBank(String name);
}
