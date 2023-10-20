package tech.reliab.course.toropchinda.bank.entity;

public abstract class BaseEntity<T> {
    private T id;

    public BaseEntity(T id) {
        this.id = id;
    }

    public BaseEntity() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
