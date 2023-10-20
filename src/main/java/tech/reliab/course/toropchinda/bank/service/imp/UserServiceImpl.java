package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private final EntityHolder entityHolder;

    public UserServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public User getEntity() {
        return entityHolder.getUser();
    }

    @Override
    public void updateEntity(User user) {
        entityHolder.setUser(user);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setUser(null);
    }

    @Override
    public User createUser(String surname, String name, String patronymic, LocalDate dateBirth, String workPlace, Bank bank) {
        var user = new User(surname, name, patronymic, dateBirth, workPlace, bank);
        entityHolder.setUser(user);
        return user;
    }
}
