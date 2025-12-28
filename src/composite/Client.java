package composite;

public class Client {
    public static void main(String[] args) {
        Team team = new Team();
        Developer developer = new JavaDeveloper();
        Developer developer2 = new JavaDeveloper();
        Developer developer3 = new CppDeveloper();
        team.addDeveloper(developer);
        team.addDeveloper(developer2);
        team.addDeveloper(developer3);
        team.writeCode();

        System.out.println("----------");
        developer.writeCode();
    }
}
