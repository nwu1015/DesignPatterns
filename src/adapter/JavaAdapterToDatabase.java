package adapter;

public class JavaAdapterToDatabase extends JavaDatabase implements Database{

    @Override
    public void save() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
