package maratonlar.maraton02.entities;

public abstract class BaseEntity {

    protected final int id;

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
