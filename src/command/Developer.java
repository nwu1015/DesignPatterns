package command;

public class Developer {
    Command insert;
    Command update;
    Command delete;
    Command select;

    public Developer(Command insert, Command update, Command delete, Command select) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
        this.select = select;
    }

    public void insert() {
        insert.execute();
    }

    public void update() {
        update.execute();
    }

    public void delete() {
        delete.execute();
    }

    public void select() {
        select.execute();
    }
}
