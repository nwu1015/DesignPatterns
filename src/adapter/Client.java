package adapter;

public class Client {
    public static void main(String[] args) {

        Database database = new JavaAdapterToDatabase();

        database.select();
        database.delete();
        database.update();
        database.save();

    }
}
