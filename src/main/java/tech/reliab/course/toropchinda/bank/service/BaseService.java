package tech.reliab.course.toropchinda.bank.service;

public interface BaseService<T> {

    T getEntity();

    void updateEntity(T t);

    void deleteEntity();

}
