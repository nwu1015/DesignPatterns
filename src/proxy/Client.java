package proxy;

public class Client {
    public static void main(String[] args) {
        Project realProject = new ProxyProject("1233");
        realProject.run();
    }
}
