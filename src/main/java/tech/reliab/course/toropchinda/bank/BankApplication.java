package tech.reliab.course.toropchinda.bank;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.entity.enums.EntityNameEnum;
import tech.reliab.course.toropchinda.bank.entity.enums.StatusEnum;
import tech.reliab.course.toropchinda.bank.service.BankAtmService;
import tech.reliab.course.toropchinda.bank.service.BankOfficeService;
import tech.reliab.course.toropchinda.bank.service.BankService;
import tech.reliab.course.toropchinda.bank.service.CreditAccountService;
import tech.reliab.course.toropchinda.bank.service.EmployeeService;
import tech.reliab.course.toropchinda.bank.service.PaymentAccountService;
import tech.reliab.course.toropchinda.bank.service.UserService;
import tech.reliab.course.toropchinda.bank.service.imp.BankAtmServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.BankOfficeServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.BankServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.CreditAccountServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.EmployeeServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.PaymentAccountServiceImpl;
import tech.reliab.course.toropchinda.bank.service.imp.UserServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class BankApplication {

    private static final EntityHolder ENTITY_HOLDER = new EntityHolder();
    private static final String HELLO_MESSAGE = """
            Welcome!
            Enter number for print information about chosen entity:
            1) Bank
            2) ATM
            3) Bank office
            4) Credit account
            5) Employee
            6) Payment account
            7) User
            Your choose: """;
    private static BankAtmService bankAtmService;
    private static BankService bankService;
    private static BankOfficeService bankOfficeService;
    private static CreditAccountService creditAccountService;
    private static PaymentAccountService paymentAccountService;
    private static EmployeeService employeeService;
    private static UserService userService;

    static {
        bankService = new BankServiceImpl(ENTITY_HOLDER);
        bankAtmService = new BankAtmServiceImpl(ENTITY_HOLDER);
        bankOfficeService = new BankOfficeServiceImpl(ENTITY_HOLDER);
        paymentAccountService = new PaymentAccountServiceImpl(ENTITY_HOLDER);
        creditAccountService = new CreditAccountServiceImpl(ENTITY_HOLDER);
        userService = new UserServiceImpl(ENTITY_HOLDER);
        employeeService = new EmployeeServiceImpl(ENTITY_HOLDER);
    }

    public static void main(String[] args) {
        Bank hcb = bankService.createBank("HCB");
        BankOffice office = bankOfficeService.createBankOffice("office1", "K2A", hcb, true, true, true, 10000, true, false);
        Employee employee = employeeService.createEmployee("Mamontova", "Vasilina", "Gennadievna", LocalDate.of(2002, 7, 7), "Manager", hcb, false, office, true, 9999999);
        User user = userService.createUser("Daniil", "Kilev", "Olegovich", LocalDate.of(2001, 7, 6), "TN", hcb);
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(user, hcb, 15000);
        CreditAccount creditAccount = creditAccountService.createCreditAccount(user, hcb, LocalDate.of(2022, 2, 20), LocalDate.of(2025, 2, 20), 36, 100000, employee, paymentAccount);
        BankAtm atm = bankAtmService.createBankAtm("atm1", office, StatusEnum.WORK, hcb, employee, true, true, 100);

        System.out.println(HELLO_MESSAGE);
        byte userChoose = new Scanner(System.in).nextByte();
        ENTITY_HOLDER.printEntityInfo(EntityNameEnum.getEntityNameByUserChoose(userChoose));
    }

}
