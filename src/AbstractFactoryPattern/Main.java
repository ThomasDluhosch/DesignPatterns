package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        Factory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new FactoryMac();
        } else{
            factory = new FactoryWin();
        }

        app = new Application(factory);
        return app;
    }
    
}
