package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;

public interface BankOfficeService extends BaseService<BankOffice> {

    BankOffice createBankOffice(Long id, String name, String address, Bank bank, boolean canApplyLoan, boolean withdrawMoney, boolean depositMoney, int rentCost, boolean isWork, boolean hasSpaceToPlaceAtm);
}
