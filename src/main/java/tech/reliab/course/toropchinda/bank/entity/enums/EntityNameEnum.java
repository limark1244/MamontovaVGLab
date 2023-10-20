package tech.reliab.course.toropchinda.bank.entity.enums;

import java.util.Arrays;

public enum EntityNameEnum {
    BANK(1),
    BANK_ATM(2),
    BANK_OFFICE(3),
    CREDIT_ACCOUNT(4),
    EMPLOYEE(5),
    PAYMENT_ACCOUNT(6),
    USER(7);
    final int userChoose;

    EntityNameEnum(int userChoose) {
        this.userChoose = userChoose;
    }

    private int getUserChoose() {
        return userChoose;
    }

    public static EntityNameEnum getEntityNameByUserChoose(int userChoose) {
        return Arrays.stream(values())
                .filter(name -> name.getUserChoose() == userChoose)
                .findAny()
                .orElse(null);
    }
}
