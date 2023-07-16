public class App {
    private static App app;

    private App() {

    }

    public static App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }
}
