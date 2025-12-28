package iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "SQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Developer", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer Name: " + javaDeveloper.getName());
        System.out.println("Developer Skills: " );
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
